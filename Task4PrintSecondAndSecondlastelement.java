package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4PrintSecondAndSecondlastelement {

	public static void main(String[] args) 
	{
		List<Integer> intList = Arrays.asList(10,45,90,45,23,90,44);
		System.out.println(intList);
		System.out.println();
		int size = intList.size();
		int secEle = intList.get(1);
		int secLastEle = intList.get(size-2);
		List<Integer> outList = new ArrayList<Integer>();
		outList.add(0, secEle);
		outList.add(1, secLastEle);
		System.out.println("Second element and Second last element in the list are : ");
		System.out.println(outList);
		
		
		
		
//		System.out.println("Second element in the list is ");
//		System.out.println(intList.get(1));
//		System.out.println();
//		System.out.println("Second last element in the list is ");
//		System.out.println(intList.get(size-2));

	}

}
