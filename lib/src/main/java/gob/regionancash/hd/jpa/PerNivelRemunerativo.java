package gob.regionancash.hd.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "per_nivel_remunerativo")
public class PerNivelRemunerativo
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_nivel_r")
  private Integer idNivelR;
  @Column(name = "id_grupo_o")
  private Integer idGrupoO;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 30)
  @Column(name = "nivel")
  private String nivel;
  @Size(max = 100)
  @Column(name = "descripcion")
  private String description;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_nivel")
  private int idNivel;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_go")
  private int idGo;
  @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
  @ManyToOne
  private PerCategoriaDocente category;
  @JoinColumn(name = "id_dedicacion", referencedColumnName = "iddedicacion")
  @ManyToOne
  private PerDedicacion idDedicacion;
  
  public PerNivelRemunerativo() {}
  
  public PerNivelRemunerativo(Integer idNivelR) {
this.idNivelR = idNivelR;
  }
  
  public PerNivelRemunerativo(Integer idNivelR, String nivel, int idNivel, int idGo) {
this.idNivelR = idNivelR;
this.nivel = nivel;
this.idNivel = idNivel;
this.idGo = idGo;
  }
  
  public Integer getIdNivelR() {
return this.idNivelR;
  }
  
  public void setIdNivelR(Integer idNivelR) {
this.idNivelR = idNivelR;
  }
  
  public String getDescription() {
return this.description;
  }
  
  public void setDescription(String description) {
this.description = description;
  }
  
  public PerCategoriaDocente getCategory() {
return this.category;
  }
  
  public void setCategory(PerCategoriaDocente category) {
this.category = category;
  }
  
  public Integer getIdGrupoO() {
return this.idGrupoO;
  }
  
  public void setIdGrupoO(Integer idGrupoO) {
this.idGrupoO = idGrupoO;
  }
  
  public String getNivel() {
return this.nivel;
  }
  
  public void setNivel(String nivel) {
this.nivel = nivel;
  }


  
  public int getIdNivel() {
return this.idNivel;
  }
  
  public void setIdNivel(int idNivel) {
this.idNivel = idNivel;
  }
  
  public int getIdGo() {
return this.idGo;
  }
  
  public void setIdGo(int idGo) {
this.idGo = idGo;
  }
  
  public PerCategoriaDocente getIdCategoria() {
return this.category;
  }
  
  public void setIdCategoria(PerCategoriaDocente idCategoria) {
this.category = idCategoria;
  }
  
  public PerDedicacion getIdDedicacion() {
return this.idDedicacion;
  }
  
  public void setIdDedicacion(PerDedicacion idDedicacion) {
this.idDedicacion = idDedicacion;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idNivelR != null) ? this.idNivelR.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof PerNivelRemunerativo)) {
  return false;
    }
PerNivelRemunerativo other = (PerNivelRemunerativo)object;
if ((this.idNivelR == null && other.idNivelR != null) || (this.idNivelR != null && !this.idNivelR.equals(other.idNivelR))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.hd.jpa.PerNivelRemunerativo[ idNivelR=" + this.idNivelR + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/hd/jpa/PerNivelRemunerativo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */