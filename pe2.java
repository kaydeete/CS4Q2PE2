/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC5-COMLAB1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // for the user input to work

public class pe2 implements ActionListener{
    JFrame frame;
    JButton left;
    JButton right;
    JButton up;
    JButton down;
    
    int xd, yd, xu, yu, xl, yl, xr, yr=0;
    int x = 4;
    int y=4;
    
    public pe2() {
        frame = new JFrame("PE2");
        up = new JButton("Up");
        down = new JButton("Down");
        right = new JButton("Right");
        left = new JButton("Left");
    }
    
    public void setFrame() {
        frame.setLayout(new GraphPaperLayout(new Dimension(10, 10)));
        frame.add(up, new Rectangle(4, 2, 2, 2));
        frame.add(down, new Rectangle(4, 6, 2, 2));
        frame.add(right, new Rectangle(6, 4, 2, 2));
        frame.add(left, new Rectangle(2, 4, 2, 2));
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(400,400);
        
        up.addActionListener(this);
        down.addActionListener(this);
        right.addActionListener(this);
        left.addActionListener(this);
    }
    
    public static void main(String[] args) {
        pe2 srn = new pe2();
        srn.setFrame(); //srn is just a variable name
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==up){
            yu -=20;
            frame.setLocation(xu,yu);
            yl= yu;
            yr = yu;
            yd = yu;
            xl = xu;
            xr = xu;
            xd = xu;
        }
        else if(e.getSource()==down){
            yd += 20;
            frame.setLocation(xd,yd);
            yl = yd;
            yr = yd;
            yu = yd;
            xl = xd;
            xr = xd;
            xu = xd;
        }
        else if(e.getSource()==left){
            xl -=20;
            frame.setLocation(xl,yl);
            yr = yl;
            yu = yl;
            yd = yl;
            xr = xl;
            xu = xl;
            xd = xl;
        }
        else if(e.getSource()==right){
            xr +=20;
            frame.setLocation(xr,yr);
            yl = yr;
            yu = yr;
            yd = yr;
            xl = xr;
            xu = xr;
            xd = xr;
        }
    }
}
