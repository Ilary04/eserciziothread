 class ConsumaDato extends Thread{
    Semaforo pieno ;
    Semaforo vuoto;
    int dato;
    public ConsumaDato(Semaforo s1, Semaforo s2){
        pieno=s1;
        vuoto=s2;
    }
    public void run(){
        while(true){
            pieno.p();
            vuoto.v();
            vuoto.v2();
            dato=ProdConsSem.buffer;
            System.out.println("dato letto"+dato);
        }
       
    }
}