/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.algoritmia.interfaztiendas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author gilberto-pedraza
 */
public class PanelTriqui extends JPanel implements ActionListener {
    // Declarar referencia a la clase padre
    private InterfazTriqui principal;

    //Declara rlos atributos del Panel
    //Campo de texto para escribir o modificar el nombre del producto
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private JTextField i;
    //Botones para realizar acciones
    private JButton botAdcionar;
    private JButton botAdcionar1;


    //Delcarar constructor con la referencia al elemento padre

    public PanelTriqui(InterfazTriqui principal) {
        //GUardar la referencia al elemento padre
        this.principal = principal;

        setLayout(new GridLayout(4, 3));  //creacion de columna de 3 y filas de 3  
        setSize(300, 300);
        //Definir el tamano del layout
        
        //Adicionar un titulo
        TitledBorder border= BorderFactory.createTitledBorder("JUEGO DE TRIQUI");
        border.setTitleColor(Color.GREEN);
        this.setBorder(border);

        //Inicializar contenidos
        a=new JTextField("A");
        b=new JTextField("B");
        c=new JTextField("C");
        d=new JTextField("D");
        e=new JTextField("E");
        f=new JTextField("F");
        g=new JTextField("G");
        h=new JTextField("H");
        i=new JTextField("I");
        
        //Inicializar el boton
        botAdcionar=new JButton("Jugador 1");
        botAdcionar.addActionListener(this);
        botAdcionar.setBackground(Color.RED);
        
        botAdcionar1=new JButton("Jugador 2");
        botAdcionar1.addActionListener(this);
        botAdcionar1.setBackground(Color.BLUE);

//Adicionar los elememtos gráficos al panel

        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        add(h);
        add(i);
        
        
        add (botAdcionar);
        add(new JLabel(""));
        add (botAdcionar1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Selecciono "+ e.getActionCommand());
    }
}