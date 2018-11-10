package calculate;

/**
 * @Description: java类作用描述
 * @Author: zq
 * @CreateDate: 2018/8/19$ 11:21$
 * @Version: 1.0
 */

public class ZQ_calculate {
    public static void main(String[] args) {
/*
位运算符:
    Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
    位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13;它们的二进制格式表示将如下：
        A     = 0011 1100
        B     = 0000 1101
        -----------------
        A & b = 0000 1100
        A | B = 0011 1101
        A ^ B = 0011 0001
        ~A    = 1100 0011
        下表列出了位运算符的基本运算,假设整数变量A的值为60和变量B的值为13：

    操作符	描述	                                                          例子
    ＆	    如果相对应位都是1，则结果为1，否则为0	                         （A ＆ B）  得到12，即 0000 1100
    |	    如果相对应位都是0，则结果为0，否则为1	                         （A | B）   得到61，即 0011 1101
    ^	    如果相对应位值相同，则结果为0，否则为1	                         （A ^ B）   得到49，即 0011 0001
    〜	    按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	             （〜A）     得到-61，即 1100 0011
    << 	    按位左移运算符。左操作数按位左移右操作数指定的位数。	              A << 2    得到240，即 1111 0000
    >> 	    按位右移运算符。左操作数按位右移右操作数指定的位数。	              A >> 2    得到15,  即 1111
    >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
*/


        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);

/*
逻辑运算符
    下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假

    操作符	描述
    &&	    称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。
    ||	    称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。
    ！	    称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。
    短路逻辑运算符
    当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
*/

        boolean A = true;
        boolean B = false;
        System.out.println("a && b = " + (A && B));     //flase
        System.out.println("a || b = " + (A || B));    //true
        System.out.println("!(a && b) = " + !(A && B));     //true

        //短路
        int d = 5;//定义一个变量；
        boolean e = (d < 4) && (d++ < 10);
        System.out.println("使用短路逻辑运算符的结果为" + e);
        System.out.println("d的结果为" + d);


/*
赋值运算符中的几个结合：
操作符	描述
<<=	    左移位赋值运算符	        C <<= 2 等价于C = C << 2
>>=	    右移位赋值运算符	        C >>= 2 等价于C = C >> 2
＆=	    按位与赋值运算符	        C ＆= 2 等价于C = C ＆ 2
^=	    按位异或赋值操作符       	C ^= 2  等价于C = C ^ 2
|=	    按位或赋值操作符	        C |= 2  等价于C = C | 2
*/

        int z = 16;
        int q = 7;
        System.out.println("z = " + z);
        z <<= 2;
        System.out.println("z <<= 2 = " + z);
        z >>= 2;
        System.out.println("z >>= 2 = " + z);
        z >>>= 2;
        System.out.println("z >>>= 2 = " + z);
        z &= q;
        System.out.println("z &= q  = " + z);
        z ^= q;
        System.out.println("z ^= q   = " + z);
        z |= q;
        System.out.println("z |= q   = " + z);
    }
}
