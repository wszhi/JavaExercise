刻意练习

###打印数组的所有子数组
题目：
给出一个数组例如：[10,20,30]。
请写出一个程序，打印数组的所有子数组，例如：[10],[20],[30],[10,20],[10,30],[10,20,30]

思路：
采用递归，把当前的数组加到结果list中，然后remove当前元素，对于剩下元素所组成的数组重复以上操作，对于最后的结果list去重即可。

###斐波那契数列
题目：
现在要求输入一个整数n，请你输出斐波那契数列的第n项。
n<=39

思路:还是使用递归，当n=0的时候返回0，n=1的时候返回1，其余就是之前两项的和

###用两个栈来实现一个队列
题目：
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

思路:栈的特点是先进后出，所以插入的时候只插入到栈1，取的时候把栈1的元素一个一个取出来放到栈2，这样最后一个就是最先进去的元素。
为了保证之后的顺序，需要把剩下的元素重新放回栈1。

###输出旋转数组的最小元素
题目：
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

思路：
默认把第一个设置为最小值，遍历后面的元素，根据旋转数组的特性只要找到一个元素比第一个小，就可以跳出循环了

###青蛙跳台阶
题目：
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

思路：
第1级就是1种方法，第2级是2种方法，后面是前两种的和

题目：
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

思路：
第1级就是1种方法，第2级是2种方法，第3级是1+2+1种方法，后面是前面所有的和+1


###矩形覆盖
题目：
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

思路：
对于一个2*n的矩形可以拆分成两种方式，一个是2*(n-1)矩形加上一个竖着的2*1矩形，另一个是2*(n-2)的矩形加上一个横着的2*1矩形，所以使用递归就很方便了

###根据前序遍历和中序遍历重建二叉树
题目：
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

思路：
根据前序遍历可以知道1是顶部的节点，然后根据中序遍历可知4、7、2是1的左边的节点，剩下的是右边的节点，同理可以递归得到结果
###有序单链表合并
题目：
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

思路：
构造一个新链表，把原来的两个链表的第一个值进行对比，取小的值为新链表第一个值，把这个节点从原来的链表中去掉，新链表当前节点的下一个节点就可以通过递归得到结果了
 
###顺时针打印矩阵
题目：
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下矩阵： 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

思路：
对于一个矩阵打印只有四种，往右横向打印，往下竖向打印，往左横向打印，往上竖向打印，所以只要处理四种情况。
当把一个值放入结果list后，就把原来的位置置为-1作为标志。方便下次判断这个节点是否已经被处理过。
注意临界值跳出递归。