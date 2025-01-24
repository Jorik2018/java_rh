package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.isobit.directory.jpa.Dependency;



@Entity
@Table(name = "esc_cap_uns")
public class EscCapUns
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected EscCapUnsPK escCapUnsPK;
  @JoinColumn(name = "id_dep", referencedColumnName = "id_dep", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private Dependency orgDependencia;
  @Column(name = "nro_cargo")
  private Short nroCargo;
  @Column(name = "cargo")
  private String cargo;
  @Column(name = "total_necesario")
  private Short totalNecesario;
  @Column(name = "codigo")
  private String codigo;
  @Column(name = "previstos")
  private Short previstos;
  @Column(name = "nombrados")
  private Short nombrados;
  @Column(name = "contratados")
  private Short contratados;
  @Column(name = "vacantes")
  private Short vacantes;
  @Column(name = "observaciones")
  private String observaciones;
  @JoinColumn(name = "id_hist_cap", referencedColumnName = "id_hist_cap")
  @ManyToOne
  private EscHistoriaCap idHistCap;
  @JoinColumns({@JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel", insertable = false, updatable = false), @JoinColumn(name = "tipo_cap", referencedColumnName = "tipo", insertable = false, updatable = false)})
  @ManyToOne(optional = false)
  private EscNivelRemunerativoUns escNivelRemunerativoUns;
  
  public Dependency getOrgDependencia() {
return this.orgDependencia;
  }
  
  public void setOrgDependencia(Dependency orgDependencia) {
this.orgDependencia = orgDependencia;
  }

  
  public EscCapUns() {}
  
  public EscCapUns(EscCapUnsPK escCapUnsPK) {
this.escCapUnsPK = escCapUnsPK;
  }
  
  public EscCapUns(int idCap, int idDep, boolean tipoCap) {
this.escCapUnsPK = new EscCapUnsPK(idCap, idDep, tipoCap);
  }
  
  public EscCapUnsPK getEscCapUnsPK() {
return this.escCapUnsPK;
  }
  
  public void setEscCapUnsPK(EscCapUnsPK escCapUnsPK) {
this.escCapUnsPK = escCapUnsPK;
  }
  
  public Short getNroCargo() {
return this.nroCargo;
  }
  
  public void setNroCargo(Short nroCargo) {
this.nroCargo = nroCargo;
  }
  
  public String getCargo() {
return this.cargo;
  }
  
  public void setCargo(String cargo) {
this.cargo = cargo;
  }
  
  public Short getTotalNecesario() {
return this.totalNecesario;
  }
  
  public void setTotalNecesario(Short totalNecesario) {
this.totalNecesario = totalNecesario;
  }
  
  public String getCodigo() {
return this.codigo;
  }
  
  public void setCodigo(String codigo) {
this.codigo = codigo;
  }
  
  public Short getPrevistos() {
return this.previstos;
  }
  
  public void setPrevistos(Short previstos) {
this.previstos = previstos;
  }
  
  public Short getNombrados() {
return this.nombrados;
  }
  
  public void setNombrados(Short nombrados) {
this.nombrados = nombrados;
  }
  
  public Short getContratados() {
return this.contratados;
  }
  
  public void setContratados(Short contratados) {
this.contratados = contratados;
  }
  
  public Short getVacantes() {
return this.vacantes;
  }
  
  public void setVacantes(Short vacantes) {
this.vacantes = vacantes;
  }
  
  public String getObservaciones() {
return this.observaciones;
  }
  
  public void setObservaciones(String observaciones) {
this.observaciones = observaciones;
  }
  
  public EscHistoriaCap getIdHistCap() {
return this.idHistCap;
  }
  
  public void setIdHistCap(EscHistoriaCap idHistCap) {
this.idHistCap = idHistCap;
  }
  
  public EscNivelRemunerativoUns getEscNivelRemunerativoUns() {
return this.escNivelRemunerativoUns;
  }
  
  public void setEscNivelRemunerativoUns(EscNivelRemunerativoUns escNivelRemunerativoUns) {
this.escNivelRemunerativoUns = escNivelRemunerativoUns;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.escCapUnsPK != null) ? this.escCapUnsPK.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscCapUns)) {
  return false;
    }
EscCapUns other = (EscCapUns)object;
if ((this.escCapUnsPK == null && other.escCapUnsPK != null) || (this.escCapUnsPK != null && !this.escCapUnsPK.equals(other.escCapUnsPK))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscCapUns[ escCapUnsPK=" + this.escCapUnsPK + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCapUns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */