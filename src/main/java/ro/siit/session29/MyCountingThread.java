package ro.siit.session29;

public class MyCountingThread extends Thread{
    private int limit;

    public MyCountingThread(int limit){
        this.limit = limit;
    }

    @Override
    public void run(){
        for (int i = 0; i < limit; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyCountingThread toTen = new MyCountingThread(10);
        MyCountingThread toTwenty = new MyCountingThread(20);

        // toTen.run();
        // toTwenty.run();

         toTen.start();
         toTwenty.start();
    }
}
