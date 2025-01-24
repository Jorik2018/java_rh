package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "esc_reposiciones")
public class EscReposicion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_rep")
  private Integer idRep;
  @Column(name = "id_dtra")
  private String idDtra;
  @Column(name = "mencion")
  private String mencion;
  @Column(name = "fecha_rep")
  @Temporal(TemporalType.DATE)
  private Date fechaRep;
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Basic(optional = false)
  @Column(name = "activo")
  private boolean activo;
  @JoinColumn(name = "id", referencedColumnName = "id")
  @ManyToOne(optional = false)
  private Demerit id;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscReposicion() {}
  
  public EscReposicion(Integer idRep) {
this.idRep = idRep;
  }
  
  public EscReposicion(Integer idRep, boolean activo) {
this.idRep = idRep;
this.activo = activo;
  }
  
  public Integer getIdRep() {
return this.idRep;
  }
  
  public void setIdRep(Integer idRep) {
this.idRep = idRep;
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
  
  public Date getFechaRep() {
return this.fechaRep;
  }
  
  public void setFechaRep(Date fechaRep) {
this.fechaRep = fechaRep;
  }
  
  public Date getFechaIni() {
return this.fechaIni;
  }
  
  public void setFechaIni(Date fechaIni) {
this.fechaIni = fechaIni;
  }
  
  public boolean getActivo() {
return this.activo;
  }
  
  public void setActivo(boolean activo) {
this.activo = activo;
  }
  
  public Demerit getId() {
return this.id;
  }
  
  public void setId(Demerit id) {
this.id = id;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idRep != null) ? this.idRep.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscReposicion)) {
  return false;
    }
EscReposicion other = (EscReposicion)object;
if ((this.idRep == null && other.idRep != null) || (this.idRep != null && !this.idRep.equals(other.idRep))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscReposiciones[ idRep=" + this.idRep + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscReposicion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */