package jardines;

import java.util.HashSet;

/*

package jardines;

/**
 *
 * @author Hernandez
 */
public class Empleado extends Persona
{
     private String codigo;
    private String nombre;
    private String domicilio;
    private String rfc;
    private String telefono;
    private String email;
    
 HashSet <AtnCte> empleadoAtcn = new HashSet <AtnCte> ();
 HashSet <Jardinero> empleadoJ = new HashSet <Jardinero> ();
 
 
 //metodo constructor 
    public Empleado( String codigo, String nombre, String domicilio, String rfc, String telefono, String email) {
        super(codigo, nombre, domicilio, rfc, telefono, email);
        this.codigo = codigo;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.email = email;
    }

     //alta
    public void altaempleadoAtcn (AtnCte empleado)
    {
     empleadoAtcn.add(empleado);
     
     //empleado.setComisiones(comisiones);
    }
    
    
     //getter and setter 
    public String getcodigo(){
      return codigo;
      }
    
    public void setcodigo(String cod){
        codigo = cod;
    }
    
      public String getnombre(){
      return nombre;
      }
    
    public void setnombre(String nom){
        nombre = nom;
    }
    
    public String getdomicilio(){
      return domicilio;
      }
    
    public void setdomicilio(String dom){
        domicilio = dom;
    }
    
    public String getrfc(){
      return rfc;
      }
    
    public void setrfc(String rf){
        rfc = rf;
    }
    
     public String gettelefono(){
      return telefono;
      }
    
    public void settelefono(String tel){
        telefono = tel;
    }
    
      public String getemail(){
      return email;
      }
    
    public void setemail(String ema){
        email = ema;
    }
    
    public void setempleadoAtcn (AtnCte atencion)
    {
     empleadoAtcn.add(atencion);
    }
    
    public void setempleadoJ (Jardinero jardinero)
    {
     empleadoJ.add(jardinero);
    }
}
