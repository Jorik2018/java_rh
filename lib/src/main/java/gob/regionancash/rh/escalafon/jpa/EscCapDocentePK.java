package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EscCapDocentePK
  implements Serializable
{
  @Basic(optional = false)
  @Column(name = "id_cap")
  private int idCap;
  @Basic(optional = false)
  @Column(name = "id_dep")
  private int idDep;
  
  public EscCapDocentePK() {}
  
  public EscCapDocentePK(int idCap, int idDep) {
this.idCap = idCap;
this.idDep = idDep;
  }
  
  public int getIdCap() {
return this.idCap;
  }
  
  public void setIdCap(int idCap) {
this.idCap = idCap;
  }
  
  public int getIdDep() {
return this.idDep;
  }
  
  public void setIdDep(int idDep) {
this.idDep = idDep;
  }

  
  public int hashCode() {
int hash = 0;
hash += this.idCap;
hash += this.idDep;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscCapDocentePK)) {
  return false;
    }
EscCapDocentePK other = (EscCapDocentePK)object;
if (this.idCap != other.idCap) {
  return false;
    }
if (this.idDep != other.idDep) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscCapDocentePK[ idCap=" + this.idCap + ", idDep=" + this.idDep + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCapDocentePK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */