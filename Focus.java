import objectdraw.*;
import java.awt.*;

public class Focus extends WindowController {
    @Override public void onMouseEnter(Location point){
        canvas.clear();
        new Text("The cursor is inside.",40,50,canvas);
    }
    
    @Override public void onMouseExit(Location point){
        canvas.clear();
        new Text("The cursor is outside.",40,50,canvas);
    }
     
}
