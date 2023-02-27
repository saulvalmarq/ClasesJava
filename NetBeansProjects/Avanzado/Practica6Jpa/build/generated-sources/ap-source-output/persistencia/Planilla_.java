package persistencia;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-02-03T23:15:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Planilla.class)
public class Planilla_ { 

    public static volatile SingularAttribute<Planilla, String> nombreContribuyente;
    public static volatile SingularAttribute<Planilla, BigDecimal> impuestos;
    public static volatile SingularAttribute<Planilla, String> direccion;
    public static volatile SingularAttribute<Planilla, String> noNit;
    public static volatile SingularAttribute<Planilla, BigDecimal> ingresosAnuales;

}