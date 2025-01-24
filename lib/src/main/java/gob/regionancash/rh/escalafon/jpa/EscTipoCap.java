package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "esc_tipo_cap")
public class EscTipoCap
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_tc")
  private Short id;
  @Basic(optional = false)
  @Column(name = "tipos")
  private String name;
  
  public EscTipoCap() {}
  
  public EscTipoCap(Short idTc) {
this.id = idTc;
  }
  
  public EscTipoCap(Short idTc, String tipos) {
this.id = idTc;
this.name = tipos;
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
if (!(object instanceof EscTipoCap)) {
  return false;
    }
EscTipoCap other = (EscTipoCap)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return this.id + ": " + this.name;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscTipoCap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */