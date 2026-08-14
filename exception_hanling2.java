import java.util.Arrays;

public class Main{
     public static void main(String[] args){
         try{
             int[] a= new int [4];
             a[4]=10;
         }catch(Exception e){
             System.out.println("Exception: "+e);
         }
         finally{
             System.out.println("print last line");
         }

     }
 }
