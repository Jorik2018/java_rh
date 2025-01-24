package gob.regionancash.hd.jpa;

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
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "org_resolucion")
@MenuItem(name = "document")
public class OrgResolucion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_dtra")
  private Integer idDtra;
  @Size(max = 40)
  @Column(name = "extension")
  private String extension;
  @Column(name = "fecha")
  @Temporal(TemporalType.DATE)
  private Date fecha;
  
  public OrgResolucion() {}
  
  public OrgResolucion(Integer idDtra) {
this.idDtra = idDtra;
  }
  
  public Integer getIdDtra() {
return this.idDtra;
  }
  
  public void setIdDtra(Integer idDtra) {
this.idDtra = idDtra;
  }
  
  public String getExtension() {
return this.extension;
  }
  
  public void setExtension(String extension) {
this.extension = extension;
  }
  
  public Date getFecha() {
return this.fecha;
  }
  
  public void setFecha(Date fecha) {
this.fecha = fecha;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idDtra != null) ? this.idDtra.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof OrgResolucion)) {
  return false;
    }
OrgResolucion other = (OrgResolucion)object;
if ((this.idDtra == null && other.idDtra != null) || (this.idDtra != null && !this.idDtra.equals(other.idDtra))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.OrgResolucion[ idDtra=" + this.idDtra + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/OrgResolucion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */