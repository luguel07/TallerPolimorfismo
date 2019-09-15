package tallerpolimorfismo;

/**
 *
 * @author Lucho
 */
public class ProgramaInterfaz {

  public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro igor=new Burro();
        hacerCantar(igor);
       
    } 

    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
   
}
