/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package primefaces;

import java.math.BigDecimal;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Saúl Valencia
 */
@ManagedBean
@RequestScoped
public class NewJSFManagedBean {

    private String noNit;
    private String nombreContribuyente;
    private String razonSocial;
    private String representanteLegal;
    private BigDecimal rentaAnual;
    private Date fechaRegistro;
    private String estadoContribuyente;

    
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoContribuyente() {
        return estadoContribuyente;
    }

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public void setEstadoContribuyente(String estadoContribuyente) {    
        this.estadoContribuyente = estadoContribuyente;
    }

    public NewJSFManagedBean() {
        
    }
    
}
