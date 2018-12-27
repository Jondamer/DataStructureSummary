package com.zzt.StringLearningSummary;
/**
 * 
 * @author zhengzhentao
 * 总结：

当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

1.使用String类的场景：在字符串不经常变化的场景中可以使用String类，例如常量的声明、少量的变量运算。 
2.使用StringBuffer类的场景：在频繁进行字符串运算（如拼接、替换、删除等），并且运行在多线程环境中，则可以考虑使用StringBuffer，例如XML解析、HTTP参数解析和封装。 
3.使用StringBuilder类的场景：在频繁进行字符串运算（如拼接、替换、和删除等），并且运行在单线程的环境中，则可以考虑使用StringBuilder，如SQL语句的拼装、JSON封装等。


times=90000时的运行时间对比
操作java.lang.String类型使用的时间为：10754毫秒
操作java.lang.StringBuffer类型使用的时间为：6毫秒
操作java.lang.StringBuilder类型使用的时间为：3毫秒
字符串直接相加操作：1毫秒
字符串间接相加操作：12毫秒

 */
public class PerformanceOfStringAndStringBuilderAndStringBuffer {
    private static int time = 90000;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
        test1String();
        test2String();
    }
     
     
    public static void testString () {
        String s="";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            s += "java";
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+s.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void testStringBuffer () {
        StringBuffer sb = new StringBuffer();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+sb.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void testStringBuilder () {
        StringBuilder sb = new StringBuilder();
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            sb.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作"+sb.getClass().getName()+"类型使用的时间为："+(over-begin)+"毫秒");
    }
     
    public static void test1String () {
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = "I"+"love"+"java";
        }
        long over = System.currentTimeMillis();
        System.out.println("字符串直接相加操作："+(over-begin)+"毫秒");
    }
     
    public static void test2String () {
        String s1 ="I";
        String s2 = "love";
        String s3 = "java";
        long begin = System.currentTimeMillis();
        for(int i=0; i<time; i++){
            String s = s1+s2+s3;
        }
        long over = System.currentTimeMillis();
        System.out.println("字符串间接相加操作："+(over-begin)+"毫秒");
    }
     
}
