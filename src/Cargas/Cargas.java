/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cargas;

import static proyecto.VentanaPrincipal.jp1;
import javax.swing.JLabel;

/**
 *
 * @author fredy-18
 */
public class Cargas {
    private double carga;
    private int x;
    private int y;  
    private char signo;
    private String imagen;
    private JLabel jlbael;
  

    public Cargas(double carga, int x, int y, char signo ,JLabel jl,String img) {
        this.carga = carga;
        this.x = x-10;
        this.y = y-10;
        this.signo = signo;
        this.jlbael =jl;
        this.imagen = img;
        ajustarLabel();
    }

    public Cargas() {
        this.signo = '-';
    }
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

   
    public char getSibno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setJlbael(JLabel jlbael) {
        this.jlbael = jlbael;
    }

    public char getSigno() {
        return signo;
    }

    public String getImagen() {
        return imagen;
    }

    public JLabel getJlbael() {
        return jlbael;
    }
  
   private void ajustarLabel(){
       jp1.add(jlbael);
       jlbael.setBounds(x, y, 24, 24);
       jlbael.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen)));
    
   } 
    
}
