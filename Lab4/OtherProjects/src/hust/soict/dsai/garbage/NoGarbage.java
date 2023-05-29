package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NoGarbage {
	public static void main(String[] args) {
	    String filename = "ConcatenationInLoops";
	    List<String> inputText = Arrays.asList(null);
	    long startTime, endTime;
	    try {
	        inputText = Files.readAllLines(Paths.get(filename));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    startTime = System.currentTimeMillis();
	    StringBuilder outputStringBuilder = new StringBuilder();
	    for (String b: inputText) {
	        outputStringBuilder.append(b);
	    }
	    endTime = System.currentTimeMillis();
	    System.out.println(endTime - startTime);
	}
}
