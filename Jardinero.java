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
    float hrsExtras=0;
        
 /*   //metodo constructor 
    public void setHrsExtras(float hrsExtras) {
        this.hrsExtras = hrsExtras;
    }

    public float getHrsExtras() {
        return hrsExtras;
    }
    */
//nota probar el float value linea 28 y 29
     @Override
    protected void SetExtension(Object infExt) {
      hrsExtras =((Integer)infExt).floatValue();
      hrsExtras =((Integer)infExt).floatValue();
       // comisiones = ((float)infExt).
    }

    @Override
    protected Object getExtension() {
        return hrsExtras;
    }
    
    
    
    
}
