package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import gob.regionancash.rh.jpa.EscTipoPersonal;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.isobit.directory.jpa.Dependency;

@Entity
@Table(name = "esc_carreralaboral")
public class EscCarreraLaboral
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_percl")
  private Integer idPercl;
  @Column(name = "id_percl_de")
  private Integer idPerclDe;
  @Column(name = "id_cap")
  private Integer idCap;
  @Column(name = "tipo_cap")
  private Boolean tipoCap;
  @Basic(optional = false)
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Column(name = "cod_dtra")
  private String codDtra;
  @Basic(optional = false)
  @Column(name = "condicion")
  private short condicion;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Basic(optional = false)
  @Column(name = "jefe")
  private boolean jefe;
  @Basic(optional = false)
  @Column(name = "plaza")
  private boolean plaza;
  @Basic(optional = false)
  @Column(name = "servicio")
  private boolean servicio;
  @Column(name = "horas")
  private Short horas;
  @Column(name = "monto")
  private BigDecimal monto;
  @Column(name = "mencion")
  private String mencion;
  @Basic(optional = false)
  @Column(name = "migrado")
  private boolean migrado;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCarreraLaboral")
  private List<EscLabordependencias> escLabordependenciasList;
  @JoinColumn(name = "id_desp", referencedColumnName = "id_desp")
  @ManyToOne(fetch = FetchType.LAZY)
  private EscDesplazamiento escDesplazamiento;
  @JoinColumn(name = "id_mov", referencedColumnName = "id_mov")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private EscMovimiento escMovimiento;
  @JoinColumn(name = "id_movmod", referencedColumnName = "id_movmod")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private EscMovmodalidad idMovmod;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Employee employee;
  @JoinColumn(name = "id_servicio", referencedColumnName = "id_servicio")
  @ManyToOne
  private EscServicio escServicio;
  @JoinColumn(name = "id_dep", referencedColumnName = "id_dep")
  @ManyToOne(fetch = FetchType.LAZY)
  private Dependency orgDependencia;
  @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
  @ManyToOne(optional = false)
  private EscTipoPersonal escTipoPersonal;
  @JoinColumn(name = "id_tp", referencedColumnName = "id_tp")
  @ManyToOne(fetch = FetchType.LAZY)
  private EscTipoPromocion idTp;
  @JoinColumns({ @JoinColumn(name = "id_cap", referencedColumnName = "id_cap", insertable = false, updatable = false),
      @JoinColumn(name = "id_dep", referencedColumnName = "id_dep", insertable = false, updatable = false),
      @JoinColumn(name = "tipo_cap", referencedColumnName = "tipo_cap", insertable = false, updatable = false) })
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private EscCapUns escCapUns;

  public EscCapUns getEscCapUns() {
    return this.escCapUns;
  }

  public void setEscCapUns(EscCapUns escCapUns) {
    this.escCapUns = escCapUns;
  }

  public Dependency getOrgDependencia() {
    return this.orgDependencia;
  }

  public void setOrgDependencia(Dependency orgDependencia) {
    this.orgDependencia = orgDependencia;
  }

  public EscCarreraLaboral() {
  }

  public EscCarreraLaboral(Integer idPercl) {
    this.idPercl = idPercl;
  }

  public EscCarreraLaboral(Integer idPercl, Date fechaIni, short condicion, boolean estado, boolean jefe, boolean plaza,
      boolean servicio, boolean migrado) {
    this.idPercl = idPercl;
    this.fechaIni = fechaIni;
    this.condicion = condicion;
    this.estado = estado;
    this.jefe = jefe;
    this.plaza = plaza;
    this.servicio = servicio;
    this.migrado = migrado;
  }

  public Integer getIdPercl() {
    return this.idPercl;
  }

  public void setIdPercl(Integer idPercl) {
    this.idPercl = idPercl;
  }

  public Integer getIdPerclDe() {
    return this.idPerclDe;
  }

  public EscDesplazamiento getEscDesplazamiento() {
    return this.escDesplazamiento;
  }

  public void setEscDesplazamiento(EscDesplazamiento escDesplazamiento) {
    this.escDesplazamiento = escDesplazamiento;
  }

  public void setIdPerclDe(Integer idPerclDe) {
    this.idPerclDe = idPerclDe;
  }

  public Integer getIdCap() {
    return this.idCap;
  }

  public void setIdCap(Integer idCap) {
    this.idCap = idCap;
  }

  public Boolean getTipoCap() {
    return this.tipoCap;
  }

  public void setTipoCap(Boolean tipoCap) {
    this.tipoCap = tipoCap;
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

  public String getCodDtra() {
    return this.codDtra;
  }

  public void setCodDtra(String codDtra) {
    this.codDtra = codDtra;
  }

  public short getCondicion() {
    return this.condicion;
  }

  public void setCondicion(short condicion) {
    this.condicion = condicion;
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

  public boolean getPlaza() {
    return this.plaza;
  }

  public void setPlaza(boolean plaza) {
    this.plaza = plaza;
  }

  public boolean getServicio() {
    return this.servicio;
  }

  public void setServicio(boolean servicio) {
    this.servicio = servicio;
  }

  public Short getHoras() {
    return this.horas;
  }

  public void setHoras(Short horas) {
    this.horas = horas;
  }

  public BigDecimal getMonto() {
    return this.monto;
  }

  public void setMonto(BigDecimal monto) {
    this.monto = monto;
  }

  public String getMencion() {
    return this.mencion;
  }

  public void setMencion(String mencion) {
    this.mencion = mencion;
  }

  public boolean getMigrado() {
    return this.migrado;
  }

  public void setMigrado(boolean migrado) {
    this.migrado = migrado;
  }

  public List<EscLabordependencias> getEscLabordependenciasList() {
    return this.escLabordependenciasList;
  }

  public void setEscLabordependenciasList(List<EscLabordependencias> escLabordependenciasList) {
    this.escLabordependenciasList = escLabordependenciasList;
  }

  public EscMovimiento getEscMovimiento() {
    return this.escMovimiento;
  }

  public void setEscMovimiento(EscMovimiento escMovimiento) {
    this.escMovimiento = escMovimiento;
  }

  public EscTipoPersonal getEscTipoPersonal() {
    return this.escTipoPersonal;
  }

  public void setEscTipoPersonal(EscTipoPersonal escTipoPersonal) {
    this.escTipoPersonal = escTipoPersonal;
  }

  public EscMovmodalidad getIdMovmod() {
    return this.idMovmod;
  }

  public void setIdMovmod(EscMovmodalidad idMovmod) {
    this.idMovmod = idMovmod;
  }

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public EscServicio getEscServicio() {
    return this.escServicio;
  }

  public void setEscServicio(EscServicio escServicio) {
    this.escServicio = escServicio;
  }

  public EscTipoPersonal getIdTipo() {
    return this.escTipoPersonal;
  }

  public void setIdTipo(EscTipoPersonal idTipo) {
    this.escTipoPersonal = idTipo;
  }

  public EscTipoPromocion getIdTp() {
    return this.idTp;
  }

  public void setIdTp(EscTipoPromocion idTp) {
    this.idTp = idTp;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.idPercl != null) ? this.idPercl.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscCarreraLaboral)) {
      return false;
    }
    EscCarreraLaboral other = (EscCarreraLaboral) object;
    if ((this.idPercl == null && other.idPercl != null)
        || (this.idPercl != null && !this.idPercl.equals(other.idPercl))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscCarreraLaboral[ idPercl=" + this.idPercl + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscCarreraLaboral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */