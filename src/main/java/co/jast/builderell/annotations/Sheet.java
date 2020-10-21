package co.jast.builderell.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Sheet {

    /**
     *
     * @return name of the sheet in the workbook
     */
    String name() default "sheet1";
}
