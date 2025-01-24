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
@Table(name = "esc_gocupacional")
public class EscGrupoOcupacional
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_go")
  private Short idGo;
  @Basic(optional = false)
  @Column(name = "grupo")
  private String grupo;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idGo")
  private List<EscNivelRemunerativoUns> escNivelRemunerativoUnsList;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idGo")
  private List<EscNivelRemunerativo> escNivelRemunerativoList;

  public EscGrupoOcupacional() {
  }

  public EscGrupoOcupacional(Short idGo) {
    this.idGo = idGo;
  }

  public EscGrupoOcupacional(Short idGo, String grupo) {
    this.idGo = idGo;
    this.grupo = grupo;
  }

  public Short getIdGo() {
    return this.idGo;
  }

  public void setIdGo(Short idGo) {
    this.idGo = idGo;
  }

  public String getGrupo() {
    return this.grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public List<EscNivelRemunerativoUns> getEscNivelRemunerativoUnsList() {
    return this.escNivelRemunerativoUnsList;
  }

  public void setEscNivelRemunerativoUnsList(List<EscNivelRemunerativoUns> escNivelRemunerativoUnsList) {
    this.escNivelRemunerativoUnsList = escNivelRemunerativoUnsList;
  }

  public List<EscNivelRemunerativo> getEscNivelRemunerativoList() {
    return this.escNivelRemunerativoList;
  }

  public void setEscNivelRemunerativoList(List<EscNivelRemunerativo> escNivelRemunerativoList) {
    this.escNivelRemunerativoList = escNivelRemunerativoList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idGo != null) ? this.idGo.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscGrupoOcupacional)) {
      return false;
    }
    EscGrupoOcupacional other = (EscGrupoOcupacional) object;
    if ((this.idGo == null && other.idGo != null) || (this.idGo != null && !this.idGo.equals(other.idGo))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscGrupoOcupacional[ idGo=" + this.idGo + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscGrupoOcupacional.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */