package gob.regionancash.rh.jpa;

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
@Table(name = "position")
public class Position
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 200)
  @Column(name = "name")
  private String name;
  @Size(max = 1)
  @Column(name = "level")
  private String level;
  @Size(max = 6)
  @Column(name = "cod_pdt")
  private String codPdt;
  @Column(name = "nivel")
  private Integer nivel;
  @Column(name = "orden_firma")
  private Integer ordenFirma;
  @Size(max = 15)
  @Column(name = "abreviatura")
  private String abrev;
  @Column(name = "estado")
private Character status = Character.valueOf('1');
  
  public String getCodPdt() {
return this.codPdt;
  }
  
  public void setCodPdt(String codPdt) {
this.codPdt = codPdt;
  }
  
  public Integer getNivel() {
return this.nivel;
  }
  
  public void setNivel(Integer nivel) {
this.nivel = nivel;
  }
  
  public Integer getOrdenFirma() {
return this.ordenFirma;
  }
  
  public void setOrdenFirma(Integer ordenFirma) {
this.ordenFirma = ordenFirma;
  }
  
  public String getAbreviatura() {
return this.abrev;
  }
  
  public void setAbreviatura(String abreviatura) {
this.abrev = abreviatura;
  }
  
  public Character getStatus() {
return this.status;
  }
  
  public void setStatus(Character status) {
this.status = status;
  }

  
  public Position() {}
  
  public Position(Integer id) {
this.id = id;
  }
  
  public Position(Integer id, String name) {
this.id = id;
this.name = name;
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
  
  public String getLevel() {
return this.level;
  }
  
  public void setLevel(String level) {
this.level = level;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Position)) {
  return false;
    }
Position other = (Position)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.jpa.Position[ id=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Position.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */