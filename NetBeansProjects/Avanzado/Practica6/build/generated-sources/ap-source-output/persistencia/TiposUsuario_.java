package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-02-04T18:57:29")
@StaticMetamodel(TiposUsuario.class)
public class TiposUsuario_ { 

    public static volatile SingularAttribute<TiposUsuario, String> codigoTipo;
    public static volatile ListAttribute<TiposUsuario, Usuarios> usuariosList;
    public static volatile SingularAttribute<TiposUsuario, String> tipoUsuario;

}