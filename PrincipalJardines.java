//Proyecto Unidad III Jardines
//Omar Hernandez Calvario
package jardines;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalJardines 
{

   
    public static void main(String[] args) 
    {
       Scanner entrada = new Scanner (System.in);
       String busqueda = "", cod = "";
       int opc = 0, opc1=0, opcjardin=0,  opcempleado1 = 0,opcempleado2 = 0, ctrl=0,ctrlj=0, busquedas=0,  ctrlcontratro=0, NoContrato=100;; 
       Contrato contrato[]= new Contrato [20];  
       Jardin j[] = new Jardin [20];

       boolean salir1 = false, salir2 = false;
       Persona personas[]= new Persona [20];  //craea arrglo de objetos
       while(!salir1)
       {
        System.out.println("---------Menu Principal Empresa de Jardinería.. Cuando Calienta el Sol-------");
        System.out.println("1.- Empleado");
        System.out.println("2.- Cliente");
        System.out.println("3.- Contrato");
        System.out.println("4.- Jardin");
        System.out.println("5.- Salir"); 
           System.out.println("------------------------------------------------------------------");
        
         try {
               opc = 0;
               opcempleado1=0;
                opcempleado2=0;
            
               System.out.print("Selecciona una opcion...");        
               opc=entrada.nextInt();
               entrada.nextLine();
            
                if (opc == 1 )
                {
                  System.out.println("---------Menu Tipo empleado-------");
                  System.out.println("1.- Jardinero");
                  System.out.println("2.- Atención al cliente");
                  System.out.println("3.- Salir");
                  
                    System.out.print("Selecciona una opcion del menu empleado...");        
                    opcempleado1=entrada.nextInt();
                    entrada.nextLine();
                    
                    if (opcempleado1 == 1 )
                    {
                        while(!salir2)
                        {
                         //opcempleado1 = 0;
                         System.out.println("Menu de Empleado Jardinero");
                         System.out.println("-----------------------------------------------------------------");
                         System.out.println("Selecciona una opción para el empleado Jardinero");
                         System.out.println("1.- Agregar");
                         System.out.println("2.- Consultar");
                         System.out.println("3.- Busqueda"); 
                         System.out.println("4.- Modificar"); 
                         System.out.println("5.- Eliminar");
                          System.out.println("6.- Calcular salario");
                         System.out.println("7.- Salir"); 
                         System.out.println("-----------------------------------------------------------------");
                         System.out.print("Selecciona una opcion del menu Empleado Jardinero...");        
                         opcempleado2=entrada.nextInt();
                         entrada.nextLine();
                    
                         switch  (opcempleado2)
                           {
                             case 1:
                                { 
                                 Jardinero jardinero = new Jardinero (); //arreglo tipo jardinero
                                 String codigo, nombre, domicilio, rfc, tel, email, TipoC;
                                 float hrsext=0;
                                 opcempleado2=0;
                                 System.out.println("Ingresa datos del empleado: ");
    		                 System.out.print("Codigo: ");    
                                 codigo = entrada.nextLine();
                                 jardinero.setcodigo(codigo);
                                 
                                 System.out.print("Nombre: ");    
                                 nombre = entrada.nextLine();  
                                 jardinero.setnombre(nombre);
                        
                                 System.out.print("Domicilio: ");    
                                 domicilio = entrada.nextLine();  
                                jardinero.setdomicilio(domicilio);
                        
                                 System.out.print("RFC: ");    
                                 rfc = entrada.nextLine();  
                                 jardinero.setrfc(rfc);
                        
                                 System.out.print("Telefono: ");    
                                 tel = entrada.nextLine();  
                                 jardinero.settelefono(tel);
                        
                                 System.out.print("Email: ");    
                                 email = entrada.nextLine();  
                                 jardinero.setemail(email);
                                 
                                 System.out.print("Horas extras: ");    
                                 hrsext = entrada.nextFloat();
                                 jardinero.sethrsExtras(hrsext);
                                 //falta atributo de jardinero
                                 personas[ctrl] = jardinero;
                                 ctrl++;
                                 System.out.println("Empleado agregado con exito!");
                                 break;
                               }//llave agregar
                             
                              case 2://Muestra todos los empleados tipo jardineros
                                {                                 
                                 for (int i = 0; i < ctrl; i ++)
                                  {
                                    if (personas[i] instanceof Jardinero)
                                     {
                                       Jardinero jar = new Jardinero();
                                       jar = (Jardinero)personas[i];
                                       System.out.println("////////////////////////////");
                                       System.out.println("----Empleado Jardinero----");                                  
                                       System.out.println("Codigo: " + jar.getcodigo());
                                       System.out.println("Nombre: " + jar.getnombre());
                                       System.out.println("Domicilio: " + jar.getdomicilio());
                                       System.out.println("RFC: " + jar.getrfc());
                                       System.out.println("Telefono: " + jar.gettelefono());
                                       System.out.println("Email: " + jar.getemail());
                                       System.out.println("Horas extras: " + jar.gethrsExtras());
                                       System.out.println("////////////////////////////");
                                    }
                                 }
                           
                              }  //llave case mostrar empleados jardinero

                           break;
                                  
                                  case 3: //busqueda
                                   {
                                     System.out.print("Ingresa codigo del Empleado/Jardinero a buscar.. ");
                                     busqueda=entrada.nextLine();
                                     boolean bandera= false;
                                     int i=0;
                            
                                     while (!bandera)
                                      {
                                         if (personas[i] instanceof Jardinero)
                                           {
                                             Jardinero jar = new Jardinero();
                                             jar = (Jardinero)personas[i];
                                 
                                             if (busqueda.equals(jar.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Empleado Jardinero----");                                  
                                               System.out.println("Codigo: " + jar.getcodigo());
                                               System.out.println("Nombre: " + jar.getnombre());
                                               System.out.println("Domicilio: " + jar.getdomicilio());
                                               System.out.println("RFC: " + jar.getrfc());
                                               System.out.println("Telefono: " + jar.gettelefono());
                                               System.out.println("Email: " + jar.getemail());
                                               System.out.println("Horas extras: " + jar.gethrsExtras());
                                             }
                                             i=i+1;
                                           }
                                            
                                                                                  
                                         if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado tipo Jardinero no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                                                  
                                    }//llave while
                                        
                                     
                                 }//llave case busqueda
                           
                           break;
                                      
                                        case 4://modificar
                                         { System.out.print("Ingresa codigo del empleado tipo jardinero a modificar.. ");
                                           busqueda=entrada.nextLine();
                                           boolean bandera= false;
                                           int i=0, actualizar=0;
                                           String d ="";
                                           String codigo, nombre, domicilio, rfc, tel, email;
                                           float he = 0;
                                           while (!bandera)
                                            {
                                             if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                             if (personas[i] instanceof Jardinero)
                                               {
                                                Jardinero jar = new Jardinero();
                                                jar = (Jardinero)personas[i];
                                 
                                                   if (busqueda.equals(jar.getcodigo()))
                                                    {
                                                     bandera=true;
                                                     System.out.println("////////////////////////////");
                                                     System.out.println("----Empleado----");                                  
                                                     System.out.println("Codigo: " + jar.getcodigo());
                                                     System.out.println("Nombre: " + jar.getnombre());
                                                     System.out.println("Domicilio: " + jar.getdomicilio());
                                                     System.out.println("RFC: " + jar.getrfc());
                                                     System.out.println("Telefono: " + jar.gettelefono());
                                                     System.out.println("Email: " + jar.getemail());
                                                     System.out.println("Hrs extras: " + jar.gethrsExtras());
                                               
                                                     System.out.print("Desea modificar datos del empleado "+jar.getnombre()+" S/n .. "); 
                                                     d=entrada.nextLine();
                                                 
                                                     if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                       {                                                                                                          
                                                     
                                                                 System.out.println("Ingresa los nuevos datos del empleado jardinero: ");
    		        
                                                                 codigo=jar.getcodigo();
                                                                 jar.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = entrada.nextLine();  
                                                                 jar.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = entrada.nextLine();  
                                                                 jar.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = entrada.nextLine();  
                                                                 jar.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = entrada.nextLine();  
                                                                 jar.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = entrada.nextLine();  
                                                                 jar.setemail(email);
                        
                                                                 System.out.print("Tipo de Cliente: ");    
                                                                 he = entrada.nextFloat();  
                                                                 jar.sethrsExtras(he);
                        
                                                                 personas[i] = jar;
                        
                                                                 System.out.println("Datos de empleado jardinero modificado con exito!");
                                                  
                                                                                                           
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
                                System.out.print("Ingresa codigo del empleado jardinero a eliminar.. ");
                                busqueda=entrada.nextLine();
                                boolean bandera= false;
                                int i=0, actualizar=0;
                                String d ="";
                                String codigo, nombre, domicilio, rfc, tel, email;
                                float he = 0;
                                   while (!bandera)
                                    {
                                          if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                         if (personas[i] instanceof Jardinero)
                                           {
                                             Jardinero jar = new Jardinero();
                                             jar = (Jardinero)personas[i];
                                 
                                             if (busqueda.equals(jar.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Empleado----");                                  
                                               System.out.println("Codigo: " + jar.getcodigo());
                                               System.out.println("Nombre: " + jar.getnombre());
                                               System.out.println("Domicilio: " + jar.getdomicilio());
                                               System.out.println("RFC: " + jar.getrfc());
                                               System.out.println("Telefono: " + jar.gettelefono());
                                               System.out.println("Email: " + jar.getemail());
                                               System.out.println("Hrs extras: " + jar.gethrsExtras());
                                               
                                               System.out.print("Desea eliminar al Cliente "+jar.getnombre()+" S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                               if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                    {                                                                                                          
                                                     //System.out.println("tooo bienn ");
                                                
                                                                 //System.out.println("Ingresa los nuevos datos del cliente: ");
    		        
                                                                 codigo="";
                                                                 jar.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = "";  
                                                                 jar.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = "";  
                                                                jar.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = "";  
                                                                 jar.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = "";  
                                                                 jar.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = "";  
                                                                 jar.setemail(email);
                        
                                                                 System.out.print("Horas extras: ");    
                                                                 he = 0;  
                                                                 jar.sethrsExtras(he);
                        
                                                                 personas[i] = jar;
                        
                                                                 System.out.println("Empleado Jardinero eliminado con exito!");
                                                  
                                                                                                           
                                                    }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                    {
                                                      System.out.println("No Eliminar Empleado Jardinero!");
                                                      bandera=true;
                                                    }
                                                   
                                              }//llave if equals
                                              
                                              }//llave instance
                                             i=i+1;
                                             }//llave while
                               
                               break;
                           }
                           
                           
                                                   case 6:  //salario
                                                    {
                                                                                                              
                                                         //float sueldo = 5000;
                                                         //float pagoxhr = 100;
                                                         //float salario = 0;
                                                         float hrs = 0;
                                                          boolean bandera= false;
                                                          int i=0;
                                                          System.out.print("Ingresa codigo del Empleado/Jardinero calcular salario.. ");
                                                          cod = entrada.nextLine();
                            
                                                     while (!bandera)
                                                      {
                                                         if (personas[i] instanceof Jardinero)
                                                          {
                                                            Jardinero jar = new Jardinero();
                                                            jar = (Jardinero)personas[i];
                                 
                                                             if (cod.equals(jar.getcodigo()))
                                                              {
                                                                bandera=true;
                                                                System.out.println("////////////////////////////");
                                                                System.out.println("----Empleado Jardinero Salario individual----");                                  
                                                                System.out.println("Codigo: " + jar.getcodigo());
                                                                System.out.println("Nombre: " + jar.getnombre());
                                                                System.out.println("Hrs extras trabajadas: " + jar.gethrsExtras());
                                                                hrs = jar.gethrsExtras();
                                                                jar.Jardinero(hrs);
                                                               }
                                                                   i=i+1;
                                                            }
                                            
                                                                                  
                                                              if (bandera==false && i==ctrl)
                                                                  {
                                                                   System.out.println("********************************");
                                                                   System.out.println("Empleado tipo Jardinero no encontrado!"); 
                                                                   System.out.println("*********************************"); 
                                                                   bandera=true;
                                           
                                                                 }
                                                                                  
                                                            }//llave while
                                                        // }
                                                    
                                        
                                     
                                                    }//llave case salario
                           
                                                     break;
                                                       
                                                   case 7: 
                                                   System.out.println("Regresar al Menu principal!!");
                                                   salir2 = true;
                                                   opcempleado1 = 0;
                                                   opcempleado2 = 0;
                                                   break;
                                      
                                      
                                  
                             
                           }//llave del sw
                   } //llave del while menu 
                       
                               } else if (opcempleado1 == 2 ) //llave del if tipo empleado atencion a cliente
                               {
                          while(!salir2)
                        {
                                 System.out.println("Menu de Empleado Atención al cliente");
                                 System.out.println("-----------------------------------------------------------------");
                                 System.out.println("Selecciona una opción para el empleado Atención al cliente");
                                 System.out.println("1.- Agregar");
                                 System.out.println("2.- Consultar");
                                 System.out.println("3.- Busqueda"); 
                                 System.out.println("4.- Modificar"); 
                                 System.out.println("5.- Eliminar");
                                 System.out.println("6.- Calcular salario"); 
                                 System.out.println("7.- Regresar menu principal"); 
                                 System.out.println("-----------------------------------------------------------------");
                                 System.out.print("Selecciona una opcion del menu Empleado Atención al cliente...");        
                                 opcempleado2=entrada.nextInt();
                                 entrada.nextLine();
                                 
                                  switch  (opcempleado2)
                           {
                             case 1:
                                {  //agregar
                                 AtnCte atc = new AtnCte (); //arreglo tipo atc
                                 String codigo, nombre, domicilio, rfc, tel, email;
                                 int clientescaptados=0;
                                 System.out.println("Ingresa datos del empleado: ");
    		                 System.out.print("Codigo: ");    
                                 codigo = entrada.nextLine();
                                 atc.setcodigo(codigo);
                                 
                                 System.out.print("Nombre: ");    
                                 nombre = entrada.nextLine();  
                                 atc.setnombre(nombre);
                        
                                 System.out.print("Domicilio: ");    
                                 domicilio = entrada.nextLine();  
                                atc.setdomicilio(domicilio);
                        
                                 System.out.print("RFC: ");    
                                 rfc = entrada.nextLine();  
                                 atc.setrfc(rfc);
                        
                                 System.out.print("Telefono: ");    
                                 tel = entrada.nextLine();  
                                 atc.settelefono(tel);
                        
                                 System.out.print("Email: ");    
                                 email = entrada.nextLine();  
                                 atc.setemail(email);
                                 
                                 System.out.print("Cantidad de clientes captados: ");    
                                 clientescaptados = entrada.nextInt();
                                 atc.setCcaptados(clientescaptados);
                                 //falta atributo de jardinero
                                 personas[ctrl] = atc;
                                 ctrl++;
                                 System.out.println("Empleado agregado con exito!");
                                 break;
                               }//llave agregar
                             
                              case 2://Muestra todos los empleados tipo atc cte
                                {                                 
                                 for (int i = 0; i < ctrl; i ++)
                                  {
                                    if (personas[i] instanceof AtnCte)
                                     {
                                       AtnCte atc = new AtnCte();
                                       atc = (AtnCte)personas[i];
                                       System.out.println("////////////////////////////");
                                       System.out.println("----Empleado Atención a Cliente----");                                  
                                       System.out.println("Codigo: " + atc.getcodigo());
                                       System.out.println("Nombre: " + atc.getnombre());
                                       System.out.println("Domicilio: " + atc.getdomicilio());
                                       System.out.println("RFC: " + atc.getrfc());
                                       System.out.println("Telefono: " + atc.gettelefono());
                                       System.out.println("Email: " + atc.getemail());
                                       System.out.println("Cantidad de clientes captados: " + atc.getCcaptados());
                                       System.out.println("////////////////////////////");
                                    }
                                 }
                           
                              }  //llave case mostrar empleados jardinero

                                break;
                                   case 3: //busqueda
                                   {
                                     System.out.print("Ingresa codigo del Empleado/Atención al cliente a buscar.. ");
                                     busqueda=entrada.nextLine();
                                     boolean bandera= false;
                                     int i=0;
                            
                                     while (!bandera)
                                      {
                                         if (personas[i] instanceof AtnCte)
                                           {
                                             AtnCte atc = new AtnCte();
                                             atc = (AtnCte)personas[i];
                                 
                                             if (busqueda.equals(atc.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Empleado Atención al cliente----");                                  
                                               System.out.println("Codigo: " + atc.getcodigo());
                                               System.out.println("Nombre: " + atc.getnombre());
                                               System.out.println("Domicilio: " + atc.getdomicilio());
                                               System.out.println("RFC: " + atc.getrfc());
                                               System.out.println("Telefono: " + atc.gettelefono());
                                               System.out.println("Email: " + atc.getemail());
                                               System.out.println("Cantidad de clientes captados: " + atc.getCcaptados());
                                             }
                                             i=i+1;
                                           }
                                            
                                                                                  
                                         if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado tipo Jardinero no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                                                  
                                    }//llave while
                                        
                                     
                                 }//llave case busqueda
                           
                           break;
                                       
                                   case 4://modificar
                                         { System.out.print("Ingresa codigo del empleado tipo atencion al cliente a modificar.. ");
                                           busqueda=entrada.nextLine();
                                           boolean bandera= false;
                                           int i=0, actualizar=0;
                                           String d ="";
                                           String codigo, nombre, domicilio, rfc, tel, email;
                                           int clientescaptados = 0;
                                           while (!bandera)
                                            {
                                             if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                             if (personas[i] instanceof AtnCte)
                                               {
                                                AtnCte atc = new AtnCte();
                                                atc = (AtnCte)personas[i];
                                 
                                                   if (busqueda.equals(atc.getcodigo()))
                                                    {
                                                     bandera=true;
                                                     System.out.println("////////////////////////////");
                                                     System.out.println("----Empleado----");                                  
                                                     System.out.println("Codigo: " + atc.getcodigo());
                                                     System.out.println("Nombre: " + atc.getnombre());
                                                     System.out.println("Domicilio: " + atc.getdomicilio());
                                                     System.out.println("RFC: " + atc.getrfc());
                                                     System.out.println("Telefono: " + atc.gettelefono());
                                                     System.out.println("Email: " + atc.getemail());
                                                     System.out.println("Cantidad de Clientes captados: " + atc.getCcaptados());
                                               
                                                     System.out.print("Desea modificar datos del empleado "+atc.getnombre()+" S/n .. "); 
                                                     d=entrada.nextLine();
                                                 
                                                     if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                       {                                                                                                          
                                                     
                                                                 System.out.println("Ingresa los nuevos datos del empleado jardinero: ");
    		        
                                                                 codigo=atc.getcodigo();
                                                                 atc.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = entrada.nextLine();  
                                                                 atc.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = entrada.nextLine();  
                                                                 atc.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = entrada.nextLine();  
                                                                 atc.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = entrada.nextLine();  
                                                                 atc.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = entrada.nextLine();  
                                                                 atc.setemail(email);
                        
                                                                 System.out.print("Comisiones: ");    
                                                                 clientescaptados = entrada.nextInt();  
                                                                 atc.setCcaptados(clientescaptados);
                        
                                                                 personas[i] = atc;
                        
                                                                 System.out.println("Datos de empleado Atencion a cliente modificado con exito!");
                                                  
                                                                                                           
                                                    }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                    {
                                                      System.out.println("No modificar Empleado!");
                                                      bandera=true;
                                                    }
                                                   
                                              }//llave if equals
                                              
                                              }//llave instance
                                             i=i+1;
                                             }//llave while
                                            
                                          
                                           }//llave case
                                            
                                  break; 
                                       case 5://eliminar empleado atc cte
                           {
                              
                                System.out.print("Ingresa codigo del empleado Atencion al Cliente a eliminar.. ");
                                busqueda=entrada.nextLine();
                                boolean bandera= false;
                                int i=0, actualizar=0;
                                String d ="";
                                String codigo, nombre, domicilio, rfc, tel, email;
                                int clientescaptados = 0;
                                   while (!bandera)
                                    {
                                          if (bandera==false && i==ctrl)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Empleado no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                         if (personas[i] instanceof AtnCte)
                                           {
                                             AtnCte atc = new AtnCte();
                                             atc = (AtnCte)personas[i];
                                 
                                             if (busqueda.equals(atc.getcodigo()))
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Empleado----");                                  
                                               System.out.println("Codigo: " + atc.getcodigo());
                                               System.out.println("Nombre: " + atc.getnombre());
                                               System.out.println("Domicilio: " + atc.getdomicilio());
                                               System.out.println("RFC: " + atc.getrfc());
                                               System.out.println("Telefono: " + atc.gettelefono());
                                               System.out.println("Email: " + atc.getemail());
                                               System.out.println("Cantidad de clientes captados: " + atc.getCcaptados());
                                               
                                               System.out.print("Desea eliminar al Cliente "+atc.getnombre()+" S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                               if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                    {                                                                                                          
                                                     //System.out.println("tooo bienn ");
                                                
                                                                 //System.out.println("Ingresa los nuevos datos del cliente: ");
    		        
                                                                 codigo="";
                                                                 atc.setcodigo(codigo);
                        
                                                                 System.out.print("Nombre: ");    
                                                                 nombre = "";  
                                                                 atc.setnombre(nombre);
                        
                                                                 System.out.print("Domicilio: ");    
                                                                 domicilio = "";  
                                                                atc.setdomicilio(domicilio);
                        
                                                                 System.out.print("RFC: ");    
                                                                 rfc = "";  
                                                                 atc.setrfc(rfc);
                        
                                                                 System.out.print("Telefono: ");    
                                                                 tel = "";  
                                                                 atc.settelefono(tel);
                        
                                                                 System.out.print("Email: ");    
                                                                 email = "";  
                                                                 atc.setemail(email);
                        
                                                                 System.out.print("Cantidad de clientes captados: ");    
                                                                 clientescaptados = 0;  
                                                                 atc.setCcaptados(clientescaptados);
                        
                                                                 personas[i] = atc;
                        
                                                                 System.out.println("Empleado Atencion al cliente eliminado con exito!");
                                                  
                                                                                                           
                                                    }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                    {
                                                      System.out.println("No Eliminar Empleado Atencion al cliente!");
                                                      bandera=true;
                                                    }
                                                   
                                              }//llave if equals
                                              
                                              }//llave instance
                                             i=i+1;
                                             }//llave while
                               
                               break;
                           }
                           
                           
                                                   case 6: 
                                                   {                                                
                                                         
                                                          boolean bandera= false;
                                                          int i=0, ccaptados = 0;
                                                          System.out.print("Ingresa codigo del Empleado/Atención al cliente calcular salario.. ");
                                                          cod = entrada.nextLine();
                            
                                                     while (!bandera)
                                                      {
                                                         if (personas[i] instanceof AtnCte)
                                                          {
                                                            AtnCte cte = new AtnCte();
                                                            cte = (AtnCte)personas[i];
                                 
                                                             if (cod.equals(cte.getcodigo()))
                                                              {
                                                                bandera=true;
                                                                System.out.println("////////////////////////////");
                                                                System.out.println("----Empleado Atención al cliente Salario individual----");                                  
                                                                System.out.println("Codigo: " + cte.getcodigo());
                                                                System.out.println("Nombre: " + cte.getnombre());
                                                                System.out.println("Cantidad de clientes captados: "+cte.getCcaptados());
                                                                ccaptados = cte.getCcaptados();
                                                                cte.AtnCte(ccaptados);
                                                           
                                                               }
                                                                   i=i+1;
                                                            }
                                            
                                                                                  
                                                              if (bandera==false && i==ctrl)
                                                                  {
                                                                   System.out.println("********************************");
                                                                   System.out.println("Empleado no encontrado!"); 
                                                                   System.out.println("*********************************"); 
                                                                   bandera=true;
                                           
                                                                 }
                                                                                  
                                                            }//llave while
                                                       }//llave case salario
                           
                                                     break;
                                                   case 7: 
                                                   System.out.println("Regresar al Menu principal!!");
                                                   salir2=true;
                                                   opcempleado1 = 0;
                                                   opcempleado2 = 0;
                                                   break;
                               ////////////////////////////////////////////////////////////////////
                             
                               }
                             } //llave del lwhile atencion al cliente
                } //llave del if atencion al cliente
                     
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
                   case 1: //agregar
                      
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
                                                
                                                                 //System.out.println("Ingresa los nuevos datos del cliente: ");
    		        
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
                           opc=0; opc1=0;
                           break;
                     } //llave del sw
              } //llave del while de bandera de menu cliente
                
               } else if (opc==3)
                 {
                 //contrato         
                    
                     Contrato c;
                     int opccontrato=0;                     
                     String nom = "", direccion , duracion;
                     while (!salir2)
                     {
                      System.out.println("---------Menu Contrato+-------");
                      System.out.println("1.- Ingresar nombre de cliente");
                      System.out.println("2.- Ingresar nombre de cliente y dirección");
                      System.out.println("3.- Ingresar nombre de cliente, dirección y duración"); 
                      System.out.println("4.- Mostrar contratos"); 
                      System.out.println("5.- Regresar al menu principal"); 
                       
                      System.out.println("---------+------------------------+-------------");
         
                      System.out.print("Selecciona una opcion: ");        
                      opccontrato=entrada.nextInt();
                      entrada.nextLine();
                      
                      if (opccontrato==1)
                 {       
                     System.out.println(ctrlcontratro);
                     System.out.println("Ingresa el nombre del cliente");
                     nom = entrada.nextLine();                                       
                     c = new Contrato(NoContrato, nom);
                     contrato[ctrlcontratro]=c;
                     
                     ctrlcontratro++;
                     NoContrato++;
                                                   
                 } else if (opccontrato==2)
                 {
                     
                     System.out.println(ctrlcontratro);
                     System.out.println("Ingresa el nombre del cliente");
                     nom = entrada.nextLine(); 
                     System.out.println("Ingresa la dirección del cliente");
                     direccion = entrada.nextLine();
                     c = new Contrato(NoContrato, nom, direccion );
                     contrato[ctrlcontratro]=c;
                     ctrlcontratro++;
                     NoContrato++;
                     
                     System.out.println(ctrlcontratro);
                  
                  }else if (opccontrato==3)
                  {
                     System.out.println(ctrlcontratro);
                     System.out.println("Ingresa el nombre del cliente");
                     nom = entrada.nextLine(); 
                     System.out.println("Ingresa la dirección del cliente");
                     direccion = entrada.nextLine();
                      System.out.println("Ingresa la duración del contrato");
                      duracion = entrada.nextLine();
                     c = new Contrato(NoContrato, nom,duracion, direccion );
                     contrato[ctrlcontratro]=c;
                     ctrlcontratro++;
                     NoContrato++;
                                        
                  } else if (opccontrato==4)
                         {
                            for (int i = 0; i < ctrlcontratro; i ++)
                           {
                             System.out.println(contrato[i]);                          
                           }
                         }else if (opccontrato==5)
                         {
                            System.out.println("Regresar al Menu principal!!");
                            salir2 = true;
                         }
                 }////llave del while de bandera de menu contrato
                 } else if (opc==4)
                 {
                     while (!salir2)
                     {
                 //jardin
                    opcjardin=0;
                    System.out.println("Menu de Jardin");
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Selecciona una opción para Jardin");
                    System.out.println("1.- Agregar");
                    System.out.println("2.- Consultar");
                    System.out.println("3.- Busqueda"); 
                    System.out.println("4.- Modificar"); 
                    System.out.println("5.- Eliminar");
                    System.out.println("6.- Salir"); 
                    System.out.println("-----------------------------------------------------------------");
                    System.out.print("Selecciona una opcion del menu Jardin...");        
                    opcjardin=entrada.nextInt();
                    entrada.nextLine();
                    
                     switch  (opcjardin)
                           {
                             case 1:
                                { 
                                   Jardin jardin = new Jardin (); //arreglo tipo jardin
                                 
                                   int NoJardin;
                                   int extension;
                                   float tiempodedicado;
                                   String TipoJardin;
                                   
                                 System.out.println("Ingresa datos del Jardin: ");
    		                 System.out.print("No Jardin: ");    
                                 NoJardin = entrada.nextInt();
                                 jardin.setNoJardin(NoJardin);
                                 
                                 System.out.print("Extension de jardin: ");    
                                 extension = entrada.nextInt();  
                                 jardin.setExtension(extension);
                        
                                 System.out.print("Tiempo dedicado: ");    
                                 tiempodedicado = entrada.nextFloat();
                                 jardin.setTiempodedicado(tiempodedicado);
                                entrada.nextLine();
                                 System.out.print("Tipo jardin: ");    
                                 TipoJardin = entrada.nextLine();  
                                 jardin.setTipoJardin(TipoJardin);
                                 entrada.nextLine();
                                 j[ctrlj] = jardin;
                                 ctrlj++;
                                 System.out.println("Jardin agregado con exito!");
                                 break;
                               }//llave agregar
                             
                             case 2://Muestra todos los jardines
                                {                                 
                                 for (int i = 0; i < ctrlj; i ++)
                                  {
                                    System.out.println(j[i]);                          
                                  }
                           
                                }  //llave case mostrar jardines
                                 break;
                                  
                          
                                  case 3: //busqueda
                                    {
                                      int nojardin = 0;
                                      System.out.print("Ingresa codigo del Jardin a buscar.. ");
                                      nojardin=entrada.nextInt();
                                      boolean bandera= false;
                                      int i=0;
                            
                                            while (!bandera)
                                            {
                                               if (j[i].getNoJardin()==nojardin)
                                         
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Jardin----");                                  
                                               System.out.println("Numero de Jardin: " + j[i].getNoJardin());
                                               System.out.println("Extension de Jardin: " + j[i].getExtension());
                                               System.out.println("Tiempo dedicado: " + j[i].getTiempodedicado());
                                               System.out.println("RFC: " + j[i].getTipoJardin());
                                              }  
                                                i=i+1;
                                            }
                                            if (bandera==false && i==ctrlj)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Jardin no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                                                  
                                    } //llave case busqueda
                                   break;
                                      
                                       case 4: //modificar
                                     {
                                           Jardin jardin = new Jardin (); //arreglo tipo jardin 
                                           int NoJardin;
                                            int extension;
                                            float tiempodedicado;
                                            String TipoJardin, d ="";
                                      int nojardin = 0;
                                      System.out.print("Ingresa codigo del Jardin a modificar.. ");
                                      nojardin=entrada.nextInt();
                                      boolean bandera= false;
                                      int i=0;
                            
                                            while (!bandera)
                                            {
                                                 if (bandera==false && i==ctrlj)
                                                   {
                                                     System.out.println("Jardin no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                 
                                               if (j[i].getNoJardin()==nojardin)
                                         
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Jardin----");                                  
                                               System.out.println("Numero de Jardin: " + j[i].getNoJardin());
                                               System.out.println("Extension de Jardin: " + j[i].getExtension());
                                               System.out.println("Tiempo dedicado: " + j[i].getTiempodedicado());
                                               System.out.println("Tipo de jardin: " + j[i].getTipoJardin());
                                              entrada.nextLine();
                                               System.out.print("Desea modificar datos del Jardin.. S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                                     if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                       {                                                                                                          
                                                        System.out.println("Ingresa los nuevos datos del jardin: ");
    		        
                                               
                                                           System.out.println("////////////////////////////");
                                                           System.out.println("----Jardin a modificar----");                                  
                                                           NoJardin = j[i].getNoJardin();
                                                           jardin.setNoJardin(NoJardin);
                                 
                                                            System.out.print("Extension de jardin: ");    
                                                            extension = entrada.nextInt();  
                                                            jardin.setExtension(extension);
                        
                                                            System.out.print("Tiempo dedicado: ");    
                                                            tiempodedicado = entrada.nextFloat();
                                                            jardin.setTiempodedicado(tiempodedicado);
                                                            entrada.nextLine();
                                                            System.out.print("Tipo jardin: ");    
                                                            TipoJardin = entrada.nextLine();  
                                                            jardin.setTipoJardin(TipoJardin);
                                                            entrada.nextLine();
                                                            j[i] = jardin;
                                                            System.out.println("Jardin modificado con exito!");
                                                       }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                            {
                                                             System.out.println("No modificar Jardin!");
                                                             bandera=true;
                                                            }
                                              
                                              }  
                                                i=i+1;
                                            }
                                           
                                     } // llave de case modificar
                                     break;
                                           
                                      case 5: //elimiar
                                     {
                                          Jardin jardin = new Jardin (); //arreglo tipo jardin 
                                           int NoJardin;
                                            int extension;
                                            float tiempodedicado;
                                            String TipoJardin, d ="";
                                      int nojardin = 0;
                                      System.out.print("Ingresa codigo del Jardin a eliminar.. ");
                                      nojardin=entrada.nextInt();
                                      boolean bandera= false;
                                      int i=0;
                            
                                            while (!bandera)
                                            {
                                                 if (bandera==false && i==ctrlj)
                                                   {
                                                     System.out.println("********************************");
                                                     System.out.println("Jardin no encontrado!"); 
                                                     System.out.println("*********************************"); 
                                                     bandera=true;
                                           
                                                    }
                                                 
                                               if (j[i].getNoJardin()==nojardin)
                                         
                                              {
                                               bandera=true;
                                               System.out.println("////////////////////////////");
                                               System.out.println("----Jardin----");                                  
                                               System.out.println("Numero de Jardin: " + j[i].getNoJardin());
                                               System.out.println("Extension de Jardin: " + j[i].getExtension());
                                               System.out.println("Tiempo dedicado: " + j[i].getTiempodedicado());
                                               System.out.println("Tipo de jardin: " + j[i].getTipoJardin());
                                              entrada.nextLine();
                                               System.out.print("Desea eliminar datos del Jardin.. S/n .. "); 
                                               d=entrada.nextLine();
                                                 
                                                     if (d.equals("Si")||(d.equals("si")||(d.equals("S")||d.equals("s"))))
                                                       {                                                                                                          
                                                       
                                                           System.out.println("////////////////////////////");
                                                           NoJardin = 0;
                                                           jardin.setNoJardin(NoJardin);
                                                            extension = 0;  
                                                            jardin.setExtension(extension);
                                                            tiempodedicado = 0;
                                                            jardin.setTiempodedicado(tiempodedicado);
                                                        
                                                            TipoJardin = "";  
                                                            jardin.setTipoJardin(TipoJardin);
                                                           
                                                            j[i] = jardin;
                                                            System.out.println("Jardin eliminado con exito!");
                                                       }else  if (d.equals("No")||(d.equals("no")||(d.equals("N")||d.equals("n"))))
                                                            {
                                                             System.out.println("No eliminar Jardin!");
                                                             bandera=true;
                                                            }
                                              
                                              }  
                                                i=i+1;
                                            }
                                          
                                          
                     
                                     }//llave de case eliminar
                                     break;
                                               
                                      case 6: //regresar menu principal
                                     {
                                      System.out.println("Regresar al Menu principal!!");
                                      salir2 = true;
                     
                                     }
                                     break;
                                        
                           }//llave sw
                           
                         
                     } //llave del while de bandera de menu jardin
                 
                 } else if (opc==5)
                 {
                   System.out.println("Salir del Sistema...Gracias por participar!!");
                   salir1=true;
                   System.exit(0);
                 }
    
  } catch (InputMismatchException e) {
                System.out.println("Ingresa el dato de manera correcta");
                entrada.next();
            } 

       } //llave while
        
    } // lave main
} //clase principal