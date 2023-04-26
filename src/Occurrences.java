import java.util.HashMap;

public class Occurrences {
    public static void main(String[] args) {

        int[] intArr = {1,1,2,4,5,6,7,7,4,8,9,3,5,6,7};

        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();

        for (int num: intArr){
            if (intMap.containsKey(num)){
                int currentCount = intMap.get(num);
                intMap.put(num, ++currentCount);
            } else {
                intMap.put(num, 1);
            }
        }

        System.out.println(intMap);
    }
}
