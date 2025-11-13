import java.awt.*;
import java.applet.*;
/*
<applet code="AppletRectangle.class" width="500" height="500">
        <param name="x" value="50">
        <param name="y" value="50">
        <param name="w" value="150">
        <param name="h" value="250">
        <param name="r" value="200">
        <param name="g" value="000">
        <param name="b" value="010">
        
    </applet>
*/
public class AppletRectangle extends Applet{
    public void paint(Graphics G){
        int x = Integer.parseInt(getParameter("x"));
        int y = Integer.parseInt(getParameter("y"));
        int r = Integer.parseInt(getParameter("r"));
        int g = Integer.parseInt(getParameter("g"));
        int b = Integer.parseInt(getParameter("b"));
        int w = Integer.parseInt(getParameter("w"));
        int h = Integer.parseInt(getParameter("h"));
        Color c = new Color(r,g,b);
        G.setColor(c);
        G.fillRect(x, y, h, w);
    }
    
}
