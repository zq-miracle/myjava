package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/8/10$ 18:40$
 * @Version: 1.0
 * <p>
 * 线程池：
 * 其实就是一个容纳多个线程的容器，其中的线程可以反复使用，
 * 省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源。
 * <p>
 * 优点：
 * 1. 降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
 * 2. 提高响应速度。当任务到达时，任务可以不需要的等到线程创建就能立即执行。
 * 3. 提高线程的可管理性。可以根据系统的承受能力，调整线程池中工作线线程的数目，防止因为消耗过多的内存，而把服务器累趴下(每个线程需要大约1MB内存，线程开的越多，消耗的内存也就越大，最后死机)。
 * <p>
 * 常用的几种线程池:
 * 1,newFixedThreadPool
 * 特点：创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。
 * 线程池的大小一旦达到最大值就会保持不变.
 * 2,newSingleThreadExecutor
 * 特点：创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 * 如果这个线程异常结束，会有另一个取代它，保证顺序执行。单工作线程最大的特点是可保证顺序地执行各个任务，并且在任意给定的时间不会有多个线程是活动的。
 * 3,newScheduleThreadPool
 * 创建一个定长的线程池，而且支持定时的以及周期性的任务执行，支持定时及周期性任务执行。
 * 4,newCachedThreadPool
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
 * 缺点：工作线程的创建数量几乎没有限制  一定要注意控制任务的数量，否则，由于大量线程同时运行，很有会造成系统瘫痪
 * <p>
 * public ThreadPoolExecutor(
 * int corePoolSize,    //核心线程数
 * int maximumPoolSize,  //线程池最大线程数
 * long keepAliveTime,//表示线程没有任务执行时最多保持多久时间会终止
 * TimeUnit unit,   //时间单位
 * BlockingQueue<Runnable> workQueue, //一个阻塞队列，用来存储等待执行的任务
 * ThreadFactory threadFactory,  //线程工厂，主要用来创建线程
 * RejectedExecutionHandler handler) 表示当拒绝处理任务时的策略
 */


/*	注意：创建线程池对象时，核心线程数取多大是有讲究的：
        cpu密集型：能快速执行完的任务   -- 尽可能去获取更多的cpu执行权  2*cpu核数+1
        io密集型：io的读写操作，很耗时间 -- 尽可能减少cpu切换的时间消耗  cpu核数+1
*/
public class ZQ_ThreadPool {
    public static void main(String[] args) {

        //本机电脑可用处理器（线程数）电脑几核几线程中的线程数
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);


//        1,newFixedThreadPool
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);
                }
            });

        }

//        2,newSingleThreadExecutor

/*        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            singleThreadExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        if (finalI % 3 == 0) {
                            int a = 1 / 0;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);

                }
            });
        }*/

//        3,newScheduledThreadPool
       /* ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);
                }
            }, 3, TimeUnit.SECONDS);
        }*/

//        4,newCachedThreadPool
/*        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":" + finalI);
                }
            });
        }*/


    }


}

