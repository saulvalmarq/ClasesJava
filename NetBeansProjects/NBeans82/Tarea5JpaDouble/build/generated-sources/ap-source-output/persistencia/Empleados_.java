package persistencia;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-01-30T00:11:16", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, BigDecimal> descuentoRentaMensual;
    public static volatile SingularAttribute<Empleados, String> fechaContratacion;
    public static volatile SingularAttribute<Empleados, BigDecimal> salarioMensual;
    public static volatile SingularAttribute<Empleados, String> noNit;
    public static volatile SingularAttribute<Empleados, String> nombreEmpleado;
    public static volatile SingularAttribute<Empleados, String> cargo;

}