
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String>lis= new ArrayList<>();

        while(true){
            String s=scanner.nextLine();
            if(s.equals("end")){
                break;
            }
            lis.add(s);

        }
        		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String ip= scanner.nextLine();
        double average=0;
        if(ip.equals("n")){
         average= lis.stream()
            .mapToInt(s->Integer.valueOf(s))
            .filter(x->x<0)
            .average()
            .getAsDouble();

        	System.out.println("Average of the negative numbers: " + average);

        } else if(ip.equals("p")){
         average= lis.stream()
            .mapToInt(s->Integer.valueOf(s))
            .filter(x->x>0)
            .average()
            .getAsDouble();
        System.out.println("Average of the positive numbers: " + average);

        }
    }
}
