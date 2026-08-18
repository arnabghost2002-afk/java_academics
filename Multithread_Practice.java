class Hellotask implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello-"+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Worldtask implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("World-"+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class Main{
    public static void main(String[] args){
        Runnable hello = new Hellotask();
        Runnable world = new Worldtask();
        Thread t1= new Thread(hello);
        Thread t2= new Thread(world);
        t1.start();
        t2.start();
    }
}
