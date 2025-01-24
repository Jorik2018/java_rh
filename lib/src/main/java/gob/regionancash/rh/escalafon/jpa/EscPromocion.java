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
@Table(name = "esc_promociones")
public class EscPromocion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_pro")
  private Integer idPro;
  @Basic(optional = false)
  @Column(name = "fecha_prom")
  @Temporal(TemporalType.DATE)
  private Date fechaProm;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String idDtra;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  @JoinColumn(name = "id_tp", referencedColumnName = "id_tp")
  @ManyToOne(optional = false)
  private EscTipoPromocion idTp;
  
  public EscPromocion() {}
  
  public EscPromocion(Integer idPro) {
this.idPro = idPro;
  }
  
  public EscPromocion(Integer idPro, Date fechaProm, String idDtra, boolean estado) {
this.idPro = idPro;
this.fechaProm = fechaProm;
this.idDtra = idDtra;
this.estado = estado;
  }
  
  public Integer getIdPro() {
return this.idPro;
  }
  
  public void setIdPro(Integer idPro) {
this.idPro = idPro;
  }
  
  public Date getFechaProm() {
return this.fechaProm;
  }
  
  public void setFechaProm(Date fechaProm) {
this.fechaProm = fechaProm;
  }
  
  public String getIdDtra() {
return this.idDtra;
  }
  
  public void setIdDtra(String idDtra) {
this.idDtra = idDtra;
  }
  
  public boolean getEstado() {
return this.estado;
  }
  
  public void setEstado(boolean estado) {
this.estado = estado;
  }
  
  public Date getFechaFin() {
return this.fechaFin;
  }
  
  public void setFechaFin(Date fechaFin) {
this.fechaFin = fechaFin;
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
  
  public EscTipoPromocion getIdTp() {
return this.idTp;
  }
  
  public void setIdTp(EscTipoPromocion idTp) {
this.idTp = idTp;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idPro != null) ? this.idPro.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscPromocion)) {
  return false;
    }
EscPromocion other = (EscPromocion)object;
if ((this.idPro == null && other.idPro != null) || (this.idPro != null && !this.idPro.equals(other.idPro))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscPromociones[ idPro=" + this.idPro + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscPromocion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */