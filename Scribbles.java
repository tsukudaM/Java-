import objectdraw.*;
import java.awt.*;

public class Scribbles extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Line( 120, 120, 60, 100, canvas );
        new FramedRect(220,200,60,80,canvas);
        new FilledRect(180,180,80,60,canvas);
        new FramedOval(200,40,40,80,canvas);
        new FilledOval( 40, 40, 60, 60, canvas );  
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
