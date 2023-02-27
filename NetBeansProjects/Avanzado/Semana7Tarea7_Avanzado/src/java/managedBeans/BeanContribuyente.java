/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedBeans;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import mantenimiento.MantenimientoContribuyenteJpa;
import persistencia.Contribuyente;

/**
 *
 * @author Saúl Valencia
 */
@ManagedBean
@RequestScoped
public class BeanContribuyente {

    /**
     * Creates a new instance of BeanContribuyente
     */
    private String nit;
    private String nombre;
    private String razon;
    private String representante;
    private BigDecimal renta;
    private Date fecha;
    private String estado;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public BigDecimal getRenta() {
        return renta;
    }

    public void setRenta(BigDecimal renta) {
        this.renta = renta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BeanContribuyente() {
        FacesMessage msg = new FacesMessage("Guardando Datos del Contribuyente...");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public void limpiarContribuyente(){
    this.nit="";
    this.nombre="";
    this.razon="";
    this.representante="";
    this.renta=null;
    this.fecha=null;
    this.estado="";
        
    }
    
    public void guardarContribuyente() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        FacesMessage msg = new FacesMessage("Guardando Datos del Contribuyente...");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);

        MantenimientoContribuyenteJpa man = new MantenimientoContribuyenteJpa();

        Contribuyente cont = new Contribuyente();

        cont.setNoNit(nit);
        cont.setNombreContribuyente(nombre);
        cont.setRazonSocial(razon);
        cont.setRepresentanteLegal(representante);
        cont.setRentaAnual(renta);
        Date d = (Date) fecha;
        cont.setFechaRegistro(d);
        cont.setEstadoContribuyente(estado);

        man.guardarContribuyente(cont);
    }
}
