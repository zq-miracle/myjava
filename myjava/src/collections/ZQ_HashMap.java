package collections;

import java.util.HashMap;
import java.util.Set;

/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/8/11$ 15:33$
 * @Version: 1.0
 * <p>
 * HashMap数据结构:
 * 哈希表：数组+链表+红黑树
 * 底层是一个数组结构，数组中每一项又是一个链表。
 * <p>
 * 基于哈希表的 Map 接口的实现。此实现提供所有可选的映射操作，并允许使用 null 值和 null 键。
 * （除了非同步和允许使用 null 之外，HashMap 类与 Hashtable 大致相同。）
 * 此类不保证映射的顺序，特别是它不保证该顺序恒久不变。
 * <p>
 * HashMap 的实例有两个参数影响其性能：
 * 初始容量 和加载因子。容量 是哈希表中桶的数量，初始容量只是哈希表在创建时的容量。
 * 加载因子 是哈希表在其容量自动增加之前可以达到多满的一种尺度。
 * 当哈希表中的条目数超出了加载因子与当前容量的乘积时，则要对该哈希表进行 rehash 操作（即重建内部数据结构），
 * 从而哈希表将具有大约两倍的桶数。
 * <p>
 * <p>
 * <p>
 * 通常，默认加载因子 (.75) 在时间和空间成本上寻求一种折衷。
 * 加载因子过高虽然减少了空间开销，但同时也增加了查询成本（在大多数 HashMap 类的操作中，包括 get 和 put 操作，都反映了这一点）。
 * 在设置初始容量时应该考虑到映射中所需的条目数及其加载因子，以便最大限度地减少 rehash 操作次数。
 * 如果初始容量大于最大条目数除以加载因子，则不会发生 rehash 操作。
 * <p>
 * <p>
 * 如果Map中的key-value对数量超过了极限
 * 把table对象的长度扩充到原来的2倍。
 * <p>
 * HashMap底层数组的长度总是2的n次方，这是HashMap在速度上的优化
 * <p>
 * 当size达到了变量threshold=capicity*loadFactor。扩容
 * HashMap中的元素个数超过数组大小*loadFcator时，需要扩容。默认情况初始数组为16，负载因子为0.75。所以当超过12的时候，扩容成原来的两倍32.
 * 当HashMap扩容（resize）时，需要重新哈希（rehash）
 * <p>
 * 负载因子衡量是一个散列表的空间的使用程度，负载因子越大表示散列表的装填程度越高，反之越小。
 * 对于使用链表法的散列表来说，查找一个元素的平均空间的利用更充分，然而后果是查询效率降低。
 * 如果负载因子太小，那么散列表的数据将过于稀疏，对空间严重浪费
 * <p>
 * <p>
 * 根据元素自身提供的hashcode计算出散列值，该散列值就是数组下标
 * static final int hash(Object key) {
 * int h;
 * return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
 */

public class ZQ_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("张琦","cc");
        Set<String> strings = hashMap.keySet();
        for (String string : strings) {
//            System.out.println(string.hashCode());
            int h=string.hashCode();
            System.out.println(h);
            System.out.println(h >>> 16);
            int i = (h = string.hashCode()) ^ (h >>> 16);
            System.out.println(i);

        }



    }
}
