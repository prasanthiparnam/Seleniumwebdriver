package Demostring;

       import java.util.*;

		public class Duplicatewords{
		    public static void main(String[] args) {
		        String str = "java python apple orange java python java";
		        String[] words = str.split(" ");
		        Map<String, Integer> map = new LinkedHashMap<>();

		        for (String word : words) {
		            map.put(word, map.getOrDefault(word, 0) + 1);
		        }

		        System.out.println("Duplicate words in order:");
		        for (String word : map.keySet()) {
		            if (map.get(word) > 1) {
		                System.out.println(word + " → " + map.get(word));
		            }
		        }
		    }
		}


