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
import jakarta.validation.constraints.Size;
import org.isobit.directory.jpa.Company;
import org.isobit.directory.jpa.People;
import org.isobit.util.OptionMap;




@Entity
@Table(name = "esc_study")
public class Study
  implements Serializable
{
private static OptionMap STUDY_TYPE = new OptionMap(); private static final long serialVersionUID = 1L; @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Basic(optional = false) @Column(name = "id") private Integer id; @Column(name = "type_id") private Character typeId; @Column(name = "level_id") private Character levelId; @Column(name = "cycle") private Integer cycle; @Size(max = 100) @Column(name = "career") private String career; @Column(name = "career_id") private Integer careerId; @Column(name = "entity_id") private Integer entityId; @Column(name = "school_id")
private Integer schoolId; static { STUDY_TYPE.put(Character.valueOf('D'), new Object[] { "DOCTORADO", Integer.valueOf(0) });
STUDY_TYPE.put(Character.valueOf('M'), new Object[] { "MAESTRIA", Integer.valueOf(0) });
STUDY_TYPE.put(Character.valueOf('P'), new Object[] { "PRIMARIA", Integer.valueOf(0) });
STUDY_TYPE.put(Character.valueOf('S'), new Object[] { "SECUNDARIA", Integer.valueOf(0) });
STUDY_TYPE.put(Character.valueOf('T'), new Object[] { "TECNICO", Integer.valueOf(0) });
STUDY_TYPE.put(Character.valueOf('U'), new Object[] { "UNIVERSITARIO", Integer.valueOf(1) }); } @Size(max = 100) @Column(name = "entity") private String entityName; @JoinColumn(name = "entity_id", referencedColumnName = "id_dir", updatable = false, insertable = false) @ManyToOne(optional = true) private Company entity; @Column(name = "meritOrder") private Integer meritOrder; @Column(name = "date") @Temporal(TemporalType.DATE) private Date date; @Column(name = "people_id") private Integer peopleId; @Transient private People people; @Column(name = "employee_id")
  private Integer employeeId; @Column(name = "code")
  private String code; @Transient
  private String tempFile; @Transient
private Object ext; public OptionMap getSTUDY_TYPE() { return STUDY_TYPE; }













































  
  public People getPeople() {
return this.people;
  }
  
  public void setPeople(People people) {
this.people = people;
  }
  
  public String getCode() {
return this.code;
  }
  
  public String getTempFile() {
return this.tempFile;
  }
  
  public void setTempFile(String tempFile) {
this.tempFile = tempFile;
  }
  
  public void setCode(String code) {
this.code = code;
  }
  
  public String getEntityName() {
return this.entityName;
  }
  
  public void setEntityName(String entityName) {
this.entityName = entityName;
  }
  
  public Company getEntity() {
return this.entity;
  }
  
  public void setEntity(Company entity) {
this.entityId = (entity != null) ? entity.getId() : null;
this.entity = entity;
  }



  
  public Object getExt() {
return this.ext;
  }
  
  public void setExt(Object ext) {
this.ext = ext;
  }

  
  public Study() {}
  
  public Study(Integer id) {
this.id = id;
  }
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public Character getTypeId() {
return this.typeId;
  }
  
  public void setTypeId(Character typeId) {
this.typeId = typeId;
  }
  
  public Character getLevelId() {
return this.levelId;
  }
  
  public void setLevelId(Character levelId) {
this.levelId = levelId;
  }
  
  public Integer getCycle() {
return this.cycle;
  }
  
  public void setCycle(Integer cycle) {
this.cycle = cycle;
  }
  
  public String getCareer() {
return this.career;
  }
  
  public void setCareer(String career) {
this.career = career;
  }
  
  public Integer getCareerId() {
return this.careerId;
  }
  
  public void setCareerId(Integer careerId) {
this.careerId = careerId;
  }
  
  public Integer getEntityId() {
return this.entityId;
  }
  
  public void setEntityId(Integer entityId) {
this.entityId = entityId;
  }
  
  public Integer getSchoolId() {
return this.schoolId;
  }
  
  public void setSchoolId(Integer schoolId) {
this.schoolId = schoolId;
  }
  
  public Integer getMeritOrder() {
return this.meritOrder;
  }
  
  public void setMeritOrder(Integer meritOrder) {
this.meritOrder = meritOrder;
  }
  
  public Date getDate() {
return this.date;
  }
  
  public void setDate(Date date) {
this.date = date;
  }
  
  public Integer getPeopleId() {
return this.peopleId;
  }
  
  public void setPeopleId(Integer peopleId) {
this.peopleId = peopleId;
  }
  
  public Integer getEmployeeId() {
return this.employeeId;
  }
  
  public void setEmployeeId(Integer employeeId) {
this.employeeId = employeeId;
  }

  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }


  
  public boolean equals(Object object) {
if (!(object instanceof Study)) {
  return false;
    }
Study other = (Study)object;
if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
  return false;
    }
return true;
  }

  
  public String toString() {
return "gob.regionancash.rh.jpa.EscStudy[ id=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/Study.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */