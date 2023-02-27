package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-02-04T18:57:29")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile ListAttribute<Paises, Usuarios> usuariosList;
    public static volatile SingularAttribute<Paises, String> codigoPais;
    public static volatile SingularAttribute<Paises, String> nombrePais;

}