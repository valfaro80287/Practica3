/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class Tienda {
    String productos[];
    
    public void ingresarProduc(){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos a registrar"));
        int producto[] = new int [cantidad];
        for (int i = 0; i < cantidad; i++) {
            producto[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre del producto"));
            
        }
        String resultado = "El arreglo es: \n";
        for (int i = 0; i < cantidad; i++) {
            resultado += "La edad número " + i + " es: " + producto[i] + "\n";
        }
        
    JOptionPane.showMessageDialog(null, resultado);
    }
    
}
