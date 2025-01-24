package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "esc_nivel_estudios")
public class EscNivelEstudio
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_nivel")
  private Short idNivel;
  @Basic(optional = false)
  @Column(name = "nivel")
  private String nombre;
  @Basic(optional = false)
  @Column(name = "abrev")
  private String abrev;
  @Column(name = "ambito")
  private String ambito;
  @Column(name = "ultimo")
  private Boolean ultimo;
  
  public EscNivelEstudio() {}
  
  public EscNivelEstudio(Short idNivel) {
this.idNivel = idNivel;
  }
  
  public Short getIdNivel() {
return this.idNivel;
  }
  
  public void setIdNivel(Short idNivel) {
this.idNivel = idNivel;
  }
  
  public String getNombre() {
return this.nombre;
  }
  
  public void setNombre(String nivel) {
this.nombre = nivel;
  }
  
  public String getAbrev() {
return this.abrev;
  }
  
  public void setAbrev(String abrev) {
this.abrev = abrev;
  }
  
  public String getAmbito() {
return this.ambito;
  }
  
  public void setAmbito(String ambito) {
this.ambito = ambito;
  }
  
  public Boolean getUltimo() {
return this.ultimo;
  }
  
  public void setUltimo(Boolean ultimo) {
this.ultimo = ultimo;
  }










  
  public int hashCode() {
int hash = 0;
hash += (this.idNivel != null) ? this.idNivel.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscNivelEstudio)) {
  return false;
    }
EscNivelEstudio other = (EscNivelEstudio)object;
if ((this.idNivel == null && other.idNivel != null) || (this.idNivel != null && !this.idNivel.equals(other.idNivel))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscNivelEstudios[ idNivel=" + this.idNivel + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscNivelEstudio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */