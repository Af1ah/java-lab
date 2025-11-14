import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
  <applet code="adList.class" width=600 height=450></applet>
 */
public class adList extends Applet implements ActionListener {
    List l1,l2;
    Button b1,b2;
    String msg="";
    public void init()
    {
        l1=new List();
        l2=new List();
        l1.add("desktop");
        l1.add("mobile");
        l1.add("laptop");
        add(l1);
        add(l2);
        l1.addActionListener(this);
        l2.addActionListener(this);
        b1=new Button(">>");
        b2=new Button("<<");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String command=ae.getActionCommand();

        if(command.equals(">>")){
            int index=l1.getSelectedIndex();
            String item=l1.getSelectedItem();
            l1.remove(index);
            l2.add(item);
        }
        else if(command.equals("<<")){
            int index=l2.getSelectedIndex();
            String item=l2.getSelectedItem();
            l2.remove(index);
            l1.add(item);
        }
    }
}
