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
@Table(name = "sv_estudiantes")
@NamedQueries({
    @NamedQuery(name = "SvEstudiantes.findAll", query = "SELECT s FROM SvEstudiantes s"),
    @NamedQuery(name = "SvEstudiantes.findByCarnet", query = "SELECT s FROM SvEstudiantes s WHERE s.carnet = :carnet"),
    @NamedQuery(name = "SvEstudiantes.findByApellidos", query = "SELECT s FROM SvEstudiantes s WHERE s.apellidos = :apellidos"),
    @NamedQuery(name = "SvEstudiantes.findByNombres", query = "SELECT s FROM SvEstudiantes s WHERE s.nombres = :nombres"),
    @NamedQuery(name = "SvEstudiantes.findByDireccion", query = "SELECT s FROM SvEstudiantes s WHERE s.direccion = :direccion"),
    @NamedQuery(name = "SvEstudiantes.findByTelefono", query = "SELECT s FROM SvEstudiantes s WHERE s.telefono = :telefono"),
    @NamedQuery(name = "SvEstudiantes.findByCodigoCarrera", query = "SELECT s FROM SvEstudiantes s WHERE s.codigoCarrera = :codigoCarrera"),
    @NamedQuery(name = "SvEstudiantes.findByCodigoDepartamento", query = "SELECT s FROM SvEstudiantes s WHERE s.codigoDepartamento = :codigoDepartamento")})
public class SvEstudiantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "carnet")
    private String carnet;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "codigo_carrera")
    private String codigoCarrera;
    @Column(name = "codigo_departamento")
    private String codigoDepartamento;

    public SvEstudiantes() {
    }

    public SvEstudiantes(String carnet) {
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carnet != null ? carnet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SvEstudiantes)) {
            return false;
        }
        SvEstudiantes other = (SvEstudiantes) object;
        if ((this.carnet == null && other.carnet != null) || (this.carnet != null && !this.carnet.equals(other.carnet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.SvEstudiantes[ carnet=" + carnet + " ]";
    }
    
}
