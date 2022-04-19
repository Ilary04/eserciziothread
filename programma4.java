public class programma4 extends Semaforo{

    
    public programma4(int v) {
        super(v);
        
    }

    int x=1;
    int vfisso=10;
    int y=0;
    
    public void A (){
      While (true) {
      item = produce_item();
      p(vfisso); 
      p(x); 
      insert(item); 
      V(x);
     V(y);
     }
    }

    public void B (){
        While (true) {
            P(y);
            P(x);
            item= remove_item();
            V(x);
            V(vfisso);
            consume(item);
            }
    }
    
    
    
}
