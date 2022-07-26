package StreamAPI_Java8_Feature;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		/**filter(predicate)
		 * it'll return boolean type;
		 */
		List<String> name=List.of("Aman","Abhinav","DK");
		List newName = name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newName);
		
		//using :: reference colon
		
		name.stream().forEach(System.out::println);
		
		
	
	/** map(function)
	 * each element operation.
	 */
		List<Integer> number=List.of(23,4,2,5,7,4);
		List<Integer> newNumber=number.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println("Using map : "+newNumber);
		
		//sorted
		
		number.stream().sorted().forEach(System.out::println);
		Integer integer = number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("MinValue : "+integer);
	}

}
