package gob.regionancash.hd.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;



@Entity
@Table(name = "org_contrato")
@MenuItem(name = "contract")
public class OrgContrato
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_co")
  private Integer id;
  @Column(name = "horas")
  private Float horas;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_modalidad")
  private int idModalidad;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Column(name = "status")
  private Boolean status;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne
  @Autocomplete
  private Employee employee;
  @JoinColumn(name = "id_dtra", referencedColumnName = "id_dtra")
  @ManyToOne
  @Autocomplete
  private OrgResolucion document;
  @JoinColumn(name = "id_cargo", referencedColumnName = "id_cargo")
  @ManyToOne
  @Autocomplete
  private PerCargoLaboral position;
  @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel_r")
  @ManyToOne
  private PerNivelRemunerativo nivel;
  
  public OrgContrato() {}
  
  public OrgContrato(Integer idCo) {
this.id = idCo;
  }
  
  public OrgContrato(Integer idCo, int idModalidad, Date fechaIni) {
this.id = idCo;
this.idModalidad = idModalidad;
this.fechaIni = fechaIni;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer idCo) {
this.id = idCo;
  }
  
  public Float getHoras() {
return this.horas;
  }
  
  public void setHoras(Float horas) {
this.horas = horas;
  }
  
  public int getIdModalidad() {
return this.idModalidad;
  }
  
  public void setIdModalidad(int idModalidad) {
this.idModalidad = idModalidad;
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
  
  public Boolean getStatus() {
return this.status;
  }
  
  public void setStatus(Boolean status) {
this.status = status;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }
  
  public OrgResolucion getDocument() {
return this.document;
  }
  
  public void setDocument(OrgResolucion document) {
this.document = document;
  }
  
  public PerCargoLaboral getPosition() {
return this.position;
  }
  
  public void setPosition(PerCargoLaboral position) {
this.position = position;
  }
  
  public PerNivelRemunerativo getNivel() {
return this.nivel;
  }
  
  public void setNivel(PerNivelRemunerativo nivel) {
this.nivel = nivel;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof OrgContrato)) {
  return false;
    }
OrgContrato other = (OrgContrato)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.OrgContrato[ idCo=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/OrgContrato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */