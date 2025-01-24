package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EscCapUnsPK
  implements Serializable
{
  @Basic(optional = false)
  @Column(name = "id_cap")
  private int idCap;
  @Basic(optional = false)
  @Column(name = "id_dep")
  private int idDep;
  @Basic(optional = false)
  @Column(name = "tipo_cap")
  private boolean tipoCap;
  
  public EscCapUnsPK() {}
  
  public EscCapUnsPK(int idCap, int idDep, boolean tipoCap) {
this.idCap = idCap;
this.idDep = idDep;
this.tipoCap = tipoCap;
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
  
  public boolean getTipoCap() {
return this.tipoCap;
  }
  
  public void setTipoCap(boolean tipoCap) {
this.tipoCap = tipoCap;
  }

  
  public int hashCode() {
int hash = 0;
hash += this.idCap;
hash += this.idDep;
hash += this.tipoCap ? 1 : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscCapUnsPK)) {
  return false;
    }
EscCapUnsPK other = (EscCapUnsPK)object;
if (this.idCap != other.idCap) {
  return false;
    }
if (this.idDep != other.idDep) {
  return false;
    }
if (this.tipoCap != other.tipoCap) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscCapUnsPK[ idCap=" + this.idCap + ", idDep=" + this.idDep + ", tipoCap=" + this.tipoCap + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCapUnsPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */