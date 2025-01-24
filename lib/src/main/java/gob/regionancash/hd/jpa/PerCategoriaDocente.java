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
@Table(name = "per_categoria_docente")
public class PerCategoriaDocente
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_categoria")
  private Integer idCategoria;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 30)
  @Column(name = "categoria")
  private String name;
  
  public PerCategoriaDocente() {}
  
  public PerCategoriaDocente(Integer idCategoria) {
this.idCategoria = idCategoria;
  }
  
  public PerCategoriaDocente(Integer idCategoria, String categoria) {
this.idCategoria = idCategoria;
this.name = categoria;
  }
  
  public Integer getIdCategoria() {
return this.idCategoria;
  }
  
  public void setIdCategoria(Integer idCategoria) {
this.idCategoria = idCategoria;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String name) {
this.name = name;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idCategoria != null) ? this.idCategoria.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerCategoriaDocente)) {
  return false;
    }
PerCategoriaDocente other = (PerCategoriaDocente)object;
if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.PerCategoriaDocente[ idCategoria=" + this.idCategoria + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/PerCategoriaDocente.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */