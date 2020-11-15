/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jardines;

/**
 *
 * @author Hernandez
 */
public class Jardinero extends Empleado {
    private float hrsExtras;
        

   public float gethrsExtras(){
     return hrsExtras;
    }
    
    public void sethrsExtras(float he){
        hrsExtras = he;
    }

    public void Jardinero(float hrsExtras)
    {
         float sueldo = 5000;
        float salario = 0;
        float pagoxhr = 100; 
        this.hrsExtras = hrsExtras;
        
        salario=(pagoxhr*hrsExtras)+sueldo;
        System.out.println("Salario mensual ..$"+salario);
        System.out.println("-------------------------------");
        
        
    }

  
    
    
    
}
    
  
       