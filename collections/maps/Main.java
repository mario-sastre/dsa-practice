import java.util.HashMap;
import java.util.Map;

public class Main{
  
  public static int[] twoSum(int[] numbers, int target){
    HashMap<Integer, Integer> seen = new HashMap<>();
   
    for(int i = 0; i < numbers.length; ++i){
      int complement = target - numbers[i];
      if(seen.containsKey(complement)){
        return new int[]{seen.get(complement), i};
      }
      seen.put(numbers[i], i);
    }
    return new int[]{};
  }

  public static void getFrequency(int[] numbers){
    HashMap<Integer, Integer> freq = new HashMap<>();
   
    for(int n : numbers){
      freq.put(n, freq.getOrDefault(n, 0) + 1);
    }

    for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
      System.out.println("Value: " + entry.getKey() + " frequency: " + entry.getValue());
  
    }
  }

  public static void main(String[] args){
    // frequency counter
    int[] numbers = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 7, 9, 8, 9};
  
    // calling the frequency method
    getFrequency(numbers);
    
    // calling 2 sum for 2,7,11,15 and target = 9 
    int[] nums = {2,7,11,15};
    int[] res = twoSum(nums, 9);

    System.out.println("Response: {" + res[0] + ", " + res[1] + "}");
  }
}
