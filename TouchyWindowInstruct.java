import objectdraw.*;
import java.awt.*;

public class TouchyWindowInstruct extends WindowController {
  @Override public void begin(){
    new Text("Click in this window.",40,50,canvas);
    }
    
    @Override public void onMousePress(Location point) {
    canvas.clear();
    new Text("I'm Touched", 40, 50, canvas );
  }

  @Override public void onMouseRelease( Location point ) {
    canvas.clear();
  }
}
