package com.test;

import java.util.Comparator;

public class ComparatorImperativeVsDeclarativeApproach {

	public static void main (String [] args) {
		//Imperative Approach
		Comparator<Integer> comparator=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);   //0  ->o1==o2
				                           //1  ->o1>o2
				                           //-1 ->o1<o2
			}		
		};
		System.out.println(comparator.compare(1,1));
		System.out.println(comparator.compare(2,1));
		System.out.println(comparator.compare(1,2));

		//Declarative Approach
		Comparator<Integer> comparator2=(Integer i1,Integer i2)->i1.compareTo(i2);
		System.out.println(comparator2.compare(1,1));
		System.out.println(comparator2.compare(2,1));
		System.out.println(comparator2.compare(1,2));
	}
}
