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
@Table(name = "per_tipo_falta")
public class PerTipoFalta
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_tipofalta")
  private Short idTipofalta;
  @Size(max = 50)
  @Column(name = "nombre")
  private String nombre;
  
  public PerTipoFalta() {}
  
  public PerTipoFalta(Short idTipofalta) {
this.idTipofalta = idTipofalta;
  }
  
  public Short getIdTipofalta() {
return this.idTipofalta;
  }
  
  public void setIdTipofalta(Short idTipofalta) {
this.idTipofalta = idTipofalta;
  }
  
  public String getNombre() {
return this.nombre;
  }
  
  public void setNombre(String nombre) {
this.nombre = nombre;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idTipofalta != null) ? this.idTipofalta.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerTipoFalta)) {
  return false;
    }
PerTipoFalta other = (PerTipoFalta)object;
if ((this.idTipofalta == null && other.idTipofalta != null) || (this.idTipofalta != null && !this.idTipofalta.equals(other.idTipofalta))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.ocper.jpa.PerTipoFalta[ idTipofalta=" + this.idTipofalta + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PerTipoFalta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */