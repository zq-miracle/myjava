package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/8/10$ 9:56$
 * @Version: 1.0
 *
 * 看源码：
 * ArrayList默认长度为10的数组；
 * 扩容：
 * 调用ensureCapacity(minCapacity)判断是否扩容。
 * 扩容仍调用grow(minCapacity)
 * newCapacity = oldCapacity + (oldCapacity >> 1)(大约在1.5倍左右)
 * 但如果newCapacity - minCapacity <= 0
 * 直接扩容到minCapacity（所需要的最小容量）
 *
 * 有冗余长度仍调用trimToSize()方法。
 *
 * 扩容的代价是很高的，因此在实际使用时，我们应该尽量避免数组容量扩张。
 * 当我们可预知要保存元素的多少时，就在构造ArrayList的时候指定其容量。
 *
 * Fail-Fast机制（快速失败机制）：
 * 通过记录modCount参数来实现。面对并发修改迭代器很快就会完全失败。
 *
 * API:
 *
 * List 接口的大小可变数组的实现。
 * 实现了所有可选列表操作，并允许包括 null 在内的所有元素。
 * （此类大致上等同于 Vector 类，除了此类是不同步的)
 */

public class ZQ_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        //System.arraycopy方法
        int[] elementData ={1,2,3,4,5,6};
        System.arraycopy(elementData, 1,
                elementData, 1 + 1,
                3);
        System.out.println(Arrays.toString(elementData));

        //Arrays.copyOf方法
        int[] arr ={1,2,3,4};
        int[] ints = Arrays.copyOf(arr, 8);
        System.out.println(Arrays.toString(ints));

        //左右偏移
        int i=12;
        System.out.println(i>>1);



    }

}
