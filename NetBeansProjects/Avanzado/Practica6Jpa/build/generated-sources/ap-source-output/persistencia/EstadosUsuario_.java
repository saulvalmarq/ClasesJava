package persistencia;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-03T23:15:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EstadosUsuario.class)
public class EstadosUsuario_ { 

    public static volatile ListAttribute<EstadosUsuario, Usuarios> usuariosList;
    public static volatile SingularAttribute<EstadosUsuario, String> estadoUsuario;
    public static volatile SingularAttribute<EstadosUsuario, String> codigoEstado;

}