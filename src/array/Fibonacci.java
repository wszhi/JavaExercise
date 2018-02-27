package array;

/*
现在要求输入一个整数n，请你输出斐波那契数列的第n项。
n<=39
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
