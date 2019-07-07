import objectdraw.*;
import java.awt.*;
public class Diamonds extends WindowController {
    @Override public void begin(){
        new Line(300,0,600,300,canvas);
        new Line(300,0,0,300,canvas);
        new Line(0,300,300,600,canvas);
        new Line(600,300,300,600,canvas);
        new Line(150,150,450,450,canvas);
        new Line(150,450,450,150,canvas);
    }
}

