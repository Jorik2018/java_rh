package gob.regionancash.rh.dto;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.isobit.directory.jpa.Dependency;

public class AssistSummary implements Serializable {
  private String td;
  
  public int getPp() {
return this.pp;
  }
  private int particularMinutes;
  private int pp;
  private int particularTime;
  
  public int getParticularMinutes() {
return this.particularMinutes;
  }
  
  public void setParticularMinutes(int particularMinutes) {
this.particularMinutes = particularMinutes;
  }
  
  public String getTd() {
return this.td;
  }
  
  public void setTd(String td) {
this.td = td;
  }
  
  public void setPp(int pp) {
this.pp = pp;
  }
  
  public int getParticularTime() {
return this.particularTime;
  }
  
  public void setParticularTime(int particularTime) {
this.particularTime = particularTime;
  }


  
private HashMap children = new HashMap<>();
  
  private String code;
  
  private Long[][] times;
  private String[] status;
  private String boss;
  private int peopleId;
  private String fullName;
  private String position;
  private int tr;
  private int tp;
  private int v;
  private int l;
  private int lgh;
  private int dm;
  private int dmc;
  private int f;
  private int workedDays;
  private int hours;
  private String delay;
  private String tolerance;
  private Long accumulatedSeconds;
  private Long seconds;
  private List data;
  private Integer dependencyId;
  private Dependency dependency;
  private String laborRegime;
  
  public String getLaborRegime() {
return this.laborRegime;
  }
  
  public void setLaborRegime(String laborRegime) {
this.laborRegime = laborRegime;
  }
  
  public AssistSummary get(Object k) {
return (AssistSummary)this.children.get(k);
  }
  
  public Collection values() {
return this.children.values();
  }
  
  public void put(Object k, Object o) {
this.children.put(k, o);
  }
  
  public Long[][] getTimes() {
return this.times;
  }
  
  public void setTimes(Long[][] times) {
this.times = times;
  }
  
  public String getTolerance() {
return this.tolerance;
  }
  
  public void setTolerance(String tolerance) {
this.tolerance = tolerance;
  }
  
  public List getData() {
return this.data;
  }
  
  public void setData(List data) {
this.data = data;
  }
  
  public String getDelay() {
return this.delay;
  }
  
  public void setDelay(String minutes) {
this.delay = minutes;
  }
  
  public Long getAccumulatedSeconds() {
return this.accumulatedSeconds;
  }
  
  public void setAccumulatedSeconds(Long accumulatedSeconds) {
this.accumulatedSeconds = accumulatedSeconds;
  }
  
  public Long getSeconds() {
return this.seconds;
  }
  
  public void setSeconds(Long seconds) {
this.seconds = seconds;
  }
  
  public String getCode() {
return this.code;
  }
  
  public void setCode(String code) {
this.code = code;
  }
  
  public Integer getDependencyId() {
return this.dependencyId;
  }
  
  public void setDependencyId(Integer dependencyId) {
this.dependencyId = dependencyId;
  }
  
  public Dependency getDependency() {
return this.dependency;
  }
  
  public void setDependency(Dependency dependency) {
this.dependency = dependency;
  }
  
  public String[] getStatus() {
return this.status;
  }
  
  public int getPeopleId() {
return this.peopleId;
  }
  
  public void setPeopleId(int peopleId) {
this.peopleId = peopleId;
  }
  
  public void setStatus(String[] status) {
this.status = status;
  }
  
  public String getBoss() {
return this.boss;
  }
  
  public void setBoss(String boss) {
this.boss = boss;
  }
  
  public String getFullName() {
return this.fullName;
  }
  
  public void setFullName(String fullName) {
this.fullName = fullName;
  }
  
  public String getPosition() {
return this.position;
  }
  
  public void setPosition(String position) {
this.position = position;
  }
  
  public int getTr() {
return this.tr;
  }
  
  public void setTr(int tr) {
this.tr = tr;
  }
  
  public int getTp() {
return this.tp;
  }
  
  public void setTp(int tp) {
this.tp = tp;
  }
  
  public int getV() {
return this.v;
  }
  
  public void setV(int v) {
this.v = v;
  }
  
  public int getL() {
return this.l;
  }
  
  public void setL(int l) {
this.l = l;
  }
  
  public int getLgh() {
return this.lgh;
  }
  
  public void setLgh(int lgh) {
this.lgh = lgh;
  }
  
  public int getDm() {
return this.dm;
  }
  
  public void setDm(int dm) {
this.dm = dm;
  }
  
  public int getDmc() {
return this.dmc;
  }
  
  public void setDmc(int dmc) {
this.dmc = dmc;
  }
  
  public int getF() {
return this.f;
  }
  
  public void setF(int f) {
this.f = f;
  }
  
  public int getWorkedDays() {
return this.workedDays;
  }
  
  public void setWorkedDays(int workedDays) {
this.workedDays = workedDays;
  }
  
  public int getHours() {
return this.hours;
  }
  
  public void setHours(int hours) {
this.hours = hours;
  }

  
  public String toString() {
return "AssistSummary{code=" + this.code + ", peopleId=" + this.peopleId + ", fullName=" + this.fullName + '}';
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/dto/AssistSummary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */