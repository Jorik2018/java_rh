package org.isobit.directory.jpa;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "org_dep_tipo")
public class DependencyType
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "id_dep_tipo")
  private Integer id;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "nombre_dep_tipo")
  private String name;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 50)
  @Column(name = "abreviatura_dep_tipo")
  private String abreviatura;
  @Size(max = 200)
  @Column(name = "desc_dep_tipo")
  private String description;
  @Basic(optional = false)
  @NotNull
  @Size(min = 1, max = 1)
  @Column(name = "estado_dep_tipo")
  private String status;
  @Column(name = "position_id")
  private Integer positionId;
  
  public DependencyType() {}
  
  public DependencyType(Integer idDepTipo) {
/*  50 */     this.id = idDepTipo;
  }
  
  public Integer getId() {
/*  54 */     return this.id;
  }
  
  public void setId(Integer id) {
/*  58 */     this.id = id;
  }
  
  public String getName() {
/*  62 */     return this.name;
  }
  
  public void setName(String nombreDepTipo) {
/*  66 */     this.name = nombreDepTipo;
  }
  
  public String getAbreviatura() {
/*  70 */     return this.abreviatura;
  }
  
  public void setAbreviatura(String abreviaturaDepTipo) {
/*  74 */     this.abreviatura = abreviaturaDepTipo;
  }
  
  public String getDescription() {
/*  78 */     return this.description;
  }
  
  public void setDescription(String description) {
/*  82 */     this.description = description;
  }
  
  public Integer getPositionId() {
/*  86 */     return this.positionId;
  }
  
  public void setPositionId(Integer positionId) {
/*  90 */     this.positionId = positionId;
  }
  
  public String getStatus() {
/*  94 */     return this.status;
  }
  
  public void setStatus(String status) {
/*  98 */     this.status = status;
  }

  
  public int hashCode() {
/* 103 */     int hash = 0;
/* 104 */     hash += (this.id != null) ? this.id.hashCode() : 0;
/* 105 */     return hash;
  }


  
  public boolean equals(Object object) {
/* 111 */     if (!(object instanceof DependencyType)) {
/* 112 */       return false;
    }
/* 114 */     DependencyType other = (DependencyType)object;
/* 115 */     if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
/* 116 */       return false;
    }
/* 118 */     return true;
  }

  
  public String toString() {
/* 123 */     return "edu.uns.ocid.jpa.OrgDepTipo[ idDepTipo=" + this.id + " ]";
  }
}


/* Location:              /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/directory.jar!/org/isobit/directory/jpa/DependencyType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */