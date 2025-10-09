import java.util.Scanner;
public class Cubes {
    public static void main(String[] args){

    Scanner scan = new Scanner (System.in);
    while (true){
        String a = scan.nextLine();
        if (a.equals("end")) break;
        int an= Integer.valueOf(a);
        System.out.println((an*an)*an);


    }
}
}