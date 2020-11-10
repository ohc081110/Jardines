/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jardines;

import java.util.HashSet;

/**
 *
 * @author Hernandez
 */
public class AtnCte extends Empleado {
  
    private float comisiones=0;

     
    @Override
    protected void SetExtension(Object infExt) {
      comisiones =((Integer)infExt).floatValue(); //probar
       // comisiones = ((float)infExt).
    }

    @Override
    protected Object getExtension() {
        return comisiones;
    }

  
    
    
}
 