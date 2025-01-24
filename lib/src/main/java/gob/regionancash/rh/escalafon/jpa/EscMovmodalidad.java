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
@Table(name = "esc_movmodalidad")
public class EscMovmodalidad
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_movmod")
  private Short idMovmod;
  @Basic(optional = false)
  @Column(name = "modalidad")
  private String modalidad;
  @Basic(optional = false)
  @Column(name = "abrev")
  private String abrev;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idMovmod")
  private List<EscCarreraLaboral> escCarreraLaboralList;

  public EscMovmodalidad() {
  }

  public EscMovmodalidad(Short idMovmod) {
    this.idMovmod = idMovmod;
  }

  public EscMovmodalidad(Short idMovmod, String modalidad, String abrev) {
    this.idMovmod = idMovmod;
    this.modalidad = modalidad;
    this.abrev = abrev;
  }

  public Short getIdMovmod() {
    return this.idMovmod;
  }

  public void setIdMovmod(Short idMovmod) {
    this.idMovmod = idMovmod;
  }

  public String getModalidad() {
    return this.modalidad;
  }

  public void setModalidad(String modalidad) {
    this.modalidad = modalidad;
  }

  public String getAbrev() {
    return this.abrev;
  }

  public void setAbrev(String abrev) {
    this.abrev = abrev;
  }

  public List<EscCarreraLaboral> getEscCarreraLaboralList() {
    return this.escCarreraLaboralList;
  }

  public void setEscCarreraLaboralList(List<EscCarreraLaboral> escCarreraLaboralList) {
    this.escCarreraLaboralList = escCarreraLaboralList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idMovmod != null) ? this.idMovmod.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscMovmodalidad)) {
      return false;
    }
    EscMovmodalidad other = (EscMovmodalidad) object;
    if ((this.idMovmod == null && other.idMovmod != null)
        || (this.idMovmod != null && !this.idMovmod.equals(other.idMovmod))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscMovmodalidad[ idMovmod=" + this.idMovmod + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscMovmodalidad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */