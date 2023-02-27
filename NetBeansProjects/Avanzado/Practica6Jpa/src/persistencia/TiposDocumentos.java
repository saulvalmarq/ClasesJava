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

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "TIPOS_DOCUMENTOS")
@NamedQueries({
    @NamedQuery(name = "TiposDocumentos.findAll", query = "SELECT t FROM TiposDocumentos t"),
    @NamedQuery(name = "TiposDocumentos.findByCodDocumento", query = "SELECT t FROM TiposDocumentos t WHERE t.codDocumento = :codDocumento"),
    @NamedQuery(name = "TiposDocumentos.findByTipoDocumento", query = "SELECT t FROM TiposDocumentos t WHERE t.tipoDocumento = :tipoDocumento")})
public class TiposDocumentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_DOCUMENTO")
    private String codDocumento;
    @Basic(optional = false)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposDocumentosCodDocumento")
    private List<Usuarios> usuariosList;

    public TiposDocumentos() {
    }

    public TiposDocumentos(String codDocumento) {
        this.codDocumento = codDocumento;
    }

    public TiposDocumentos(String codDocumento, String tipoDocumento) {
        this.codDocumento = codDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getCodDocumento() {
        return codDocumento;
    }

    public void setCodDocumento(String codDocumento) {
        this.codDocumento = codDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDocumento != null ? codDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TiposDocumentos)) {
            return false;
        }
        TiposDocumentos other = (TiposDocumentos) object;
        if ((this.codDocumento == null && other.codDocumento != null) || (this.codDocumento != null && !this.codDocumento.equals(other.codDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.TiposDocumentos[ codDocumento=" + codDocumento + " ]";
    }
    
}
