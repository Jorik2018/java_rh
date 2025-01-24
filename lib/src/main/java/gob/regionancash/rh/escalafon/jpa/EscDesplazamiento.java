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
@Table(name = "esc_desplazamiento")
public class EscDesplazamiento
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_desp")
  private Short idDesp;
  @Column(name = "desp_personal")
  private String despPersonal;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idDesp")
  private List<EscEncargatura> escEncargaturasList;
  @OneToMany(mappedBy = "escDesplazamiento")
  private List<EscCarreraLaboral> escCarreraLaboralList;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idDesp")
  private List<EscPersDep> escPersDepList;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idDesp")
  private List<EscRotacion> escRotacionesList;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idDesp")
  private List<EscRotacionCas> escRotacionesCasList;

  public EscDesplazamiento() {
  }

  public EscDesplazamiento(Short idDesp) {
    this.idDesp = idDesp;
  }

  public Short getIdDesp() {
    return this.idDesp;
  }

  public void setIdDesp(Short idDesp) {
    this.idDesp = idDesp;
  }

  public String getDespPersonal() {
    return this.despPersonal;
  }

  public void setDespPersonal(String despPersonal) {
    this.despPersonal = despPersonal;
  }

  public List<EscEncargatura> getEscEncargaturasList() {
    return this.escEncargaturasList;
  }

  public void setEscEncargaturasList(List<EscEncargatura> escEncargaturasList) {
    this.escEncargaturasList = escEncargaturasList;
  }

  public List<EscCarreraLaboral> getEscCarreraLaboralList() {
    return this.escCarreraLaboralList;
  }

  public void setEscCarreraLaboralList(List<EscCarreraLaboral> escCarreraLaboralList) {
    this.escCarreraLaboralList = escCarreraLaboralList;
  }

  public List<EscPersDep> getEscPersDepList() {
    return this.escPersDepList;
  }

  public void setEscPersDepList(List<EscPersDep> escPersDepList) {
    this.escPersDepList = escPersDepList;
  }

  public List<EscRotacion> getEscRotacionesList() {
    return this.escRotacionesList;
  }

  public void setEscRotacionesList(List<EscRotacion> escRotacionesList) {
    this.escRotacionesList = escRotacionesList;
  }

  public List<EscRotacionCas> getEscRotacionesCasList() {
    return this.escRotacionesCasList;
  }

  public void setEscRotacionesCasList(List<EscRotacionCas> escRotacionesCasList) {
    this.escRotacionesCasList = escRotacionesCasList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idDesp != null) ? this.idDesp.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscDesplazamiento)) {
      return false;
    }
    EscDesplazamiento other = (EscDesplazamiento) object;
    if ((this.idDesp == null && other.idDesp != null) || (this.idDesp != null && !this.idDesp.equals(other.idDesp))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscDesplazamiento[ idDesp=" + this.idDesp + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscDesplazamiento.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */