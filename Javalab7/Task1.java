import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
  
        int[] responses = {
            8, 6, 7, 5, 9, 8, 7, 6, 7, 5,
            8, 9, 6, 7, 8, 5, 6, 7, 8, 9,
            6, 5, 6, 7, 8, 9, 6, 7, 8, 9,
            5, 6, 7, 8, 9, 6, 7, 8, 9, 5
        };

        Map<Integer, Integer> summary = summarizeResponses(responses);

   
        System.out.println("Poll Summary:");
        for (Map.Entry<Integer, Integer> entry : summary.entrySet()) {
            System.out.println("Rating " + entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }


    public static Map<Integer, Integer> summarizeResponses(int[] responses) {
        Map<Integer, Integer> summary = new HashMap<>();

        for (int response : responses) {
            summary.put(response, summary.getOrDefault(response, 0) + 1);
        }

        return summary;
    }
}

  
