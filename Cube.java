import objectdraw.*;
import java.awt.*;

public class Cube extends WindowController {
@Override public void begin(){
new FramedRect(20,20,400,400,canvas);
new Line(420,20,600,200,canvas);  
new Line(600,200,600,600,canvas);
new Line(420,420,600,600,canvas);
new Line(20,420,200,600,canvas);
new Line(200,600,600,600,canvas);  
}
}
