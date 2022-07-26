package StreamAPI_Java8_Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {
		List<Integer>list1=List.of(2,4,50,21,22,67);
		List evenList=new ArrayList<Integer>();
		for(Integer i:list1) {
			if(i%2==0) {
				evenList.add(i);
			}//end if
		}//end for
		System.out.println(list1);
		System.out.println(evenList);
		
	//using streamAPI
		List<Integer> stream = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("StreamAPI : "+stream);
		
		List<Integer> newList = list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println("More than 10 value :"+newList);
	}

}
