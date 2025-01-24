package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "per_espec_pl")
public class PerEspecPl
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_espe")
  private Short idEspe;
  @JoinColumn(name = "id_tipo_pl", referencedColumnName = "id_tipo_pl")
  @ManyToOne(optional = true)
  private LicenseType permLice;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "especificacion")
  private String especificacion;
  @Size(max = 7)
  @Column(name = "id_regla")
  private String idRegla;
  
  public PerEspecPl() {}
  
  public PerEspecPl(Short idEspe) {
this.idEspe = idEspe;
  }
  
  public Short getIdEspe() {
return this.idEspe;
  }
  
  public void setIdEspe(Short idEspe) {
this.idEspe = idEspe;
  }
  
  public LicenseType getPermLice() {
return this.permLice;
  }
  
  public void setPermLice(LicenseType permLice) {
this.permLice = permLice;
  }
  
  public String getEspecificacion() {
return this.especificacion;
  }
  
  public void setEspecificacion(String especificacion) {
this.especificacion = especificacion;
  }
  
  public String getIdRegla() {
return this.idRegla;
  }
  
  public void setIdRegla(String idRegla) {
this.idRegla = idRegla;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idEspe != null) ? this.idEspe.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerEspecPl)) {
  return false;
    }
PerEspecPl other = (PerEspecPl)object;
if ((this.idEspe == null && other.idEspe != null) || (this.idEspe != null && !this.idEspe.equals(other.idEspe))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.ocper.jpa.PerEspecPl[ idEspe=" + this.idEspe + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PerEspecPl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */