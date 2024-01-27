import java.awt.Label;
import java.awt.color.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class mouse extends JFrame implements MouseListener{
    Label l;
    mouse(){
        addMouseListener(this);
        l=new Label();
        
        l.setBounds(20,50,500,20);
        
        add(l);
        
        setSize(600,700);
        setLayout(null);
        setVisible(true);
        
    }
    public void mousePressed(MouseEvent e){
        l.setText("mouse pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("mouse Released");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("mouse Entered");
    }
    public void mouseClicked(MouseEvent e){
        l.setText("mouse Clicked at "+e.getX()+"and "+e.getY());
    }
    public void mouseExited(MouseEvent e){
        l.setText("mouse Exited");
    }
    public static void main(String[] args){
        new mouse();
    }
}