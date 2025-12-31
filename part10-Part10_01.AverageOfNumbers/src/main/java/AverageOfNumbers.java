
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        while(true){
            String s= scanner.nextLine();
            if(s.equals("end")){
                break;
            }
            list.add(s);
        }
        double average= list.stream()
        .mapToInt(a-> Integer.valueOf(a))
        .average()
        .getAsDouble();
        System.out.println("average of the numbers: "+average);
    }
    
}
