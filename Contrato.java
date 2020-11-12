/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jardines;

import java.util.Scanner;


/**
 *
 * @author Hernandez
 */
public class Contrato
{
   
    
     private int NoContrato;
     private String NombreCliente;
     private String duracion;
     private String direccion;
     
     
   // String datos[] = new array String [20];
    // Object [] fila = new Object [20]; 

    //Contrato contrato[]= new Contrato [20];
    
  /*    public Contrato(String nom) //constructor 1 parametro
        {
         
          String nombre;
           String duracion ="duracion pendiente por capturar";
           String direccion ="direccion pendiente por capturar";
           
            nombre = nom;
             fila [ctrl] = nombre;
             fila [ctrl] = duracion;
             fila [ctrl] = direccion;
        System.out.println("Contrato almacenado con exito");
       
        ctrl =  ctrl+1;
       
        System.out.println(ctrl);
       */  
       //}

    public int getNoContrato() {
        return NoContrato;
    }

    public void setNoContrato(int NoContrato) {
        this.NoContrato = NoContrato;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
}
