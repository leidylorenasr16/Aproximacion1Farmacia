import java.util.Scanner;

/**
 * Write a description of class Compra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compras
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String identificacion, nombre, sucursal;
        double compra1, compra2, compra3, promedio = 0;
        int numClientes;
    
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] sucursales = new String[50];
        double[] comprauno = new double[50];
        double[] comprados = new double[50];
        double[] compratres = new double[50];
        Cliente unCliente = new Cliente();
        
        System.out.println("Digite el numero de clientes");
        numClientes = scn.nextInt();
        
        for(int i=0; i < numClientes; i++){
            System.out.println("Digite la identificacion del cliente");
            identificacion = scn.next();
            System.out.println("Digite el nombre del cliente");
            nombre = scn.next();
            System.out.println("Digite la sucursal del cliente");
            sucursal = scn.next();
            System.out.println("Digite la compra uno del clientes");
            compra1 = scn.nextInt();
            System.out.println("Digite la compra dos del clientes");
            compra2 = scn.nextInt();
            System.out.println("Digite la compra tres del clientes");
            compra3 = scn.nextInt();
                
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            sucursales[i] = sucursal;
            comprauno[i] = compra1;
            comprados[i] = compra2;
            compratres[i] = compra3;
        }
        
        for(int i = 0; i < numClientes; i++){
            unCliente.identificacion = identificaciones[i];
            unCliente.nombre = nombres[i];
            unCliente.sucursal = sucursales[i];
            unCliente.compra1 = comprauno[i];
            unCliente.compra2 = comprados[i];
            unCliente.compra3 = compratres[i];
            promedio = promedio + unCliente.promedio();
        }
        
        System.out.println("El promedio de compras es: " + promedio/ numClientes);
    }
}
