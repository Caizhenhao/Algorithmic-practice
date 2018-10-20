package Stack;

import java.util.Stack;

/**
 * Create with IntelliJ IDEA
 * Author:CaiZhenhao
 * Data:2018/10/20
 * Time:21:37
 */
public class StackTest {
    public static void main(String[] args) {
        int tmp=0;
        Stack<Integer> astack = new Stack<Integer>();

        //将10，20，30依次推入栈中
        astack.push(10);
        astack.push(20);
        astack.push(30);

        //将“栈顶元素”复制给tmp，并删除“栈顶元素”
        tmp = astack.pop();
        System.out.println("tmp="+tmp);

        //只将“栈顶”赋值给tmp，不删除该元素
        tmp = (int)astack.peek();
        System.out.println("tmp="+tmp);

        astack.push(40);
        while (!astack.empty()) {
            tmp = (int)astack.pop();
            System.out.println("tmp="+tmp);
        }

    }
}
