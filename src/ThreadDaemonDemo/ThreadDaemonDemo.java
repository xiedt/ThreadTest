package ThreadDaemonDemo;

/**
 * 守护线程
 */
class MyThread implements Runnable{ // 实现Runnable接口
    public void run(){  // 覆写run()方法
        while(true){
            System.out.println(Thread.currentThread().getName() + "在运行。") ;
        }
    }
};
public class ThreadDaemonDemo{
    public static void main(String args[]) throws InterruptedException {
        MyThread mt = new MyThread() ;  // 实例化Runnable子类对象
        Thread t = new Thread(mt,"守护线程");     // 实例化Thread对象
        t.setDaemon(true) ; // 此线程在后台运行
        t.start() ; // 启动线程

        Thread.sleep(10);
        System.out.println("主线程运行结束");

    }
};