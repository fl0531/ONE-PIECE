//线程间通信，等待唤醒机制
public class Main {
    public static void main(String[] args) {
            Ziyuan z=new Ziyuan();
            shuru s=new shuru(z);
            shuchu c=new shuchu(z);
            Thread t1=new Thread(s);
            Thread t2=new Thread(c);
            t1.start();
            t2.start();
}
    }


