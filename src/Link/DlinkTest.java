package Link;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/10/19
 * Time:20:48
 */
public class DlinkTest {

    //双向链表操作int数据
    private static void int_test() {
        int[] iarr={10,20,30,40};

        System.out.println("\n----int_test----");
        //创建双向链表
        DoubleLink<Integer> dlink = new DoubleLink<Integer>();

        dlink.insert(0,20);
        dlink.appendLast(10);
        dlink.insertFirst(30);

        //双向链表是否为空
        System.out.println("isEmpty()="+dlink.isEmpty());

        //双向链表的大小
        System.out.println("size()="+dlink.size());

        //打印出全部的节点
        for (int i=0;i<dlink.size();i++)
            System.out.println("dlink("+i+")="+dlink.get(i));

    }

    public static void main(String[] args) {
        int_test();
    }
}
