package maps;
import java.util.*; 

public class Inclass {
	public static void main(String[] args) 
	{
		
	//part 1
		
	Set<String> set1=new LinkedHashSet<>();
	Set<String> set2=new LinkedHashSet<>();
	set1.add("Apple"); set1.add("Banana"); set1.add("Cherry"); set1.add("Orange"); set1.add("plum"); set1.add("Watermelon"); set1.add("Nectarine");
	System.out.println("Contains Apple? "+set1.contains("Apple"));
	System.out.println("Contains Banana? "+set1.contains("Banana"));
	
	set2.add("Banana"); set2.add("Cherry"); set2.add("Pineapple"); set2.add("Plum"); set2.add("Blueberry");
	
	System.out.println("Set1: ");
	for(String s: set1)
	{
		System.out.println("Hashcode of "+s+" is: "+s.hashCode());
	}
	System.out.println("Set2: ");
	for(String s: set2)
	{
		System.out.println("Hashcode of "+s+" is: "+s.hashCode());
	}
	
	System.out.println("\nCustom hash code and collisions:");
    Set<Integer> hashSet = new LinkedHashSet<>();
    for (String fruit : set1) {
        int hash = hashfruit(fruit);
        System.out.println(fruit + " -> " + hash);
        if (!hashSet.add(hash)) {
            System.out.println("Collision detected for hash " + hash);
        }
    }
    for (String fruit : set2) {
        int hash = hashfruit(fruit);
        System.out.println(fruit + " -> " + hash);
        if (!hashSet.add(hash)) {
            System.out.println("Collision detected for hash " + hash);
        }
    }

	
	Set<String> unionSet=new LinkedHashSet<>(set1);
	unionSet.addAll(set2);
	System.out.println("Union of sets: "+unionSet);
	
	Set<String> intersectionSet=new LinkedHashSet<>(set1);
	unionSet.retainAll(set2);
	System.out.println("Intersection of sets: "+intersectionSet);
	
	Set<String> differenceSet=new LinkedHashSet<>(set1);
	unionSet.removeAll(set2);
	System.out.println("Difference of sets: "+differenceSet);
	
	//Part 2
	
	Map<Integer, String> map1 = new HashMap<>();
    map1.put(1, "HTML");
    map1.put(2, "CSS");
    map1.put(3, "JAVA");
    map1.put(4, "PYTHON");

   
    System.out.println("Map contains 'HTML': " + map1.containsValue("HTML"));

    System.out.println("Map contains key 1: " + map1.containsKey(1));

    System.out.println("\nKey-Value pairs in the map:");
    map1.forEach((key, value) -> System.out.println(key + " -> " + value));

    Set<Integer> keys = map1.keySet();
    System.out.println("\nKeys in the map: " + keys);

    System.out.println("Values in the map: " + map1.values());
	
	}
	
	public static int hashfruit(String fruit) {
        return fruit.length();
	}

}
