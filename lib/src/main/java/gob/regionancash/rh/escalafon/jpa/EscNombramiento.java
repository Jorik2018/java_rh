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
@Table(name = "esc_nombramientos")
public class EscNombramiento
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_nom")
  private Integer idNom;
  @Basic(optional = false)
  @Column(name = "fecha_nomb")
  @Temporal(TemporalType.DATE)
  private Date fechaNomb;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String idDtra;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCap escCap;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscNombramiento() {}
  
  public EscNombramiento(Integer idNom) {
this.idNom = idNom;
  }
  
  public EscNombramiento(Integer idNom, Date fechaNomb, String idDtra) {
this.idNom = idNom;
this.fechaNomb = fechaNomb;
this.idDtra = idDtra;
  }
  
  public Integer getIdNom() {
return this.idNom;
  }
  
  public void setIdNom(Integer idNom) {
this.idNom = idNom;
  }
  
  public Date getFechaNomb() {
return this.fechaNomb;
  }
  
  public void setFechaNomb(Date fechaNomb) {
this.fechaNomb = fechaNomb;
  }
  
  public String getIdDtra() {
return this.idDtra;
  }
  
  public void setIdDtra(String idDtra) {
this.idDtra = idDtra;
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

  
  public int hashCode() {
int hash = 0;
hash += (this.idNom != null) ? this.idNom.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscNombramiento)) {
  return false;
    }
EscNombramiento other = (EscNombramiento)object;
if ((this.idNom == null && other.idNom != null) || (this.idNom != null && !this.idNom.equals(other.idNom))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscNombramientos[ idNom=" + this.idNom + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscNombramiento.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */