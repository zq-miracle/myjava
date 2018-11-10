package string;

/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/8/10$ 20:19$
 * @Version: 1.0
 *
 * 线程不安全，不保证同步
 * 默认初始容量为16位数组
 * 若构造方法中有字符串或字符数组，则初始长度为字符串长度或字符数组长度+16.
 * 扩容:
 * newCapacity = (oldCapacity << 1) + 2;(两倍加2)
 */

public class ZQ_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println((16<<1)+2);
        System.out.println((20<<1)+2);
    }
}
