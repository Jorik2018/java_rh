package gob.regionancash.hd.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "per_cargo_laboral")
public class PerCargoLaboral
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_cargo")
  private Integer idCargo;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "cargo_laboral")
  private String cargoLaboral;
  
  public PerCargoLaboral() {}
  
  public PerCargoLaboral(Integer idCargo) {
this.idCargo = idCargo;
  }
  
  public PerCargoLaboral(Integer idCargo, String cargoLaboral) {
this.idCargo = idCargo;
this.cargoLaboral = cargoLaboral;
  }
  
  public Integer getIdCargo() {
return this.idCargo;
  }
  
  public void setIdCargo(Integer idCargo) {
this.idCargo = idCargo;
  }
  
  public String getCargoLaboral() {
return this.cargoLaboral;
  }
  
  public void setCargoLaboral(String cargoLaboral) {
this.cargoLaboral = cargoLaboral;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idCargo != null) ? this.idCargo.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerCargoLaboral)) {
  return false;
    }
PerCargoLaboral other = (PerCargoLaboral)object;
if ((this.idCargo == null && other.idCargo != null) || (this.idCargo != null && !this.idCargo.equals(other.idCargo))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.PerCargoLaboral[ idCargo=" + this.idCargo + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/PerCargoLaboral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */