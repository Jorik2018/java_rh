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

@Entity
@Table(name = "esc_demeritos")
public class Demerit
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String document;
  @Column(name = "mencion")
  private String mencion;
  @Column(name = "dias_sancion")
  private Short diasSancion;
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Basic(optional = false)
  @Column(name = "fecha_dem")
  @Temporal(TemporalType.DATE)
  private Date fechaDem;
  @Basic(optional = false)
  @Column(name = "activo")
  private boolean activo;
  @Column(name = "observacion")
  private String observation;
  @Column(name = "id_esc")
  private Integer employeeId;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Employee employee;
  @JoinColumn(name = "id_tf", referencedColumnName = "id_tf")
  @ManyToOne(optional = true)
  private FaultType faultType;
  @JoinColumn(name = "id_ts", referencedColumnName = "id_ts")
  @ManyToOne(optional = false)
  private SanctionType sanctionType;
  
  public Demerit() {}
  
  public Demerit(Integer id) {
this.id = id;
  }
  
  public Integer getEmployeeId() {
return this.employeeId;
  }
  
  public void setEmployeeId(Integer employeeId) {
this.employeeId = employeeId;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public String getMencion() {
return this.mencion;
  }
  
  public void setMencion(String mencion) {
this.mencion = mencion;
  }
  
  public Short getDiasSancion() {
return this.diasSancion;
  }
  
  public void setDiasSancion(Short diasSancion) {
this.diasSancion = diasSancion;
  }
  
  public Date getFechaIni() {
return this.fechaIni;
  }
  
  public void setFechaIni(Date fechaIni) {
this.fechaIni = fechaIni;
  }
  
  public Date getFechaFin() {
return this.fechaFin;
  }
  
  public void setFechaFin(Date fechaFin) {
this.fechaFin = fechaFin;
  }
  
  public String getDocument() {
return this.document;
  }
  
  public void setDocument(String document) {
this.document = document;
  }
  
  public String getObservation() {
return this.observation;
  }
  
  public void setObservation(String observation) {
this.observation = observation;
  }
  
  public SanctionType getSanctionType() {
return this.sanctionType;
  }
  
  public void setSanctionType(SanctionType sanctionType) {
this.sanctionType = sanctionType;
  }
  
  public Date getFechaDem() {
return this.fechaDem;
  }
  
  public void setFechaDem(Date fechaDem) {
this.fechaDem = fechaDem;
  }
  
  public boolean getActivo() {
return this.activo;
  }
  
  public void setActivo(boolean activo) {
this.activo = activo;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }
  
  public FaultType getFaultType() {
return this.faultType;
  }
  
  public void setFaultType(FaultType faultType) {
this.faultType = faultType;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Demerit)) {
  return false;
    }
Demerit other = (Demerit)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscDemeritos[ id=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/Demerit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */