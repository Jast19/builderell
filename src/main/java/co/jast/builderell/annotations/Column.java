package co.jast.builderell.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {

    /**
     *
     * @return name of the column in the sheet
     */
    String name();

    /**
     *
     * @return position of the column in the sheet
     */
    int index();

    /**
     *
     * @return mark attribute to not show it on the sheet
     */
    boolean ignore() default false;
}
