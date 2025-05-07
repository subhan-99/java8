package StreamAPI;

	import java.util.*;
	 import java.util.stream.*;
	 public class MapCollect {
			

	 public static void main(String[] args) {
	 ArrayList<String> l = new ArrayList<String>();
	 l.add("khan"); l.add("subhan"); l.add("waqas"); l.add("zaid"); l.add("sohail");
	 System.out.println(l);
	 List<String> l2 = l.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
	 System.out.println(l2);
	 }
	 }
	
	
	


