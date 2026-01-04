
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random lot= new Random();
        while(numbers.size()<7){
            int number= lot.nextInt()+1;
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        for(int lumber: numbers){
            if (number== lumber){
                return true;
            }
        }
        // Check here whether the number is among the drawn numbers
        return false;
    }
}

