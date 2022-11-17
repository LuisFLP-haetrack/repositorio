import java.security.cert.PolicyNode;
import java.util.concurrent.*;

public class FCFS extends Policy{
    int contador = 1;
    protected int size;
    protected int totalProcesses;

    ConcurrentLinkedQueue<SimpleProcess> funcCola = new ConcurrentLinkedQueue<>();

    public FCFS(int size, int totalProcesses){
        this.contador = 1;

        this.size = size;
        this.totalProcesses = totalProcesses;
        
    }

    public void meterCola(int cont){
        this.contador = cont;
        while(true){
            funcCola.add(cont++);
        }
    }
//no creo que sea necesario sacar de la cola creo
    /**public void sacarCola(int size){
       dequeue(this.contador); 
    }*/

    /**public void getTotalProcesos(){

    }*/



}