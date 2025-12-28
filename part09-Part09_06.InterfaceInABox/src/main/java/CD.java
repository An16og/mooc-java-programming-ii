public class CD implements Packable{
  private String Anamr;
    private String Bname;
    private int year;

public CD(String author, String book, int year){
    this.Anamr=author;
    this.Bname=book;
    this.year=year;
}
public double weight(){
    return 0.1;}
@Override 
public String toString(){
    return (Anamr+": "+Bname+" ("+year+")");
}
}


