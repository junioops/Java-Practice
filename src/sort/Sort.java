package sort;
import java.util.*;
class defination {
    private int g = 0;
    int greatest(int[] arr, int pos) {
        if(pos < 0) return g;
        else if(arr[pos] > g) g = arr[pos];
        greatest(arr, --pos);
        return g;
    }
    private int count = 0, sortArr[];
    ArrayList<Integer> finalArray = new ArrayList<>();
    void sortDesc(int[] arr) {
        if (count < arr.length) {
            if(count == 0) sortArr = arr;
            finalArray.add(greatest(sortArr, arr.length - 1));
            for(int i = 0; i < sortArr.length; i++)
                if(sortArr[i] == greatest(sortArr, arr.length - 1))
                    sortArr[i] = 0;
            ++count;
            sortDesc(sortArr);
        }
        else for(int i : finalArray) System.out.println(i);
    }
}
class sort {
    public static void main(String args[]) {
        defination x = new defination();
        int y[] = {10, 3, 4, 1, 9, 8};
        x.sortDesc(y);
    }
}