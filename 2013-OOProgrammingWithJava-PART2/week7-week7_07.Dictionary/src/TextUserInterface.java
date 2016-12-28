
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shane Yankam Shaneyankam.com Samyyankam@gmail.com
 */
public class TextUserInterface {

    private Scanner read;
    private Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dic) {

        this.read = reader;
        this.dict = dic;

    }

    public void start() {

        while (true) {

            String x = read.nextLine();

            if (x.toLowerCase().equals("quit")) {

                System.out.println("Cheers!");
                return;
            }
            
            else if(x.toLowerCase().equals("add")){
                
                this.add();
            }
            else if(x.toLowerCase().equals("translate")){
                
                this.translate();
            }
            else {
                System.out.println("Unkown Statement");
            }
        }

    }

    public void add() {

        System.out.println("Word:");
        String x = read.nextLine();
        System.out.println("Translation");
        String y = read.nextLine();
        
        if (!x.isEmpty()) {
            dict.add(x, y);
        }
    }
    
    
    public void translate(){
        
        System.out.println("Give a word:");
        String a = read.nextLine();
       
        if(!a.isEmpty()){
            
            System.out.println(dict.translate(a));
        }
        
    }

}
