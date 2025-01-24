package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.io.Serializable;
import java.util.Date;
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
import jakarta.persistence.TableGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import org.isobit.directory.jpa.Company;

@Entity
@Table(name = "esc_estudios")
public class Study2
    implements Serializable {
      
  @Column(name = "nro_matricula")
  private Integer nroMatricula;
  @Column(name = "id_inst")
  private Integer idInstitucion;
  @Transient
  private Company institucion;
  @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")
  @ManyToOne(optional = false)
  private EscNivelEstudio nivel;
  private static final long serialVersionUID = 1L;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false, fetch = FetchType.LAZY)
  private Employee employee;
  @Column(name = "fecha")
  @Temporal(TemporalType.DATE)
  private Date fecha;
  @Column(name = "mension")
  private String mension;
  @Basic(optional = false)
  @Column(name = "materia")
  private String materia;
  @Id
  @Basic(optional = false)
  @TableGenerator(table = "sequence", pkColumnValue = "id_estud", pkColumnName = "seq_name", valueColumnName = "seq_count", name = "id", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.TABLE, generator = "id")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "estado")
  private boolean estado;
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Column(name = "fecha_aprcu")
  @Temporal(TemporalType.DATE)
  private Date fechaAprcu;
  @Column(name = "nro_libro")
  private Integer nroLibro;
  @Column(name = "folio")
  private Integer folio;
  @Column(name = "nro_orden")
  private Integer nroOrden;
  @Column(name = "grado_abrev")
  private String gradoAbrev;

  public Study2() {
  }

  public Study2(Integer id) {
    this.id = id;
  }

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Integer getIdInstitucion() {
    return this.idInstitucion;
  }

  public void setIdInstitucion(Integer idInstitucion) {
    this.idInstitucion = idInstitucion;
  }

  public Date getFecha() {
    return this.fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public String getMension() {
    return this.mension;
  }

  public void setMension(String mension) {
    this.mension = mension;
  }

  public String getMateria() {
    return this.materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public boolean getEstado() {
    return this.estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
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

  public Date getFechaAprcu() {
    return this.fechaAprcu;
  }

  public void setFechaAprcu(Date fechaAprcu) {
    this.fechaAprcu = fechaAprcu;
  }

  public Integer getNroLibro() {
    return this.nroLibro;
  }

  public void setNroLibro(Integer nroLibro) {
    this.nroLibro = nroLibro;
  }

  public Integer getFolio() {
    return this.folio;
  }

  public void setFolio(Integer folio) {
    this.folio = folio;
  }

  public Integer getNroOrden() {
    return this.nroOrden;
  }

  public void setNroOrden(Integer nroOrden) {
    this.nroOrden = nroOrden;
  }

  public String getGradoAbrev() {
    return this.gradoAbrev;
  }

  public void setGradoAbrev(String gradoAbrev) {
    this.gradoAbrev = gradoAbrev;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof Study2)) {
      return false;
    }
    Study2 other = (Study2) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.ocper.trabajador.EscEstudios[id=" + this.id + "]";
  }

  public Integer getNroMatricula() {
    return this.nroMatricula;
  }

  public void setNroMatricula(Integer nroMatricula) {
    this.nroMatricula = nroMatricula;
  }

  public Company getInstitucion() {
    return this.institucion;
  }

  public void setInstitucion(Company institucion) {
    this.institucion = institucion;
  }

  public EscNivelEstudio getNivel() {
    return this.nivel;
  }

  public void setNivel(EscNivelEstudio nivelEstudios) {
    this.nivel = nivelEstudios;
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/Study2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */