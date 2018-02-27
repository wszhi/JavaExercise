package recursion;

/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
思路：
对于一个2*n的矩形可以拆分成两种方式，一个是2*(n-1)矩形加上一个竖着的2*1矩形，另一个是2*(n-2)的矩形加上一个横着的2*1矩形，所以使用递归就很方便了
 */
public class RectCover {
    public int rectCover(int target) {
        if (target == 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return rectCover(target - 1) + rectCover(target - 2);
        }
    }
}
