/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "MUNICIPIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Municipios.findAll", query = "SELECT m FROM Municipios m"),
    @NamedQuery(name = "Municipios.findByCodigoMunicipio", query = "SELECT m FROM Municipios m WHERE m.codigoMunicipio = :codigoMunicipio"),
    @NamedQuery(name = "Municipios.findByNombreMunicipio", query = "SELECT m FROM Municipios m WHERE m.nombreMunicipio = :nombreMunicipio"),
    @NamedQuery(name = "Municipios.findByCodigoDepartamento", query = "SELECT m FROM Municipios m WHERE m.codigoDepartamento = :codigoDepartamento"),
    @NamedQuery(name = "Municipios.findByDeptosCodigoDepartamento", query = "SELECT m FROM Municipios m WHERE m.deptosCodigoDepartamento = :deptosCodigoDepartamento")})
public class Municipios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_MUNICIPIO")
    private String codigoMunicipio;
    @Basic(optional = false)
    @Column(name = "NOMBRE_MUNICIPIO")
    private String nombreMunicipio;
    @Basic(optional = false)
    @Column(name = "CODIGO_DEPARTAMENTO")
    private String codigoDepartamento;
    @Basic(optional = false)
    @Column(name = "DEPTOS_CODIGO_DEPARTAMENTO")
    private String deptosCodigoDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "municipiosCodigoMunicipio")
    private List<Usuarios> usuariosList;

    public Municipios() {
    }

    public Municipios(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public Municipios(String codigoMunicipio, String nombreMunicipio, String codigoDepartamento, String deptosCodigoDepartamento) {
        this.codigoMunicipio = codigoMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.codigoDepartamento = codigoDepartamento;
        this.deptosCodigoDepartamento = deptosCodigoDepartamento;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getDeptosCodigoDepartamento() {
        return deptosCodigoDepartamento;
    }

    public void setDeptosCodigoDepartamento(String deptosCodigoDepartamento) {
        this.deptosCodigoDepartamento = deptosCodigoDepartamento;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMunicipio != null ? codigoMunicipio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipios)) {
            return false;
        }
        Municipios other = (Municipios) object;
        if ((this.codigoMunicipio == null && other.codigoMunicipio != null) || (this.codigoMunicipio != null && !this.codigoMunicipio.equals(other.codigoMunicipio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Municipios[ codigoMunicipio=" + codigoMunicipio + " ]";
    }
    
}
