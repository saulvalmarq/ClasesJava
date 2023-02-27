package persistencia;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-01-30T01:19:31")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, BigDecimal> descuentoRentaMensual;
    public static volatile SingularAttribute<Empleados, String> fechaContratacion;
    public static volatile SingularAttribute<Empleados, BigDecimal> salarioMensual;
    public static volatile SingularAttribute<Empleados, String> noNit;
    public static volatile SingularAttribute<Empleados, String> nombreEmpleado;
    public static volatile SingularAttribute<Empleados, String> cargo;

}