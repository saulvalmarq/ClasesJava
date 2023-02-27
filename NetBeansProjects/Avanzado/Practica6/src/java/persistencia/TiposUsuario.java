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
@Table(name = "TIPOS_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposUsuario.findAll", query = "SELECT t FROM TiposUsuario t"),
    @NamedQuery(name = "TiposUsuario.findByCodigoTipo", query = "SELECT t FROM TiposUsuario t WHERE t.codigoTipo = :codigoTipo"),
    @NamedQuery(name = "TiposUsuario.findByTipoUsuario", query = "SELECT t FROM TiposUsuario t WHERE t.tipoUsuario = :tipoUsuario")})
public class TiposUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_TIPO")
    private String codigoTipo;
    @Basic(optional = false)
    @Column(name = "TIPO_USUARIO")
    private String tipoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposUsuarioCodigoTipo")
    private List<Usuarios> usuariosList;

    public TiposUsuario() {
    }

    public TiposUsuario(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public TiposUsuario(String codigoTipo, String tipoUsuario) {
        this.codigoTipo = codigoTipo;
        this.tipoUsuario = tipoUsuario;
    }

    public String getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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
        hash += (codigoTipo != null ? codigoTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposUsuario)) {
            return false;
        }
        TiposUsuario other = (TiposUsuario) object;
        if ((this.codigoTipo == null && other.codigoTipo != null) || (this.codigoTipo != null && !this.codigoTipo.equals(other.codigoTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.TiposUsuario[ codigoTipo=" + codigoTipo + " ]";
    }
    
}
