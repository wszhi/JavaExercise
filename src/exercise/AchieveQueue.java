package exercise;

import java.util.Stack;

/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
思路:栈的特点是先进后出，所以插入的时候只插入到栈1，取的时候把栈1的元素一个一个取出来放到栈2，这样最后一个就是最先进去的元素。
为了保证之后的顺序，需要把剩下的元素重新放回栈1。
 */
public class AchieveQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        Integer currentFirst = stack2.pop();
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return currentFirst;
    }
}
