package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_categoria_doc")
public class EscCategoriaDoc
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_cat")
  private Integer idCat;
  @Column(name = "nombre")
  private String nombre;
  @OneToMany(mappedBy = "idCat")
  private List<EscNivelRemunerativoUns> escNivelRemunerativoUnsList;
  @OneToMany(mappedBy = "idCat")
  private List<EscCategoria> escCategoriaList;

  public EscCategoriaDoc() {
  }

  public EscCategoriaDoc(Integer idCat) {
    this.idCat = idCat;
  }

  public Integer getIdCat() {
    return this.idCat;
  }

  public void setIdCat(Integer idCat) {
    this.idCat = idCat;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public List<EscNivelRemunerativoUns> getEscNivelRemunerativoUnsList() {
    return this.escNivelRemunerativoUnsList;
  }

  public void setEscNivelRemunerativoUnsList(List<EscNivelRemunerativoUns> escNivelRemunerativoUnsList) {
    this.escNivelRemunerativoUnsList = escNivelRemunerativoUnsList;
  }

  public List<EscCategoria> getEscCategoriaList() {
    return this.escCategoriaList;
  }

  public void setEscCategoriaList(List<EscCategoria> escCategoriaList) {
    this.escCategoriaList = escCategoriaList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idCat != null) ? this.idCat.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscCategoriaDoc)) {
      return false;
    }
    EscCategoriaDoc other = (EscCategoriaDoc) object;
    if ((this.idCat == null && other.idCat != null) || (this.idCat != null && !this.idCat.equals(other.idCat))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscCategoriaDoc[ idCat=" + this.idCat + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscCategoriaDoc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */