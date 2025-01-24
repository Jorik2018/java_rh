package org.isobit.directory.jpa;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "drt_personajuridica")
public class Company
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "id_dir")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "id_ubg")
  private int idUbg;
  @Basic(optional = false)
  @Column(name = "razon_social")
  private String businessName;
  @Basic(optional = false)
  @Column(name = "ruc")
  private String ruc;
  @Column(name = "direccion")
  private String address;
  @Basic(optional = false)
  @Column(name = "provclie")
  private char provclie = '0';
  @Basic(optional = false)
  @Column(name = "estado_perjur")
  private char estadoPerjur = 'A';
  
  @Column(name = "fecha_ing")
  @Temporal(TemporalType.TIMESTAMP)
  private Date fechaIng;
  
  @Column(name = "update_flow")
  private Integer updateFlow;
  @Transient
  private Directory directory;
  @Transient
  private Object ext;
  
  public Object getExt() {
    return this.ext;
  }
  
  public void setExt(Object ext) {
    this.ext = ext;
  }

  
  public Company() {}
  
  public Company(Integer idDir) {
    this.id = idDir;
  }
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer idDir) {
    this.id = idDir;
  }
  
  public int getIdUbg() {
    return this.idUbg;
  }
  
  public void setIdUbg(int idUbg) {
    this.idUbg = idUbg;
  }
  
  public String getBusinessName() {
    return this.businessName;
  }
  
  public void setBusinessName(String razonSocial) {
    this.businessName = razonSocial;
  }
  
  public String getRuc() {
    return this.ruc;
  }
  
  public void setRuc(String ruc) {
    this.ruc = ruc;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public char getProvclie() {
    return this.provclie;
  }
  
  public void setProvclie(char provclie) {
    this.provclie = provclie;
  }
  
  public char getEstadoPerjur() {
    return this.estadoPerjur;
  }
  
  public void setEstadoPerjur(char estadoPerjur) {
    this.estadoPerjur = estadoPerjur;
  }
  
  public Date getFechaIng() {
    return this.fechaIng;
  }
  
  public void setFechaIng(Date fechaIng) {
    this.fechaIng = fechaIng;
  }
  
  public Integer getUpdateFlow() {
    return this.updateFlow;
  }
  
  public void setUpdateFlow(Integer updateFlow) {
    this.updateFlow = updateFlow;
  }
  
  public Directory getDrtDirectorio() {
    return this.directory;
  }
  
  public void setDrtDirectorio(Directory drtDirectorio) {
    this.directory = drtDirectorio;
  }

  
  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }


  
  public boolean equals(Object object) {
    if (!(object instanceof Company)) {
      return false;
    }
    Company other = (Company)object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  
  public String toString() {
    return this.ruc + ": " + getBusinessName();
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/isobit.jar!/org/isobit/directory/jpa/Company.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */