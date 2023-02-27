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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "SISTEMAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sistemas.findAll", query = "SELECT s FROM Sistemas s"),
    @NamedQuery(name = "Sistemas.findByCodigoSistema", query = "SELECT s FROM Sistemas s WHERE s.codigoSistema = :codigoSistema"),
    @NamedQuery(name = "Sistemas.findByNombreSistema", query = "SELECT s FROM Sistemas s WHERE s.nombreSistema = :nombreSistema"),
    @NamedQuery(name = "Sistemas.findByAutor", query = "SELECT s FROM Sistemas s WHERE s.autor = :autor"),
    @NamedQuery(name = "Sistemas.findByVersion", query = "SELECT s FROM Sistemas s WHERE s.version = :version"),
    @NamedQuery(name = "Sistemas.findByUrlInterna", query = "SELECT s FROM Sistemas s WHERE s.urlInterna = :urlInterna"),
    @NamedQuery(name = "Sistemas.findByUrlExterna", query = "SELECT s FROM Sistemas s WHERE s.urlExterna = :urlExterna"),
    @NamedQuery(name = "Sistemas.findByComentarios", query = "SELECT s FROM Sistemas s WHERE s.comentarios = :comentarios")})
public class Sistemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO_SISTEMA")
    private String codigoSistema;
    @Basic(optional = false)
    @Column(name = "NOMBRE_SISTEMA")
    private String nombreSistema;
    @Basic(optional = false)
    @Column(name = "AUTOR")
    private String autor;
    @Basic(optional = false)
    @Column(name = "VERSION")
    private String version;
    @Basic(optional = false)
    @Column(name = "URL_INTERNA")
    private String urlInterna;
    @Column(name = "URL_EXTERNA")
    private String urlExterna;
    @Column(name = "COMENTARIOS")
    private String comentarios;

    public Sistemas() {
    }

    public Sistemas(String codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    public Sistemas(String codigoSistema, String nombreSistema, String autor, String version, String urlInterna) {
        this.codigoSistema = codigoSistema;
        this.nombreSistema = nombreSistema;
        this.autor = autor;
        this.version = version;
        this.urlInterna = urlInterna;
    }

    public String getCodigoSistema() {
        return codigoSistema;
    }

    public void setCodigoSistema(String codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrlInterna() {
        return urlInterna;
    }

    public void setUrlInterna(String urlInterna) {
        this.urlInterna = urlInterna;
    }

    public String getUrlExterna() {
        return urlExterna;
    }

    public void setUrlExterna(String urlExterna) {
        this.urlExterna = urlExterna;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoSistema != null ? codigoSistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistemas)) {
            return false;
        }
        Sistemas other = (Sistemas) object;
        if ((this.codigoSistema == null && other.codigoSistema != null) || (this.codigoSistema != null && !this.codigoSistema.equals(other.codigoSistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Sistemas[ codigoSistema=" + codigoSistema + " ]";
    }
    
}
