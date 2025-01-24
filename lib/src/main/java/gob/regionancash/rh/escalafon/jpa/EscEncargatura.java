package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.isobit.directory.jpa.Dependency;



@Entity
@Table(name = "esc_encargaturas")
public class EscEncargatura
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_enc")
  private Integer idEnc;
  @Column(name = "fec_inicio")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "fec_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Column(name = "id_dtra")
  private String idDtra;
  @Column(name = "mencion")
  private String mencion;
  @Column(name = "temporada_actual")
  private Boolean temporadaActual;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_desp", referencedColumnName = "id_desp")
  @ManyToOne(optional = false)
  private EscDesplazamiento idDesp;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  @JoinColumn(name = "id_dep", referencedColumnName = "id_dep", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Dependency orgDependencia;
  
  public Dependency getOrgDependencia() {
return this.orgDependencia;
  }
  
  public void setOrgDependencia(Dependency orgDependencia) {
this.orgDependencia = orgDependencia;
  }

  
  public EscEncargatura() {}
  
  public EscEncargatura(Integer idEnc) {
this.idEnc = idEnc;
  }
  
  public EscEncargatura(Integer idEnc, boolean estado) {
this.idEnc = idEnc;
this.estado = estado;
  }
  
  public Integer getIdEnc() {
return this.idEnc;
  }
  
  public void setIdEnc(Integer idEnc) {
this.idEnc = idEnc;
  }
  
  public Date getFechaIni() {
return this.fechaIni;
  }
  
  public void setFechaIni(Date fechaIni) {
this.fechaIni = fechaIni;
  }
  
  public Date getFechaFin() {
return this.fechaFin;
  }
  
  public void setFechaFin(Date fechaFin) {
this.fechaFin = fechaFin;
  }
  
  public boolean getEstado() {
return this.estado;
  }
  
  public void setEstado(boolean estado) {
this.estado = estado;
  }
  
  public String getIdDtra() {
return this.idDtra;
  }
  
  public void setIdDtra(String idDtra) {
this.idDtra = idDtra;
  }
  
  public String getMencion() {
return this.mencion;
  }
  
  public void setMencion(String mencion) {
this.mencion = mencion;
  }
  
  public Boolean getTemporadaActual() {
return this.temporadaActual;
  }
  
  public void setTemporadaActual(Boolean temporadaActual) {
this.temporadaActual = temporadaActual;
  }
  
  public EscCap getEscCap() {
return this.escCap;
  }
  
  public void setEscCap(EscCap escCap) {
this.escCap = escCap;
  }
  
  public EscDesplazamiento getIdDesp() {
return this.idDesp;
  }
  
  public void setIdDesp(EscDesplazamiento idDesp) {
this.idDesp = idDesp;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idEnc != null) ? this.idEnc.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscEncargatura)) {
  return false;
    }
EscEncargatura other = (EscEncargatura)object;
if ((this.idEnc == null && other.idEnc != null) || (this.idEnc != null && !this.idEnc.equals(other.idEnc))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscEncargaturas[ idEnc=" + this.idEnc + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscEncargatura.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */