package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;






@Entity
@Table(name = "per_actividad_0")
@NamedQueries({@NamedQuery(name = "PerActividad0.findAll", query = "SELECT p FROM PerActividad0 p")})
public class PerActividad0
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_actividad")
  private Integer idActividad;
  @Size(max = 100)
  @Column(name = "descripcion")
  private String descripcion;
  @Column(name = "pp")
  private Integer pp;
  
  public PerActividad0() {}
  
  public PerActividad0(Integer idActividad) {
this.idActividad = idActividad;
  }
  
  public Integer getIdActividad() {
return this.idActividad;
  }
  
  public void setIdActividad(Integer idActividad) {
this.idActividad = idActividad;
  }
  
  public String getDescripcion() {
return this.descripcion;
  }
  
  public void setDescripcion(String descripcion) {
this.descripcion = descripcion;
  }
  
  public Integer getPp() {
return this.pp;
  }
  
  public void setPp(Integer pp) {
this.pp = pp;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idActividad != null) ? this.idActividad.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerActividad0)) {
  return false;
    }
PerActividad0 other = (PerActividad0)object;
if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.rh.jpa.PerActividad0[ idActividad=" + this.idActividad + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PerActividad0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */