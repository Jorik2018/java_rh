package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "rh_assist")
public class Attendance
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Column(name = "id_dir")
private Long peopleId = Long.valueOf(0L);
  
  @Basic(optional = false)
  @NotNull
  @Column(name = "code")
  private Long code;
  
  @Column(name = "contract_id")
  private Integer contractId;
  @Column(name = "date")
  @Temporal(TemporalType.DATE)
  private Date date;
  @Column(name = "time")
  @Temporal(TemporalType.TIME)
  private Date time;
  @Column(name = "create_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createDate;
  @Column(name = "in_out_mode")
  private Integer inOutMode;
  @Column(name = "machine_number")
  private Integer machineNumber;
  @Column(name = "verify_mode")
  private Integer verifyMode;
  @Basic(optional = false)
  @NotNull
  @Column(name = "canceled")
  private short canceled;
  
  public Attendance() {}
  
  public Attendance(Integer id) {
this.id = id;
  }
  
  public long getCode() {
return this.code.longValue();
  }
  
  public void setCode(long code) {
this.code = Long.valueOf(code);
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public Long getPeopleId() {
return this.peopleId;
  }
  
  public void setPeopleId(Long peopleId) {
this.peopleId = peopleId;
  }
  
  public Integer getContractId() {
return this.contractId;
  }
  
  public void setContractId(Integer contractId) {
this.contractId = contractId;
  }
  
  public Integer getInOutMode() {
return this.inOutMode;
  }
  
  public void setInOutMode(Integer inOutMode) {
this.inOutMode = inOutMode;
  }
  
  public Integer getVerifyMode() {
return this.verifyMode;
  }
  
  public void setVerifyMode(Integer verifyMode) {
this.verifyMode = verifyMode;
  }
  
  public Date getDate() {
return this.date;
  }
  
  public void setDate(Date date) {
this.date = date;
  }
  
  public Date getTime() {
return this.time;
  }
  
  public void setTime(Date time) {
this.time = time;
  }
  
  public Date getCreateDate() {
return this.createDate;
  }
  
  public void setCreateDate(Date createDate) {
this.createDate = createDate;
  }
  
  public Integer getMachineNumber() {
return this.machineNumber;
  }
  
  public void setMachineNumber(Integer machineNumber) {
this.machineNumber = machineNumber;
  }
  
  public short getCanceled() {
return this.canceled;
  }
  
  public void setCanceled(short canceled) {
this.canceled = canceled;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Attendance)) {
  return false;
    }
Attendance other = (Attendance)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return super.toString();
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Attendance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */