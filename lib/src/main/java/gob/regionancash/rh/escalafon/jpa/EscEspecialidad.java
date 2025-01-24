package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_especialidad")
public class EscEspecialidad
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_esp")
  private Short idEsp;
  @Basic(optional = false)
  @Column(name = "especialidad")
  private String especialidad;
  @Column(name = "abrev")
  private String abrev;

  public EscEspecialidad() {
  }

  public EscEspecialidad(Short idEsp) {
    this.idEsp = idEsp;
  }

  public EscEspecialidad(Short idEsp, String especialidad) {
    this.idEsp = idEsp;
    this.especialidad = especialidad;
  }

  public Short getIdEsp() {
    return this.idEsp;
  }

  public void setIdEsp(Short idEsp) {
    this.idEsp = idEsp;
  }

  public String getEspecialidad() {
    return this.especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public String getAbrev() {
    return this.abrev;
  }

  public void setAbrev(String abrev) {
    this.abrev = abrev;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idEsp != null) ? this.idEsp.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscEspecialidad)) {
      return false;
    }
    EscEspecialidad other = (EscEspecialidad) object;
    if ((this.idEsp == null && other.idEsp != null) || (this.idEsp != null && !this.idEsp.equals(other.idEsp))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscEspecialidad[ idEsp=" + this.idEsp + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscEspecialidad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */