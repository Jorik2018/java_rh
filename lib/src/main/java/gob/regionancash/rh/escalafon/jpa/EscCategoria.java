package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "esc_categoria")
public class EscCategoria
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_categoria")
  private Short idCategoria;
  @Basic(optional = false)
  @Column(name = "categoria")
  private String categoria;
  @Column(name = "dedicacion")
  private String dedicacion;
  @Basic(optional = false)
  @Column(name = "abrev_cat")
  private String abrevCat;
  @Column(name = "abrev_ded")
  private String abrevDed;
  @JoinColumn(name = "id_cat", referencedColumnName = "id_cat")
  @ManyToOne
  private EscCategoriaDoc idCat;
  
  public EscCategoria() {}
  
  public EscCategoria(Short idCategoria) {
this.idCategoria = idCategoria;
  }
  
  public EscCategoria(Short idCategoria, String categoria, String abrevCat) {
this.idCategoria = idCategoria;
this.categoria = categoria;
this.abrevCat = abrevCat;
  }
  
  public Short getIdCategoria() {
return this.idCategoria;
  }
  
  public void setIdCategoria(Short idCategoria) {
this.idCategoria = idCategoria;
  }
  
  public String getCategoria() {
return this.categoria;
  }
  
  public void setCategoria(String categoria) {
this.categoria = categoria;
  }
  
  public String getDedicacion() {
return this.dedicacion;
  }
  
  public void setDedicacion(String dedicacion) {
this.dedicacion = dedicacion;
  }
  
  public String getAbrevCat() {
return this.abrevCat;
  }
  
  public void setAbrevCat(String abrevCat) {
this.abrevCat = abrevCat;
  }
  
  public String getAbrevDed() {
return this.abrevDed;
  }
  
  public void setAbrevDed(String abrevDed) {
this.abrevDed = abrevDed;
  }

  
  public EscCategoriaDoc getIdCat() {
return this.idCat;
  }
  
  public void setIdCat(EscCategoriaDoc idCat) {
this.idCat = idCat;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idCategoria != null) ? this.idCategoria.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscCategoria)) {
  return false;
    }
EscCategoria other = (EscCategoria)object;
if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscCategoria[ idCategoria=" + this.idCategoria + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscCategoria.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */