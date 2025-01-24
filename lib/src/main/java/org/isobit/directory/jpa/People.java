package org.isobit.directory.jpa;

import java.io.Serializable;
import java.util.Date;
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


@Entity
@Table(name = "drt_personanatural")
public class People
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Basic(optional = false)
  @Column(name = "ap_materno")
  private String apMaterno = ""; @Id @Basic(optional = false) @Column(name = "id_dir")
  private Integer id; @Basic(optional = false)
  @Column(name = "ap_paterno")
  private String apPaterno = "";
  @Basic(optional = false)
  @Column(name = "nombre")
  private String names = "";
  @Basic(optional = false)
  @Column(name = "sexo")
  private char sex = ' ';
  @Column(name = "fecha_nac")
  @Temporal(TemporalType.DATE)
  private Date birthdate;
  @Basic(optional = false)
  @Column(name = "estado_pernat")
  private char status = '1';
  
  @Basic(optional = false)
  @Column(name = "fecha_ing")
  @Temporal(TemporalType.DATE)
  private Date fechaIng;
  @Column(name = "direccion")
  private String address = "";
  @Column(name = "observacion")
  private String observacion = "";
  @JoinColumn(name = "id_pdid", referencedColumnName = "id_pdid")
  @ManyToOne(optional = true, fetch = FetchType.LAZY)
  private DocIdentity document;
  @Column(name = "numero_pndid")
  private String code = "";
  @Column(name = "id_ubg_nac")
  private Integer idUbgNac;
  @Column(name = "id_ubg_pro")
  private Integer idUbgPro;
  @Column(name = "id_pnec")
  private Integer idPnec;
  @Column(name = "id_grpsng")
  private Integer idGrpsng;
  @Column(name = "nombre_completo")
  private String fullName = "";
  
  @Column(name = "id_colegio")
  private Integer idColegio = Integer.valueOf(0);
  @Column(name = "anio_egreso_cole")
  private Integer anioEgresoCole = Integer.valueOf(0); @Column(name = "update_flow")
  private Integer updateFlow;
  @Column(name = "email_prin")
  private String mail = "";
  @Column(name = "telefono_prin")
  private String telefonoPrin = "";
  @Column(name = "celular_prin")
  private String phone = "";
  
  @Column(name = "update_self")
  private Integer updateSelf = Integer.valueOf(0); @Column(name = "otro_colegio")
  private String otroColegio = "";

  
  @Transient
  private Object ext;


  
  public DocIdentity getDocument() {
    return this.document;
  }
  
  public void setDocument(DocIdentity document) {
    this.document = document;
  }
  
  public Object getExt() {
    return this.ext;
  }
  
  public void setExt(Object ext) {
    this.ext = ext;
  }
  
  public String getNames() {
    return this.names;
  }
  
  public void setNames(String names) {
    this.names = names;
  }

  
  public People() {}
  
  public People(Integer id) {
    this.id = id;
  }
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer idDir) {
    this.id = idDir;
  }
  
  public Integer getIdUbgNac() {
    return this.idUbgNac;
  }
  
  public void setIdUbgNac(Integer idUbgNac) {
    this.idUbgNac = Integer.valueOf((idUbgNac != null) ? idUbgNac.intValue() : 0);
  }
  
  public String getApMaterno() {
    return this.apMaterno;
  }
  
  public void setApMaterno(String apMaterno) {
    this.apMaterno = apMaterno;
  }
  
  public String getApPaterno() {
    return this.apPaterno;
  }
  
  public void setApPaterno(String apPaterno) {
    this.apPaterno = apPaterno;
  }
  
  public char getSex() {
    return this.sex;
  }
  
  public void setSex(char sexo) {
    this.sex = sexo;
  }







  
  public Date getBirthdate() {
    return this.birthdate;
  }
  
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }
  
  public char getStatus() {
    return this.status;
  }
  
  public void setStatus(char status) {
    this.status = status;
  }
  
  public Date getFechaIng() {
    return this.fechaIng;
  }
  
  public void setFechaIng(Date fechaIng) {
    this.fechaIng = fechaIng;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String direccion) {
    this.address = direccion;
  }
  
  public Integer getIdUbgPro() {
    return this.idUbgPro;
  }
  
  public void setIdUbgPro(Integer idUbgPro) {
    this.idUbgPro = Integer.valueOf((idUbgPro != null) ? idUbgPro.intValue() : 0);
  }
  
  public String getObservacion() {
    return this.observacion;
  }
  
  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }
  
  public String getCode() {
    return this.code;
  }
  
  public void setCode(String numeroPndid) {
    this.code = numeroPndid;
  }
  
  public Integer getIdPnec() {
    return this.idPnec;
  }
  
  public void setIdPnec(Integer idPnec) {
    this.idPnec = idPnec;
  }
  
  public Integer getIdGrpsng() {
    return this.idGrpsng;
  }
  
  public void setIdGrpsng(Integer idGrpsng) {
    this.idGrpsng = idGrpsng;
  }
  
  public String getFullName() {
    return this.fullName;
  }
  
  public void setFullName(String nombreCompleto) {
    this.fullName = nombreCompleto;
  }
  
  public Integer getIdColegio() {
    return this.idColegio;
  }
  
  public void setIdColegio(Integer idColegio) {
    this.idColegio = idColegio;
  }
  
  public Integer getAnioEgresoCole() {
    return this.anioEgresoCole;
  }
  
  public void setAnioEgresoCole(Integer anioEgresoCole) {
    this.anioEgresoCole = anioEgresoCole;
  }
  
  public Integer getUpdateFlow() {
    return this.updateFlow;
  }
  
  public void setUpdateFlow(Integer updateFlow) {
    this.updateFlow = updateFlow;
  }
  
  public String getMail() {
    return this.mail;
  }
  
  public void setMail(String emailPrin) {
    this.mail = emailPrin;
  }
  
  public String getTelefonoPrin() {
    return this.telefonoPrin;
  }
  
  public void setTelefonoPrin(String telefonoPrin) {
    this.telefonoPrin = telefonoPrin;
  }
  
  public String getPhone() {
    return this.phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public int getUpdateSelf() {
    return this.updateSelf.intValue();
  }
  
  public void setUpdateSelf(Integer updateSelf) {
    this.updateSelf = Integer.valueOf((updateSelf != null) ? updateSelf.intValue() : 0);
  }
  
  public String getOtroColegio() {
    return this.otroColegio;
  }
  
  public void setOtroColegio(String otroColegio) {
    this.otroColegio = otroColegio;
  }
















  
  public int hashCode() {
    int hash = 0;
    hash += (this.id != null) ? this.id.hashCode() : 0;
    return hash;
  }


  
  public boolean equals(Object object) {
    if (!(object instanceof People)) {
      return false;
    }
    People other = (People)object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  
  public String toString() {
    return (this.id != null) ? (((this.code==null||this.code.isEmpty()) ? ("[" + this.id + "]") : this.code) + ": " + this.fullName) : (
      "people[" + this.id + "]");
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/isobit.jar!/org/isobit/directory/jpa/People.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */