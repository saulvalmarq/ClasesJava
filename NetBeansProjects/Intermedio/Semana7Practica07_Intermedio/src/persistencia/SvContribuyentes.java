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
@Table(name = "sv_contribuyentes")
@NamedQueries({
    @NamedQuery(name = "SvContribuyentes.findAll", query = "SELECT s FROM SvContribuyentes s"),
    @NamedQuery(name = "SvContribuyentes.findByNoNit", query = "SELECT s FROM SvContribuyentes s WHERE s.noNit = :noNit"),
    @NamedQuery(name = "SvContribuyentes.findByNombreContribuyente", query = "SELECT s FROM SvContribuyentes s WHERE s.nombreContribuyente = :nombreContribuyente"),
    @NamedQuery(name = "SvContribuyentes.findByRazonSocial", query = "SELECT s FROM SvContribuyentes s WHERE s.razonSocial = :razonSocial"),
    @NamedQuery(name = "SvContribuyentes.findByRepresentanteLegal", query = "SELECT s FROM SvContribuyentes s WHERE s.representanteLegal = :representanteLegal"),
    @NamedQuery(name = "SvContribuyentes.findByRentaAnual", query = "SELECT s FROM SvContribuyentes s WHERE s.rentaAnual = :rentaAnual")})
public class SvContribuyentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_nit")
    private String noNit;
    @Column(name = "nombre_contribuyente")
    private String nombreContribuyente;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "representante_legal")
    private String representanteLegal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "renta_anual")
    private BigDecimal rentaAnual;

    public SvContribuyentes() {
    }

    public SvContribuyentes(String noNit) {
        this.noNit = noNit;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public BigDecimal getRentaAnual() {
        return rentaAnual;
    }

    public void setRentaAnual(BigDecimal rentaAnual) {
        this.rentaAnual = rentaAnual;
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
        if (!(object instanceof SvContribuyentes)) {
            return false;
        }
        SvContribuyentes other = (SvContribuyentes) object;
        if ((this.noNit == null && other.noNit != null) || (this.noNit != null && !this.noNit.equals(other.noNit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.SvContribuyentes[ noNit=" + noNit + " ]";
    }
    
}
