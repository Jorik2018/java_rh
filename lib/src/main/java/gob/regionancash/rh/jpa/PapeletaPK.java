package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PapeletaPK
  implements Serializable {
  @Basic(optional = false)
  @Column(name = "ano_eje")
  private String anoEje;
  @Basic(optional = false)
  @Column(name = "n_papeleta")
  private String nPapeleta;
  
  public PapeletaPK() {}
  
  public PapeletaPK(String anoEje, String nPapeleta) {
this.anoEje = anoEje;
this.nPapeleta = nPapeleta;
  }
  
  public String getAnoEje() {
return this.anoEje;
  }
  
  public void setAnoEje(String anoEje) {
this.anoEje = anoEje;
  }
  
  public String getNPapeleta() {
return this.nPapeleta;
  }
  
  public void setNPapeleta(String nPapeleta) {
this.nPapeleta = nPapeleta;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.anoEje != null) ? this.anoEje.hashCode() : 0;
hash += (this.nPapeleta != null) ? this.nPapeleta.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PapeletaPK)) {
  return false;
    }
PapeletaPK other = (PapeletaPK)object;
if ((this.anoEje == null && other.anoEje != null) || (this.anoEje != null && !this.anoEje.equals(other.anoEje))) {
  return false;
    }
if ((this.nPapeleta == null && other.nPapeleta != null) || (this.nPapeleta != null && !this.nPapeleta.equals(other.nPapeleta))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "javaapplication1.PapeletaPK[ anoEje=" + this.anoEje + ", nPapeleta=" + this.nPapeleta + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/PapeletaPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */