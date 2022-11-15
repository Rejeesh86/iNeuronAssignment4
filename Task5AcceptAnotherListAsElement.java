package assignment4;

import java.util.ArrayList;
public class Task5AcceptAnotherListAsElement {

	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer> > l1 = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		l1.add(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		l1.add(list2);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
		l1.add(list3);
		
//		System.out.println(l1.size());
//		System.out.println(l1.get(0).size());
		
		for (int i = 0; i < l1.size(); i++) 
		{
            for (int j = 0; j < l1.get(i).size(); j++) 
            {
                System.out.print(l1.get(i).get(j) + " ");
            }
            System.out.println();
		}
	}	 
}
