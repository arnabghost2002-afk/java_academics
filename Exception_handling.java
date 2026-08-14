import java.util.Arrays;

public class Main{
     public static void main(String[] args){
         try{
             int x=15;
             int y=0;
             int result=x/y;
             System.out.println("result = " + result);
         }catch(Exception e){
             System.out.println(e);
         }
         finally{
             System.out.println("print last line");
         }

     }
 }
