package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "modalidad_laboral")
public class ModLaboral
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 1)
  @Column(name = "mod_laboral")
  private String id;
  @Size(max = 30)
  @Column(name = "nombre")
  private String nombre;
  @Size(max = 15)
  @Column(name = "abrev")
  private String abrev;
  @Size(max = 2)
  @Column(name = "tipo_trab")
  private String tipoTrab;
  @JoinColumn(name = "tipo_trab", referencedColumnName = "tipo_trab", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private TipoTrabajador tipoTrabajador;
  
  public TipoTrabajador getTipoTrabajador() {
return this.tipoTrabajador;
  }
  
  public void setTipoTrabajador(TipoTrabajador tipoTrabajador) {
this.tipoTrabajador = tipoTrabajador;
  }

  
  public ModLaboral() {}
  
  public ModLaboral(String modLaboral, String nombre) {
this.id = modLaboral;
this.nombre = nombre;
  }
  
  public String getId() {
return this.id;
  }
  
  public void setId(String modLaboral) {
this.id = modLaboral;
  }
  
  public String getNombre() {
return this.nombre;
  }
  
  public void setNombre(String nombre) {
this.nombre = nombre;
  }
  
  public String getAbrev() {
return this.abrev;
  }
  
  public void setAbrev(String abrev) {
this.abrev = abrev;
  }
  
  public String getTipoTrab() {
return this.tipoTrab;
  }
  
  public void setTipoTrab(String tipoTrab) {
this.tipoTrab = tipoTrab;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof ModLaboral)) {
  return false;
    }
ModLaboral other = (ModLaboral)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return (this.id != null) ? (this.id + ": " + this.nombre).trim() : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/ModLaboral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */