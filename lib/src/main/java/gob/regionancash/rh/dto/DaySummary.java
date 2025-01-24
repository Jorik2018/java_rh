package gob.regionancash.rh.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DaySummary
  implements Serializable {
  private String dayName;
  private List exceptions;
  private String entry;
  private String breaking;
  private String out;
  private long entryDelaySeconds;
  private long breakDelaySeconds;
  private int day;
  private Date date;
  
  public String getOut() {
return this.out;
  }
  
  public void setOut(String out) {
this.out = out;
  }








  
private String decision = "";
  
private String remark = ""; private String fullName;
  
  public int getDay() {
return this.day;
  }
  private int period;
  public void setDay(int dayMonth) {
this.day = dayMonth;
  }
  
  public String getDayName() {
return this.dayName;
  }
  
  public void setDayName(String dayName) {
this.dayName = dayName;
  }
  
  public String getEntry() {
return this.entry;
  }
  
  public void setEntry(String entry) {
this.entry = entry;
  }
  
  public String getBreaking() {
return this.breaking;
  }
  
  public void setBreaking(String breaking) {
this.breaking = breaking;
  }




  
  public String getFullName() {
return this.fullName;
  }
  
  public void setFullName(String fullName) {
this.fullName = fullName;
  }


  
private String foul = "";
  
private String particular = "";
  
private String tolerance = "";
  
  public Date getDate() {
return this.date;
  }
  
  public String getDecision() {
return this.decision;
  }
  
  public void setDecision(String decision) {
this.decision = decision;
  }
  
  public String getRemark() {
return this.remark;
  }
  
  public void setRemark(String remark) {
this.remark = remark;
  }
  
  public void setDate(Date date) {
this.date = date;
  }
  
  public int getPeriod() {
return this.period;
  }
  
  public void setPeriod(int period) {
this.period = period;
  }
  
  public String getFoul() {
return this.foul;
  }
  
  public void setFoul(String foul) {
this.foul = foul;
  }
  
  public String getParticular() {
return this.particular;
  }
  
  public void setParticular(String particular) {
this.particular = particular;
  }
  
  public String getTolerance() {
return this.tolerance;
  }
  
  public void setTolerance(String tolerance) {
this.tolerance = tolerance;
  }
  
  public List getExceptions() {
return this.exceptions;
  }
  
  public void setExceptions(List exceptions) {
this.exceptions = exceptions;
  }
  
  public long getEntryDelaySeconds() {
return this.entryDelaySeconds;
  }
  
  public void setEntryDelaySeconds(long entryDelaySeconds) {
this.entryDelaySeconds = entryDelaySeconds;
  }
  
  public long getBreakDelaySeconds() {
return this.breakDelaySeconds;
  }
  
  public void setBreakDelaySeconds(long breakDelaySeconds) {
this.breakDelaySeconds = breakDelaySeconds;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/dto/DaySummary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */