package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_servicios")
public class EscServicio
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_servicio")
  private Integer idServicio;
  @Basic(optional = false)
  @Column(name = "servicio")
  private String servicio;
  @OneToMany(mappedBy = "escServicio")
  private List<EscContratoOtro> escContratosOtrosList;
  @OneToMany(mappedBy = "escServicio")
  private List<EscCarreraLaboral> escCarreraLaboralList;
  
  public EscServicio() {}
  
  public EscServicio(Integer idServicio) {
this.idServicio = idServicio;
  }
  
  public EscServicio(Integer idServicio, String servicio) {
this.idServicio = idServicio;
this.servicio = servicio;
  }
  
  public Integer getIdServicio() {
return this.idServicio;
  }
  
  public void setIdServicio(Integer idServicio) {
this.idServicio = idServicio;
  }
  
  public String getServicio() {
return this.servicio;
  }
  
  public void setServicio(String servicio) {
this.servicio = servicio;
  }
  
  public List<EscContratoOtro> getEscContratosOtrosList() {
return this.escContratosOtrosList;
  }
  
  public void setEscContratosOtrosList(List<EscContratoOtro> escContratosOtrosList) {
this.escContratosOtrosList = escContratosOtrosList;
  }
  
  public List<EscCarreraLaboral> getEscCarreraLaboralList() {
return this.escCarreraLaboralList;
  }
  
  public void setEscCarreraLaboralList(List<EscCarreraLaboral> escCarreraLaboralList) {
this.escCarreraLaboralList = escCarreraLaboralList;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idServicio != null) ? this.idServicio.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscServicio)) {
  return false;
    }
EscServicio other = (EscServicio)object;
if ((this.idServicio == null && other.idServicio != null) || (this.idServicio != null && !this.idServicio.equals(other.idServicio))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscServicios[ idServicio=" + this.idServicio + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscServicio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */