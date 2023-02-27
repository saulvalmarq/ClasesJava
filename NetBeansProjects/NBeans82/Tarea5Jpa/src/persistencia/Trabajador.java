/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
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
@Table(name = "TRABAJADOR")
@NamedQueries({
    @NamedQuery(name = "Trabajador.findAll", query = "SELECT t FROM Trabajador t"),
    @NamedQuery(name = "Trabajador.findByNoNit", query = "SELECT t FROM Trabajador t WHERE t.noNit = :noNit"),
    @NamedQuery(name = "Trabajador.findByNombreEmpleado", query = "SELECT t FROM Trabajador t WHERE t.nombreEmpleado = :nombreEmpleado"),
    @NamedQuery(name = "Trabajador.findByFechaContratacion", query = "SELECT t FROM Trabajador t WHERE t.fechaContratacion = :fechaContratacion"),
    @NamedQuery(name = "Trabajador.findByCargo", query = "SELECT t FROM Trabajador t WHERE t.cargo = :cargo"),
    @NamedQuery(name = "Trabajador.findBySalarioMensual", query = "SELECT t FROM Trabajador t WHERE t.salarioMensual = :salarioMensual"),
    @NamedQuery(name = "Trabajador.findByDescuentoRentaMensual", query = "SELECT t FROM Trabajador t WHERE t.descuentoRentaMensual = :descuentoRentaMensual")})
public class Trabajador implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "SALARIO_MENSUAL")
    private String salarioMensual;
    @Basic(optional = false)
    @Column(name = "DESCUENTO_RENTA_MENSUAL")
    private String descuentoRentaMensual;

    public Trabajador() {
    }

    public Trabajador(String noNit) {
        this.noNit = noNit;
    }

    public Trabajador(String noNit, String nombreEmpleado, String fechaContratacion, String cargo, String salarioMensual, String descuentoRentaMensual) {
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

    public String getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(String salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getDescuentoRentaMensual() {
        return descuentoRentaMensual;
    }

    public void setDescuentoRentaMensual(String descuentoRentaMensual) {
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
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.noNit == null && other.noNit != null) || (this.noNit != null && !this.noNit.equals(other.noNit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Trabajador[ noNit=" + noNit + " ]";
    }
    
}
