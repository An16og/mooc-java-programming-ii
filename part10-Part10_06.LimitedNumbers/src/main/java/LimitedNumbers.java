
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        while(true){
            int a =Integer.valueOf(scanner.nextLine());
            if(a<0)
                {break;
            }list.add(a);

        }
        list.stream()
        .filter(x->x>=1&&x<=5)
        .forEach(x->System.out.println(x));
    }
}
