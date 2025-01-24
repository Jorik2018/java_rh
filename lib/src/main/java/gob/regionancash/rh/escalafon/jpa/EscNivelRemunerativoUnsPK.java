package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EscNivelRemunerativoUnsPK
  implements Serializable
{
  @Basic(optional = false)
  @Column(name = "id_nivel")
  private short idNivel;
  @Basic(optional = false)
  @Column(name = "tipo")
  private boolean tipo;
  
  public EscNivelRemunerativoUnsPK() {}
  
  public EscNivelRemunerativoUnsPK(short idNivel, boolean tipo) {
this.idNivel = idNivel;
this.tipo = tipo;
  }
  
  public short getIdNivel() {
return this.idNivel;
  }
  
  public void setIdNivel(short idNivel) {
this.idNivel = idNivel;
  }
  
  public boolean getTipo() {
return this.tipo;
  }
  
  public void setTipo(boolean tipo) {
this.tipo = tipo;
  }

  
  public int hashCode() {
int hash = 0;
hash += this.idNivel;
hash += this.tipo ? 1 : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof EscNivelRemunerativoUnsPK)) {
  return false;
    }
EscNivelRemunerativoUnsPK other = (EscNivelRemunerativoUnsPK)object;
if (this.idNivel != other.idNivel) {
  return false;
    }
if (this.tipo != other.tipo) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "org.jsuns.escalafon.jpa.EscNivelRemunerativoUnsPK[ idNivel=" + this.idNivel + ", tipo=" + this.tipo + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/escalafon/jpa/EscNivelRemunerativoUnsPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */