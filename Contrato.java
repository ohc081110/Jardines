package jardines;

import java.util.Scanner;

public class Contrato
{
   
     private int NoContrato;
     private String NombreCliente;
     private String duracion="Duración Pendiente";
     private String direccion="Direccion Pendiente";     
   
    public Contrato(int NoContrato, String NombreCliente) 
    {
        this.NoContrato = NoContrato;
        this.NombreCliente = NombreCliente;
    }

    public Contrato(int NoContrato, String NombreCliente, String direccion) 
    {
        this.NoContrato = NoContrato;
        this.NombreCliente = NombreCliente;
        this.direccion = direccion;
    }

    public Contrato(int NoContrato, String NombreCliente, String duracion, String direccion) 
    {
        this.NoContrato = NoContrato;
        this.NombreCliente = NombreCliente;
        this.duracion = duracion;
        this.direccion = direccion;
    }
@Override
public String toString ()
  {
    return  "Numero de contrato: "+NoContrato+", Nombre del cliente: "+NombreCliente+", Direccón del cliente: "+direccion+", Duración del contrato: "+duracion;
  }
}
