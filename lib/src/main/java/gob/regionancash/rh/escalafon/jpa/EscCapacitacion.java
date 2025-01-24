package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.io.Serializable;
import java.util.Date;
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
import org.isobit.directory.jpa.Company;

@Entity
@Table(name = "esc_capacitacion")
public class EscCapacitacion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  @JoinColumn(name = "id_cc", referencedColumnName = "id_cc")
  @ManyToOne(optional = false)
  private EscCondicionCap condition;
  @JoinColumn(name = "id_tc", referencedColumnName = "id_tc")
  @ManyToOne(optional = false)
  private EscTipoCap type;
  @Basic(optional = false)
  @Column(name = "capacitacion")
  private String denomination;
  @Basic(optional = false)
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "id_pl")
  private Integer idPl;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Basic(optional = false)
  @Column(name = "id_inst")
  private int companyId;
  @JoinColumn(name = "id_inst", referencedColumnName = "id_dir", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Company institution;
  @Transient
  private Company company;
  @Column(name = "horas")
  private Short hours;
  @Column(name = "horas_text")
  private String horasText;
  @Column(name = "mencion")
  private String mencion;
  @Transient
  private Object ext;
  
  public Object getExt() {
return this.ext;
  }
  
  public void setExt(Object ext) {
this.ext = ext;
  }
  
  public Company getCompany() {
return this.company;
  }
  
  public void setCompany(Company institucion) {
this.company = institucion;
  }

  
  public EscCapacitacion() {}
  
  public EscCapacitacion(Integer id) {
this.id = id;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }
  
  public EscCondicionCap getCondition() {
return this.condition;
  }
  
  public void setCondition(EscCondicionCap condition) {
this.condition = condition;
  }
  
  public EscTipoCap getType() {
return this.type;
  }
  
  public void setType(EscTipoCap type) {
this.type = type;
  }
  
  public String getDenomination() {
return this.denomination;
  }
  
  public void setDenomination(String denomination) {
this.denomination = denomination;
  }
  
  public Date getFechaIni() {
return this.fechaIni;
  }
  
  public void setFechaIni(Date fechaIni) {
this.fechaIni = fechaIni;
  }
  
  public Integer getIdPl() {
return this.idPl;
  }
  
  public void setIdPl(Integer idPl) {
this.idPl = idPl;
  }
  
  public Date getFechaFin() {
return this.fechaFin;
  }
  
  public void setFechaFin(Date fechaFin) {
this.fechaFin = fechaFin;
  }
  
  public int getCompanyId() {
return this.companyId;
  }
  
  public void setCompanyId(int companyId) {
this.companyId = companyId;
  }
  
  public Company getInstitution() {
return this.institution;
  }
  
  public void setInstitution(Company institution) {
this.institution = institution;
setCompanyId((institution != null) ? institution.getId().intValue() : 0);
  }
  
  public Short getHours() {
return this.hours;
  }
  
  public void setHours(Short hours) {
this.hours = hours;
  }
  
  public String getHorasText() {
return this.horasText;
  }
  
  public void setHorasText(String horasText) {
this.horasText = horasText;
  }
  
  public String getMencion() {
return this.mencion;
  }
  
  public void setMencion(String mencion) {
this.mencion = mencion;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscCapacitacion)) {
  return false;
    }
EscCapacitacion other = (EscCapacitacion)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "aa.EscCapacitacion[ id=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCapacitacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */