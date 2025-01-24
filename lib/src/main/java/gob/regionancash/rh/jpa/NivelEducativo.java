package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Collection;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "nivel_educativo")
public class NivelEducativo
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 2)
  @Column(name = "nivel_educativo")
  private String id;
  @Size(max = 100)
  @Column(name = "descripcion")
  private String descripcion;
  @OneToMany(mappedBy = "nivelEducativo")
  private Collection<Personal> personalCollection;

  public NivelEducativo() {
  }

  public NivelEducativo(String nivelEducativo) {
    this.id = nivelEducativo;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String nivelEducativo) {
    this.id = nivelEducativo;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Collection<Personal> getPersonalCollection() {
    return this.personalCollection;
  }

  public void setPersonalCollection(Collection<Personal> personalCollection) {
    this.personalCollection = personalCollection;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof NivelEducativo)) {
      return false;
    }
    NivelEducativo other = (NivelEducativo) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.pegasus.model.NivelEducativo[ nivelEducativo=" + this.id + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/jpa/NivelEducativo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */