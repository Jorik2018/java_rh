package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_tipo_falta")
public class FaultType
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_tf")
  private Short id;
  @Basic(optional = false)
  @Column(name = "falta")
  private String description;
  
  public FaultType() {}
  
  public FaultType(Short idTf) {
this.id = idTf;
  }
  
  public Short getId() {
return this.id;
  }
  
  public void setId(Short idTf) {
this.id = idTf;
  }
  
  public String getDescription() {
return this.description;
  }
  
  public void setDescription(String description) {
this.description = description;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof FaultType)) {
  return false;
    }
FaultType other = (FaultType)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscTipoFalta[ idTf=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/FaultType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */