/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.interfaztiendas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Temporal
 */
public class InterfazTriqui extends JFrame {
    //Declarar oos paneles
    private PanelTriqui paneltriquio;
    
    public InterfazTriqui() {

        this.setTitle ("Juego de Triqui");
        this.setSize(300,300);
        this.setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Definir el distribuir de elementos
        this.setLayout(new BorderLayout());

        //Crear los paneles
        PanelTriqui paneltriqui = new PanelTriqui (this);
        this.add(paneltriqui,BorderLayout.NORTH);
    }
}

    