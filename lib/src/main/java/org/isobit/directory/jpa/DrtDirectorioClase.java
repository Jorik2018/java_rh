package org.isobit.directory.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;





@Entity
@Table(name = "drt_directorio_clase")
public class DrtDirectorioClase
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_dclas")
  private Short idDclas;
  @Basic(optional = false)
  @Column(name = "nombre")
  private String nombre;
  @Basic(optional = false)
  @Column(name = "descripcion")
  private String descripcion;
  @Basic(optional = false)
  @Column(name = "abrevia")
  private String abrevia;
  
  public DrtDirectorioClase() {}
  
  public DrtDirectorioClase(Short idDclas) {
    this.idDclas = idDclas;
  }
  
  public DrtDirectorioClase(Short idDclas, String nombre, String descripcion, String abrevia) {
    this.idDclas = idDclas;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.abrevia = abrevia;
  }
  
  public Short getIdDclas() {
    return this.idDclas;
  }
  
  public void setIdDclas(Short idDclas) {
    this.idDclas = idDclas;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getDescripcion() {
    return this.descripcion;
  }
  
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public String getAbrevia() {
    return this.abrevia;
  }
  
  public void setAbrevia(String abrevia) {
    this.abrevia = abrevia;
  }

  
  public int hashCode() {
    int hash = 0;
    hash += (this.idDclas != null) ? this.idDclas.hashCode() : 0;
    return hash;
  }


  
  public boolean equals(Object object) {
    if (!(object instanceof DrtDirectorioClase)) {
      return false;
    }
    DrtDirectorioClase other = (DrtDirectorioClase)object;
    if ((this.idDclas == null && other.idDclas != null) || (this.idDclas != null && !this.idDclas.equals(other.idDclas))) {
      return false;
    }
    return true;
  }

  
  public String toString() {
    return "org.isobit.oceda.DrtDirectorioClase[idDclas=" + this.idDclas + "]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/isobit.jar!/org/isobit/directory/jpa/DrtDirectorioClase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */