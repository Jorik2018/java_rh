package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.isobit.util.OptionMap;

@Entity
@Table(name = "papeleta")
public class Papeleta
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @EmbeddedId
  protected PapeletaPK papeletaPK;
  @Column(name = "tipo_pape")
  private Character tipoPape;
  @Column(name = "regulariza")
  private Character regulariza;
  @Column(name = "peri_pape")
  private Character periPape;
  @Column(name = "fecha_pape")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaPape;
  @Column(name = "fecha_del")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaDel;
  @Column(name = "fecha_al")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaAl;
  @Column(name = "hora_ini")
  @Temporal(TemporalType.TIMESTAMP)
  private Date horaIni;
  @Column(name = "hora_fin")
  @Temporal(TemporalType.TIMESTAMP)
  private Date horaFin;
  @JoinColumn(name = "dni", referencedColumnName = "dni")
  @ManyToOne
  private Personal personal;
private static final Map estadoMap = (Map)new OptionMap();
private static final Map tipoPapeMap = (Map)new OptionMap();
private static final Map periPapeMap = (Map)new OptionMap(); @Column(name = "lugar")
  private String lugar; @Column(name = "motivo")
private String motivo; static { estadoMap.put(Character.valueOf('0'), "Borrador");
estadoMap.put(Character.valueOf('1'), "Tramite");
estadoMap.put(Character.valueOf('2'), "Pendiente");
estadoMap.put(Character.valueOf('3'), "Iniciado");
estadoMap.put(Character.valueOf('4'), "Concluido");
estadoMap.put(Character.valueOf('9'), "Anulado");
tipoPapeMap.put(Character.valueOf('1'), "NORMAL");
tipoPapeMap.put(Character.valueOf('2'), "DE REGULARIZACION");
periPapeMap.put(Character.valueOf('1'), "HORAS");
periPapeMap.put(Character.valueOf('2'), "DIAS"); }
   @Column(name = "observaciones")
  private String observaciones; @Column(name = "estado")
  private Character estado; public Map getEstadoMap() {
return estadoMap;
  }
  
  public Map getTipoPapeMap() {
return tipoPapeMap;
  }
  
  public Map getPeriPapeMap() {
return periPapeMap;
  }
  
  public String getKey() {
return (getPapeletaPK() != null) ? (getPapeletaPK().getAnoEje() + "-" + getPapeletaPK().getNPapeleta()) : null;
  }
  
  public Personal getPersonal() {
return this.personal;
  }
  
  public void setPersonal(Personal personal) {
this.personal = personal;
  }





  
  public Papeleta() {}





  
  public Papeleta(PapeletaPK papeletaPK) {
this.papeletaPK = papeletaPK;
  }
  
  public Papeleta(String anoEje, String nPapeleta) {
this.papeletaPK = new PapeletaPK(anoEje, nPapeleta);
  }
  
  public PapeletaPK getPapeletaPK() {
return this.papeletaPK;
  }
  
  public void setPapeletaPK(PapeletaPK papeletaPK) {
this.papeletaPK = papeletaPK;
  }
  
  public Character getTipoPape() {
return this.tipoPape;
  }
  
  public void setTipoPape(Character tipoPape) {
this.tipoPape = tipoPape;
  }
  
  public Character getRegulariza() {
return this.regulariza;
  }
  
  public void setRegulariza(Character regulariza) {
this.regulariza = regulariza;
  }
  
  public Character getPeriPape() {
return this.periPape;
  }
  
  public void setPeriPape(Character periPape) {
this.periPape = periPape;
  }
  
  public Date getFechaPape() {
return this.fechaPape;
  }
  
  public void setFechaPape(Date fechaPape) {
this.fechaPape = fechaPape;
  }
  
  public Date getFechaDel() {
return this.fechaDel;
  }
  
  public void setFechaDel(Date fechaDel) {
this.fechaDel = fechaDel;
  }
  
  public Date getFechaAl() {
return this.fechaAl;
  }
  
  public void setFechaAl(Date fechaAl) {
this.fechaAl = fechaAl;
  }
  
  public Date getHoraIni() {
return this.horaIni;
  }
  
  public void setHoraIni(Date horaIni) {
this.horaIni = horaIni;
  }
  
  public Date getHoraFin() {
return this.horaFin;
  }
  
  public void setHoraFin(Date horaFin) {
this.horaFin = horaFin;
  }
  
  public String getLugar() {
return this.lugar;
  }
  
  public void setLugar(String lugar) {
this.lugar = lugar;
  }
  
  public String getMotivo() {
return this.motivo;
  }
  
  public void setMotivo(String motivo) {
this.motivo = motivo;
  }
  
  public String getObservaciones() {
return this.observaciones;
  }
  
  public void setObservaciones(String observaciones) {
this.observaciones = observaciones;
  }
  
  public Character getEstado() {
return this.estado;
  }
  
  public void setEstado(Character estado) {
this.estado = estado;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.papeletaPK != null) ? this.papeletaPK.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Papeleta)) {
  return false;
    }
Papeleta other = (Papeleta)object;
if ((this.papeletaPK == null && other.papeletaPK != null) || (this.papeletaPK != null && !this.papeletaPK.equals(other.papeletaPK))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "javaapplication1.Papeleta[ papeletaPK=" + this.papeletaPK + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Papeleta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */