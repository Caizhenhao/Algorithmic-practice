package Queue;

/**
 * 数组实现“队列”，只能存储int数据
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/10/21
 * Time:10:50
 */
public class ArrayQueue {

    private int[] mArray;
    private int mCount;

    public ArrayQueue(int sz) {
        mArray = new int[sz];
        mCount = 0;
    }

    //将val添加到队列的末尾
    public void add(int val) {
        if (mCount+1<=mArray.length)
            mArray[mCount++] = val;
        else
            System.out.println("队列已满");
    }

    //返回“队列开头元素”
    public int front() {
        return mArray[0];
    }

    //返回“队首元素值”，并删除“队首元素”
    public int pop() {
        int ret = mArray[0];
        mCount--;
        for (int i=1;i<=mCount;i++)
            mArray[i-1] = mArray[i];
        return ret;
    }

    //返回队列的大小
    public int size() {
        return mCount;
    }

    //返回队列是否为空
    public boolean isEmpty() {
        return size()==0;
    }

    public static void main(String[] args) {
        int tmp=0;
        ArrayQueue aqueue = new ArrayQueue(12);

        //将10，20，30依次推入队列中
        aqueue.add(10);
        aqueue.add(20);
        aqueue.add(30);

        //将“队首元素”赋值给tmp，并删除“队首元素”
        tmp=aqueue.pop();
        System.out.printf("tmp=%d\n",tmp);

        //只将“队首”赋值给tmp。不删除该元素
        tmp=aqueue.front();
        System.out.printf("tmp=%d\n",tmp);

        aqueue.add(40);

        for (int i=0;i<13;i++)
            aqueue.add(i*10);

        System.out.printf("isEmpty()=%b\n",aqueue.isEmpty());
        System.out.printf("size()=%d\n",aqueue.size());

        while (!aqueue.isEmpty())
            System.out.println(aqueue.pop());

    }























}
