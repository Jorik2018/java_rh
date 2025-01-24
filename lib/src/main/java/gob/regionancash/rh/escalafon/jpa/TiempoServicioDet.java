package gob.regionancash.rh.escalafon.jpa;

import gob.regionancash.rh.jpa.Employee;
import java.util.Date;
import org.isobit.directory.model.Dependency;
import org.isobit.util.XDate;

public class TiempoServicioDet {
  public static final int[] vv = new int[] { 0, 0, 0 };

  private short movimiento = 1;
  private String tipo;
  private Employee employee;
  private String descripcion;
  private String abrev;
  private Dependency dependency;
  private String document;
  private Date fechaIni;
  private Date fechaFin;
  private String periodo;

  public short getMovimiento() {
    return this.movimiento;
  }

  public void setMovimiento(short movimiento) {
    this.movimiento = movimiento;
  }

  public String getTipo() {
    return this.tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Employee getEmployee() {
    return this.employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getAbrev() {
    return this.abrev;
  }

  public void setAbrev(String abrev) {
    this.abrev = abrev;
  }

  public Dependency getDependency() {
    return this.dependency;
  }

  public void setDependency(Dependency dependency) {
    this.dependency = dependency;
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

  public String getPeriodo() {
    return this.periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public String getDocument() {
    return this.document;
  }

  public void setDocument(String documento) {
    this.document = documento;
  }

  public int getYears() {
    return this.v[0];
  }

  public int getMonths() {
    return this.v[1];
  }

  public int getDays() {
    return this.v[2];
  }

  public void init() {
    if (this.fechaIni == null) {
      this.v = vv;
    } else if (this.fechaFin != null) {
      this.v = XDate.getDateDifferenceInDDMMYYYY(this.fechaIni, this.fechaFin);
    }
  }

  private int[] v = vv;
}

/*
 * Location:
 * /Users/ealarcop/Downloads/rh_web_admin.war!/WEB-INF/lib/rh.jar!/gob/
 * regionancash/rh/escalafon/jpa/TiempoServicioDet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.3
 */