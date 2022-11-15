package assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task1StringListInReverse {

	public static void main(String[] args) 
	{
		List<String> tools = new LinkedList<String>();
		System.out.println("Input:");
		tools =Arrays.asList("Java","Selenium","TestNG","Git","Github");
		System.out.println(tools);
		System.out.println();
		System.out.println("Output:");
		System.out.println("Reverse order of given list is :");
		Collections.reverse(tools);
		System.out.println(tools);
		
	}

}
