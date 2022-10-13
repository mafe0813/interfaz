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
public class Jugadores {
    
    //ATRIBUTOS
    private String jugador1;
    private String marcaJugador1;
    private String marcaJugador2;
    private String jugador2;
    private String tablero[][];
    
    //constuctor1
    public Jugadores (){}

    
    //CONSTUCTOR
    public Jugadores(String jugador1, String marcaJugador1, String marcaJugador2, String jugador2, String[][] tablero) {
        this.jugador1 = jugador1;
        this.marcaJugador1 = marcaJugador1;
        this.marcaJugador2 = marcaJugador2;
        this.jugador2 = jugador2;
        this.tablero = tablero;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getMarcaJugador1() {
        return marcaJugador1;
    }

    public void setMarcaJugador1(String marcaJugador1) {
        this.marcaJugador1 = marcaJugador1;
    }

    public String getMarcaJugador2() {
        return marcaJugador2;
    }

    public void setMarcaJugador2(String marcaJugador2) {
        this.marcaJugador2 = marcaJugador2;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }
    
    
}
