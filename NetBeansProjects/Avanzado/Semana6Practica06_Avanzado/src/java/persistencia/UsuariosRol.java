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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "USUARIOS_ROL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosRol.findAll", query = "SELECT u FROM UsuariosRol u"),
    @NamedQuery(name = "UsuariosRol.findByUsuario", query = "SELECT u FROM UsuariosRol u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "UsuariosRol.findByCodigoRol", query = "SELECT u FROM UsuariosRol u WHERE u.codigoRol = :codigoRol"),
    @NamedQuery(name = "UsuariosRol.findByCodigoOpcion", query = "SELECT u FROM UsuariosRol u WHERE u.codigoOpcion = :codigoOpcion")})
public class UsuariosRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "CODIGO_ROL")
    private String codigoRol;
    @Basic(optional = false)
    @Column(name = "CODIGO_OPCION")
    private String codigoOpcion;
    @JoinColumn(name = "USUARIOS_USUARIO", referencedColumnName = "USUARIO")
    @ManyToOne(optional = false)
    private Usuarios usuariosUsuario;

    public UsuariosRol() {
    }

    public UsuariosRol(String usuario) {
        this.usuario = usuario;
    }

    public UsuariosRol(String usuario, String codigoRol, String codigoOpcion) {
        this.usuario = usuario;
        this.codigoRol = codigoRol;
        this.codigoOpcion = codigoOpcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(String codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getCodigoOpcion() {
        return codigoOpcion;
    }

    public void setCodigoOpcion(String codigoOpcion) {
        this.codigoOpcion = codigoOpcion;
    }

    public Usuarios getUsuariosUsuario() {
        return usuariosUsuario;
    }

    public void setUsuariosUsuario(Usuarios usuariosUsuario) {
        this.usuariosUsuario = usuariosUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosRol)) {
            return false;
        }
        UsuariosRol other = (UsuariosRol) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.UsuariosRol[ usuario=" + usuario + " ]";
    }
    
}
