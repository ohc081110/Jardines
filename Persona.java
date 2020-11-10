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
public class Persona 
{
    private String codigo;
    private String nombre;
    private String domicilio;
    private String rfc;
    private String telefono;
    private String email;
    
          
    
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
    
}
