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
@Table(name = "esc_movimientos")
public class EscMovimiento
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_mov")
  private Short idMov;
  @Basic(optional = false)
  @Column(name = "movimiento")
  private String movimiento;
  @Basic(optional = false)
  @Column(name = "abrev")
  private String abrev;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escMovimiento")
  private List<EscCarreraLaboral> escCarreraLaboralList;

  public EscMovimiento() {
  }

  public EscMovimiento(Short idMov) {
    this.idMov = idMov;
  }

  public EscMovimiento(Short idMov, String movimiento, String abrev) {
    this.idMov = idMov;
    this.movimiento = movimiento;
    this.abrev = abrev;
  }

  public Short getIdMov() {
    return this.idMov;
  }

  public void setIdMov(Short idMov) {
    this.idMov = idMov;
  }

  public String getMovimiento() {
    return this.movimiento;
  }

  public void setMovimiento(String movimiento) {
    this.movimiento = movimiento;
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
    hash += (this.idMov != null) ? this.idMov.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscMovimiento)) {
      return false;
    }
    EscMovimiento other = (EscMovimiento) object;
    if ((this.idMov == null && other.idMov != null) || (this.idMov != null && !this.idMov.equals(other.idMov))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscMovimientos[ idMov=" + this.idMov + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscMovimiento.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */