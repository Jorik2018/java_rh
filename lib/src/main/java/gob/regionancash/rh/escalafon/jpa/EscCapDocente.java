package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.isobit.directory.jpa.Dependency;

@Entity
@Table(name = "esc_cap_docente")
public class EscCapDocente
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected EscCapDocentePK escCapDocentePK;
  @Basic(optional = false)
  @Column(name = "nro_cargo")
  private short nroCargo;
  @Basic(optional = false)
  @Column(name = "total_necesario")
  private short totalNecesario;
  @Basic(optional = false)
  @Column(name = "previstos")
  private short previstos;
  @Basic(optional = false)
  @Column(name = "nombrados")
  private short nombrados;
  @Basic(optional = false)
  @Column(name = "vacantes")
  private short vacantes;
  @Column(name = "observaciones")
  private String observaciones;
  @Column(name = "cargo")
  private String cargo;
  @Column(name = "codigo")
  private String codigo;
  @Column(name = "contratados")
  private Integer contratados;
  @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
  @ManyToOne(optional = false)
  private EscCategoria categoria;
  @JoinColumn(name = "id_hist_cap", referencedColumnName = "id_hist_cap")
  @ManyToOne(optional = false)
  private EscHistoriaCap idHistCap;
  @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCapDocente")
  private List<EscPromocionDoc> escPromocionesDocList;
  @JoinColumn(name = "id_dep", referencedColumnName = "id_dep", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private Dependency dependency;

  public Dependency getDependency() {
    return this.dependency;
  }

  public void setDependency(Dependency dependencia) {
    this.dependency = dependencia;
  }

  public EscCapDocente() {
  }

  public EscCapDocente(EscCapDocentePK escCapDocentePK) {
    this.escCapDocentePK = escCapDocentePK;
  }

  public EscCapDocente(EscCapDocentePK escCapDocentePK, short nroCargo, short totalNecesario, short previstos,
      short nombrados, short vacantes) {
    this.escCapDocentePK = escCapDocentePK;
    this.nroCargo = nroCargo;
    this.totalNecesario = totalNecesario;
    this.previstos = previstos;
    this.nombrados = nombrados;
    this.vacantes = vacantes;
  }

  public EscCapDocente(int idCap, int idDep) {
    this.escCapDocentePK = new EscCapDocentePK(idCap, idDep);
  }

  public EscCapDocentePK getEscCapDocentePK() {
    return this.escCapDocentePK;
  }

  public void setEscCapDocentePK(EscCapDocentePK escCapDocentePK) {
    this.escCapDocentePK = escCapDocentePK;
  }

  public short getNroCargo() {
    return this.nroCargo;
  }

  public void setNroCargo(short nroCargo) {
    this.nroCargo = nroCargo;
  }

  public short getTotalNecesario() {
    return this.totalNecesario;
  }

  public void setTotalNecesario(short totalNecesario) {
    this.totalNecesario = totalNecesario;
  }

  public short getPrevistos() {
    return this.previstos;
  }

  public void setPrevistos(short previstos) {
    this.previstos = previstos;
  }

  public short getNombrados() {
    return this.nombrados;
  }

  public void setNombrados(short nombrados) {
    this.nombrados = nombrados;
  }

  public short getVacantes() {
    return this.vacantes;
  }

  public void setVacantes(short vacantes) {
    this.vacantes = vacantes;
  }

  public String getObservaciones() {
    return this.observaciones;
  }

  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  public String getCargo() {
    return this.cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getCodigo() {
    return this.codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public Integer getContratados() {
    return this.contratados;
  }

  public void setContratados(Integer contratados) {
    this.contratados = contratados;
  }

  public EscCategoria getCategoria() {
    return this.categoria;
  }

  public void setCategoria(EscCategoria idCategoria) {
    this.categoria = idCategoria;
  }

  public EscHistoriaCap getIdHistCap() {
    return this.idHistCap;
  }

  public void setIdHistCap(EscHistoriaCap idHistCap) {
    this.idHistCap = idHistCap;
  }

  public List<EscPromocionDoc> getEscPromocionesDocList() {
    return this.escPromocionesDocList;
  }

  public void setEscPromocionesDocList(List<EscPromocionDoc> escPromocionesDocList) {
    this.escPromocionesDocList = escPromocionesDocList;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.escCapDocentePK != null) ? this.escCapDocentePK.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof EscCapDocente)) {
      return false;
    }
    EscCapDocente other = (EscCapDocente) object;
    if ((this.escCapDocentePK == null && other.escCapDocentePK != null)
        || (this.escCapDocentePK != null && !this.escCapDocentePK.equals(other.escCapDocentePK))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.jsuns.escalafon.jpa.EscCapDocente[ escCapDocentePK=" + this.escCapDocentePK + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/EscCapDocente.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */