import java.util.Map;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap();
    
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Mercury", 1);
    map.put("Venus", 2);
    map.put("Mars", 3);

    // Get the value associated with a given key in the Map
    Integer closestPlanet = map.get("Mercury");
    System.out.println(closestPlanet);

    // Find the size (number of key/value pairs) of the Map
    int numOfPlanets = map.size();
    System.out.println(numOfPlanets);
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    
    map.replace("Mars", 4);
    Integer ourPlanet = map.get("Mars");
    System.out.println(ourPlanet);
    int newNumOfPlanets = map.size();
    System.out.println(newNumOfPlanets);

    // Check whether the Map contains a given key
    boolean hasMars = map.containsKey("Mars"); 
    System.out.println(hasMars);

    // Check whether the Map contains a given value
    boolean hasFive = map.containsValue(5);
    System.out.println(hasFive);
    // Iterate over the keys of the Map, printing each key
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey());
  }
    // Iterate over the values of the map, printing each value
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getValue());
  }
    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
  }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
