package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_tipo_personal")
public class EscTipoPersonal
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_tipo")
  private Short id;
  @Basic(optional = false)
  @Column(name = "tipo")
  private String name;
  @Column(name = "id_modpers")
  private Short idModpers;
  
  public EscTipoPersonal() {}
  
  public EscTipoPersonal(Short idTipo) {
this.id = idTipo;
  }
  
  public Short getId() {
return this.id;
  }
  
  public void setId(Short idTipo) {
this.id = idTipo;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String tipo) {
this.name = tipo;
  }
  
  public Short getIdModpers() {
return this.idModpers;
  }
  
  public void setIdModpers(Short idModpers) {
this.idModpers = idModpers;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscTipoPersonal)) {
  return false;
    }
EscTipoPersonal other = (EscTipoPersonal)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return this.id + ": " + getName();
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/EscTipoPersonal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */