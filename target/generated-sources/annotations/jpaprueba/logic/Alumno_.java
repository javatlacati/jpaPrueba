package jpaprueba.logic;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpaprueba.logic.Carrera;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-19T12:41:08", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, Date> fechaNac;
    public static volatile SingularAttribute<Alumno, String> apellido;
    public static volatile SingularAttribute<Alumno, Carrera> carre;
    public static volatile SingularAttribute<Alumno, Integer> id;
    public static volatile SingularAttribute<Alumno, String> nombre;

}