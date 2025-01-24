package gob.regionancash.rh.jpa;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;





@Entity
@Table(name = "rh_remunerative_level")
public class RemunerativeLevel
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;
  @Column(name = "employee_type_id")
  private Integer employeeTypeId;
  @Size(max = 50)
  @Column(name = "name")
  private String name;
  @Size(max = 15)
  @Column(name = "abbreviation")
  private String abbreviation;
  @Column(name = "periodicidad")
  private Character periodicidad;
  @Column(name = "monto_basico")
  private BigDecimal montoBasico;
  @Column(name = "monto_tope")
  private BigDecimal montoTope;
  @Column(name = "buc")
  private BigDecimal buc;
  @JoinColumn(name = "employee_type_id", referencedColumnName = "id", insertable = false, updatable = false)
  @ManyToOne(optional = false)
  private EmployeeType employeeType;
  
  public Integer getId() {
return this.id;
  }
  
  public void setId(Integer id) {
this.id = id;
  }
  
  public Integer getEmployeeTypeId() {
return this.employeeTypeId;
  }
  
  public void setEmployeeTypeId(Integer employeeTypeId) {
this.employeeTypeId = employeeTypeId;
  }
  
  public EmployeeType getEmployeeType() {
return this.employeeType;
  }
  
  public void setEmployeeType(EmployeeType employeeType) {
this.employeeType = employeeType;
  }
  
  public String getName() {
return this.name;
  }
  
  public void setName(String name) {
this.name = name;
  }
  
  public String getAbbreviation() {
return this.abbreviation;
  }
  
  public void setAbbreviation(String abbreviation) {
this.abbreviation = abbreviation;
  }
  
  public Character getPeriodicidad() {
return this.periodicidad;
  }
  
  public void setPeriodicidad(Character periodicidad) {
this.periodicidad = periodicidad;
  }
  
  public BigDecimal getMontoBasico() {
return this.montoBasico;
  }
  
  public void setMontoBasico(BigDecimal montoBasico) {
this.montoBasico = montoBasico;
  }
  
  public BigDecimal getMontoTope() {
return this.montoTope;
  }
  
  public void setMontoTope(BigDecimal montoTope) {
this.montoTope = montoTope;
  }
  
  public BigDecimal getBuc() {
return this.buc;
  }
  
  public void setBuc(BigDecimal buc) {
this.buc = buc;
  }


  
  public int hashCode() {
int hash = 0;
hash += (this.id != null) ? this.id.hashCode() : 0;
return hash;
  }

  
  public boolean equals(Object obj) {
return super.equals(obj);
  }

  
  public String toString() {
return (this.id != null) ? this.id.toString() : null;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/regionancash/rh/jpa/RemunerativeLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */