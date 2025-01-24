package gob.regionancash.rh.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import gob.regionancash.rh.jpa.Attendance;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "rh_assist")
public class AssistPeople implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_dir")
    private int idDir;
    @Transient
    private boolean early;
    @Size(max = 45)
    @Column(name = "contract_id")
    private String contractId;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    private int turno;
    private String fullName;
    private String dependency;
    private String position;

    public boolean isEarly() {
        return this.early;
    }

    private String code;
    private Date entryTime;
    private String entryDelay;
    private Long entryDelaySeconds;
    private Long outDelaySeconds;
    private Date breakTime;
    private String breakDelay;
    private Long breakDelaySeconds;
    private Date outTime;
    private String justification;
    private String aux;
    private String dayName;
    @Transient
    private List<Attendance> times;

    public String getDayName() {
        return this.dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void setEarly(boolean early) {
        this.early = early;
    }

    public String getBreakDelay() {
        return this.breakDelay;
    }

    public void setBreakDelay(String breakDelay) {
        this.breakDelay = breakDelay;
    }

    public String getJustification() {
        return this.justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public List<Attendance> getTimes() {
        return this.times;
    }

    public void setTimes(List<Attendance> times) {
        this.times = times;
    }

    public Long getOutDelaySeconds() {
        return this.outDelaySeconds;
    }

    public void setOutDelaySeconds(Long outDelaySeconds) {
        this.outDelaySeconds = outDelaySeconds;
    }

    public String getAux() {
        return this.aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
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

    public Date getEntryTime() {
        return this.entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Long getEntryDelaySeconds() {
        return this.entryDelaySeconds;
    }

    public void setEntryDelaySeconds(Long entryDelaySeconds) {
        this.entryDelaySeconds = entryDelaySeconds;
    }

    public Long getBreakDelaySeconds() {
        return this.breakDelaySeconds;
    }

    public void setBreakDelaySeconds(Long breakDelaySeconds) {
        this.breakDelaySeconds = breakDelaySeconds;
    }

    public String getEntryDelay() {
        return this.entryDelay;
    }

    public void setEntryDelay(String entryDelay) {
        this.entryDelay = entryDelay;
    }

    public Date getBreakTime() {
        return this.breakTime;
    }

    public void setBreakTime(Date breakTime) {
        this.breakTime = breakTime;
    }

    public Date getOutTime() {
        return this.outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTurno() {
        return this.turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getIdDir() {
        return this.idDir;
    }

    public void setIdDir(int idDir) {
        this.idDir = idDir;
    }

    public String getContractId() {
        return this.contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int hashCode() {
        int hash = 0;
        hash += (this.id != null) ? this.id.hashCode() : 0;
        return hash;
    }

    public String getDependency() {
        return this.dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean equals(Object object) {
        if (!(object instanceof AssistPeople)) {
            return false;
        }
        AssistPeople other = (AssistPeople) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "gob.regionancash.rh.rest.RhAssist[ id=" + this.id + " ]";
    }
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/dto/AssistPeople.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */