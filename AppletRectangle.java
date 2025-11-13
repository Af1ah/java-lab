import java.awt.*;
import java.applet.*;
/*
<applet code="AppletRectangle.class" width="500" height="500">
</applet>
*/
public class AppletRectangle extends Applet{
    public void paint(Graphics g){
        Color c = new Color(200,010,00);
        g.setColor(c);
        g.fillRect(250, 250, 300, 200);
    }
    
}
