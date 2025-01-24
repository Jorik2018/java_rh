package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "esc_historia_cap")
public class EscHistoriaCap
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_hist_cap")
  private Integer idHistCap;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String idDtra;
  @Column(name = "elaborada")
  private String elaborada;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Column(name = "fecha_doc")
  @Temporal(TemporalType.DATE)
  private Date fechaDoc;
  @OneToMany(mappedBy = "idHistCap")
  private List<EscCap> escCapList;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "idHistCap")
  private List<EscCapDocente> escCapDocenteList;
  @OneToMany(mappedBy = "idHistCap")
  private List<EscCapUns> escCapUnsList;

  public EscHistoriaCap() {
  }

  public EscHistoriaCap(Integer idHistCap) {
    this.idHistCap = idHistCap;
  }

  public EscHistoriaCap(Integer idHistCap, String idDtra, boolean estado) {
    this.idHistCap = idHistCap;
    this.idDtra = idDtra;
    this.estado = estado;
  }

  public Integer getIdHistCap() {
    return this.idHistCap;
  }

  public void setIdHistCap(Integer idHistCap) {
    this.idHistCap = idHistCap;
  }

  public String getIdDtra() {
    return this.idDtra;
  }

  public void setIdDtra(String idDtra) {
    this.idDtra = idDtra;
  }

  public String getElaborada() {
    return this.elaborada;
  }

  public void setElaborada(String elaborada) {
    this.elaborada = elaborada;
  }

  public boolean getEstado() {
    return this.estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }

  public Date getFechaDoc() {
    return this.fechaDoc;
  }

  public void setFechaDoc(Date fechaDoc) {
    this.fechaDoc = fechaDoc;
  }

  public List<EscCap> getEscCapList() {
    return this.escCapList;
  }

  public void setEscCapList(List<EscCap> escCapList) {
    this.escCapList = escCapList;
  }

  public List<EscCapDocente> getEscCapDocenteList() {
    return this.escCapDocenteList;
  }

  public void setEscCapDocenteList(List<EscCapDocente> escCapDocenteList) {
    this.escCapDocenteList = escCapDocenteList;
  }

  public List<EscCapUns> getEscCapUnsList() {
    return this.escCapUnsList;
  }

  public void setEscCapUnsList(List<EscCapUns> escCapUnsList) {
    this.escCapUnsList = escCapUnsList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idHistCap != null) ? this.idHistCap.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscHistoriaCap)) {
      return false;
    }
    EscHistoriaCap other = (EscHistoriaCap) object;
    if ((this.idHistCap == null && other.idHistCap != null)
        || (this.idHistCap != null && !this.idHistCap.equals(other.idHistCap))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscHistoriaCap[ idHistCap=" + this.idHistCap + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscHistoriaCap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */