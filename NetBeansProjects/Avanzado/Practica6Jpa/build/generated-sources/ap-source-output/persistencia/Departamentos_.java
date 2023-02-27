package persistencia;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Usuarios;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-03T23:15:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile ListAttribute<Departamentos, Usuarios> usuariosList;
    public static volatile SingularAttribute<Departamentos, String> nombreDepartamento;
    public static volatile SingularAttribute<Departamentos, String> codDepartamento;

}