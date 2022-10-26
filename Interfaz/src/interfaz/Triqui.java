/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.*;    
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Temporal
 */
public class Triqui 
        
{      
// constructor  
public void Triqui()  
{    
JFrame Objeto= new JFrame();    
  
//crear los 9 botones de la tabla , como unos objetos 
JButton boton1 = new JButton("X");    
JButton boton2 = new JButton("X");    
JButton boton3 = new JButton("X");    
JButton boton4 = new JButton("O");    
JButton boton5 = new JButton("X");    
JButton boton6 = new JButton("O");    
JButton boton7 = new JButton("X");    
JButton boton8 = new JButton("O");    
JButton boton9 = new JButton("O");    
    
//aqui estoy agregando los diferentes botones que se crearon
Objeto.add(boton1);
Objeto.add(boton2);
Objeto.add(boton3);  
Objeto.add(boton4); 
Objeto.add(boton5); 
Objeto.add(boton6);  
Objeto.add(boton7); 
Objeto.add(boton8); 
Objeto.add(boton9);    


Objeto.setLayout(new GridLayout(3, 3));  //creacion de columna de 3 y filas de 3  
Objeto.setSize(250, 300);  //alto y ancho del tablero  
Objeto.setVisible(true); //si puedeser visible


boton1.setBackground(Color.WHITE);
boton2.setBackground(Color.WHITE);
boton3.setBackground(Color.RED);
boton4.setBackground(Color.WHITE);
boton5.setBackground(Color.RED);
boton6.setBackground(Color.WHITE);
boton7.setBackground(Color.RED);
boton8.setBackground(Color.WHITE);
boton9.setBackground(Color.WHITE);

}  
// main method  
public static void main(String argvs[])   
{    
Triqui triqui =new Triqui();    
}    
} 

