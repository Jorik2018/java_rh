package org.isobit.directory.jpa;

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
import jakarta.persistence.Transient;

@Entity
@Table(name = "drt_directorio")
public class Directory
  implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_dir")
  private Integer idDir;
  @Basic(optional = false)
  @Column(name = "psp_cxt")
  private short pspCxt;
  @Basic(optional = true)
  @Column(name = "psp_app")
  private int pspApp;
  @Basic(optional = true)
  @Column(name = "id_dclas")
  private int idDclas;
  @Basic(optional = true)
  @Column(name = "psp_uid")
  private Integer pspUid;
  @Basic(optional = true)
  @Column(name = "dateinsert", insertable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dateinsert;
  @Transient
  private Object ext;
  
  public int getIdDclas() {
    return this.idDclas;
  }
  
  public void setIdDclas(int idDclas) {
    this.idDclas = idDclas;
  }
  
  public Integer getIdDir() {
    return this.idDir;
  }
  
  public void setIdDir(Integer idDir) {
    this.idDir = idDir;
  }
  
  public short getPspCxt() {
    return this.pspCxt;
  }
  
  public void setPspCxt(short pspCxt) {
    this.pspCxt = pspCxt;
  }
  
  public int getPspApp() {
    return this.pspApp;
  }
  
  public void setPspApp(int pspApp) {
    this.pspApp = pspApp;
  }
  
  public Integer getPspUid() {
    return this.pspUid;
  }
  
  public void setPspUid(Integer pspUid) {
    this.pspUid = pspUid;
  }
  
  public Date getDateinsert() {
    return this.dateinsert;
  }
  
  public void setDateinsert(Date dateinsert) {
    this.dateinsert = dateinsert;
  }
  
  public Object getExt() {
    return this.ext;
  }
  
  public void setExt(Object ext) {
    this.ext = ext;
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/isobit.jar!/org/isobit/directory/jpa/Directory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */