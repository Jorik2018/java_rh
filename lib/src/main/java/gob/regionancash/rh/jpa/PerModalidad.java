package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "per_modalidad")
public class PerModalidad
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_modalidad")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 40)
  @Column(name = "nombre")
  private String nombre;
  
  public PerModalidad() {}
  
  public PerModalidad(Integer idModalidad) {
this.id = idModalidad;
  }
  
  public PerModalidad(Integer idModalidad, String nombre) {
this.id = idModalidad;
this.nombre = nombre;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer idModalidad) {
this.id = idModalidad;
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
if (!(object instanceof PerModalidad)) {
  return false;
    }
PerModalidad other = (PerModalidad)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.rh.jpa.PerModalidad[ idModalidad=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PerModalidad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */