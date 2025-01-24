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
@Table(name = "esc_nombramientos_doc")
public class EscNombramientoDoc
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_nomd")
  private Integer idNomd;
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
  @Column(name = "horas")
  private Short horas;
  @Column(name = "estado")
  private Boolean estado;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCapDocente escCapDocente;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscNombramientoDoc() {}
  
  public EscNombramientoDoc(Integer idNomd) {
this.idNomd = idNomd;
  }
  
  public EscNombramientoDoc(Integer idNomd, Date fechaNomb, String idDtra) {
this.idNomd = idNomd;
this.fechaNomb = fechaNomb;
this.idDtra = idDtra;
  }
  
  public Integer getIdNomd() {
return this.idNomd;
  }
  
  public void setIdNomd(Integer idNomd) {
this.idNomd = idNomd;
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
  
  public Short getHoras() {
return this.horas;
  }
  
  public void setHoras(Short horas) {
this.horas = horas;
  }
  
  public Boolean getEstado() {
return this.estado;
  }
  
  public void setEstado(Boolean estado) {
this.estado = estado;
  }
  
  public EscCapDocente getEscCapDocente() {
return this.escCapDocente;
  }
  
  public void setEscCapDocente(EscCapDocente escCapDocente) {
this.escCapDocente = escCapDocente;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idNomd != null) ? this.idNomd.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscNombramientoDoc)) {
  return false;
    }
EscNombramientoDoc other = (EscNombramientoDoc)object;
if ((this.idNomd == null && other.idNomd != null) || (this.idNomd != null && !this.idNomd.equals(other.idNomd))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscNombramientosDoc[ idNomd=" + this.idNomd + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscNombramientoDoc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */