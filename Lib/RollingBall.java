package Lib;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel implements ActionListener {
    int start_angle=0;
    int MoveForward=0,x,y;
    public RollingBall(){
        Timer t=new Timer(50,this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        x=MoveForward-50+getWidth()/2;
        y=getHeight()/2;
        g.setColor(Color.BLACK);
        g.fillArc(x, y-50, 100 ,100, start_angle, 180);
        g.fillArc(x, y-50, 100 ,100, start_angle+180, 180);
    }
    public void actionPerformered(ActionEvent e){
        start_angle+=5;
        MoveForward-=5;
        if(x<=-100){MoveForward=getWidth()/2+50;}
        repaint();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    

}
