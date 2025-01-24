package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "esc_condicion_cap")
public class EscCondicionCap
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_cc")
  private Short id;
  @Basic(optional = false)
  @Column(name = "condicion")
  private String name;
  
  public EscCondicionCap() {}
  
  public EscCondicionCap(Short idCc) {
this.id = idCc;
  }
  
  public EscCondicionCap(Short idCc, String condicion) {
this.id = idCc;
this.name = condicion;
  }
  
  public Short getId() {
return this.id;
  }
  
  public void setId(Short id) {
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
if (!(object instanceof EscCondicionCap)) {
  return false;
    }
EscCondicionCap other = (EscCondicionCap)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return this.id + ": " + this.name;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCondicionCap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */