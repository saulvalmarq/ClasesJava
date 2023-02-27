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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Saúl Valencia
 */
@Entity
@Table(name = "USUARIOS")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarios.findByTipoUsuario", query = "SELECT u FROM Usuarios u WHERE u.tipoUsuario = :tipoUsuario"),
    @NamedQuery(name = "Usuarios.findByPrimerApellido", query = "SELECT u FROM Usuarios u WHERE u.primerApellido = :primerApellido"),
    @NamedQuery(name = "Usuarios.findBySegundoApellido", query = "SELECT u FROM Usuarios u WHERE u.segundoApellido = :segundoApellido"),
    @NamedQuery(name = "Usuarios.findByNombres", query = "SELECT u FROM Usuarios u WHERE u.nombres = :nombres"),
    @NamedQuery(name = "Usuarios.findByTipoDocumento", query = "SELECT u FROM Usuarios u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuarios.findByNumeroDocumento", query = "SELECT u FROM Usuarios u WHERE u.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Usuarios.findByNoNit", query = "SELECT u FROM Usuarios u WHERE u.noNit = :noNit"),
    @NamedQuery(name = "Usuarios.findByCodigoPais", query = "SELECT u FROM Usuarios u WHERE u.codigoPais = :codigoPais"),
    @NamedQuery(name = "Usuarios.findByCodigoDepartamento", query = "SELECT u FROM Usuarios u WHERE u.codigoDepartamento = :codigoDepartamento"),
    @NamedQuery(name = "Usuarios.findByCodigoMunicipio", query = "SELECT u FROM Usuarios u WHERE u.codigoMunicipio = :codigoMunicipio"),
    @NamedQuery(name = "Usuarios.findByDireccionParticular", query = "SELECT u FROM Usuarios u WHERE u.direccionParticular = :direccionParticular"),
    @NamedQuery(name = "Usuarios.findByTelefonoParticular", query = "SELECT u FROM Usuarios u WHERE u.telefonoParticular = :telefonoParticular"),
    @NamedQuery(name = "Usuarios.findByDireccionTrabajoUsuario", query = "SELECT u FROM Usuarios u WHERE u.direccionTrabajoUsuario = :direccionTrabajoUsuario"),
    @NamedQuery(name = "Usuarios.findByTelefonoTrabajoUsuario", query = "SELECT u FROM Usuarios u WHERE u.telefonoTrabajoUsuario = :telefonoTrabajoUsuario"),
    @NamedQuery(name = "Usuarios.findByFaxUsuario", query = "SELECT u FROM Usuarios u WHERE u.faxUsuario = :faxUsuario"),
    @NamedQuery(name = "Usuarios.findByCorreoElectronico", query = "SELECT u FROM Usuarios u WHERE u.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Usuarios.findByEstadoUsuario", query = "SELECT u FROM Usuarios u WHERE u.estadoUsuario = :estadoUsuario")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "TIPO_USUARIO")
    private String tipoUsuario;
    @Basic(optional = false)
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Basic(optional = false)
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    @Column(name = "NOMBRES")
    private String nombres;
    @Basic(optional = false)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    @Basic(optional = false)
    @Column(name = "NO_NIT")
    private String noNit;
    @Basic(optional = false)
    @Column(name = "CODIGO_PAIS")
    private String codigoPais;
    @Basic(optional = false)
    @Column(name = "CODIGO_DEPARTAMENTO")
    private String codigoDepartamento;
    @Basic(optional = false)
    @Column(name = "CODIGO_MUNICIPIO")
    private String codigoMunicipio;
    @Column(name = "DIRECCION_PARTICULAR")
    private String direccionParticular;
    @Column(name = "TELEFONO_PARTICULAR")
    private String telefonoParticular;
    @Column(name = "DIRECCION_TRABAJO_USUARIO")
    private String direccionTrabajoUsuario;
    @Column(name = "TELEFONO_TRABAJO_USUARIO")
    private String telefonoTrabajoUsuario;
    @Column(name = "FAX_USUARIO")
    private String faxUsuario;
    @Basic(optional = false)
    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;
    @Basic(optional = false)
    @Column(name = "ESTADO_USUARIO")
    private String estadoUsuario;
    @JoinColumn(name = "DEPARTAMENTOS_COD_DEPARTAMENTO", referencedColumnName = "COD_DEPARTAMENTO")
    @ManyToOne(optional = false)
    private Departamentos departamentosCodDepartamento;
    @JoinColumn(name = "ESTADOS_USUARIO_CODIGO_ESTADO", referencedColumnName = "CODIGO_ESTADO")
    @ManyToOne(optional = false)
    private EstadosUsuario estadosUsuarioCodigoEstado;
    @JoinColumn(name = "MUNICIPIOS_CODIGO_MUNICIPIO", referencedColumnName = "CODIGO_MUNICIPIO")
    @ManyToOne(optional = false)
    private Municipios municipiosCodigoMunicipio;
    @JoinColumn(name = "PAISES_CODIGO_PAIS", referencedColumnName = "CODIGO_PAIS")
    @ManyToOne(optional = false)
    private Paises paisesCodigoPais;
    @JoinColumn(name = "TIPOS_DOCUMENTOS_COD_DOCUMENTO", referencedColumnName = "COD_DOCUMENTO")
    @ManyToOne(optional = false)
    private TiposDocumentos tiposDocumentosCodDocumento;
    @JoinColumn(name = "TIPOS_USUARIO_CODIGO_TIPO", referencedColumnName = "CODIGO_TIPO")
    @ManyToOne(optional = false)
    private TiposUsuario tiposUsuarioCodigoTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuariosUsuario")
    private List<UsuariosRol> usuariosRolList;

    public Usuarios() {
    }

    public Usuarios(String usuario) {
        this.usuario = usuario;
    }

    public Usuarios(String usuario, String tipoUsuario, String primerApellido, String segundoApellido, String tipoDocumento, String numeroDocumento, String noNit, String codigoPais, String codigoDepartamento, String codigoMunicipio, String correoElectronico, String estadoUsuario) {
        this.usuario = usuario;
        this.tipoUsuario = tipoUsuario;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.noNit = noNit;
        this.codigoPais = codigoPais;
        this.codigoDepartamento = codigoDepartamento;
        this.codigoMunicipio = codigoMunicipio;
        this.correoElectronico = correoElectronico;
        this.estadoUsuario = estadoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getDireccionParticular() {
        return direccionParticular;
    }

    public void setDireccionParticular(String direccionParticular) {
        this.direccionParticular = direccionParticular;
    }

    public String getTelefonoParticular() {
        return telefonoParticular;
    }

    public void setTelefonoParticular(String telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }

    public String getDireccionTrabajoUsuario() {
        return direccionTrabajoUsuario;
    }

    public void setDireccionTrabajoUsuario(String direccionTrabajoUsuario) {
        this.direccionTrabajoUsuario = direccionTrabajoUsuario;
    }

    public String getTelefonoTrabajoUsuario() {
        return telefonoTrabajoUsuario;
    }

    public void setTelefonoTrabajoUsuario(String telefonoTrabajoUsuario) {
        this.telefonoTrabajoUsuario = telefonoTrabajoUsuario;
    }

    public String getFaxUsuario() {
        return faxUsuario;
    }

    public void setFaxUsuario(String faxUsuario) {
        this.faxUsuario = faxUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public Departamentos getDepartamentosCodDepartamento() {
        return departamentosCodDepartamento;
    }

    public void setDepartamentosCodDepartamento(Departamentos departamentosCodDepartamento) {
        this.departamentosCodDepartamento = departamentosCodDepartamento;
    }

    public EstadosUsuario getEstadosUsuarioCodigoEstado() {
        return estadosUsuarioCodigoEstado;
    }

    public void setEstadosUsuarioCodigoEstado(EstadosUsuario estadosUsuarioCodigoEstado) {
        this.estadosUsuarioCodigoEstado = estadosUsuarioCodigoEstado;
    }

    public Municipios getMunicipiosCodigoMunicipio() {
        return municipiosCodigoMunicipio;
    }

    public void setMunicipiosCodigoMunicipio(Municipios municipiosCodigoMunicipio) {
        this.municipiosCodigoMunicipio = municipiosCodigoMunicipio;
    }

    public Paises getPaisesCodigoPais() {
        return paisesCodigoPais;
    }

    public void setPaisesCodigoPais(Paises paisesCodigoPais) {
        this.paisesCodigoPais = paisesCodigoPais;
    }

    public TiposDocumentos getTiposDocumentosCodDocumento() {
        return tiposDocumentosCodDocumento;
    }

    public void setTiposDocumentosCodDocumento(TiposDocumentos tiposDocumentosCodDocumento) {
        this.tiposDocumentosCodDocumento = tiposDocumentosCodDocumento;
    }

    public TiposUsuario getTiposUsuarioCodigoTipo() {
        return tiposUsuarioCodigoTipo;
    }

    public void setTiposUsuarioCodigoTipo(TiposUsuario tiposUsuarioCodigoTipo) {
        this.tiposUsuarioCodigoTipo = tiposUsuarioCodigoTipo;
    }

    public List<UsuariosRol> getUsuariosRolList() {
        return usuariosRolList;
    }

    public void setUsuariosRolList(List<UsuariosRol> usuariosRolList) {
        this.usuariosRolList = usuariosRolList;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Usuarios[ usuario=" + usuario + " ]";
    }
    
}
