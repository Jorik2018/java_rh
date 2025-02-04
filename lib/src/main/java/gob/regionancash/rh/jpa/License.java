package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.isobit.directory.jpa.People;

@Entity
@Table(name = "rh_permission")
public class License
  implements Serializable {
public static HashMap<Short, String> AUTHORIZACTION_TYPE = new HashMap<>();
  
  static {
AUTHORIZACTION_TYPE.put(Short.valueOf((short)1), "COMISION OFICIAL DE SERVICIOS");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)2), "PARTICULAR");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)3), "ENFERMEDAD");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)4), "CAPACITACIONES");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)5), "CITACION EXPRESA JUDICIAL, MILITAR O POLICIAL");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)6), "OTROS");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)7), "FUNCION EDIL O REGIONAL");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)8), "LACTANCIA");
AUTHORIZACTION_TYPE.put(Short.valueOf((short)9), "MATERNIDAD");
  }
  
public static HashMap<String, String> TYPE = new HashMap<>();
  
  static {
TYPE.put("P", "PAPELETA");
TYPE.put("J", "JUSTIFICACION");
TYPE.put("O", "ONOMASTICO");
TYPE.put("V", "VACACIONES");
TYPE.put("LGH", "LICENCIA CON GOCE DE HABER");
TYPE.put("LSH", "LICENCIA SIN GOCE DE HABER");
TYPE.put("LS", "LICENCIA SINDICAL");
TYPE.put("LP", "LICENCIA POR PATERNIDAD");
TYPE.put("LF", "LICENCIA POR FALLECIMIENTO");
TYPE.put("DM", "DESCANSO MEDICO");
TYPE.put("DMC", "DESCANSO MEDICO COVID");
TYPE.put("TR", "TRABAJO REMOTO");
TYPE.put("TM", "TRABAJO MIXTO");
TYPE.put("TP", "TRABAJO PRESENCIAL");
  }

  
  private static final long serialVersionUID = 1L;
  
  @Id
  @Basic(optional = false)
  @NotNull
  @Column(name = "id")
  private Integer id;
  @Column(name = "days")
  private Integer days;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 12)
  @Column(name = "plaza")
  private String plaza;
  @Column(name = "trabajador_id", insertable = false, updatable = false)
  private Integer peopleId;
  @Column(name = "trabajador_id", insertable = false, updatable = false)
  private Long peopleIdLong;
  @JoinColumn(name = "trabajador_id", referencedColumnName = "id_dir")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private People worker;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fec_soli")
  @Temporal(TemporalType.DATE)
  private Date fecSoli;
  @Basic(optional = false)
  @NotNull
  @Size(max = 30)
  @Column(name = "nro_soli")
  private String nroSoli;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 3)
  @Column(name = "tipo_soli")
  private String type;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 1)
  @Column(name = "esta_soli")
  private String estaSoli;
  @Basic(optional = false)
  @NotNull
  @Size(min = 0, max = 10)
  @Column(name = "hora_soli")
  private String horaSoli;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fec_ini")
  @Temporal(TemporalType.DATE)
  private Date fecIni;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fec_fin")
  @Temporal(TemporalType.DATE)
  private Date fecFin;
  @Temporal(TemporalType.TIME)
  @Column(name = "time_start", insertable = false, updatable = false)
  private Date timeStart;
  @Column(name = "time_start")
  private String timeStartString;
  @Temporal(TemporalType.TIME)
  @Column(name = "time_end", insertable = false, updatable = false)
  private Date timeEnd;
  @Column(name = "time_end")
  private String timeEndString;
  @Basic(optional = false)
  @NotNull
  @Size(max = 25)
  @Column(name = "detalle")
  private String detalle;
  @Basic(optional = false)
  @NotNull
  @Size(min = 0, max = 3)
  @Column(name = "cod_movi")
  private String codMovi;
  @Transient
  private Object ext;
  @Transient
  private Object file;
  @Column(name = "authorization_type")
  private Short authorizationType;
  private Integer fid;
  @Transient
  private String description;
  
  public String getDescription() {
return this.description;
  }
  
  public void setDescription(String description) {
this.description = description;
  }


  
  public Integer getFid() {
return this.fid;
  }
  
  public void setFid(Integer fid) {
this.fid = fid;
  }
  
  public Short getAuthorizationType() {
return this.authorizationType;
  }
  
  public void setAuthorizationType(Short authorizationType) {
this.authorizationType = authorizationType;
  }
  
  public String getTimeStartString() {
return this.timeStartString;
  }
  
  public void setTimeStartString(String timeStartString) {
this.timeStartString = timeStartString;
  }
  
  public String getTimeEndString() {
return this.timeEndString;
  }
  
  public void setTimeEndString(String timeEndString) {
this.timeEndString = timeEndString;
  }
  
  public Integer getPeopleId() {
return this.peopleId;
  }
  
  public void setPeopleId(Integer peopleId) {
this.peopleId = peopleId;
  }
  
  public Object getFile() {
return this.file;
  }
  
  public void setFile(Object file) {
this.file = file;
  }



  
  public Long getPeopleIdLong() {
return this.peopleIdLong;
  }
  
  public void setPeopleIdLong(Long peopleIdLong) {
this.peopleIdLong = peopleIdLong;
  }
  
  public Object getExt() {
return this.ext;
  }
  
  public void setExt(Object ext) {
this.ext = ext;
  }
  
  public Date getTimeStart() {
return this.timeStart;
  }
  
  public void setTimeStart(Date timeStart) {
this.timeStart = timeStart;
  }
  
  public Date getTimeEnd() {
return this.timeEnd;
  }
  
  public void setTimeEnd(Date timeEnd) {
this.timeEnd = timeEnd;
  }
  
  public Integer getDays() {
return this.days;
  }
  
  public void setDays(Integer days) {
this.days = days;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public String getPlaza() {
return this.plaza;
  }
  
  public void setPlaza(String plaza) {
this.plaza = plaza;
  }
  
  public People getWorker() {
return this.worker;
  }
  
  public void setWorker(People worker) {
this.worker = worker;
  }
  
  public Date getFecSoli() {
return this.fecSoli;
  }
  
  public void setFecSoli(Date fecSoli) {
this.fecSoli = fecSoli;
  }
  
  public String getNroSoli() {
return this.nroSoli;
  }
  
  public void setNroSoli(String nroSoli) {
this.nroSoli = nroSoli;
  }
  
  public String getType() {
return this.type;
  }
  
  public void setType(String type) {
this.type = type;
  }
  
  public String getEstaSoli() {
return this.estaSoli;
  }
  
  public void setEstaSoli(String estaSoli) {
this.estaSoli = estaSoli;
  }
  
  public String getHoraSoli() {
return this.horaSoli;
  }
  
  public void setHoraSoli(String horaSoli) {
this.horaSoli = horaSoli;
  }
  
  public Date getFecIni() {
return this.fecIni;
  }
  
  public void setFecIni(Date fecIni) {
this.fecIni = fecIni;
  }
  
  public Date getFecFin() {
return this.fecFin;
  }
  
  public void setFecFin(Date fecFin) {
this.fecFin = fecFin;
  }
  
  public String getDetalle() {
return this.detalle;
  }
  
  public void setDetalle(String detalle) {
this.detalle = detalle;
  }
  
  public String getCodMovi() {
return this.codMovi;
  }
  
  public void setCodMovi(String codMovi) {
this.codMovi = codMovi;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof License)) {
  return false;
    }
License other = (License)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.jpa.License[ id=" + this.id + ",startDate=" + this.fecIni + ", endDate=" + this.fecFin + " ,startTime=" + this.timeStart + ", endTime=" + this.timeEnd + ", type=" + this.type + "-" + this.authorizationType + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/License.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */