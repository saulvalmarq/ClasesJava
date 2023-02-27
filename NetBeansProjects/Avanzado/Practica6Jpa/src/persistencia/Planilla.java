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
@Table(name = "PLANILLA")
@NamedQueries({
    @NamedQuery(name = "Planilla.findAll", query = "SELECT p FROM Planilla p"),
    @NamedQuery(name = "Planilla.findByNoNit", query = "SELECT p FROM Planilla p WHERE p.noNit = :noNit"),
    @NamedQuery(name = "Planilla.findByNombreContribuyente", query = "SELECT p FROM Planilla p WHERE p.nombreContribuyente = :nombreContribuyente"),
    @NamedQuery(name = "Planilla.findByDireccion", query = "SELECT p FROM Planilla p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Planilla.findByIngresosAnuales", query = "SELECT p FROM Planilla p WHERE p.ingresosAnuales = :ingresosAnuales"),
    @NamedQuery(name = "Planilla.findByImpuestos", query = "SELECT p FROM Planilla p WHERE p.impuestos = :impuestos")})
public class Planilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NO_NIT")
    private String noNit;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CONTRIBUYENTE")
    private String nombreContribuyente;
    @Basic(optional = false)
    @Column(name = "DIRECCION")
    private String direccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "INGRESOS_ANUALES")
    private BigDecimal ingresosAnuales;
    @Basic(optional = false)
    @Column(name = "IMPUESTOS")
    private BigDecimal impuestos;

    public Planilla() {
    }

    public Planilla(String noNit) {
        this.noNit = noNit;
    }

    public Planilla(String noNit, String nombreContribuyente, String direccion, BigDecimal ingresosAnuales, BigDecimal impuestos) {
        this.noNit = noNit;
        this.nombreContribuyente = nombreContribuyente;
        this.direccion = direccion;
        this.ingresosAnuales = ingresosAnuales;
        this.impuestos = impuestos;
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getNombreContribuyente() {
        return nombreContribuyente;
    }

    public void setNombreContribuyente(String nombreContribuyente) {
        this.nombreContribuyente = nombreContribuyente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigDecimal getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(BigDecimal ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public BigDecimal getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(BigDecimal impuestos) {
        this.impuestos = impuestos;
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
        if (!(object instanceof Planilla)) {
            return false;
        }
        Planilla other = (Planilla) object;
        if ((this.noNit == null && other.noNit != null) || (this.noNit != null && !this.noNit.equals(other.noNit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Planilla[ noNit=" + noNit + " ]";
    }
    
}
