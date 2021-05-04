package jaemisseo.man.annotation

import org.apache.poi.ss.usermodel.FillPatternType

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Created with IntelliJ IDEA.
 * User: sujkim
 * Date: 10/27/16
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReportColumnHighlightStyle {

    String condition() default ""

    String range() default ""

    //POI's STYLE
    int color() default (int) -1
    int fillForegroundColor() default (int) -1
    int fillBackgroundColor() default (int) -1
    FillPatternType fillPattern() default FillPatternType.NO_FILL
    int borderTop() default (int) -1
    int borderBottom() default (int) -1
    int borderLeft() default (int) -1
    int borderRight() default (int) -1

    //ReportMan CUSTOM STYLE
    int border() default (int) -1
    int foreground() default (int) -1
    int background() default (int) -1


}