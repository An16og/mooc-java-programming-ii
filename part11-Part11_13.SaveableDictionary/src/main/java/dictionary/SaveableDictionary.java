package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
private HashMap<String,String>dict=new HashMap<>();
private File file;
    public SaveableDictionary(){}
   public SaveableDictionary (String file){
    this.file=new File(file);
   }

    public void add(String words, String translation){
        dict.putIfAbsent(words, translation);
    }
       public String translate(String word) {
        for (String item : this.dict.keySet()) {
            if (this.dict.get(item).equals(word)) {
                return item;
            } else if (this.dict.get(word) != null) {
                return this.dict.get(word);
            }
        }

        return null;
    }
    public void delete(String word){
        String toRemove="";
        for (String item : this.dict.keySet()) {
            if (this.dict.get(item).equals(word)) {
                toRemove=item;
            } else if (item.equals(word)) {
                toRemove=item;
            }

        }
        
         dict.remove(toRemove);
    }
    
    public boolean load(){
        try{
            Scanner scan = new Scanner(this.file);
            while (scan.hasNextLine()) {
                String[] parts= scan.nextLine().split(":");
                dict.putIfAbsent(parts[0], parts[1]);
            }
        
             return true;}
            catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }

        public boolean save(){
            try {
                PrintWriter writer= new PrintWriter(file);

                for(String s: dict.keySet()){
                    String word= s;
                    String translation= dict.get(s);
                    writer.println(word+":"+translation);
                }
                writer.close();
                return true;
            } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;}
        }
    }

