 class Contatore{
int valore;
int passo;

Contatore(int valore,int passo){
    this.valore=valore;
    this.passo=passo;
    System.out.println("contatore"+this.getValore());
}

void    incrementa(){
    valore+=passo;
}

void    decrementa(){
    valore-=passo;
}

int getValore(){
    return valore;
}

}