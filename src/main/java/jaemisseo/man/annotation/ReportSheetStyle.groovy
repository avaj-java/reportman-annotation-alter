package jaemisseo.man.annotation

import org.apache.poi.ss.usermodel.FillPatternType

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * Created by sujkim on 2017-02-09.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ReportSheetStyle {

    int apply() default -1

    //POI's STYLE
    int color() default (int) -1
    int fontHeightInPoints() default -1
    boolean bold() default false
    boolean italic() default false
    boolean wrapText() default false
    int alignment() default (int) -1
    int verticalAlignment() default (int) -1
    int fillForegroundColor() default (int) -1
    int fillBackgroundColor() default (int) -1
    FillPatternType fillPattern() default FillPatternType.NO_FILL
    int borderTop() default (int) -1
    int borderBottom() default (int) -1
    int borderLeft() default (int) -1
    int borderRight() default (int) -1

    //ReportMan CUSTOM STYLE
    int fontSize() default -1
    int border() default (int) -1
    int foreground() default (int) -1
    int background() default (int) -1

}