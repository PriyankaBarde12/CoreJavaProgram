package com.collectionArrayList;

import java.util.ArrayList;

public class ArraylistExample 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<>();
		l.add(89);
		l.add(4);
		l.add(7);
		l.add(90);
		l.add(6);
		l.add(7);
		l.add(3,55);
		l.add(null);
		l.add(0);
		
		//l.remove(1);
		//l.remove((Integer)55);
		//System.out.println("remove ind : "+l);
		
		//l.clear();
		System.out.println(l);
		ArrayList<Integer> list2 =new ArrayList();
		list2.add(89);
		list2.add(4);
		list2.add(7);
		list2.add(90);
		list2.add(7);
		list2.add(6);
		list2.add(3,55);
		list2.add(678);
		list2.add(66);
		list2.add(23);
		list2.add(1);
		list2.add(7);
		list2.add(9);
		list2.add(90);
		//list2.addAll(l);
		
	//	System.out.println(list2);
		/*System.out.println("List 1 "+l);

		System.out.println("List 2 "+list2);
		boolean result =l.retainAll(list2); //intersection println*/
		//System.out.println();
		/*System.out.println("Result of retain : " +result+"  "+l);
		System.out.println(" Check two List Same : "+list2.equals(l)); 
		System.out.println("Hashcode  "+l.hashCode());
		System.out.println(list2.removeAll(l)); // remove common elements(difference)
		System.out.println(list2);
		System.out.println(l.iterator()); //return java.util.ArrayList$Itr@515f550a*/
		
		
		System.out.println(l.listIterator());
		System.out.println(l);
		
		
		System.out.println(l.spliterator());
		System.out.println(l);
		
		System.out.println(l.toString()+" \n split ite : "+l+"\n "+l.subList(4, 6)+" subList : "+l);
		
	}

}
