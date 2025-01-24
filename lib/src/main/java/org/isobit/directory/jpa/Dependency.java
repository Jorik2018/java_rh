package org.isobit.directory.jpa;

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
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "org_dependencia")
public class Dependency
        implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_dep")
    private Integer id;
    @Column(name = "id_org")
    private Integer idOrg;
    @JoinColumn(name = "id_dep_tipo", referencedColumnName = "id_dep_tipo")
    @ManyToOne(optional = false)
    private DependencyType type;
    @Column(name = "org_id_dep")
    private Integer parentId;
    @Transient
    private Dependency parent;
    @Column(name = "id_dtra")
    private Integer idDtra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nombre_dep")
    private String name;
    @Size(max = 200)
    @Column(name = "desc_dep")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaReg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "dep_estado")
    private String status;
    @Size(max = 20)
    @Column(name = "abrevia_dep")
    private String acronym;
    @Size(max = 2)
    @Column(name = "tmp")
    private String tmp;
    @Size(max = 17)
    @Column(name = "jerarq_dep")
    private String jerarqDep;
    @Column(name = "codigo_dep")
    private Integer code;
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 8)
    @Column(name = "telefono1")
    private String phone;
    @Size(max = 8)
    @Column(name = "telefono2")
    private String telefono2;
    @Size(max = 8)
    @Column(name = "anexo")
    private String anexo;
    @Column(name = "id_ubi")
    private Integer idUbi;
    @Size(max = 100)
    @Column(name = "sitioweb")
    private String website;
    @Size(max = 3)
    @Column(name = "subdep")
    private String subdep;
    @Column(name = "boss_id")
    private Integer bossId;
    @Column(name = "position_id")
    private Integer positionId;
    /* 99 */ private boolean canceled = Boolean.FALSE.booleanValue();
    @Column(name = "id_institucion")
    private Integer companyId;
    @Column(name = "m_nemonico")
    private Integer mNemonico;
    @Transient
    private Object ext;

    public Object getExt() {
        /* 108 */ return this.ext;
    }

    public void setExt(Object ext) {
        /* 112 */ this.ext = ext;
    }

    public Integer getBossId() {
        /* 116 */ return this.bossId;
    }

    public void setBossId(Integer bossId) {
        /* 120 */ this.bossId = bossId;
    }

    public boolean getCanceled() {
        /* 124 */ return this.canceled;
    }

    public void setCanceled(boolean canceled) {
        /* 128 */ this.canceled = canceled;
    }

    public Integer getmNemonico() {
        /* 132 */ return this.mNemonico;
    }

    public void setmNemonico(Integer mNemonico) {
        /* 136 */ this.mNemonico = mNemonico;
    }

    public Dependency() {
    }

    public void setFullName(String s) {
    }

    public String getFullName() {
        /* 146 */ DependencyType s = getType();
        /* 147 */ return ((s != null) ? (s.getName() + " ") : "") + getName();
    }

    public Dependency(Integer idDep) {
        /* 151 */ this.id = idDep;
    }

    public Integer getId() {
        /* 155 */ return this.id;
    }

    public void setId(Integer idDep) {
        /* 159 */ this.id = idDep;
    }

    public Integer getPositionId() {
        /* 163 */ return this.positionId;
    }

    public void setPositionId(Integer positionId) {
        /* 167 */ this.positionId = positionId;
    }

    public Integer getIdOrg() {
        /* 171 */ return this.idOrg;
    }

    public void setIdOrg(Integer idOrg) {
        /* 175 */ this.idOrg = idOrg;
    }

    public Integer getParentId() {
        /* 179 */ return this.parentId;
    }

    public void setParentId(Integer parentId) {
        /* 183 */ this.parentId = parentId;
    }

    public Dependency getParent() {
        /* 187 */ return this.parent;
    }

    public void setParent(Dependency parent) {
        /* 191 */ this.parent = parent;
    }

    public Integer getIdDtra() {
        /* 195 */ return this.idDtra;
    }

    public void setIdDtra(Integer idDtra) {
        /* 199 */ this.idDtra = idDtra;
    }

    public String getName() {
        /* 203 */ return this.name;
    }

    public void setName(String nombreDep) {
        /* 207 */ this.name = nombreDep;
    }

    public String getDescription() {
        /* 211 */ return this.description;
    }

    public void setDescription(String descDep) {
        /* 215 */ this.description = descDep;
    }

    public Date getFechaReg() {
        /* 219 */ return this.fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        /* 223 */ this.fechaReg = fechaReg;
    }

    public String getStatus() {
        /* 227 */ return this.status;
    }

    public void setStatus(String status) {
        /* 231 */ this.status = status;
    }

    public String getAcronym() {
        /* 235 */ return this.acronym;
    }

    public void setAcronym(String acronym) {
        /* 239 */ this.acronym = acronym;
    }

    public String getTmp() {
        /* 243 */ return this.tmp;
    }

    public void setTmp(String tmp) {
        /* 247 */ this.tmp = tmp;
    }

    public String getJerarqDep() {
        /* 251 */ return this.jerarqDep;
    }

    public void setJerarqDep(String jerarqDep) {
        /* 255 */ this.jerarqDep = jerarqDep;
    }

    public String getEmail() {
        /* 259 */ return this.email;
    }

    public void setEmail(String email) {
        /* 263 */ this.email = email;
    }

    public String getTelefono2() {
        /* 267 */ return this.telefono2;
    }

    public void setTelefono2(String telefono2) {
        /* 271 */ this.telefono2 = telefono2;
    }

    public String getAnexo() {
        /* 275 */ return this.anexo;
    }

    public void setAnexo(String anexo) {
        /* 279 */ this.anexo = anexo;
    }

    public Integer getIdUbi() {
        /* 283 */ return this.idUbi;
    }

    public void setIdUbi(Integer idUbi) {
        /* 287 */ this.idUbi = idUbi;
    }

    public String getSubdep() {
        /* 291 */ return this.subdep;
    }

    public void setSubdep(String subdep) {
        /* 295 */ this.subdep = subdep;
    }

    public Integer getCode() {
        /* 299 */ return this.code;
    }

    public void setCode(Integer code) {
        /* 303 */ this.code = code;
    }

    public String getPhone() {
        /* 307 */ return this.phone;
    }

    public void setPhone(String phone) {
        /* 311 */ this.phone = phone;
    }

    public String getWebsite() {
        /* 315 */ return this.website;
    }

    public void setWebsite(String website) {
        /* 319 */ this.website = website;
    }

    public Integer getCompanyId() {
        /* 323 */ return this.companyId;
    }

    public void setCompanyId(Integer companyId) {
        /* 327 */ this.companyId = companyId;
    }

    public DependencyType getType() {
        /* 331 */ return this.type;
    }

    public void setType(DependencyType orgDepTipo) {
        /* 335 */ this.type = orgDepTipo;
    }

    public int hashCode() {
        /* 340 */ int hash = 0;
        /* 341 */ hash += (this.id != null) ? this.id.hashCode() : 0;
        /* 342 */ return hash;
    }

    public boolean equals(Object object) {
        /* 348 */ if (!(object instanceof Dependency)) {
            /* 349 */ return false;
        }
        Dependency other = (Dependency) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return ((this.type != null) ? (this.type.getName() + " ") : "") + this.name
                + ((this.acronym == null || this.acronym.isEmpty()) ? "" : (" - " + this.acronym));
    }
}
