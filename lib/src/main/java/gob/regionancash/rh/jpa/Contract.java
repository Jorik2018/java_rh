package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import org.isobit.directory.model.Company;
import org.isobit.directory.model.Dependency;
import org.isobit.directory.model.People;
import org.isobit.directory.model.Province;

@Entity
@Table(name = "contract")
public class Contract
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
  @Column(name = "people_id")
  private int peopleId;
  @Column(name = "people_id", insertable = false, updatable = false)
  private long peopleIdLong;
  @Column(name = "employee_id")
  private Integer employeeId;
  @JoinColumn(name = "company_id", referencedColumnName = "id_dir", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private Company company;
  @Column(name = "company_id")
  private Integer companyId;
  @Column(name = "dependency_id")
  private Integer dependencyId;
  @JoinColumn(name = "dependency_id", referencedColumnName = "id_dep", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private Dependency dependency;
  @JoinColumn(name = "people_id", referencedColumnName = "id_dir", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private People people;
  @JoinColumn(name = "position_id", referencedColumnName = "id", insertable = false, updatable = false)
  @ManyToOne(optional = true)
  private Position position;
  @Basic(optional = false)
  @Column(name = "remunerative_level_id")
  private Integer remunerativeLevelId;
  @Transient
  private String remunerativeLevelName;
  @Column(name = "position_id")
  private Integer positionId;
  @Column(name = "fecha_ini")
  @Temporal(TemporalType.DATE)
  private Date fechaIni;
  @Basic(optional = true)
  @Column(name = "fecha_fin")
  @Temporal(TemporalType.DATE)
  private Date fechaFin;
  @Basic(optional = true)
  @Column(name = "province_id")
  private String provinceId;
  @Transient
  private Province province;
  @Basic(optional = false)
  @NotNull
  @Column(name = "user_id")
  private int userId;
  @Basic(optional = false)
  @NotNull
  @Column(name = "fecha_reg")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaReg;
  @Basic(optional = true)
  @Column(name = "document")
  private String document;
  @Basic(optional = true)
  @Column(name = "charge")
  private Boolean charge;
private Boolean canceled = Boolean.valueOf(false); @Basic(optional = true) @Column(name = "active")
private Boolean active = Boolean.TRUE; @Basic(optional = false)
  @NotNull
  @Column(name = "status")
private boolean status = Boolean.TRUE

    
.booleanValue(); @Transient
  private Object ext;
  public Boolean getCanceled() {
return this.canceled;
  }
  
  public void setCanceled(Boolean canceled) {
this.canceled = canceled;
  }
  
  public String getRemunerativeLevelName() {
return this.remunerativeLevelName;
  }
  
  public void setRemunerativeLevelName(String remunerativeLevelName) {
this.remunerativeLevelName = remunerativeLevelName;
  }
  
  public Integer getCompanyId() {
return this.companyId;
  }
  
  public void setCompanyId(Integer companyId) {
this.companyId = companyId;
  }
  
  public Integer getRemunerativeLevelId() {
return this.remunerativeLevelId;
  }
  
  public void setRemunerativeLevelId(Integer remunerativeLevelId) {
this.remunerativeLevelId = remunerativeLevelId;
  }
  
  public long getPeopleIdLong() {
return this.peopleIdLong;
  }
  
  public void setPeopleIdLong(long peopleIdLong) {
this.peopleIdLong = peopleIdLong;
  }
  
  public Integer getDependencyId() {
return this.dependencyId;
  }
  
  public void setDependencyId(Integer dependencyId) {
this.dependencyId = dependencyId;
  }
  
  public Integer getPositionId() {
return this.positionId;
  }
  
  public void setPositionId(Integer positionId) {
this.positionId = positionId;
  }
  
  public Boolean getActive() {
return this.active;
  }
  
  public void setActive(Boolean active) {
this.active = active;
  }
  
  public String getDocument() {
return this.document;
  }
  
  public void setDocument(String document) {
this.document = document;
  }
  
  public Boolean getCharge() {
return this.charge;
  }
  
  public void setCharge(Boolean charge) {
this.charge = charge;
  }



  
  public Object getExt() {
return this.ext;
  }
  
  public void setExt(Object ext) {
this.ext = ext;
  }
  
  public Dependency getDependency() {
return this.dependency;
  }
  
  public Position getPosition() {
return this.position;
  }
  
  public void setPosition(Position position) {
this.position = position;
  }
  
  public void setDependency(Dependency dependency) {
this.dependency = dependency;
  }

  
  public Contract() {}
  
  public Contract(Integer id) {
this.id = id;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public Company getCompany() {
return this.company;
  }
  
  public void setCompany(Company company) {
this.company = company;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public int getPeopleId() {
return this.peopleId;
  }
  
  public void setPeopleId(int peopleId) {
this.peopleId = peopleId;
  }
  
  public Date getFechaIni() {
return this.fechaIni;
  }
  
  public void setFechaIni(Date fechaIni) {
this.fechaIni = fechaIni;
  }
  
  public Date getFechaFin() {
return this.fechaFin;
  }
  
  public void setFechaFin(Date fechaFin) {
this.fechaFin = fechaFin;
  }
  
  public People getPeople() {
return this.people;
  }
  
  public void setPeople(People people) {
this.people = people;
  }
  
  public String getProvinceId() {
return this.provinceId;
  }
  
  public void setProvinceId(String provinceId) {
this.provinceId = provinceId;
  }
  
  public Province getProvince() {
return this.province;
  }
  
  public void setProvince(Province province) {
this.province = province;
  }
  
  public boolean getStatus() {
return this.status;
  }
  
  public void setStatus(boolean status) {
this.status = status;
  }
  
  public int getUserId() {
return this.userId;
  }
  
  public void setUserId(int userId) {
this.userId = userId;
  }
  
  public Date getFechaReg() {
return this.fechaReg;
  }
  
  public void setFechaReg(Date fechaReg) {
this.fechaReg = fechaReg;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Contract)) {
  return false;
    }
Contract other = (Contract)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.jpa.Consejero[ id=" + this.id + " ]";
  }
  
  public Integer getEmployeeId() {
return this.employeeId;
  }
  
  public void setEmployeeId(Integer employeeId) {
this.employeeId = employeeId;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Contract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */