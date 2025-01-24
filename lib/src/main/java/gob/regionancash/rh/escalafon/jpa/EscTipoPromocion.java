package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_tipo_promocion")
public class EscTipoPromocion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_tp")
  private Short idTp;
  @Basic(optional = false)
  @Column(name = "tipo_promocion")
  private String tipoPromocion;
  @OneToMany(mappedBy = "idTp")
  private List<EscCarreraLaboral> escCarreraLaboralList;
  @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "idTp")
  private List<EscPromocion> escPromocionesList;
  @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "idTp")
  private List<EscPromocionDoc> escPromocionesDocList;
  
  public EscTipoPromocion() {}
  
  public EscTipoPromocion(Short idTp) {
this.idTp = idTp;
  }
  
  public EscTipoPromocion(Short idTp, String tipoPromocion) {
this.idTp = idTp;
this.tipoPromocion = tipoPromocion;
  }
  
  public Short getIdTp() {
return this.idTp;
  }
  
  public void setIdTp(Short idTp) {
this.idTp = idTp;
  }
  
  public String getTipoPromocion() {
return this.tipoPromocion;
  }
  
  public void setTipoPromocion(String tipoPromocion) {
this.tipoPromocion = tipoPromocion;
  }
  
  public List<EscCarreraLaboral> getEscCarreraLaboralList() {
return this.escCarreraLaboralList;
  }
  
  public void setEscCarreraLaboralList(List<EscCarreraLaboral> escCarreraLaboralList) {
this.escCarreraLaboralList = escCarreraLaboralList;
  }
  
  public List<EscPromocion> getEscPromocionesList() {
return this.escPromocionesList;
  }
  
  public void setEscPromocionesList(List<EscPromocion> escPromocionesList) {
this.escPromocionesList = escPromocionesList;
  }
  
  public List<EscPromocionDoc> getEscPromocionesDocList() {
return this.escPromocionesDocList;
  }
  
  public void setEscPromocionesDocList(List<EscPromocionDoc> escPromocionesDocList) {
this.escPromocionesDocList = escPromocionesDocList;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idTp != null) ? this.idTp.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscTipoPromocion)) {
  return false;
    }
EscTipoPromocion other = (EscTipoPromocion)object;
if ((this.idTp == null && other.idTp != null) || (this.idTp != null && !this.idTp.equals(other.idTp))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscTipoPromocion[ idTp=" + this.idTp + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscTipoPromocion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */