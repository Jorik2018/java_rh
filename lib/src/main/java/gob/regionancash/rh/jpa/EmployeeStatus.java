package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rh_employee_status")
public class EmployeeStatus
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id")
  private Short id;
  @Basic(optional = false)
  @Column(name = "name")
  private String name;
  @Column(name = "activo")
  private Boolean activo;
  
  public EmployeeStatus() {}
  
  public EmployeeStatus(Short idEstado) {
this.id = idEstado;
  }
  
  public EmployeeStatus(Short idEstado, String estado) {
this.id = idEstado;
this.name = estado;
  }
  
  public Short getId() {
return this.id;
  }
  
  public void setId(Short idEstado) {
this.id = idEstado;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String estado) {
this.name = estado;
  }
  
  public Boolean getActivo() {
return this.activo;
  }
  
  public void setActivo(Boolean activo) {
this.activo = activo;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EmployeeStatus)) {
  return false;
    }
EmployeeStatus other = (EmployeeStatus)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return this.id + ": " + getName();
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/EmployeeStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */