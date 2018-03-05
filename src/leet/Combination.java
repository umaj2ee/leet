package leet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
	static List<Integer> lst=new ArrayList<Integer>();
    public static void main(String[] args){
        int[] arr = {0,1,2,3};
        combinations2(arr, 3, 0, new int[3]);
    }

    static void combinations2(int[] arr, int len, int startPosition, int[] result){
        if (len == 0){
            System.out.println(Arrays.toString(result));
            return;
        }       
        for (int i = startPosition; i <= arr.length-len; i++){
            result[result.length - len] = arr[i];
            combinations2(arr, len-1, i+1, result);
        }
    }       
}