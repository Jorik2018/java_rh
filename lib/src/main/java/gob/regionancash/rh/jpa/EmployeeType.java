package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "rh_employee_type")
public class EmployeeType
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Size(max = 80)
  @Column(name = "name")
  private String name;
  @Column(name = "id_modpers")
  private Short idModpers;
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String name) {
this.name = name;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EmployeeType)) {
  return false;
    }
EmployeeType other = (EmployeeType)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return (this.id != null) ? (this.id + ": " + this.name).trim() : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/EmployeeType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */