public class vari{
    public static void main(String[] args){
        int a = 10; 
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);        
    }
}

// answer to the above questions: 20 10//


//also Math.pow gives ans in float
//to get ans in int put (int) in front of Math....
//e.g - int num=(int)Math.pow(2,3)