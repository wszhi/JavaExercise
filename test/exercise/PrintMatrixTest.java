package exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrintMatrixTest {
    @Test
    public void should_return_list_which_is_sorted() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9},
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)), result);

    }

    @Test
    public void should_return_list2() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), result);

    }

    @Test
    public void should_return_list3() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {16, 15, 14, 13, 12, 11, 10, 9}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)), result);

    }

    @Test
    public void should_return_list4() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), result);

    }

    @Test
    public void should_return_list5() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {0, 1},
                {15, 2},
                {14, 3},
                {13, 4},
                {12, 5},
                {11, 6},
                {10, 7},
                {9, 8}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)), result);

    }

    @Test
    public void should_return_list6() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1, 2},
                {4, 3}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), result);
    }

    @Test
    public void should_return_list7() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1)), result);
    }

    @Test
    public void should_return_list_when_print_matrix() throws Exception {
        PrintMatrix printMatrix = new PrintMatrix();
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ArrayList<Integer> result = printMatrix.printMatrix(matrix);
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)), result);
    }
}