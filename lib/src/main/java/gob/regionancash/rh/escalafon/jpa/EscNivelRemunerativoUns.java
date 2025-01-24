package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_nivel_remunerativo_uns")
public class EscNivelRemunerativoUns
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected EscNivelRemunerativoUnsPK escNivelRemunerativoUnsPK;
  @Basic(optional = false)
  @Column(name = "nivel")
  private String nivel;
  @Column(name = "dedicacion")
  private String dedicacion;
  @Column(name = "abrev_cat")
  private String abrevCat;
  @Column(name = "abrev_ded")
  private String abrevDed;
  @JoinColumn(name = "id_cat", referencedColumnName = "id_cat")
  @ManyToOne
  private EscCategoriaDoc idCat;
  @JoinColumn(name = "id_go", referencedColumnName = "id_go")
  @ManyToOne(optional = false)
  private EscGrupoOcupacional idGo;
  @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "escNivelRemunerativoUns")
  private List<EscCapUns> escCapUnsList;
  
  public EscNivelRemunerativoUns() {}
  
  public EscNivelRemunerativoUns(EscNivelRemunerativoUnsPK escNivelRemunerativoUnsPK) {
this.escNivelRemunerativoUnsPK = escNivelRemunerativoUnsPK;
  }
  
  public EscNivelRemunerativoUns(EscNivelRemunerativoUnsPK escNivelRemunerativoUnsPK, String nivel) {
this.escNivelRemunerativoUnsPK = escNivelRemunerativoUnsPK;
this.nivel = nivel;
  }
  
  public EscNivelRemunerativoUns(short idNivel, boolean tipo) {
this.escNivelRemunerativoUnsPK = new EscNivelRemunerativoUnsPK(idNivel, tipo);
  }
  
  public EscNivelRemunerativoUnsPK getEscNivelRemunerativoUnsPK() {
return this.escNivelRemunerativoUnsPK;
  }
  
  public void setEscNivelRemunerativoUnsPK(EscNivelRemunerativoUnsPK escNivelRemunerativoUnsPK) {
this.escNivelRemunerativoUnsPK = escNivelRemunerativoUnsPK;
  }
  
  public String getNivel() {
return this.nivel;
  }
  
  public void setNivel(String nivel) {
this.nivel = nivel;
  }
  
  public String getDedicacion() {
return this.dedicacion;
  }
  
  public void setDedicacion(String dedicacion) {
this.dedicacion = dedicacion;
  }
  
  public String getAbrevCat() {
return this.abrevCat;
  }
  
  public void setAbrevCat(String abrevCat) {
this.abrevCat = abrevCat;
  }
  
  public String getAbrevDed() {
return this.abrevDed;
  }
  
  public void setAbrevDed(String abrevDed) {
this.abrevDed = abrevDed;
  }
  
  public EscCategoriaDoc getIdCat() {
return this.idCat;
  }
  
  public void setIdCat(EscCategoriaDoc idCat) {
this.idCat = idCat;
  }
  
  public EscGrupoOcupacional getIdGo() {
return this.idGo;
  }
  
  public void setIdGo(EscGrupoOcupacional idGo) {
this.idGo = idGo;
  }
  
  public List<EscCapUns> getEscCapUnsList() {
return this.escCapUnsList;
  }
  
  public void setEscCapUnsList(List<EscCapUns> escCapUnsList) {
this.escCapUnsList = escCapUnsList;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.escNivelRemunerativoUnsPK != null) ? this.escNivelRemunerativoUnsPK.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscNivelRemunerativoUns)) {
  return false;
    }
EscNivelRemunerativoUns other = (EscNivelRemunerativoUns)object;
if ((this.escNivelRemunerativoUnsPK == null && other.escNivelRemunerativoUnsPK != null) || (this.escNivelRemunerativoUnsPK != null && !this.escNivelRemunerativoUnsPK.equals(other.escNivelRemunerativoUnsPK))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscNivelRemunerativoUns[ escNivelRemunerativoUnsPK=" + this.escNivelRemunerativoUnsPK + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscNivelRemunerativoUns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */