import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainEsercizi{
    protected static int buffer;
    public static void main(String args[]){
        Semaforo pieno =new Semaforo(0);
        Semaforo vuoto =new Semaforo(1);
        ProduciDato prod=new ProduciDato(pieno,vuoto);
        ConsumaDato cons=new ConsumaDato(pieno,vuoto);
        prod.start();
        cons.start();
        System.out.println("termine avvio thread");
        BufferedReader test = new BufferedReader(new InputStreamReader(System.in));
        char pressione;
        Campane c1 = new Campane("DIN", 300); 
	    Campane c2 = new Campane("DON", 1000);
        Campane c3 = new Campane("DAN", 2000);
        
	    c1.start();
	    c2.start();
        c3.start();

    }
}