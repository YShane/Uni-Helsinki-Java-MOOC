import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam 
 * Shaneyankam.com
 * Samyyankam@gmail.com
 */

public class ExamGrades {

  private ArrayList<Double> scores; 
  
  private ArrayList<Double> five;
  private ArrayList<Double> four;
  private ArrayList<Double> three;
  private ArrayList<Double> two;
  private ArrayList<Double> one;
  private ArrayList<Double> zero;
  
  public ExamGrades(){
      
      scores = new ArrayList<Double>();
  }
  public ExamGrades(ArrayList<Double> z){
      
      this.scores = z;
  }
  
  public void addGrades(Scanner lukija){
      
      double x = lukija.nextDouble();
      while(x>=0 && x<=60){
          if(x != -1){
      scores.add(x);
          }
          else{
              return;
          }
      }
  }

    public ArrayList<Double> getScores() {
        return this.scores;
    }

    public void setScores(ArrayList<Double> scores) {
        this.scores = scores;
    }
   
    public void setArraylists(ArrayList<Double> cinq, ArrayList<Double> quatre, ArrayList<Double> trois, ArrayList<Double> deux, ArrayList<Double> un, ArrayList<Double> zero ){
        
        this.five = cinq;
        this.four = quatre;
        this.three = trois;
        this.two = deux;
        this.one = un;
        this.zero = zero;
    }
  
    public void printDistribution(){
        
     ArrayList<Double> ray =  this.getScores();
     
  
        
        this.five=  new ArrayList<Double>();//ArrayList<Double> five 
        this.four    =  new ArrayList<Double>();  //ArrayList<Double> four
        this.three    =  new ArrayList<Double>();  //ArrayList<Double> three
       this.two  =  new ArrayList<Double>();      //ArrayList<Double> two
       this.one  =  new ArrayList<Double>();    //ArrayList<Double> one
      this.zero =    new ArrayList<Double>();  //ArrayList<Double> zero
        
       for(double x: ray){
           
           if(x>=50){
               five.add(x);
           }
           else if(x>=45 && x<=49){
               four.add(x);
               
           }
           else if(x>=40 && x<=44){
               
               three.add(x);
           }
           else if(x>=35 && x<=39){
               two.add(x);
           }
           else if(x>=30 && x<=34){
               one.add(x);
           }
           else if(x<30 && x>-1){
               zero.add(x);
           }
           
       }
        
        System.out.println("Grade Distribution:");
        System.out.print("5:");
        for(double x: five){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.print("4:");
        for(double x: four){
            System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("3:");
        for(double x: three){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.print("2:");
        
        for(double x: two){
            System.out.print("*");
            
        }
        System.out.print("\n");
        
        System.out.print("1:");
        for(double x: one){
            System.out.print("*");
        }
        System.out.println("\n");
        System.out.print("0:");
        for(double x: zero){
            System.out.print("*");
        }
        System.out.println("\n");
        
        
        
      
    }
    
    public void printShit(int x){
        
        System.out.println(x);
    }
    
    
    
    public void acceptancePercentage(){
        
       
     //double x =   (double((this.five.size()+ this.four.size() + this.three.size() + this.two.size() + this.one.size()))/(this.five.size()+ this.four.size() + this.three.size() + this.two.size() + this.one.size() + this.zero.size()));
        
        int a = this.five.size();
        int b = this.four.size();
        int c = this.three.size();
        int d = this.two.size();
        int e = this.one.size();
        int f = this.zero.size();
        
        double eins = (double)(a+b+c+d+e);
        double zwei = (double)(a+b+c+d+e+f);
        double x = (eins/zwei)*100;
                        
     
        System.out.println("Acceptance percentage:" + x);
    }

    public ArrayList<Double> getArray() {
        return five;
    }
    
}
