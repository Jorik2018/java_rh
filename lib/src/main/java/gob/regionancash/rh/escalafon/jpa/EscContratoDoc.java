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
@Table(name = "esc_contratos_doc")
public class EscContratoDoc
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_cnd")
  private Integer idCnd;
  @Basic(optional = false)
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Basic(optional = false)
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private String idDtra;
  @Basic(optional = false)
  @Column(name = "horas")
  private short horas;
  @Column(name = "mencion")
  private String mencion;
  @Column(name = "periodo")
  private String periodo;
  @JoinColumns({@JoinColumn(name = "id_cap", referencedColumnName = "id_cap"), @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")})
  @ManyToOne(optional = false)
  private EscCapDocente escCapDocente;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  
  public EscContratoDoc() {}
  
  public EscContratoDoc(Integer idCnd) {
this.idCnd = idCnd;
  }
  
  public EscContratoDoc(Integer idCnd, Date fechaIni, Date fechaFin, boolean estado, String idDtra, short horas) {
this.idCnd = idCnd;
this.fechaIni = fechaIni;
this.fechaFin = fechaFin;
this.estado = estado;
this.idDtra = idDtra;
this.horas = horas;
  }
  
  public Integer getIdCnd() {
return this.idCnd;
  }
  
  public void setIdCnd(Integer idCnd) {
this.idCnd = idCnd;
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
  
  public short getHoras() {
return this.horas;
  }
  
  public void setHoras(short horas) {
this.horas = horas;
  }
  
  public String getMencion() {
return this.mencion;
  }
  
  public void setMencion(String mencion) {
this.mencion = mencion;
  }
  
  public String getPeriodo() {
return this.periodo;
  }
  
  public void setPeriodo(String periodo) {
this.periodo = periodo;
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
hash += (this.idCnd != null) ? this.idCnd.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscContratoDoc)) {
  return false;
    }
EscContratoDoc other = (EscContratoDoc)object;
if ((this.idCnd == null && other.idCnd != null) || (this.idCnd != null && !this.idCnd.equals(other.idCnd))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscContratosDoc[ idCnd=" + this.idCnd + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscContratoDoc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */