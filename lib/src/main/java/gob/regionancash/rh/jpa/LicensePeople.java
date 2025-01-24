package gob.regionancash.rh.jpa;

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
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "per_permiso_personal")
public class LicensePeople
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_pl")
  private Integer idPl;
  @JoinColumn(name = "id_esc", referencedColumnName = "id_esc")
  @ManyToOne(optional = false)
  private Employee employee;
  @JoinColumn(name = "id_espe", referencedColumnName = "id_espe")
  @ManyToOne
  private PerEspecPl perEspecPl;
  @Column(name = "id_dtra")
  private Integer idDtra;
  @Basic(optional = false)
  @NotNull
  @Column(name = "tipo")
  private Character tipo;
  @Size(max = 100)
  @Column(name = "mension")
  private String mension;
  @Column(name = "desde")
  @Temporal(TemporalType.DATE)
  private Date desde;
  @Column(name = "hasta")
  @Temporal(TemporalType.DATE)
  private Date hasta;
  @Basic(optional = false)
  @NotNull
  @Column(name = "recuperable")
  private boolean recuperable;
  @Basic(optional = false)
  @NotNull
  @Column(name = "recuperado")
  private boolean recuperado;
  @Size(max = 60)
  @Column(name = "documento")
  private String documento;
  @Basic(optional = false)
  @NotNull
  @Column(name = "activo")
  private boolean activo;
  
  public LicensePeople() {}
  
  public LicensePeople(Integer idPl) {
this.idPl = idPl;
  }
  
  public PerEspecPl getPerEspecPl() {
return this.perEspecPl;
  }
  
  public void setPerEspecPl(PerEspecPl perEspecPl) {
this.perEspecPl = perEspecPl;
  }
  
  public Employee getEmployee() {
return this.employee;
  }
  
  public void setEmployee(Employee employee) {
this.employee = employee;
  }

  
  public Integer getIdPl() {
return this.idPl;
  }
  
  public void setIdPl(Integer idPl) {
this.idPl = idPl;
  }
  
  public Integer getIdDtra() {
return this.idDtra;
  }
  
  public void setIdDtra(Integer idDtra) {
this.idDtra = idDtra;
  }
  
  public Character getTipo() {
return this.tipo;
  }
  
  public void setTipo(Character tipo) {
this.tipo = tipo;
  }
  
  public String getMension() {
return this.mension;
  }
  
  public void setMension(String mension) {
this.mension = mension;
  }
  
  public Date getDesde() {
return this.desde;
  }
  
  public void setDesde(Date desde) {
this.desde = desde;
  }
  
  public Date getHasta() {
return this.hasta;
  }
  
  public void setHasta(Date hasta) {
this.hasta = hasta;
  }
  
  public boolean getRecuperable() {
return this.recuperable;
  }
  
  public void setRecuperable(boolean recuperable) {
this.recuperable = recuperable;
  }
  
  public boolean getRecuperado() {
return this.recuperado;
  }
  
  public void setRecuperado(boolean recuperado) {
this.recuperado = recuperado;
  }
  
  public String getDocumento() {
return this.documento;
  }
  
  public void setDocumento(String documento) {
this.documento = documento;
  }
  
  public boolean getActivo() {
return this.activo;
  }
  
  public void setActivo(boolean activo) {
this.activo = activo;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idPl != null) ? this.idPl.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof LicensePeople)) {
  return false;
    }
LicensePeople other = (LicensePeople)object;
if ((this.idPl == null && other.idPl != null) || (this.idPl != null && !this.idPl.equals(other.idPl))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.ocper.jpa.PerPermisoPersonal[ idPl=" + this.idPl + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/LicensePeople.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */