class OddThread extends Thread {

    private int limit;
    OddThread(int lim){
        super();
        limit=lim;
       
    }

    public void run(){
    try{
        for(int i = 0;i<=limit;i++){
        if (i%2!=0) {
            System.out.println("Odd: "+i);
            Thread.sleep(1000);
        }
    }
    }catch(Exception e){}
    }
}
class MyThread {
    
    public static void main(String[] args) {
       
        OddThread ot = new OddThread(5);

        
        ot.start();
        try{
        for(int i = 0;i<=5;i++){
        if (i%2==0) {
            System.out.println("Even: "+i);
           Thread.sleep(1000);
        }


    }
    }catch(Exception e){}
    
}}
