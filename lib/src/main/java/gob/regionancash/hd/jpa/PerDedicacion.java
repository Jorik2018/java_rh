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
@Table(name = "per_dedicacion")
public class PerDedicacion
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "iddedicacion")
  private Integer id;
  @Size(max = 30)
  @Column(name = "nombre")
  private String name;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 6)
  @Column(name = "sigla")
  private String sigla;
  @Basic(optional = false)
  @NotNull
  @Column(name = "parcial")
  private int parcial;
  
  public PerDedicacion() {}
  
  public PerDedicacion(Integer iddedicacion) {
this.id = iddedicacion;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String name) {
this.name = name;
  }

  
  public String getSigla() {
return this.sigla;
  }
  
  public void setSigla(String sigla) {
this.sigla = sigla;
  }
  
  public int getParcial() {
return this.parcial;
  }
  
  public void setParcial(int parcial) {
this.parcial = parcial;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerDedicacion)) {
  return false;
    }
PerDedicacion other = (PerDedicacion)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.PerDedicacion[ iddedicacion=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/PerDedicacion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */