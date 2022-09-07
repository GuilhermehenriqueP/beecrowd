import javax.management.RuntimeErrorException;

public class Pilha {

    char elementos[];
    int topo;
    

    public Pilha(){
        elementos = new char[1000];
        this.topo = -1;
    }


    public void push(char e){
        topo++;
        elementos[topo] = e;
    }
    public char pop(){
        if(isEmpty()){
            throw new RuntimeErrorException(null, "Empty Stack !");
        }
        char e = this.elementos[topo];
        topo--;
        return e;

    }

    public boolean isEmpty(){
        return (topo == -1);
    }

    public int stackSide(){
        return topo + 1;
    }


    
}
