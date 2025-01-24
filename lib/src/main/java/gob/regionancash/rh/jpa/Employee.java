package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.isobit.directory.jpa.Company;
import org.isobit.directory.jpa.People;
import org.isobit.util.OptionMap;

@Entity
@Table(name = "rh_employee")
public class Employee
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_esc")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_estado")
  private Short statusId = Short.valueOf((short) 1);
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_dir")
  private int peopleId;
  @Column(name = "id_dir", insertable = false, updatable = false)
  private long peopleIdLong;
  @Basic(optional = false)
  @NotNull
  @Column(name = "employee_type_id")
  private Short typeId = Short.valueOf((short) 1);

  @Basic(optional = false)
  @Column(name = "fecha_ing")
  @Temporal(TemporalType.DATE)
  private Date incomeDate;
  @Basic(optional = false)
  private Short condicion;
  @Size(max = 25)
  private String ruc;

  @Size(max = 100)
  private String especialidad;
  @Size(max = 20)
  @Column(name = "abrev_esp")
  private String abrevEsp;
  @Column(name = "fecha_cese")
  @Temporal(TemporalType.DATE)
  private Date fechaCese;
  @Size(max = 400)
  @Column(name = "observaciones")
  private String observations;
  @Size(max = 60)
  @Column(name = "id_dtra_cese")
  private String idDtraCese;
  @JoinColumn(name = "employee_type_id", referencedColumnName = "id", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private EmployeeType type;
  @JoinColumn(name = "id_estado", referencedColumnName = "id", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private EmployeeStatus status;
  @JoinColumn(name = "id_dir", referencedColumnName = "id_dir", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private People people;
  @Transient
  private Object ext;
  @JoinColumn(name = "pension_system_id", referencedColumnName = "id")
  @ManyToOne
  private PensionSystem pensionSystem;
  @Basic(optional = false)
  @Column(name = "f_afiliacion")
  @Temporal(TemporalType.DATE)
  private Date fAfiliacion;
  @Basic(optional = false)
  @Column(name = "tipo_doc")
  private Integer tipoDoc;
  @Basic(optional = false)
  private Short occupation;
  @Basic(optional = false)
  @Column(name = "n_plaza")
  private String nPlaza;
  @Basic(optional = false)
  @Column(name = "labor_regime_id")
  private Short laborRegimeId;
  @Transient
  private String laborRegimeName;
  @Column(name = "user_id")
  private Integer userId;
  private String cuspp;
  @Column(name = "nro_bank_account")
  private String nroBankAccount;
  private String autogenerado;
  @Column(name = "work_modality")
  private String workModality;
  private boolean canceled;
  @Column(name = "incentivo_laboral")
  private BigDecimal incentivoLaboral;
  @Column(name = "remuneracion")
  private BigDecimal remuneracion;
  @Transient
  private Company company;

  public boolean isCanceled() {
    return this.canceled;
  }

  public void setCanceled(boolean canceled) {
    this.canceled = canceled;
  }

  public Company getCompany() {
    return this.company;
  }

  public BigDecimal getIncentivoLaboral() {
    return this.incentivoLaboral;
  }

  public void setIncentivoLaboral(BigDecimal incentivoLaboral) {
    this.incentivoLaboral = incentivoLaboral;
  }

  public BigDecimal getRemuneracion() {
    return this.remuneracion;
  }

  public void setRemuneracion(BigDecimal remuneracion) {
    this.remuneracion = remuneracion;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public long getPeopleIdLong() {
    return this.peopleIdLong;
  }

  public void setPeopleIdLong(long peopleIdLong) {
    this.peopleIdLong = peopleIdLong;
  }

  public String getWorkModality() {
    return this.workModality;
  }

  public void setWorkModality(String workModality) {
    this.workModality = workModality;
  }

  public Short getLaborRegimeId() {
    return this.laborRegimeId;
  }

  public void setLaborRegimeId(Short laborRegimeId) {
    this.laborRegimeId = laborRegimeId;
  }

  public String getLaborRegimeName() {
    return this.laborRegimeName;
  }

  public void setLaborRegimeName(String laborRegimeName) {
    this.laborRegimeName = laborRegimeName;
  }

  private static OptionMap OCCUPATION_MAP = new OptionMap();
  static {
    OCCUPATION_MAP.put(Short.valueOf((short) 1), "PROFESIONAL");
    OCCUPATION_MAP.put(Short.valueOf((short) 2), "TÉCNICO");
    OCCUPATION_MAP.put(Short.valueOf((short) 3), "AUXILIAR");
    OCCUPATION_MAP.put(Short.valueOf((short) 4), "FUNCIONARIO");
    OCCUPATION_MAP.put(Short.valueOf((short) 5), "DIRECTIVO");
    OCCUPATION_MAP.put(Short.valueOf((short) 6), "ESTUDIANTE");
  }
  @Transient
  private List<Relative> relativeList;

  public OptionMap getOCCUPATION_MAP() {
    return OCCUPATION_MAP;
  }

  public PensionSystem getPensionSystem() {
    return this.pensionSystem;
  }

  public void setPensionSystem(PensionSystem pensionSystem) {
    this.pensionSystem = pensionSystem;
  }

  public Date getfAfiliacion() {
    return this.fAfiliacion;
  }

  public String getNroBankAccount() {
    return this.nroBankAccount;
  }

  public void setNroBankAccount(String nroBankAccount) {
    this.nroBankAccount = nroBankAccount;
  }

  public String getAutogenerado() {
    return this.autogenerado;
  }

  public void setAutogenerado(String autogenerado) {
    this.autogenerado = autogenerado;
  }

  public void setfAfiliacion(Date fAfiliacion) {
    this.fAfiliacion = fAfiliacion;
  }

  public Integer getTipoDoc() {
    return this.tipoDoc;
  }

  public void setTipoDoc(Integer tipoDoc) {
    this.tipoDoc = tipoDoc;
  }

  public Short getOccupation() {
    return this.occupation;
  }

  public void setOccupation(Short occupation) {
    this.occupation = occupation;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getCuspp() {
    return this.cuspp;
  }

  public void setCuspp(String cuspp) {
    this.cuspp = cuspp;
  }

  public String getnPlaza() {
    return this.nPlaza;
  }

  public void setnPlaza(String nPlaza) {
    this.nPlaza = nPlaza;
  }

  public EmployeeStatus getStatus() {
    return this.status;
  }

  public void setStatus(EmployeeStatus status) {
    this.status = status;
  }

  public EmployeeType getType() {
    return this.type;
  }

  public void setType(EmployeeType type) {
    this.type = type;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getIncomeDate() {
    return this.incomeDate;
  }

  public void setIncomeDate(Date incomeDate) {
    this.incomeDate = incomeDate;
  }

  public Short getCondicion() {
    return this.condicion;
  }

  public void setCondicion(Short condicion) {
    this.condicion = condicion;
  }

  public String getRuc() {
    return this.ruc;
  }

  public void setRuc(String ruc) {
    this.ruc = ruc;
  }

  public String getEspecialidad() {
    return this.especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public String getAbrevEsp() {
    return this.abrevEsp;
  }

  public void setAbrevEsp(String abrevEsp) {
    this.abrevEsp = abrevEsp;
  }

  public Date getFechaCese() {
    return this.fechaCese;
  }

  public void setFechaCese(Date fechaCese) {
    this.fechaCese = fechaCese;
  }

  public String getIdDtraCese() {
    return this.idDtraCese;
  }

  public void setIdDtraCese(String idDtraCese) {
    this.idDtraCese = idDtraCese;
  }

  public People getPeople() {
    return this.people;
  }

  public void setPeople(People people) {
    this.people = people;
  }

  public Object getExt() {
    return this.ext;
  }

  public void setExt(Object ext) {
    this.ext = ext;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof Employee)) {
      return false;
    }
    Employee other = (Employee) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return this.id + ": " + this.people;
  }

  public Short getStatusId() {
    return this.statusId;
  }

  public void setStatusId(Short statusId) {
    this.statusId = statusId;
  }

  public Short getTypeId() {
    return this.typeId;
  }

  public void setTypeId(Short typeId) {
    this.typeId = typeId;
  }

  public int getPeopleId() {
    return this.peopleId;
  }

  public void setPeopleId(int idDir) {
    this.peopleId = idDir;
  }

  public List<Relative> getRelativeList() {
    return this.relativeList;
  }

  public void setRelativeList(List<Relative> relativeList) {
    this.relativeList = relativeList;
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/jpa/Employee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */