package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "per_perm_lice")
public class LicenseType
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_tipo_pl")
  private Short idTipoPl;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 70)
  @Column(name = "tipo")
  private String tipo;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 3)
  @Column(name = "abrev")
  private String abrev;
  
  public LicenseType() {}
  
  public LicenseType(Short idTipoPl) {
this.idTipoPl = idTipoPl;
  }
  
  public LicenseType(Short idTipoPl, String tipo, String abrev) {
this.idTipoPl = idTipoPl;
this.tipo = tipo;
this.abrev = abrev;
  }
  
  public Short getIdTipoPl() {
return this.idTipoPl;
  }
  
  public void setIdTipoPl(Short idTipoPl) {
this.idTipoPl = idTipoPl;
  }
  
  public String getTipo() {
return this.tipo;
  }
  
  public void setTipo(String tipo) {
this.tipo = tipo;
  }
  
  public String getAbrev() {
return this.abrev;
  }
  
  public void setAbrev(String abrev) {
this.abrev = abrev;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idTipoPl != null) ? this.idTipoPl.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof LicenseType)) {
  return false;
    }
LicenseType other = (LicenseType)object;
if ((this.idTipoPl == null && other.idTipoPl != null) || (this.idTipoPl != null && !this.idTipoPl.equals(other.idTipoPl))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "edu.uns.ocper.jpa.PerPermLice[ idTipoPl=" + this.idTipoPl + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/LicenseType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */