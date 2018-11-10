package singleton;

/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/10/23$ 19:22$
 * @Version: 1.0
 */

public class Singleton {
    private static volatile Singleton singleton;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if (singleton==null) {
            synchronized (Singleton.class) {
                if (singleton==null) {
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}

