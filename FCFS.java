import java.util.concurrent.*;

public class FCFS extends Policy{
    int contador = 1;
    ///agregue el contador para ver cuantos procesos entran a la cola1

    public FCFS(SimpleProcess[] processes){
        super(processes);
        
    }

    
    @Override
    protected void elementos(){

    }

    @Override
    protected void elementosTotal(){

    }

    @Override
    protected void sacadoTotal(){

    }

//no creo que sea necesario sacar de la cola creo
    /**public void sacarCola(int size){
       dequeue(this.contador); 
    }*/

    /**public void getTotalProcesos(){

    }*/



}