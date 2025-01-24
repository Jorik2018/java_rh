package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "drt_pernatparent")
public class Relative
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_pariente")
  private Integer idPariente;
  @Column(name = "id_dirperfam")
  private Integer idDirperfam;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_dirperuns")
  private int idDirperuns;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_pprn")
  private short idPprn;
  @Basic(optional = false)
  @NotNull
  @Column(name = "vive_parent")
  private boolean alive;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_pnec")
  private short idPnec;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_grdins")
  private short idGrdins;
  @Size(max = 120)
  @Column(name = "nombre_parent")
private String nombreParent = "";
  @Column(name = "fecha_nac")
  @Temporal(TemporalType.DATE)
  private Date fechaNac;
  @Size(max = 200)
  @Column(name = "ocupacion")
private String ocupacion = "";
  @Size(max = 60)
  @Column(name = "paterno_parent")
private String paternoParent = "";
  @Size(max = 60)
  @Column(name = "materno_parent")
private String maternoParent = "";
  
  @Basic(optional = false)
  @NotNull
  @Column(name = "discapacitado_parent")
  private boolean disabled;

  
  public Relative() {}

  
  public Relative(Integer idPariente) {
this.idPariente = idPariente;
  }
  
  public Integer getIdPariente() {
return this.idPariente;
  }
  
  public void setIdPariente(Integer idPariente) {
this.idPariente = idPariente;
  }
  
  public Integer getIdDirperfam() {
return this.idDirperfam;
  }
  
  public void setIdDirperfam(Integer idDirperfam) {
this.idDirperfam = idDirperfam;
  }
  
  public int getIdDirperuns() {
return this.idDirperuns;
  }
  
  public void setIdDirperuns(int idDirperuns) {
this.idDirperuns = idDirperuns;
  }
  
  public short getIdPprn() {
return this.idPprn;
  }
  
  public void setIdPprn(short idPprn) {
this.idPprn = idPprn;
  }
  
  public boolean isAlive() {
return this.alive;
  }
  
  public void setAlive(boolean alive) {
this.alive = alive;
  }
  
  public boolean isDisabled() {
return this.disabled;
  }
  
  public void setDisabled(boolean disabled) {
this.disabled = disabled;
  }
  
  public short getIdPnec() {
return this.idPnec;
  }
  
  public void setIdPnec(short idPnec) {
this.idPnec = idPnec;
  }
  
  public short getIdGrdins() {
return this.idGrdins;
  }
  
  public void setIdGrdins(short idGrdins) {
this.idGrdins = idGrdins;
  }
  
  public String getNombreParent() {
return this.nombreParent;
  }
  
  public void setNombreParent(String nombreParent) {
this.nombreParent = nombreParent;
  }
  
  public Date getFechaNac() {
return this.fechaNac;
  }
  
  public void setFechaNac(Date fechaNac) {
this.fechaNac = fechaNac;
  }
  
  public String getOcupacion() {
return this.ocupacion;
  }
  
  public void setOcupacion(String ocupacion) {
this.ocupacion = ocupacion;
  }
  
  public String getPaternoParent() {
return this.paternoParent;
  }
  
  public void setPaternoParent(String paternoParent) {
this.paternoParent = paternoParent;
  }
  
  public String getMaternoParent() {
return this.maternoParent;
  }
  
  public void setMaternoParent(String maternoParent) {
this.maternoParent = maternoParent;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idPariente != null) ? this.idPariente.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Relative)) {
  return false;
    }
Relative other = (Relative)object;
if ((this.idPariente == null && other.idPariente != null) || (this.idPariente != null && !this.idPariente.equals(other.idPariente))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.jpa.DrtPernatparent[ idPariente=" + this.idPariente + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Relative.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */