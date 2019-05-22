import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
public class Test extends JApplet {
  public void init(){
    JButton button = new JButton("Boop");

  }
  public void start() {
  
  }
  public void paint(Graphics g){  
g.drawString("welcome",150,150);  
  }  
}
