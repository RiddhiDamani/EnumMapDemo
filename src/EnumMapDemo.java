import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;


public class EnumMapDemo {
	
	// Defined Enum - Has 5 Enum Elements
	public enum Month {
		JAN, FEB, MAR, APR, MAY
	}

	public static void main(String[] args) {
		/*
		 * Creates an empty enum map with the specified key type. enumMap is an object that accepts Month as a Key and 
		 * Value as a string
		 */
		EnumMap<Month, String> enumMap = new EnumMap<Month, String>(Month.class);
		
		enumMap.put(Month.JAN, "January month is cool");
		enumMap.put(Month.FEB, "February month is cool");
		enumMap.put(Month.MAR, "March month is less hot");
		enumMap.put(Month.MAY, "May month is hot");
		
		System.out.println("enumMap = " + enumMap);
		/*
		 * Copies all of the mappings from the specified map to this map. These mappings will replace any mappings that
		 * this map had for any of the keys currently in the specified map
		 */
		EnumMap<Month, String> enumMap1 = new EnumMap<Month, String>(Month.class);
		enumMap1.putAll(enumMap);
		System.out.println("EnumMap1 = " + enumMap1);
		/*
		 * Returns: a collection view of the values contained in this map
		 */
		Collection<String> collection = enumMap1.values();
		System.out.println(collection);
		System.out.println("Before remove enum map1 = " + enumMap1);
		
		/*
		 * Removes the mapping for this key from this map if present
		 * Parameters:
		 * key - the key whose mapping is to be removed from the map
		 * Returns - the previous value associated with specified key, or null if there was no entry for key
		 */
		String valueOfTheRemovedKey = enumMap1.remove(Month.MAR);
		System.out.println("After remove, enumMap = " + enumMap1);
		System.out.println("ValueOfTheRemovedKey = " + valueOfTheRemovedKey);
		
		/*
		 * Returns the number of key-value mappings in this map
		 */
		int size = enumMap.size();
		System.out.println("Size = " + size);	
		/* 
		 * Parameters:
		 * Key - the key whose presence in this map is to be tested
		 * Returns true if this map contains a mappin for the specified key.
		 */
		boolean isKeyExists = enumMap.containsKey(Month.APR);
		System.out.println("isKeyExists = " + isKeyExists);
		/* 
		 * Parameters:
		 * value - the value whose presence in this ma is to be tested
		 * Returns true if this map maps one or more keys to the specified value.
		 */
		boolean isValueExists = enumMap.containsValue("March month is less");
		System.out.println("isValueExists = " + isValueExists);
		/*
		 * Returns: a set of view of the mappings contained in this enum map
		 */
		Set<Map.Entry<Month, String>> set = enumMap.entrySet();
		System.out.println("Set = " + set);
		//
		/*
		 * Parameters: get method of enum object and passing the key - month.jan
		 * Key - the key whose associated value is to be returned
		 * Returns - the value to which the specified key is mapped, or null if this map contains no mapping for the key
		 */
		String value = enumMap.get(Month.JAN);
		System.out.println("Value = " + value);
		/*
		 * Returns a set view of the keys contained in the map
		 */
		Set<Month> set1 = enumMap.keySet();
		System.out.println("Set = " + set1);
		System.out.println("Before clear, enumMap = " + enumMap);
		/*
		 * Removes all mappings from this map
		 */
		enumMap.clear();
		System.out.println("After clear, enumMap = " + enumMap);
	}

}
