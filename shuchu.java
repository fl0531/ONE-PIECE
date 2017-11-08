public class shuchu implements Runnable {
    Ziyuan z;
    shuchu(Ziyuan z) {
        this.z = z;
    }
    public void run() {
        while (true) {
            synchronized (z) {
                if (!z.flag)
                {
                    try {
                        z.wait();
                    } catch (InterruptedException e) {
                    }
                    System.out.println(z.name + "................" + z.sex);
                    z.flag = false;
                    z.notify();
                }
            }
        }
    }
}
