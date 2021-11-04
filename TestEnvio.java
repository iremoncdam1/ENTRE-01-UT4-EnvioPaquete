
/**
 *  Esta clase nos ayudará a comprobar el funcionamiento 
 *  de nuestro proyecto.
 * @author  - Iratxe Remón
 */
public class TestEnvio
{
    
    /**
     *  
     */
    public static void main(String[] args){
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        Envio envio = new Envio();
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        envio.print();
        Dimension dimension = new Dimension(50,50,70);
        Paquete paquete3 = new Paquete(dimension,13);
        envio.addPaquete(paquete3);
        envio.print();
        envio.addPaquete(paquete2.obtenerCopia());
    }
}
