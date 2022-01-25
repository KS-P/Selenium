package udemy;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) {


		List<String> words=Arrays.asList("pen", "coin", "desk", "chair");
		
String word=words.stream().findFirst().get();
System.out.println(word);

		
	}

}
