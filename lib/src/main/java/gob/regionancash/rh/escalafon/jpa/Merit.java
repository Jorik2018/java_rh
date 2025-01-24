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
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "esc_merit")
public class Merit
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Column(name = "employee_id")
  private int employeeId;
  @Transient
  private Employee employee;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 60)
  @Column(name = "document")
  private String document;
  @Size(max = 200)
  @Column(name = "reason")
  private String reason;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fecha")
  @Temporal(TemporalType.DATE)
  private Date fecha;
  @Basic(optional = false)
  @NotNull
  @Column(name = "activo")
  private boolean activo;
  @Size(max = 200)
  @Column(name = "observation")
  private String observation;
  
  public Merit() {}
  
  public Merit(Integer id) {
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
  
  public int getEmployeeId() {
return this.employeeId;
  }
  
  public void setEmployeeId(int employeeId) {
this.employeeId = employeeId;
  }
  
  public String getDocument() {
return this.document;
  }
  
  public void setDocument(String document) {
this.document = document;
  }
  
  public String getReason() {
return this.reason;
  }
  
  public void setReason(String reason) {
this.reason = reason;
  }
  
  public Date getFecha() {
return this.fecha;
  }
  
  public void setFecha(Date fecha) {
this.fecha = fecha;
  }
  
  public boolean getActivo() {
return this.activo;
  }
  
  public void setActivo(boolean activo) {
this.activo = activo;
  }
  
  public String getObservation() {
return this.observation;
  }
  
  public void setObservation(String observation) {
this.observation = observation;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Merit)) {
  return false;
    }
Merit other = (Merit)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.escalafon.jpa.EscMerit[ id=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/Merit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */