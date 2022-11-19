import java.io.*;
//import java.util.Random;

public class ProcessScheduler2{
    public static void main(String[] args) throws Exception{

        int tiempo1 = 0;
        int tiempo2 = 0;

        if(args[0].equals("-fcfs")){

            if(args[1].substring(3,4).equals("-")){
                tiempo1 = Integer.parseInt(args[1].substring(0,3));
                tiempo2 = Integer.parseInt(args[1].substring(4,5));
            }
            else if(args[1].substring(1,2).equals("-")){
                tiempo1 = Integer.parseInt(args[1].substring(0,1));
                tiempo2 = Integer.parseInt(args[1].substring(2,5));
            }
            System.out.println(tiempo1);
            System.out.println(tiempo2);

            int tiempoEntrada = (int)(Math.random()*tiempo2 - tiempo1);
            System.out.println(tiempoEntrada);
                //int tiempoEntrada = r.nextInt(tiempo2) + tiempo1;
            int aritmetico = Integer.parseInt(args[2]);
            System.out.println(aritmetico);
            int intOut = Integer.parseInt(args[3]);
            System.out.println(intOut);
            int condicional = Integer.parseInt(args[4]);
            System.out.println(condicional);
            int iterativo = Integer.parseInt(args[5]);
            System.out.println(iterativo);

        }
        else if(args[0].equals("-lcfs")){

        }
        else if(args[0].equals("-rr")){

        }
        else if(args[0].equals("-pp")){

        }


    }
}