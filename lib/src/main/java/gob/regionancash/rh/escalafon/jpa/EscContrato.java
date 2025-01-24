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
@Table(name = "esc_contratos")
public class EscContrato
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String idDtra;
  @Column(name = "mencion")
  private String mencion;
  @Basic(optional = false)
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Basic(optional = false)
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Id
  @Basic(optional = false)
  @Column(name = "id_cn")
  private Integer idCn;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Basic(optional = false)
  @Column(name = "jefe")
  private boolean jefe;
  @Column(name = "plaza")
  private Boolean plaza;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscContrato() {}
  
  public EscContrato(Integer idCn) {
this.idCn = idCn;
  }
  
  public EscContrato(Integer idCn, String idDtra, Date fechaIni, Date fechaFin, boolean estado, boolean jefe) {
this.idCn = idCn;
this.idDtra = idDtra;
this.fechaIni = fechaIni;
this.fechaFin = fechaFin;
this.estado = estado;
this.jefe = jefe;
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
  
  public Integer getIdCn() {
return this.idCn;
  }
  
  public void setIdCn(Integer idCn) {
this.idCn = idCn;
  }
  
  public boolean getEstado() {
return this.estado;
  }
  
  public void setEstado(boolean estado) {
this.estado = estado;
  }
  
  public boolean getJefe() {
return this.jefe;
  }
  
  public void setJefe(boolean jefe) {
this.jefe = jefe;
  }
  
  public Boolean getPlaza() {
return this.plaza;
  }
  
  public void setPlaza(Boolean plaza) {
this.plaza = plaza;
  }
  
  public EscCap getEscCap() {
return this.escCap;
  }
  
  public void setEscCap(EscCap escCap) {
this.escCap = escCap;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idCn != null) ? this.idCn.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscContrato)) {
  return false;
    }
EscContrato other = (EscContrato)object;
if ((this.idCn == null && other.idCn != null) || (this.idCn != null && !this.idCn.equals(other.idCn))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscContratos[ idCn=" + this.idCn + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscContrato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */