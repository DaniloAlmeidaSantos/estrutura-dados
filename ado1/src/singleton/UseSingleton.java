package singleton;

public class UseSingleton extends Thread {

	@Override
    public void run(){
      Singleton s1 = Singleton.getInstance();
      System.out.println(s1);
    }

    public static void main(String[] args) {
    	UseSingleton t1 = new UseSingleton();
    	UseSingleton t2 = new UseSingleton();
    	UseSingleton t3 = new UseSingleton();
    	UseSingleton t4 = new UseSingleton();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

	
}
