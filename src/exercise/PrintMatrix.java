package exercise;

import java.util.ArrayList;


/*
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
 */
public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        printOneRowOrColumn(matrix, new Node(0, 0), Direction.RIGHT, result);
        return result;

    }

    public enum Direction {RIGHT, LEFT, UP, DOWN}

    public class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void printOneRowOrColumn(int[][] matrix, Node from, Direction direction, ArrayList<Integer> result) {
        switch (direction) {
            case RIGHT:
                int y = 0;
                for (int j = from.y; j < matrix[from.x].length; j++) {
                    int currentNodeValue = matrix[from.x][j];
                    if (currentNodeValue == -1) {
                        y = j - 1;
                        break;
                    }
                    result.add(currentNodeValue);
                    matrix[from.x][j] = -1;
                    y = j;
                }
                if (from.x + 1 >= matrix.length || matrix[from.x + 1][y] == -1) return;
                printOneRowOrColumn(matrix, new Node(from.x + 1, y), Direction.DOWN, result);
                break;
            case DOWN:
                int x = 0;
                for (int i = from.x; i < matrix.length; i++) {
                    int currentNodeValue = matrix[i][from.y];
                    if (currentNodeValue == -1) {
                        x = i - 1;
                        break;
                    }
                    result.add(currentNodeValue);
                    matrix[i][from.y] = -1;
                    x = i;
                }
                if (from.y - 1 < 0 || matrix[x][from.y - 1] == -1) return;
                printOneRowOrColumn(matrix, new Node(x, from.y - 1), Direction.LEFT, result);
                break;
            case LEFT:
                y = from.y;
                for (int j = from.y; j >= 0; j--) {
                    int currentNodeValue = matrix[from.x][j];
                    if (currentNodeValue == -1) {
                        y = j + 1;
                        break;
                    }
                    result.add(currentNodeValue);
                    matrix[from.x][j] = -1;
                    y = j;
                }
                if (matrix[from.x - 1][y] == -1) return;
                printOneRowOrColumn(matrix, new Node(from.x - 1, y), Direction.UP, result);
                break;
            case UP:
                x = from.x;
                for (int i = from.x; i >= 0; i--) {
                    int currentNodeValue = matrix[i][from.y];
                    if (currentNodeValue == -1) {
                        x = i + 1;
                        break;
                    }
                    result.add(currentNodeValue);
                    matrix[i][from.y] = -1;
                    x = i;
                }
                if (matrix[x][from.y + 1] == -1) return;

                printOneRowOrColumn(matrix, new Node(x, from.y + 1), Direction.RIGHT, result);
                break;
            default:
                return;
        }
    }
}
