package ThreadInterruptDemo;

class MyThread implements Runnable{ // 实现Runnable接口
    public void run(){  // 覆写run()方法
        System.out.println("1、进入run()方法") ;
        try{
            Thread.sleep(10000) ;   // 线程休眠10秒
            System.out.println("2、已经完成了休眠") ;
        }catch(InterruptedException e){
            System.out.println("3、休眠被终止") ;
            return ; // 返回调用处
        }
        System.out.println("4、run()方法正常结束") ;
    }
};
public class ThreadInterruptDemo{
    public static void main(String args[]){
        MyThread mt = new MyThread() ;  // 实例化Runnable子类对象
        Thread t = new Thread(mt,"线程");     // 实例化Thread对象
        t.start() ; // 启动线程
        t.interrupt() ; // 中断线程执行
    }
};