import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MiAnotacion {

	String parametro1();
	String [] parametro2() default {"canada, españa"};
	int parametro3() default 10;
	
}
