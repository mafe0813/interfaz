/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triquis;

/**
 *
 * @author Temporal
 */
public class Tablero {
    
    //CONSTANTES
    public final static int COORDENADA_X = 1;
    public final static int COORDENADA_Y = 2;
    
    //ATRIBUTOS
    private int casillasuperior;
    private int casillasinferior;
    private int casillasmedio;

  public Tablero (){
      
  }

    public Tablero(int casillasuperior, int casillasinferior, int casillasmedio) {
        this.casillasuperior = casillasuperior;
        this.casillasinferior = casillasinferior;
        this.casillasmedio = casillasmedio;
    }

    public int getCasillasuperior() {
        return casillasuperior;
    }

    public void setCasillasuperior(int casillasuperior) {
        this.casillasuperior = casillasuperior;
    }

    public int getCasillasinferior() {
        return casillasinferior;
    }

    public void setCasillasinferior(int casillasinferior) {
        this.casillasinferior = casillasinferior;
    }

    public int getCasillasmedio() {
        return casillasmedio;
    }

    public void setCasillasmedio(int casillasmedio) {
        this.casillasmedio = casillasmedio;
    }
  
  
}
