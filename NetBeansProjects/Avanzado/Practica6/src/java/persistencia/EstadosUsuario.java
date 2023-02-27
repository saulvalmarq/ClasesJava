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
@Table(name = "ESTADOS_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadosUsuario.findAll", query = "SELECT e FROM EstadosUsuario e"),
    @NamedQuery(name = "EstadosUsuario.findByCodigoEstado", query = "SELECT e FROM EstadosUsuario e WHERE e.codigoEstado = :codigoEstado"),
    @NamedQuery(name = "EstadosUsuario.findByEstadoUsuario", query = "SELECT e FROM EstadosUsuario e WHERE e.estadoUsuario = :estadoUsuario")})
public class EstadosUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_ESTADO")
    private String codigoEstado;
    @Column(name = "ESTADO_USUARIO")
    private String estadoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadosUsuarioCodigoEstado")
    private List<Usuarios> usuariosList;

    public EstadosUsuario() {
    }

    public EstadosUsuario(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getCodigoEstado() {
        return codigoEstado;
    }

    public void setCodigoEstado(String codigoEstado) {
        this.codigoEstado = codigoEstado;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
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
        hash += (codigoEstado != null ? codigoEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadosUsuario)) {
            return false;
        }
        EstadosUsuario other = (EstadosUsuario) object;
        if ((this.codigoEstado == null && other.codigoEstado != null) || (this.codigoEstado != null && !this.codigoEstado.equals(other.codigoEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.EstadosUsuario[ codigoEstado=" + codigoEstado + " ]";
    }
    
}
