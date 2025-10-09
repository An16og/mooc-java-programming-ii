import java.util.Scanner;
public class AverageOfPositiveNumbers {
    public static void main(String[] args){

    Scanner scan = new Scanner (System.in);
    int sum=0;
    int count=0;
    while (true){
        int a = Integer.valueOf(scan.nextLine());
        if (a>0){
            sum+=a;
            count++;



        }else if(a==0){
            if(sum==0){
                System.out.println("Cannot calculate the average");
            }else{
            double avg=sum*1.0/count;
            System.out.println(avg);}
            break;
        }


    }
}
}