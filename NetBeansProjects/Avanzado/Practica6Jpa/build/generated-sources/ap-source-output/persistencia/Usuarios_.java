package persistencia;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Departamentos;
import persistencia.EstadosUsuario;
import persistencia.Municipios;
import persistencia.Paises;
import persistencia.TiposDocumentos;
import persistencia.TiposUsuario;
import persistencia.UsuariosRol;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-03T23:15:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, TiposUsuario> tiposUsuarioCodigoTipo;
    public static volatile SingularAttribute<Usuarios, String> telefonoTrabajoUsuario;
    public static volatile SingularAttribute<Usuarios, String> segundoApellido;
    public static volatile SingularAttribute<Usuarios, Departamentos> departamentosCodDepartamento;
    public static volatile SingularAttribute<Usuarios, Municipios> municipiosCodigoMunicipio;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile SingularAttribute<Usuarios, TiposDocumentos> tiposDocumentosCodDocumento;
    public static volatile SingularAttribute<Usuarios, String> direccionTrabajoUsuario;
    public static volatile SingularAttribute<Usuarios, Paises> paisesCodigoPais;
    public static volatile SingularAttribute<Usuarios, String> noNit;
    public static volatile SingularAttribute<Usuarios, String> faxUsuario;
    public static volatile SingularAttribute<Usuarios, String> numeroDocumento;
    public static volatile SingularAttribute<Usuarios, String> telefonoParticular;
    public static volatile SingularAttribute<Usuarios, String> codigoDepartamento;
    public static volatile SingularAttribute<Usuarios, String> primerApellido;
    public static volatile SingularAttribute<Usuarios, String> direccionParticular;
    public static volatile ListAttribute<Usuarios, UsuariosRol> usuariosRolList;
    public static volatile SingularAttribute<Usuarios, String> codigoPais;
    public static volatile SingularAttribute<Usuarios, String> tipoDocumento;
    public static volatile SingularAttribute<Usuarios, EstadosUsuario> estadosUsuarioCodigoEstado;
    public static volatile SingularAttribute<Usuarios, String> estadoUsuario;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, String> tipoUsuario;
    public static volatile SingularAttribute<Usuarios, String> codigoMunicipio;
    public static volatile SingularAttribute<Usuarios, String> correoElectronico;

}