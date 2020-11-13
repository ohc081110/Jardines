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
public class Jardin
{
     private int NoJardin;
     private int extension;
     private float tiempodedicado;
     private String TipoJardin;

    public int getNoJardin() {
        return NoJardin;
    }

    public void setNoJardin(int NoJardin) {
        this.NoJardin = NoJardin;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public float getTiempodedicado() {
        return tiempodedicado;
    }

    public void setTiempodedicado(float tiempodedicado) {
        this.tiempodedicado = tiempodedicado;
    }

    public String getTipoJardin() {
        return TipoJardin;
    }

    public void setTipoJardin(String TipoJardin) {
        this.TipoJardin = TipoJardin;
    }
     
     @Override
public String toString ()
  {
      return "Numero de Jardin: "+NoJardin+", Extensión de Jardin: "+extension+", Tiempo dedicado: "+ tiempodedicado+", Tipo de Jardin: "+ TipoJardin;
  }
    
}
