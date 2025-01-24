package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import org.isobit.directory.jpa.People;
import org.isobit.util.OptionMap;

@Entity
@Table(name = "per_papeleta")
public class Ballot implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_papeleta")
  private Integer id;
  @Column(name = "id_esc_autorizo")
  private Integer idEscAutorizo;
  @Basic(optional = false)
  @Column(name = "id_esc_servidor")
  private int employeeId;
  @JoinColumn(name = "id_dir_servidor", referencedColumnName = "id_dir")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private People people;
  @Basic(optional = false)
  @Column(name = "id_tm")
  private int idTm;
  @Column(name = "especificar")
  private String especificar;
  @Basic(optional = false)
  @Column(name = "lugar")
  private String lugar = "";
  
  @Basic(optional = false)
  @Column(name = "fecha_emision")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaEmision;
  
  @Basic(optional = false)
  @Column(name = "fecha_efectiva")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaEfectiva;
  
  @Basic(optional = false)
  @Column(name = "estado")
  private String estado;
  @Column(name = "h_desde")
  @Temporal(TemporalType.TIMESTAMP)
  private Date hDesde;
  @Column(name = "h_hasta")
  @Temporal(TemporalType.TIMESTAMP)
  private Date hHasta;
  @Basic(optional = false)
  @Column(name = "retorno")
  private boolean retorno;
  @Column(name = "id_dep")
  private Integer idDep;
  @Column(name = "h_ing")
  @Temporal(TemporalType.TIMESTAMP)
  private Date hIng;
  @Column(name = "h_sal")
  @Temporal(TemporalType.TIMESTAMP)
  private Date hSal;
  @Column(name = "id_depctr")
  private Integer idDepctr;
  @Basic(optional = false)
  @Column(name = "autorizado")
  private boolean autorizado = false;
  @Transient
  private Object ext;
  private static final Map REASON_TYPE = (Map)new OptionMap();
  static {
    REASON_TYPE.put(Integer.valueOf(1), "COMISION OFICIAL DE SERVICIO");
    REASON_TYPE.put(Integer.valueOf(2), "PERMISO PARTICULAR");
    REASON_TYPE.put(Integer.valueOf(3), "SALUD");
  }
  
  public Map getREASON_TYPE() {
    return REASON_TYPE;
  }
  
  public People getPeople() {
    return this.people;
  }
  
  public void setPeople(People people) {
    this.people = people;
  }



  
  public Ballot(Integer idPapeleta) {
    this.id = idPapeleta;
  }
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer idPapeleta) {
    this.id = idPapeleta;
  }
  
  public Object getExt() {
    return this.ext;
  }
  
  public void setExt(Object ext) {
    this.ext = ext;
  }
  
  public Integer getIdEscAutorizo() {
    return this.idEscAutorizo;
  }
  
  public void setIdEscAutorizo(Integer idEscAutorizo) {
    this.idEscAutorizo = idEscAutorizo;
  }
  
  public int getIdEscServidor() {
    return this.employeeId;
  }
  
  public void setIdEscServidor(int idEscServidor) {
    this.employeeId = idEscServidor;
  }
  
  public int getIdTm() {
    return this.idTm;
  }
  
  public void setIdTm(int idTm) {
    this.idTm = idTm;
  }
  
  public String getEspecificar() {
    return this.especificar;
  }
  
  public void setEspecificar(String especificar) {
    this.especificar = especificar;
  }
  
  public String getLugar() {
    return this.lugar;
  }
  
  public void setLugar(String lugar) {
    this.lugar = lugar;
  }
  
  public Date getFechaEmision() {
    return this.fechaEmision;
  }
  
  public void setFechaEmision(Date fechaEmision) {
    this.fechaEmision = fechaEmision;
  }
  
  public Date getFechaEfectiva() {
    return this.fechaEfectiva;
  }
  
  public void setFechaEfectiva(Date fechaEfectiva) {
    this.fechaEfectiva = fechaEfectiva;
  }
  
  public String getEstado() {
    return this.estado;
  }
  
  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public Date getHDesde() {
    return this.hDesde;
  }
  
  public void setHDesde(Date hDesde) {
    this.hDesde = hDesde;
  }
  
  public Date getHHasta() {
    return this.hHasta;
  }
  
  public void setHHasta(Date hHasta) {
    this.hHasta = hHasta;
  }
  
  public boolean getRetorno() {
    return this.retorno;
  }
  
  public void setRetorno(boolean retorno) {
    this.retorno = retorno;
  }
  
  public Integer getIdDep() {
    return this.idDep;
  }
  
  public void setIdDep(Integer idDep) {
    this.idDep = idDep;
  }
  
  public Date getHIng() {
    return this.hIng;
  }
  
  public void setHIng(Date hIng) {
    this.hIng = hIng;
  }
  
  public Date getHSal() {
    return this.hSal;
  }
  
  public void setHSal(Date hSal) {
    this.hSal = hSal;
  }
  
  public Integer getIdDepctr() {
    return this.idDepctr;
  }
  
  public void setIdDepctr(Integer idDepctr) {
    this.idDepctr = idDepctr;
  }
  
  public boolean getAutorizado() {
    return this.autorizado;
  }
  
  public void setAutorizado(boolean autorizado) {
    this.autorizado = autorizado;
  }

  
  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }


  
  public boolean equals(Object object) {
    if (!(object instanceof Ballot)) {
      return false;
    }
    Ballot other = (Ballot)object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  
  public String toString() {
    return "org.jsuns.ocper.papeleta.PerPapeleta[idPapeleta=" + this.id + "]";
  }
  
  public Ballot() {}
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Ballot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */