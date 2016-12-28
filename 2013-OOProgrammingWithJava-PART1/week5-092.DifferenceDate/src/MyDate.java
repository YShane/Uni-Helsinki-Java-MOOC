public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        int x = 0;
        int y = 0;
        if(this.earlier(comparedDate)==false){
            
           if((this.month-comparedDate.month)>= 0){
              
               if(this.day-comparedDate.day>=0){
                  x = this.year- comparedDate.year; 
               }
               else{
                   x = (this.year- comparedDate.year)-1; 
               }
               
           }
           else{
               x = (this.year- comparedDate.year)-1; 
           }
            
           
           
        }
        if(this.earlier(comparedDate)==true){
            
            if((comparedDate.month-this.month)>=0){
                
                if((comparedDate.day-this.day)>=0){
                    x = comparedDate.year-this.year;
                }
                else{
                    x = (comparedDate.year-this.year)-1;
                }
            }
            else{
                x = (comparedDate.year-this.year)-1;
            }
        }
        
        
        
        
        
        
        
        return x;
    }

}
