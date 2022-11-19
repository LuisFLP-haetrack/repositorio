import java.io.*;

public class Aritmetico extends SimpleProcess{
    
    protected int id;
    protected int tiempo;

    public Aritmetico(int id, int tiempo){
        super(id, tiempo);
        //ProcessSchedule tiempo = new ProcessSchedule();
        this.tiempo = args[2];
    }
    @Override
    public void aritmetico(){
        if(this.id == 1){
            this.id = 1;
        }
        else{
            this.id = 0;
        }

    }

    public static void run(int tiempo){
        this.tiempo = tiempo;
        Thread.sleep(tiempo);
    }


}