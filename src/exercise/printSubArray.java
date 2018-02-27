package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
题目：
给出一个数组例如：[10,20,30]
请写出一个程序，打印数组的所有子数组，例如：[10],[20],[30],[10,20],[10,30],[10,20,30]
思路：
采用递归，把当前的数组加到结果list中，然后remove当前元素，对于剩下元素所组成的数组重复以上操作，对于最后的结果list去重即可。
* */
public class printSubArray {
    private void getAllSubArray(List<Integer> originList, List result) {
        if (originList.size() > 0) {
            result.add(originList);
        }
        for (int i = 0; i < originList.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            temp.addAll(originList);
            temp.remove(new Integer(temp.get(i)));
            getAllSubArray(temp, result);
        }
    }

    private static List removeDuplicate(List list) {
        HashSet set = new HashSet(list);
        ArrayList newList = new ArrayList();
        newList.addAll(set);
        return newList;
    }

    public List printAllSubArray(Integer[] originArray) {
        List<Integer> originList = Arrays.asList(originArray);
        List<List> result = new ArrayList<>();
        this.getAllSubArray(originList, result);
        return this.removeDuplicate(result);
    }

}
