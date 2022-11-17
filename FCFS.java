import java.util.concurrent.*;

public class FCFS extends Policy{

    ConcurrentLinkedQueue<SimpleProcess> funcCola = new ConcurrentLinkedQueue<>();

    public FCFS(int size, int totalProcesses){
        super(size, totalProcesses);
        
    }



}