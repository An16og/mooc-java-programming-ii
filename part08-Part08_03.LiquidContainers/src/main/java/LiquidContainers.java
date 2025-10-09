import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=0;
        int b=0;
        while (true){
            System.out.println("First: "+a+"/100\n"+"Second: "+b+"/100\n");
        String comm=scan.nextLine();
        if(comm.equals("quit")){
            break;
        }
        String c[]= comm.split(" ");
        int val=Integer.valueOf(c[1]);
        if(val>=0){
        if(c[0].equals("add")){
            a+=val;
            if(a>100){
                a=100;
            }}
        if(c[0].equals("move")){
            if(a<val){
                b+=a;
                a=0;
                
            }else{
                a-=val;
                b+=val;
            }
            if(b>100){
                b=100;
            }    

        }
        if(c[0].equals("remove")){
           b-=val;
           if(b<0){
               b=0;
           }}
           
        }
        
    }

    }
}
