package recursion;


public class JumpFloor {
    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    思路：
    第1级就是1种方法，第2级是2种方法，后面是前两种的和
     */
    public int jumpFloor(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }

    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
    思路：
    第1级就是1种方法，第2级是2种方法，第3级是1+2+1种方法，后面是前面所有的和+1
     */
    public int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            int result = 0;
            for (int i = 1; i < target; i++) {
                result += JumpFloorII(i);
            }
            return result+1;
        }
    }
}
