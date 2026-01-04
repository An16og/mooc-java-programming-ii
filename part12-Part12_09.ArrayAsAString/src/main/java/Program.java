
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }
public static String arrayAsString(int[][] array){
    String s="";
    for(int row=0;row<array.length;row++){
        for(int i=0;i<array[row].length;i++){
        s+=array[row][i];
        }
        s+="\n";
    }
return s;
}
}
