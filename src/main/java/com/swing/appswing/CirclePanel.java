/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.swing.appswing;

/**
 *
 * @author UsmanAli
 */
import javax.swing.*;
import java.awt.*;

class CirclePanel extends JPanel
{

    private  int radius;
    private  int red;
    private  int blue;
    private  int green;
  public CirclePanel(int radius, int red, int green, int blue)
  {  
      this.radius = radius;
      this.red = red;
      this.blue = blue;
      this.green = green;
  }
  
  public void paintComponent ( Graphics gr )
  { 
    super.paintComponent( gr );

    // Determine the center of the panel
    int cntrX = getWidth()/2;
    int cntrY = getHeight()/2;
    
    // Calculate the radius
    
    
    // Draw the Circle
    gr.setColor( new Color(red,green,blue) );
    gr.fillOval( cntrX-radius, cntrY-radius, radius*2, radius*2 );
    gr.setColor(Color.GREEN );
    gr.drawOval( cntrX-radius, cntrY-radius, radius*2, radius*2 );
   }
  
  public void setRed(int value){
      this.red= value;
  }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void setGreen(int green) {
        this.green = green;
    }
  
}

