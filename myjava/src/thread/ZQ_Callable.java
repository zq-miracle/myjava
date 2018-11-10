package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/10/28$ 17:12$
 * @Version: 1.0
 *
 * 综上例子可以看到： Callable 和 Future接口的区别

（1）Callable规定的方法是call()，而Runnable规定的方法是run().
（2）Callable的任务执行后可返回值，而Runnable的任务是不能返回值的。
（3）call()方法可抛出异常，而run()方法是不能抛出异常的。
（4）运行Callable任务可拿到一个Future对象， Future表示异步计算的结果。
它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。
通过Future对象可了解任务执行情况，可取消任务的执行，还可获取任务执行的结果。
Callable是类似于Runnable的接口，实现Callable接口的类和实现Runnable的类都是可被其它线程执行的任务。
Callable任务可以拿到一个Future对象，表示异步计算的结果。它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。通过Future对象可以了解任务执行情况，可取消任务的执行，还可获取执行结果。
 */

public class ZQ_Callable {


    /*
     * 一、创建执行线程的方式三：实现 Callable 接口。 相较于实现 Runnable 接口的方式，方法可以有返回值，并且可以抛出异常。
     *
     * 二、执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。  FutureTask 是  Future 接口的实现类
     */


        public static void main(String[] args) {
            ThreadDemo td = new ThreadDemo();

            //1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
            FutureTask<Integer> result = new FutureTask<>(td);

            new Thread(result).start();

            //2.接收线程运算后的结果
            try {
                Integer sum = result.get();  //FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
                System.out.println(sum);
                System.out.println("------------------------------------");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

    }

    class ThreadDemo implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int sum = 0;

            for (int i = 0; i <= 100000; i++) {
                sum += i;
            }

            return sum;
        }


}
