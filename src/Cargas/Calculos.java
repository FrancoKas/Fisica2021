/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cargas;


import static proyecto.VentanaPrincipal.jp1;
import javax.swing.JOptionPane;
import Pintar.Lineas;
/**
 *
 * @author fredy-18
 */
public class Calculos {
    private double hipotenusa;
    private double ladoX;
    private double ladoY;
    private Cargas[] cargas;
    private int tope;
    private int pivoteC;
    private double fuerza;
    private double dirI;
    private double dirJ;
    private final double k = 8.988E9;
    private double sigX,sigY;
    private double angulo;
    private double fuerzaTotal;

    public Calculos(Cargas[] cargas,int tope,int pivoteC) {
        this.cargas = cargas;
        this.tope = tope;
        this.pivoteC = pivoteC;
        this.dirI=0.0;
        this.dirJ=0.0;
    }
    public void Calculos(){     
        for (int i = 0; i < tope; i++) {
            sigX=1.0;
            sigY=1.0;
            if(i != pivoteC){
                calcular_lados(i);
                if(hipotenusa >0 ){
                     fuerza =((k*(cargas[i].getCarga()*cargas[pivoteC].getCarga())) /
                             Math.pow(hipotenusa, 2));
                      signo(i);//
                      this.dirI +=( (fuerza * (ladoX / hipotenusa))*sigX);
                      this.dirJ +=( (fuerza * (ladoY / hipotenusa))*sigY);  
               }
            }
        } 
        fuerzaT();
        angulo();
    }
    private void calcular_lados(int i){        
        ladoX =((Math.abs((cargas[i].getX()+10)-(cargas[pivoteC].getX()+10)))/100.0);     
        ladoY =((Math.abs((cargas[i].getY()+10)-(cargas[pivoteC].getY()+10)))/100.0);        
        hipotenusa=(Math.sqrt(Math.pow(ladoX, 2) + Math.pow(ladoY, 2)));
    }
    
    private void signo(int i){
       if(cargas[i].getSigno() == '+' && cargas[pivoteC].getSibno() == '-'){
            if(cargas[i].getX() < cargas[pivoteC].getX())
               sigX = -1.0;            
            if(cargas[i].getY() > cargas[pivoteC].getY())
                sigY = -1.0;
        }
       else if(cargas[i].getSigno() == '-' && cargas[pivoteC].getSibno() == '+'){
          if(cargas[i].getX() < cargas[pivoteC].getX())
               sigX = -1.0;            
          if(cargas[i].getY() > cargas[pivoteC].getY())
               sigY = -1.0;
        }
       else if(cargas[i].getSigno() == '-' && cargas[pivoteC].getSibno() == '-'){
          if(cargas[i].getX() > cargas[pivoteC].getX())
               sigX = -1.0;            
          if(cargas[i].getY() < cargas[pivoteC].getY())
                sigY = -1.0;
        }
       else if(cargas[i].getSigno() == '+' && cargas[pivoteC].getSibno() == '+'){
          if(cargas[i].getX() > cargas[pivoteC].getX())
               sigX = -1.0;            
          if(cargas[i].getY() < cargas[pivoteC].getY())
                sigY = -1.0;
        }
    }
     private   void angulo(){
         double aux;
         if(dirI != 0.0){
         aux = Math.tan(dirJ/dirI);         
         angulo = Math.abs(Math.toDegrees(Math.atan(dirJ/dirI)));
         } 
         else{
             angulo = 90.0;
         }
    }
     private void fuerzaT(){
            fuerzaTotal= Math.sqrt(Math.abs(Math.pow(dirI, 2)+ Math.pow(dirJ, 2)));
           // Lineas.pintarLineaDir(jLabel10.getGraphics(), cargas[pivoteC].getJlbael().getX(), cargas[pivoteC].getJlbael().getY(),dirI,dirJ);
     }

    public double getAngulo() {
        return angulo;
    }
    
    /**
     * @return the hipotenusa
     */
    public double getHipotenusa() {
        return hipotenusa;
    }

    /**
     * @param hipotenusa the hipotenusa to set
     */
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    /**
     * @return the ladoX
     */
    public double getLadoX() {
        return ladoX;
    }

    /**
     * @param ladoX the ladoX to set
     */
    public void setLadoX(double ladoX) {
        this.ladoX = ladoX;
    }

    /**
     * @return the ladoY
     */
    public double getLadoY() {
        return ladoY;
    }

    /**
     * @param ladoY the ladoY to set
     */
    public void setLadoY(double ladoY) {
        this.ladoY = ladoY;
    }

    /**
     * @return the fuerza
     */
    public double getFuerza() {
        return fuerza;
    }

    /**
     * @param fuerza the fuerza to set
     */
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    /**
     * @return the dirI
     */
    public double getDirI() {
        return dirI;
    }

    /**
     * @param dirI the dirI to set
     */
    public void setDirI(double dirI) {
        this.dirI = dirI;
    }

    /**
     * @return the dirJ
     */
    public double getDirJ() {
        return dirJ;
    }

    /**
     * @param dirJ the dirJ to set
     */
    public void setDirJ(double dirJ) {
        this.dirJ = dirJ;
        
    }

    public double getFuerzaTotal() {
        return fuerzaTotal;
    }
    
    
}
