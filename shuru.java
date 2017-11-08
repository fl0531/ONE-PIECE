public class shuru implements Runnable{
   Ziyuan z;
    shuru(Ziyuan z){
        this.z=z;
    }
    public void run(){
        int x=0;
        while (true){
            synchronized (z) {
                if (z.flag) {
                    try {
                        z.wait();
                    } catch (InterruptedException e) {
                    }
                    if (x ==0) {
                        z.name = "zhangsan";
                        z.sex = "nan";
                    } else {
                        z.name = "lili";
                        z.sex = "nv";
                    }
                    z.flag = true;
                    z.notify();
                }
            }
            x=x++%2;
        }
    }
}

