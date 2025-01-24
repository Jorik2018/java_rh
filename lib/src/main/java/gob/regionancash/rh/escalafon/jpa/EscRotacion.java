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
@Table(name = "esc_rotaciones")
public class EscRotacion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_rot")
  private Integer idRot;
  @Basic(optional = false)
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
  @Basic(optional = false)
  @Column(name = "jefe")
  private boolean jefe;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_desp", referencedColumnName = "id_desp")
  @ManyToOne(optional = false)
  private EscDesplazamiento idDesp;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscRotacion() {}
  
  public EscRotacion(Integer idRot) {
this.idRot = idRot;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }
  
  public Integer getIdRot() {
return this.idRot;
  }
  
  public void setIdRot(Integer idRot) {
this.idRot = idRot;
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
  
  public boolean getJefe() {
return this.jefe;
  }
  
  public void setJefe(boolean jefe) {
this.jefe = jefe;
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

  
  public int hashCode() {
int hash = 0;
hash += (this.idRot != null) ? this.idRot.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscRotacion)) {
  return false;
    }
EscRotacion other = (EscRotacion)object;
if ((this.idRot == null && other.idRot != null) || (this.idRot != null && !this.idRot.equals(other.idRot))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscRotaciones[ idRot=" + this.idRot + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscRotacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */