/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pintar;

import Cargas.Calculos;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;

/**
 *
 * @author fredy-18
 */
public class Lineas {
    public static void pintarLinea(Graphics g, int x1,int y1,int x2,int y2){
        int xAux = 0; int yAux = 0; 
        double tamano=0;
        g.setColor(Color.BLACK);
      
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
       if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;   
      double  ladoX = ((Math.abs((x1+10)-(x2+10)))/100.0);     
      double  ladoY =((Math.abs((y1+10)-(y2+10)))/100.0);
      tamano=(Math.sqrt(Math.pow(ladoX, 2) + Math.pow(ladoY, 2)));

         DecimalFormat formatter = new DecimalFormat("#.##");
         g.drawString(formatter.format(tamano)+"m", xAux, yAux);
         
  }  
    public static void pintarLineaDir(Graphics g, int x1,int y1,double i, double j ){
     g.setColor(Color.red);
        if(i<0 && j>0){
         g.drawLine(x1, y1-10, x1-100,y1-100);
     }
     else if (i>0 && j>0){
          g.drawLine(x1, y1-10, x1+100,y1-100);
         
     }
     else if (i>0 && j<0){
          g.drawLine(x1, y1-10, x1+100,y1+100);
         
     }
     else if(i<0 && j<0){
         g.drawLine(x1+10, y1-10, x1-100,y1+100);
     }
    }
    
}
