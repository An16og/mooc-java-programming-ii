import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
        Container a=new Container();
        Container b=new Container();
        while (true){
            System.out.println("First: "+a+"\n"+"Second: "+b+"\n");
        String comm=scan.nextLine();
        if(comm.equals("quit")){
            break;
        }
        String c[]= comm.split(" ");
        int val=Integer.valueOf(c[1]);
        if(val>=0){
        if(c[0].equals("add")){
            a.add(val);}
        if(c[0].equals("move")){
            if(a.contains()>val){
            a.remove(val);
            b.add(val);}else{
                b.add(a.contains());
                a.remove(val);
            }
            

        }
        if(c[0].equals("remove")){
           b.remove(val);}
           
        }
        
    }

    }
}