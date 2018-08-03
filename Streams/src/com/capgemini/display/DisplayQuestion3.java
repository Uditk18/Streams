package com.capgemini.display;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(1,2,2,10,5,6,7,8,9,10,11,12,13,144,24,100,1000,200);
		int i;
		
		/*Display the list*/
		System.out.println("Elements in the list are : ");
		for(Integer list1 : num){
			System.out.print(list1+"  ");
		}
		
		/*Display all the even numbers in the list*/
		List<Integer> isEven=num.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("\nEven numbers in the list are: "+isEven);

		/*Display all the odd numbers in the list*/
		List<Integer> isOdd=num.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Odd numbers in the list are: "+isOdd);
		
		/*Display all the numbers divisible by 6 in the list*/
		List<Integer> isDivisibleBy6=num.stream().filter(n->n%6==0).collect(Collectors.toList());
		System.out.println("Numbers divisible by 6 in the list are: "+isDivisibleBy6);
		
		/*Display all the numbers less than 12 in the list*/
		List<Integer> isLessThan12=num.stream().filter(n->n<12).collect(Collectors.toList());
		System.out.println("Numbers less than 12 in the list are: "+isLessThan12);
		
		/*Display all the numbers greater than 50 in the list*/
		List<Integer> isGreaterThan50=num.stream().filter(n->n>50).collect(Collectors.toList());
		System.out.println("Numbers less than 12 in the list are: "+isGreaterThan50);
	}

}
