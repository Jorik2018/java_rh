package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_nivel_remunerativo")
public class EscNivelRemunerativo
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_nivel")
  private Short idNivel;
  @Basic(optional = false)
  @Column(name = "nivel")
  private String nivel;
  @OneToMany(mappedBy = "nivelRem")
  private List<EscCap> escCapList;
  @JoinColumn(name = "id_go", referencedColumnName = "id_go")
  @ManyToOne(optional = false)
  private EscGrupoOcupacional idGo;

  public EscNivelRemunerativo() {
  }

  public EscNivelRemunerativo(Short idNivel) {
    this.idNivel = idNivel;
  }

  public EscNivelRemunerativo(Short idNivel, String nivel) {
    this.idNivel = idNivel;
    this.nivel = nivel;
  }

  public Short getIdNivel() {
    return this.idNivel;
  }

  public void setIdNivel(Short idNivel) {
    this.idNivel = idNivel;
  }

  public String getNivel() {
    return this.nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public List<EscCap> getEscCapList() {
    return this.escCapList;
  }

  public void setEscCapList(List<EscCap> escCapList) {
    this.escCapList = escCapList;
  }

  public EscGrupoOcupacional getIdGo() {
    return this.idGo;
  }

  public void setIdGo(EscGrupoOcupacional idGo) {
    this.idGo = idGo;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idNivel != null) ? this.idNivel.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscNivelRemunerativo)) {
      return false;
    }
    EscNivelRemunerativo other = (EscNivelRemunerativo) object;
    if ((this.idNivel == null && other.idNivel != null)
        || (this.idNivel != null && !this.idNivel.equals(other.idNivel))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscNivelRemunerativo[ idNivel=" + this.idNivel + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscNivelRemunerativo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */