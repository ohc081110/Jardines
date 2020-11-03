//Proyecto Unidad III Jardines
//Omar Hernandez Calvario
package jardines;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class PrincipalJardines 
{

   
    public static void main(String[] args) 
    {
       //Persona p[]= new Persona [2];  //craea arrglo de objetos
       Scanner entrada = new Scanner (System.in);
       int opc = 0, opc1 = 1, ctrl=0; 
       boolean salir1 = false, salir2 = false;
       Set <Empleado> lista = new HashSet <> ();
       //Empleado empleado = new Empleado ();
       Empleado empleado;
            
      /* System.out.println("Ingresa el codigo ..");
       System.out.println("Ingresa el Nombre ..");
       System.out.println("Ingresa el Domicilio ..");
       System.out.println("Ingresa el RFC ..");
       System.out.println("Ingresa el Telefono ..");
       System.out.println("Ingresa el email ..");
       */
        while(!salir1)
       {
        System.out.println("---------Menu Empresa de Jardinería.. Cuando Calienta el Sol-------");
        System.out.println("1.- Empleado");
        System.out.println("2.- Cliente");
        System.out.println("3.- Salir"); 
        
        
         try {
             opc=0;
               System.out.print("Selecciona una opcion...");        
               opc=entrada.nextInt();
               entrada.nextLine();
            
                if (opc==2 )
                { System.out.println("menu de consultar");
                
                } else if (opc==3)
                 {
                   System.out.println("Salir del Sistema...Gracias por participar!!");
                   salir1=true;
                   salir2=true;
                   System.exit(0);
                 }
               
               
             while(!salir2)
        {
        
               if (opc==1 )
                { System.out.println("Menu de Empleado");
                  System.out.println("-----------------------------------------------------------------");
                   System.out.println("Selecciona una opción para Empleado");
                   System.out.println("1.- Agregar");
                   System.out.println("2.- Consultar");
                   System.out.println("3.- Modificar"); 
                   System.out.println("4.- Eliminar");                   
                   System.out.println("5.- Salir"); 
                   System.out.println("-----------------------------------------------------------------");
                    System.out.print("Selecciona una opcion del menu empleado...");        
                    opc1=entrada.nextInt();
                    entrada.nextLine();
                   
                 //////////////////////////////////
                 switch  (opc1)
                 {
                   case 1: 
                       //Empleado empleado = new Empleado( ); 
                       //AtnCte EmpleadoA;
                       
                       String codigo, nombre, domicilio, rfc, telefono, email;
    	                float comisiones=0;
                        
                        System.out.println("Ingresa datos del empleado: ");
    		        System.out.print("Codigo: ");    
                        codigo = entrada.nextLine(); 
                        //empleado.setcodigo(entrada.nextLine());
                       
                         System.out.print("Nombre: ");    
                         //empleado.setnombre(entrada.nextLine());
                         nombre = entrada.nextLine(); 
                         
                         System.out.print("Domicilio: ");    
                         //empleado.setdomicilio(entrada.nextLine());
                         domicilio = entrada.nextLine();
                         
                         System.out.print("RFC: ");    
                         //empleado.setrfc(entrada.nextLine());
                          rfc = entrada.nextLine();
                         
                          System.out.print("Telefono: ");    
                          //empleado.settelefono(entrada.nextLine());
                           telefono = entrada.nextLine();
                       
                         System.out.print("Email: ");    
                         //empleado.setemail(entrada.nextLine());
                          email = entrada.nextLine();
                          
                           System.out.print("Comisiones: ");    
                         //empleado.setemail(entrada.nextLine());
                         // comisiones = entrada.nextFloat();
                          Empleado EmpleadoA = new Empleado(codigo, nombre, domicilio, rfc, telefono, email);
                      // lista.add(new Empleado(codigo, nombre, domicilio, rfc, telefono, email));
                      //  p[ctrl]=empleado;
                       // ctrl++;
                       
                          break;
                        
                       case 2:
                           for(Empleado emp : lista)
                           {
                               System.out.println(emp.getcodigo());
                               System.out.println(emp.getnombre());
                               System.out.println(emp.getdomicilio());
                               System.out.println(emp.getrfc());
                               System.out.println(emp.gettelefono());
                               System.out.println(emp.getemail());
                           
                           }  
                       
                       case 5: 
                           System.out.println("Regresar al Menu principal!!");
                           salir2=true;
                           //System.exit(0);
                 
                 }  //switch (opc1)               
                   
             
                } //llave de if
                
                 //////////////////////////////////
                
                
               
                } //llave while bandera2
               
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                entrada.next();
            }
       } //llave while bandera1
        
      
       
    } //llave de main
    
} //llave clase principal
