public class ProduciDato extends Thread{
    Semaforo pieno ;
    Semaforo vuoto;
    int tanti =5;
    final int attesa=500;
    public ProduciDato(Semaforo s1,Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }

    public void run(){
        for(int i=0;i<tanti;i++){
            vuoto.p();
            ProdConsSem.buffer=i;
            System.out.println("scrittore dato :"+i);
            pieno.v();
            try{
                Thread.sleep(attesa);
            }
            catch
               ( Exception e ){}
            
        }
        System.out.println("termine e scrittura dei dati");
    }
}