package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-02-04T18:57:29")
@StaticMetamodel(TiposDocumentos.class)
public class TiposDocumentos_ { 

    public static volatile SingularAttribute<TiposDocumentos, String> codDocumento;
    public static volatile SingularAttribute<TiposDocumentos, String> tipoDocumento;
    public static volatile ListAttribute<TiposDocumentos, Usuarios> usuariosList;

}