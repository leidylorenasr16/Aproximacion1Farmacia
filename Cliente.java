
/**
 * Write a description of class Clientes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente
{
    String identificacion;
    String nombre;
    String sucursal;
    double compra1;
    double compra2;
    double compra3;
    
    
    public double promedio(){
        return (compra1+compra2+compra3)/3;
    }
}
