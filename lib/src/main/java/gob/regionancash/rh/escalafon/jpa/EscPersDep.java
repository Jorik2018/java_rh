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



@Entity
@Table(name = "esc_pers_dep")
public class EscPersDep
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_pd")
  private Integer idPd;
  @Column(name = "fec_inicio")
  @Temporal(TemporalType.DATE)
  private Date fecInicio;
  @Column(name = "fec_fin")
  @Temporal(TemporalType.DATE)
  private Date fecFin;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Column(name = "id_dtra")
  private String idDtra;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_desp", referencedColumnName = "id_desp")
  @ManyToOne(optional = false)
  private EscDesplazamiento idDesp;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscPersDep() {}
  
  public EscPersDep(Integer idPd) {
this.idPd = idPd;
  }
  
  public EscPersDep(Integer idPd, boolean estado) {
this.idPd = idPd;
this.estado = estado;
  }
  
  public Integer getIdPd() {
return this.idPd;
  }
  
  public void setIdPd(Integer idPd) {
this.idPd = idPd;
  }
  
  public Date getFecInicio() {
return this.fecInicio;
  }
  
  public void setFecInicio(Date fecInicio) {
this.fecInicio = fecInicio;
  }
  
  public Date getFecFin() {
return this.fecFin;
  }
  
  public void setFecFin(Date fecFin) {
this.fecFin = fecFin;
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
hash += (this.idPd != null) ? this.idPd.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscPersDep)) {
  return false;
    }
EscPersDep other = (EscPersDep)object;
if ((this.idPd == null && other.idPd != null) || (this.idPd != null && !this.idPd.equals(other.idPd))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscPersDep[ idPd=" + this.idPd + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscPersDep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */