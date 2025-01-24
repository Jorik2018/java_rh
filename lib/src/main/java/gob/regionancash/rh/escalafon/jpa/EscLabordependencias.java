package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "esc_labordependencias")
public class EscLabordependencias
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected EscLabordependenciasPK escLabordependenciasPK;
  @Column(name = "fec_fin")
  @Temporal(TemporalType.DATE)
  private Date fecFin;
  @Basic(optional = false)
  @Column(name = "activo")
  private boolean activo;
  @Basic(optional = false)
  @Column(name = "jefe")
  private boolean jefe;
  @Column(name = "cod_dtra")
  private String codDtra;
  @Column(name = "descripcion")
  private String descripcion;
  @Basic(optional = false)
  @Column(name = "migrado")
  private boolean migrado;
  @JoinColumn(name = "id_percl", referencedColumnName = "id_percl", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private EscCarreraLaboral escCarreraLaboral;

  public EscLabordependencias() {
  }

  public EscLabordependencias(EscLabordependenciasPK escLabordependenciasPK) {
    this.escLabordependenciasPK = escLabordependenciasPK;
  }

  public EscLabordependencias(EscLabordependenciasPK escLabordependenciasPK, boolean activo, boolean jefe,
      boolean migrado) {
    this.escLabordependenciasPK = escLabordependenciasPK;
    this.activo = activo;
    this.jefe = jefe;
    this.migrado = migrado;
  }

  public EscLabordependencias(int idPercl, String labor, int idDep, Date fecIni) {
    this.escLabordependenciasPK = new EscLabordependenciasPK(idPercl, labor, idDep, fecIni);
  }

  public EscLabordependenciasPK getEscLabordependenciasPK() {
    return this.escLabordependenciasPK;
  }

  public void setEscLabordependenciasPK(EscLabordependenciasPK escLabordependenciasPK) {
    this.escLabordependenciasPK = escLabordependenciasPK;
  }

  public Date getFecFin() {
    return this.fecFin;
  }

  public void setFecFin(Date fecFin) {
    this.fecFin = fecFin;
  }

  public boolean getActivo() {
    return this.activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

  public boolean getJefe() {
    return this.jefe;
  }

  public void setJefe(boolean jefe) {
    this.jefe = jefe;
  }

  public String getCodDtra() {
    return this.codDtra;
  }

  public void setCodDtra(String codDtra) {
    this.codDtra = codDtra;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public boolean getMigrado() {
    return this.migrado;
  }

  public void setMigrado(boolean migrado) {
    this.migrado = migrado;
  }

  public EscCarreraLaboral getEscCarreraLaboral() {
    return this.escCarreraLaboral;
  }

  public void setEscCarreraLaboral(EscCarreraLaboral escCarreraLaboral) {
    this.escCarreraLaboral = escCarreraLaboral;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.escLabordependenciasPK != null) ? this.escLabordependenciasPK.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscLabordependencias)) {
      return false;
    }
    EscLabordependencias other = (EscLabordependencias) object;
    if ((this.escLabordependenciasPK == null && other.escLabordependenciasPK != null)
        || (this.escLabordependenciasPK != null && !this.escLabordependenciasPK.equals(other.escLabordependenciasPK))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscLabordependencias[ escLabordependenciasPK=" + this.escLabordependenciasPK + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscLabordependencias.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */