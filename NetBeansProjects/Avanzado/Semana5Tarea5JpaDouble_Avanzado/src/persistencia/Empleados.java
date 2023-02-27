/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "EMPLEADOS")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findByNoNit", query = "SELECT e FROM Empleados e WHERE e.noNit = :noNit"),
    @NamedQuery(name = "Empleados.findByNombreEmpleado", query = "SELECT e FROM Empleados e WHERE e.nombreEmpleado = :nombreEmpleado"),
    @NamedQuery(name = "Empleados.findByFechaContratacion", query = "SELECT e FROM Empleados e WHERE e.fechaContratacion = :fechaContratacion"),
    @NamedQuery(name = "Empleados.findByCargo", query = "SELECT e FROM Empleados e WHERE e.cargo = :cargo"),
    @NamedQuery(name = "Empleados.findBySalarioMensual", query = "SELECT e FROM Empleados e WHERE e.salarioMensual = :salarioMensual"),
    @NamedQuery(name = "Empleados.findByDescuentoRentaMensual", query = "SELECT e FROM Empleados e WHERE e.descuentoRentaMensual = :descuentoRentaMensual")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NO_NIT")
    private String noNit;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EMPLEADO")
    private String nombreEmpleado;
    @Basic(optional = false)
    @Column(name = "FECHA_CONTRATACION")
    private String fechaContratacion;
    @Basic(optional = false)
    @Column(name = "CARGO")
    private String cargo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "SALARIO_MENSUAL")
    private BigDecimal salarioMensual;
    @Basic(optional = false)
    @Column(name = "DESCUENTO_RENTA_MENSUAL")
    private BigDecimal descuentoRentaMensual;

    public Empleados() {
    }

    public Empleados(String noNit) {
        this.noNit = noNit;
    }

    public Empleados(String noNit, String nombreEmpleado, String fechaContratacion, String cargo, BigDecimal salarioMensual, BigDecimal descuentoRentaMensual) {
        this.noNit = noNit;
        this.nombreEmpleado = nombreEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.cargo = cargo;
        this.salarioMensual = salarioMensual;
        this.descuentoRentaMensual = descuentoRentaMensual;
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(BigDecimal salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public BigDecimal getDescuentoRentaMensual() {
        return descuentoRentaMensual;
    }

    public void setDescuentoRentaMensual(BigDecimal descuentoRentaMensual) {
        this.descuentoRentaMensual = descuentoRentaMensual;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noNit != null ? noNit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.noNit == null && other.noNit != null) || (this.noNit != null && !this.noNit.equals(other.noNit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Empleados[ noNit=" + noNit + " ]";
    }
    
}
