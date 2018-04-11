/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dani
 */
public class Circulos extends JFrame implements ActionListener{

    JFrame marco;
    JPanel panel;
    Graphics g;
    boolean dibujar=false;
    JButton bdibuja, blimpiar;
    JTextField numero;

    public Circulos(){
        marco=new JFrame("Probando eventos");
        panel=new JPanel();
        bdibuja=new JButton("Dibujar");
        blimpiar=new JButton("Limpiar");
        numero=new JTextField("0");

        //Características
        blimpiar.addActionListener(this); //Añadimos listener al desencadenante del evento.
        bdibuja.addActionListener(this);

        marco.setSize(400, 200);
        panel.add(blimpiar);
        panel.add(bdibuja);
        panel.add(numero);
        marco.add(panel);

        //Valores
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object objeto=e.getSource();
        if(objeto==bdibuja){
            g=panel.getGraphics();
            for(int i=1; i<=Integer.parseInt(numero.getText()); i++){
                int x1=(int) (Math.random()*100)+60;
                int y1=(int) (Math.random()*100)+80;
                g.setColor(Color.red);
                g.drawOval(x1, y1, 50, 50);
            }
        }else{
            
            g.clearRect(0, 0, 400,200);
        }
    }
}
