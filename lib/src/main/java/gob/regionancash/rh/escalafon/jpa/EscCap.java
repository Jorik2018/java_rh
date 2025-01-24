package gob.regionancash.rh.escalafon.jpa;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.isobit.directory.jpa.Dependency;

@Entity
@Table(name = "esc_cap")
public class EscCap
        implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EscCapPK escCapPK;
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "nro_cargo")
    private Short nroCargo;
    @Column(name = "total_necesario")
    private Short totalNecesario;
    @Column(name = "previstos")
    private Short previstos;
    @Column(name = "nombrados")
    private Short nombrados;
    @Column(name = "contratados")
    private Short contratados;
    @Column(name = "vacantes")
    private Short vacantes;
    @JoinColumn(name = "id_hist_cap", referencedColumnName = "id_hist_cap")
    @ManyToOne
    private EscHistoriaCap idHistCap;
    @JoinColumn(name = "id_nivel", referencedColumnName = "id_nivel")
    @ManyToOne
    private EscNivelRemunerativo nivelRem;
    @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCap")
    private List<EscPersDep> escPersDepList;
    @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCap")
    private List<EscRotacion> escRotacionesList;
    @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCap")
    private List<EscPromocion> escPromocionesList;
    @OneToMany(cascade = { CascadeType.ALL }, mappedBy = "escCap")
    private List<EscRotacionCas> escRotacionesCasList;
    @JoinColumn(name = "id_dep", referencedColumnName = "id_dep", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Dependency dependency;

    public EscCap() {
    }

    public EscCap(EscCapPK escCapPK) {
        this.escCapPK = escCapPK;
    }

    public EscCap(EscCapPK escCapPK, String cargo) {
        this.escCapPK = escCapPK;
        this.cargo = cargo;
    }

    public EscCap(int idCap, int idDep) {
        this.escCapPK = new EscCapPK(idCap, idDep);
    }

    public EscCapPK getEscCapPK() {
        return this.escCapPK;
    }

    public void setEscCapPK(EscCapPK escCapPK) {
        this.escCapPK = escCapPK;
    }

    public Dependency getDependency() {
        return this.dependency;
    }

    public void setDependency(Dependency dependencia) {
        this.dependency = dependencia;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Short getNroCargo() {
        return this.nroCargo;
    }

    public void setNroCargo(Short nroCargo) {
        this.nroCargo = nroCargo;
    }

    public Short getTotalNecesario() {
        return this.totalNecesario;
    }

    public void setTotalNecesario(Short totalNecesario) {
        this.totalNecesario = totalNecesario;
    }

    public Short getPrevistos() {
        return this.previstos;
    }

    public void setPrevistos(Short previstos) {
        this.previstos = previstos;
    }

    public Short getNombrados() {
        return this.nombrados;
    }

    public void setNombrados(Short nombrados) {
        this.nombrados = nombrados;
    }

    public Short getContratados() {
        return this.contratados;
    }

    public void setContratados(Short contratados) {
        this.contratados = contratados;
    }

    public Short getVacantes() {
        return this.vacantes;
    }

    public void setVacantes(Short vacantes) {
        this.vacantes = vacantes;
    }

    public EscHistoriaCap getIdHistCap() {
        return this.idHistCap;
    }

    public void setIdHistCap(EscHistoriaCap idHistCap) {
        this.idHistCap = idHistCap;
    }

    public EscNivelRemunerativo getNivelRem() {
        return this.nivelRem;
    }

    public void setNivelRem(EscNivelRemunerativo nivelRem) {
        this.nivelRem = nivelRem;
    }

    public List<EscPersDep> getEscPersDepList() {
        return this.escPersDepList;
    }

    public void setEscPersDepList(List<EscPersDep> escPersDepList) {
        this.escPersDepList = escPersDepList;
    }

    public List<EscRotacion> getEscRotacionesList() {
        return this.escRotacionesList;
    }

    public void setEscRotacionesList(List<EscRotacion> escRotacionesList) {
        this.escRotacionesList = escRotacionesList;
    }

    public List<EscPromocion> getEscPromocionesList() {
        return this.escPromocionesList;
    }

    public void setEscPromocionesList(List<EscPromocion> escPromocionesList) {
        this.escPromocionesList = escPromocionesList;
    }

    public List<EscRotacionCas> getEscRotacionesCasList() {
        return this.escRotacionesCasList;
    }

    public void setEscRotacionesCasList(List<EscRotacionCas> escRotacionesCasList) {
        this.escRotacionesCasList = escRotacionesCasList;
    }

    public int hashCode() {
        int hash = 0;
        hash += (this.escCapPK != null) ? this.escCapPK.hashCode() : 0;
        return hash;
    }

    public boolean equals(Object object) {
        if (!(object instanceof EscCap)) {
            return false;
        }
        EscCap other = (EscCap) object;
        if ((this.escCapPK == null && other.escCapPK != null)
                || (this.escCapPK != null && !this.escCapPK.equals(other.escCapPK))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return ((this.codigo==null||this.codigo.isBlank()) ? ("C" + getEscCapPK().getIdCap()) : this.codigo) + ": "
                + ((this.dependency != null) ? (this.dependency.getAcronym() + "-") : "") + this.cargo;
    }

}