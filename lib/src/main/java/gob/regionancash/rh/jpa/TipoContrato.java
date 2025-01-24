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
@Table(name = "tipo_contrato")
public class TipoContrato
    implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 2)
  @Column(name = "tipo_contrato")
  private String tipoContrato;
  @Size(max = 60)
  @Column(name = "nombre")
  private String nombre;
  @OneToMany(mappedBy = "tipoContrato")
  private Collection<Personal> personalCollection;

  public TipoContrato() {
  }

  public TipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public String getTipoContrato() {
    return this.tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Collection<Personal> getPersonalCollection() {
    return this.personalCollection;
  }

  public void setPersonalCollection(Collection<Personal> personalCollection) {
    this.personalCollection = personalCollection;
  }

  public int hashCode() {
    int hash = 0;
    hash += (this.tipoContrato != null) ? this.tipoContrato.hashCode() : 0;
    return hash;
  }

  public boolean equals(Object object) {
    if (!(object instanceof TipoContrato)) {
      return false;
    }
    TipoContrato other = (TipoContrato) object;
    if ((this.tipoContrato == null && other.tipoContrato != null)
        || (this.tipoContrato != null && !this.tipoContrato.equals(other.tipoContrato))) {
      return false;
    }
    return true;
  }

  public String toString() {
    return "org.pegasus.model.TipoContrato[ tipoContrato=" + this.tipoContrato + " ]";
  }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/jpa/TipoContrato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */