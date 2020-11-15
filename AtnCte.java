  
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
public class AtnCte extends Empleado {
  
    private int ccaptados;

    public int getCcaptados() {
        return ccaptados;
    }

    public void setCcaptados(int ccaptados) {
        this.ccaptados = ccaptados;
    }

    public void AtnCte(int ccaptados)
    {
        float sueldo = 5000;
        float salario = 0;
        float comisiones = 50; 
        this.ccaptados = ccaptados;
        salario=(ccaptados*comisiones)+sueldo;
        System.out.println("Salario mensual ..$"+salario);
        System.out.println("--------------------------");
      }
    
    
}
 