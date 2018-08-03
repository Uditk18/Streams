package com.capgemini.isOddPrimePalindrome;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class isOddPrimePalindrome {

	public static void main(String[] args) {
		
List<Integer> num=Arrays.asList(1,2,2,10,5,6,7,8,9,101);
int i;
List<Integer> isEven=num.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.println("Even numbers are: "+isEven);

List<Integer> isOdd=num.stream().filter(n->n%2!=0).collect(Collectors.toList());
System.out.println("Odd numbers are: "+isOdd);


//boolean isPalindrome=num.stream().noneMatch(n->temp.charAt(i) != temp.chatAt(temp.length(0-i-1)).collect(Collectors.toList()));


	}

}
