package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tipo_trabajador")
public class TipoTrabajador
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 2)
  @Column(name = "tipo_trab")
  private String id;
  @Size(max = 80)
  @Column(name = "nombre")
  private String nombre;
  
  public TipoTrabajador() {}
  
  public TipoTrabajador(String tipoTrab) {
this.id = tipoTrab;
  }
  
  public String getId() {
return this.id;
  }
  
  public void setId(String tipoTrab) {
this.id = tipoTrab;
  }
  
  public String getNombre() {
return this.nombre;
  }
  
  public void setNombre(String nombre) {
this.nombre = nombre;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof TipoTrabajador)) {
  return false;
    }
TipoTrabajador other = (TipoTrabajador)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return (this.id != null) ? (this.id + ": " + this.nombre).trim() : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/TipoTrabajador.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */