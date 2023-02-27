package persistencia;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-03T23:15:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Municipios.class)
public class Municipios_ { 

    public static volatile SingularAttribute<Municipios, String> deptosCodigoDepartamento;
    public static volatile ListAttribute<Municipios, Usuarios> usuariosList;
    public static volatile SingularAttribute<Municipios, String> codigoDepartamento;
    public static volatile SingularAttribute<Municipios, String> nombreMunicipio;
    public static volatile SingularAttribute<Municipios, String> codigoMunicipio;

}