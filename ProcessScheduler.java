import java.io.*;

public class ProcessScheduler{
    public static void main(String[] args) throws Exception{

        if(args[0].equals("-fcfs")){
            System.out.println(args[1].substring(0,3));
            System.out.println(args[1].substring(4,5));
            
            int aritmetico = Integer.parseInt(args[2]);
            //Aritmetico.run(aritmetico);
            System.out.println(args[2]);

            //System.out.println(args[1].substring(3,4));
            
            System.out.println(args[3]);
            System.out.println(args[4]);
            System.out.println(args[5]);
            
        }
        else if(args[0].equals("-lcfs")){

        }
        else if(args[0].equals("-rr")){

        }
        else if(args[0].equals("-pp")){

        }
    }
}
