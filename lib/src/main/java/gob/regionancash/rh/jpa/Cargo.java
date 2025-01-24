package gob.regionancash.rh.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cargo")
public class Cargo
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_cargo")
  private Integer idCargo;
  @Size(max = 6)
  @Column(name = "cod_pdt")
  private String codPdt;
  @Size(max = 70)
  @Column(name = "nom_cargo")
  private String nomCargo;
  @Column(name = "nivel")
  private Integer nivel;
  @Column(name = "orden_firma")
  private Integer ordenFirma;
  @Size(max = 15)
  @Column(name = "abreviatura")
  private String abreviatura;
  @Size(max = 50)
  @Column(name = "abrev")
  private String abrev;
  @Column(name = "estado")
  private Character estado;
  
  public Cargo() {}
  
  public Cargo(Integer iDcargo) {
this.idCargo = iDcargo;
  }
  
  public Integer getIdCargo() {
return this.idCargo;
  }
  
  public void setIdCargo(Integer iDcargo) {
this.idCargo = iDcargo;
  }
  
  public String getCodPdt() {
return this.codPdt;
  }
  
  public void setCodPdt(String codPdt) {
this.codPdt = codPdt;
  }
  
  public String getNomCargo() {
return this.nomCargo;
  }
  
  public void setNomCargo(String nomCargo) {
this.nomCargo = nomCargo;
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
return this.abreviatura;
  }
  
  public void setAbreviatura(String abreviatura) {
this.abreviatura = abreviatura;
  }
  
  public String getAbrev() {
return this.abrev;
  }
  
  public void setAbrev(String abrev) {
this.abrev = abrev;
  }
  
  public Character getEstado() {
return this.estado;
  }
  
  public void setEstado(Character estado) {
this.estado = estado;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.idCargo != null) ? this.idCargo.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Cargo)) {
  return false;
    }
Cargo other = (Cargo)object;
if ((this.idCargo == null && other.idCargo != null) || (this.idCargo != null && !this.idCargo.equals(other.idCargo))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return (this.idCargo != null) ? ("" + this.idCargo + ": " + this.nomCargo).trim() : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Cargo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */