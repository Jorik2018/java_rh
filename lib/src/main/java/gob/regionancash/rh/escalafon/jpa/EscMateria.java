package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_materia")
public class EscMateria
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_materia")
  private Integer idMateria;
  @Basic(optional = false)
  @Column(name = "materia")
  private String materia;

  public EscMateria() {
  }

  public EscMateria(Integer idMateria) {
    this.idMateria = idMateria;
  }

  public EscMateria(Integer idMateria, String materia) {
    this.idMateria = idMateria;
    this.materia = materia;
  }

  public Integer getIdMateria() {
    return this.idMateria;
  }

  public void setIdMateria(Integer idMateria) {
    this.idMateria = idMateria;
  }

  public String getMateria() {
    return this.materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idMateria != null) ? this.idMateria.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscMateria)) {
      return false;
    }
    EscMateria other = (EscMateria) object;
    if ((this.idMateria == null && other.idMateria != null)
        || (this.idMateria != null && !this.idMateria.equals(other.idMateria))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscMateria[ idMateria=" + this.idMateria + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscMateria.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */