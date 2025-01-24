package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class EscLabordependenciasPK
  implements Serializable
{
  @Basic(optional = false)
  @Column(name = "id_percl")
  private int idPercl;
  @Basic(optional = false)
  @Column(name = "labor")
  private String labor;
  @Basic(optional = false)
  @Column(name = "id_dep")
  private int idDep;
  @Basic(optional = false)
  @Column(name = "fec_ini")
  @Temporal(TemporalType.DATE)
  private Date fecIni;
  
  public EscLabordependenciasPK() {}
  
  public EscLabordependenciasPK(int idPercl, String labor, int idDep, Date fecIni) {
this.idPercl = idPercl;
this.labor = labor;
this.idDep = idDep;
this.fecIni = fecIni;
  }
  
  public int getIdPercl() {
return this.idPercl;
  }
  
  public void setIdPercl(int idPercl) {
this.idPercl = idPercl;
  }
  
  public String getLabor() {
return this.labor;
  }
  
  public void setLabor(String labor) {
this.labor = labor;
  }
  
  public int getIdDep() {
return this.idDep;
  }
  
  public void setIdDep(int idDep) {
this.idDep = idDep;
  }
  
  public Date getFecIni() {
return this.fecIni;
  }
  
  public void setFecIni(Date fecIni) {
this.fecIni = fecIni;
  }

  
  public int hashCode() {
int hash = 0;
hash += this.idPercl;
hash += (this.labor != null) ? this.labor.hashCode() : 0;
hash += this.idDep;
hash += (this.fecIni != null) ? this.fecIni.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscLabordependenciasPK)) {
  return false;
    }
EscLabordependenciasPK other = (EscLabordependenciasPK)object;
if (this.idPercl != other.idPercl) {
  return false;
    }
if ((this.labor == null && other.labor != null) || (this.labor != null && !this.labor.equals(other.labor))) {
  return false;
    }
if (this.idDep != other.idDep) {
  return false;
    }
if ((this.fecIni == null && other.fecIni != null) || (this.fecIni != null && !this.fecIni.equals(other.fecIni))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscLabordependenciasPK[ idPercl=" + this.idPercl + ", labor=" + this.labor + ", idDep=" + this.idDep + ", fecIni=" + this.fecIni + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscLabordependenciasPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */