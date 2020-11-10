//Proyecto Unidad III Jardines
//Omar Hernandez Calvario
package jardines;
//import java.util.HashSet;
import com.sun.org.apache.bcel.internal.util.Objects;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Set;

public class PrincipalJardines 
{

   
    public static void main(String[] args) 
    {
       //Persona p[]= new Persona [2];  //craea arrglo de objetos
       Scanner entrada = new Scanner (System.in);
       String busqueda;
       int opc = 0, opc1=0, ctrl=0; 
       boolean salir1 = false, salir2 = false;
       Persona personas[]= new Persona [20];  //craea arrglo de objetos
    
        while(!salir1)
       {
        System.out.println("---------Menu Empresa de Jardinería.. Cuando Calienta el Sol-------");
        System.out.println("1.- Empleado");
        System.out.println("2.- Cliente");
        System.out.println("3.- Salir"); 
        
        
       //  try {
             opc=0;
               System.out.print("Selecciona una opcion...");        
               opc=entrada.nextInt();
               entrada.nextLine();
            
                if (opc==1 )
                {
                 System.out.println("Menu de Empleados");
                }else if (opc==2 )
                { 
                     while(!salir2)
              {
                     System.out.println("Menu de Cliente");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Selecciona una opción para Cliente");
                    System.out.println("1.- Agregar");
                    System.out.println("2.- Consultar");
                    System.out.println("3.- Busqueda"); 
                    System.out.println("4.- Modificar"); 
                     System.out.println("5.- Eliminar");
                    System.out.println("6.- Salir"); 
                    System.out.println("-----------------------------------------------------------------");
                     System.out.print("Selecciona una opcion del menu cliente...");        
                    opc1=entrada.nextInt();
                    entrada.nextLine();
                    
                     switch  (opc1)
                 {
                   case 1:
                      
                   { 
                       Cliente cliente = new Cliente (); //arreglo tipo cliente
                        String codigo, nombre, domicilio, rfc, tel, email, TipoC;
                       
                        System.out.println("Ingresa datos del cliente: ");
    		        System.out.print("Codigo: ");    
                        codigo = entrada.nextLine();  
                        cliente.setcodigo(codigo);
                        
                        System.out.print("Nombre: ");    
                        nombre = entrada.nextLine();  
                        cliente.setnombre(nombre);
                        
                        System.out.print("Domicilio: ");    
                        domicilio = entrada.nextLine();  
                        cliente.setdomicilio(domicilio);
                        
                        System.out.print("RFC: ");    
                        rfc = entrada.nextLine();  
                        cliente.setrfc(rfc);
                        
                        System.out.print("Telefono: ");    
                        tel = entrada.nextLine();  
                        cliente.settelefono(tel);
                        
                        System.out.print("Email: ");    
                        email = entrada.nextLine();  
                        cliente.setemail(email);
                        
                        System.out.print("Tipo de Cliente: ");    
                        TipoC = entrada.nextLine();  
                        cliente.setTipoCliente(TipoC);
                        //entrada.nextLine();
                        
                        personas[ctrl] = cliente;
                        ctrl++;
                        System.out.println("Cliente agregado con exito!");
                        break;
                   }
                   
                   case 2:
                           {
                             //Muestra todos los clientes
                             for (int i = 0; i < ctrl; i ++)
                             {
                              if (personas[i] instanceof Cliente)
                               {
                                 Cliente cte = new Cliente();
                                 cte = (Cliente)personas[i];
                                 //tc=cte.getTipoCliente();
                                  System.out.println("////////////////////////////");
                                  System.out.println("----Cliente----");                                  
                                  System.out.println("Codigo: " + cte.getcodigo());
                                  System.out.println("Nombre: " + cte.getnombre());
                                  System.out.println("Domicilio: " + cte.getdomicilio());
                                  System.out.println("RFC: " + cte.getrfc());
                                  System.out.println("Telefono: " + cte.gettelefono());
                                  System.out.println("Email: " + cte.getemail());
                                  System.out.println("Tipo Cliente: " + cte.getTipoCliente());
                                  System.out.println("////////////////////////////");
                               }
                             }
                           
                           }  

                           break;
                           case 3: //busqueda
                           {
                            System.out.print("Ingresa codigo del Cliente a buscar.. ");
                            busqueda=entrada.nextLine();
                            boolean bandera= false;
                            int i=0;
                            
                                   while (!bandera)
                                    {
                                         if (personas[i] instanceof Cliente)
                                           {
                                             Cliente cte = new Cliente();
                                             cte = (Cliente)personas[i];
                                 
                                             if (busqueda.equals(cte.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Cliente----");                                  
                                               System.out.println("Codigo: " + cte.getcodigo());
                                               System.out.println("Nombre: " + cte.getnombre());
                                               System.out.println("Domicilio: " + cte.getdomicilio());
                                               System.out.println("RFC: " + cte.getrfc());
                                               System.out.println("Telefono: " + cte.gettelefono());
                                               System.out.println("Email: " + cte.getemail());
                                               System.out.println("Tipo Cliente: " + cte.getTipoCliente());
                                             }
                                             i=i+1;
                                           }
                                            
                                                                                  
                                         if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Cliente no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                                                  
                                    }//llave while
                                        
                             
                                        
                           }//llave case
                           
                           break;
                               
                           case 4://modificar
                           {
                                                          
                            System.out.print("Ingresa codigo del Cliente a modificar.. ");
                            busqueda=entrada.nextLine();
                            boolean bandera= false;
                            int i=0, actualizar=0;
                            String d ="";
                            String codigo, nombre, domicilio, rfc, tel, email, TipoC;
                            
                                   while (!bandera)
                                    {
                                          if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Cliente no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                         if (personas[i] instanceof Cliente)
                                           {
                                             Cliente cliente = new Cliente();
                                             cliente = (Cliente)personas[i];
                                 
                                             if (busqueda.equals(cliente.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Cliente----");                                  
                                               System.out.println("Codigo: " + cliente.getcodigo());
                                               System.out.println("Nombre: " + cliente.getnombre());
                                               System.out.println("Domicilio: " + cliente.getdomicilio());
                                               System.out.println("RFC: " + cliente.getrfc());
                                               System.out.println("Telefono: " + cliente.gettelefono());
                                               System.out.println("Email: " + cliente.getemail());
                                               System.out.println("Tipo Cliente: " + cliente.getTipoCliente());
                                               
                                               System.out.print("Desea modificar al Cliente "+cliente.getnombre()+" S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                               if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                    {                                                                                                          
                                                     //System.out.println("tooo bienn ");
                                                
                                                                 System.out.println("Ingresa los nuevos datos del cliente: ");
    		        
                                                                 codigo=cliente.getcodigo();
                                                                 cliente.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = entrada.nextLine();  
                                                                 cliente.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = entrada.nextLine();  
                                                                 cliente.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = entrada.nextLine();  
                                                                 cliente.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = entrada.nextLine();  
                                                                 cliente.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = entrada.nextLine();  
                                                                 cliente.setemail(email);
                        
                                                                 System.out.print("Tipo de Cliente: ");    
                                                                 TipoC = entrada.nextLine();  
                                                                 cliente.setTipoCliente(TipoC);
                        
                                                                 personas[i] = cliente;
                        
                                                                 System.out.println("Cliente modificado con exito!");
                                                  
                                                                                                           
                                                    }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                    {
                                                      System.out.println("No modificar Cliente!");
                                                      bandera=true;
                                                    }
                                                   
                                              }//llave if equals
                                              
                                              }//llave instance
                                             i=i+1;
                                             }//llave while
                                            
                                          
                                           }//llave case
                                            
                                  break;   
                               
                           case 5://eliminar cliente
                           {
                              // System.out.println("Eliminar!!");
                                System.out.print("Ingresa codigo del Cliente a eliminar.. ");
                                busqueda=entrada.nextLine();
                                boolean bandera= false;
                                int i=0, actualizar=0;
                                String d ="";
                                String codigo, nombre, domicilio, rfc, tel, email, TipoC;
                            
                                   while (!bandera)
                                    {
                                          if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Cliente no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                         if (personas[i] instanceof Cliente)
                                           {
                                             Cliente cliente = new Cliente();
                                             cliente = (Cliente)personas[i];
                                 
                                             if (busqueda.equals(cliente.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Cliente----");                                  
                                               System.out.println("Codigo: " + cliente.getcodigo());
                                               System.out.println("Nombre: " + cliente.getnombre());
                                               System.out.println("Domicilio: " + cliente.getdomicilio());
                                               System.out.println("RFC: " + cliente.getrfc());
                                               System.out.println("Telefono: " + cliente.gettelefono());
                                               System.out.println("Email: " + cliente.getemail());
                                               System.out.println("Tipo Cliente: " + cliente.getTipoCliente());
                                               
                                               System.out.print("Desea eliminar al Cliente "+cliente.getnombre()+" S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                               if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                    {                                                                                                          
                                                     //System.out.println("tooo bienn ");
                                                
                                                                 System.out.println("Ingresa los nuevos datos del cliente: ");
    		        
                                                                 codigo="";
                                                                 cliente.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = "";  
                                                                 cliente.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = "";  
                                                                 cliente.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = "";  
                                                                 cliente.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = "";  
                                                                 cliente.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = "";  
                                                                 cliente.setemail(email);
                        
                                                                 System.out.print("Tipo de Cliente: ");    
                                                                 TipoC = "";  
                                                                 cliente.setTipoCliente(TipoC);
                        
                                                                 personas[i] = cliente;
                        
                                                                 System.out.println("Cliente eliminado con exito!");
                                                  
                                                                                                           
                                                    }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                    {
                                                      System.out.println("No Eliminar Cliente!");
                                                      bandera=true;
                                                    }
                                                   
                                              }//llave if equals
                                              
                                              }//llave instance
                                             i=i+1;
                                             }//llave while
                               
                               break;
                           }
                           
                           
                   case 6: 
                           System.out.println("Regresar al Menu principal!!");
                           salir2=true;
                           //System.exit(0);
                           break;
                     } //llave del sw
              } //llave de while de menu cliente
                
                } else if (opc==3)
                 {
                   System.out.println("Salir del Sistema...Gracias por participar!!");
                   salir1=true;
                   //salir2=true;
                   System.exit(0);
                 }
               
       } //llave while
    } // lave main
} //clase principal
          