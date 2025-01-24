package org.isobit.directory.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "drt_docidentidad")
public class DocIdentity
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_pdid")
  private Short id;
  @Basic(optional = false)
  @Column(name = "nombre")
  private String name;
  @Basic(optional = false)
  @Column(name = "abreviatura_tpdid")
  private String acronym;
  @Column(name = "descripcion_tpdid")
  private String description;
  @Basic(optional = false)
  @Column(name = "vigencia_tpdid")
  private Character vigenciaTpdid;
  
  public DocIdentity() {}
  
  public DocIdentity(short id) {
    this.id = Short.valueOf(id);
  }
  
  public String getAcronym() {
    return this.acronym;
  }
  
  public void setAcronym(String abreviaturaTpdid) {
    this.acronym = abreviaturaTpdid;
  }
  
  public Character getVigenciaTpdid() {
    return this.vigenciaTpdid;
  }
  
  public void setVigenciaTpdid(Character vigenciaTpdid) {
    this.vigenciaTpdid = vigenciaTpdid;
  }

  
  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }


  
  public boolean equals(Object object) {
    if (!(object instanceof DocIdentity)) {
      return false;
    }
    DocIdentity other = (DocIdentity)object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }
  
  public Short getId() {
    return this.id;
  }
  
  public void setId(Short id) {
    this.id = id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }

  
  public String toString() {
    return this.id + ": " + getDescription();
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/isobit.jar!/org/isobit/directory/jpa/DocIdentity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */