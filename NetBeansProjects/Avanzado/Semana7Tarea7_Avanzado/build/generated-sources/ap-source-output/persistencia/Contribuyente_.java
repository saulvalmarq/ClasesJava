package persistencia;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-02-12T23:04:41")
@StaticMetamodel(Contribuyente.class)
public class Contribuyente_ { 

    public static volatile SingularAttribute<Contribuyente, String> nombreContribuyente;
    public static volatile SingularAttribute<Contribuyente, String> razonSocial;
    public static volatile SingularAttribute<Contribuyente, String> estadoContribuyente;
    public static volatile SingularAttribute<Contribuyente, Date> fechaRegistro;
    public static volatile SingularAttribute<Contribuyente, String> noNit;
    public static volatile SingularAttribute<Contribuyente, String> representanteLegal;
    public static volatile SingularAttribute<Contribuyente, BigDecimal> rentaAnual;

}