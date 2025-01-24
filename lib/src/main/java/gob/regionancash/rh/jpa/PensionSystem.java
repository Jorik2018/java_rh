package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "rh_pension_system")
public class PensionSystem
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Size(max = 60)
  @Column(name = "name")
  private String name;
  
  public PensionSystem() {}
  
  public PensionSystem(Integer regPension) {
this.id = regPension;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String nombre) {
this.name = nombre;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PensionSystem)) {
  return false;
    }
PensionSystem other = (PensionSystem)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return (this.id != null) ? (this.id + ": " + this.name) : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PensionSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */