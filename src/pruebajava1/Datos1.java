package pruebajava1;



import javax.swing.JOptionPane;

/*********************************************************************
 * autor= liliana hevia
 * fecha= 30/10/2017
 * nombre de la clase= Datos1
 * responsabilidad= esta clase calcula la edad que tendre en 20 años mas
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/******************************************************************
 *
 * @author LAB04
 */
public class Datos1
{
   public static void main(String[] args)
   {
String Nombre;
int Edad;

Nombre = (JOptionPane.showInputDialog("Ingrese su Nombre"));
Edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su Edad"));

JOptionPane.showMessageDialog(null, "Bienvenido"+(Nombre));
JOptionPane.showMessageDialog(null, "en 20 años usted tendra"+(Edad+20));

   
   }
   
  
       
   }