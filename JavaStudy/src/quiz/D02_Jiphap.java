package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Jiphap {

	/*
		1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		   [1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
		
		2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		   [1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
		
		3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
		   [1, 2, 3] - [2, 3, 4, 5] => [1]
		   [2, 3, 4, 5] - [1, 2, 3] => [4, 5] 
	 */
	
	// 1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	public static Set union(Collection a, Collection b) {
		// Set은 인터페이스이기 때문에 인스턴스화 불가능
		// 따라서 HashSet으로 변환
		Set hap = new HashSet<>();	
		
		hap.addAll(a);
		hap.addAll(b);
		
		return hap;
	}
	
	// 2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	public static Set intersection(Collection a, Collection b) {
		Set inter = new HashSet<>();

		inter.addAll(a);
		inter.retainAll(b); //교집합
		
//		for (Object o : a) {
//			for (Object o2 : b) {
//				if (o.equals(o2)) {
//					inter.add(o);
//				}
//			}
//		}
		
		return inter;
	}
	
	// 3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	public static Set difference(Collection a, Collection b) {
		Set diff = new HashSet<>();
		
		diff.addAll(a);
		diff.removeAll(b);
		
		return diff;
	}
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		Set<String> b = new HashSet<>();
		
		a.add("apple");
		a.add("banana");
		a.add("banana");
		a.add("orange");
		
		b.add("banana");
		b.add("banana");
		b.add("banana");
		b.add("kiwi");
		b.add("grape");
		
		List<Integer> c = new ArrayList<>();
		Set<Integer> d = new HashSet<>();
		
		c.add(1);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		
		// a,c는 List이기 때문에 중복가능
		// b,d는 Set이기 때문에 중복 불가능		
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
		
		// Set로 출력되는 메서드를 사용했기 때문에 중복값 출력X
		System.out.println("Union A, B: " + union(a, b));
		System.out.println("Union A, C: " + union(a, c));
		System.out.println("Union C, D: " + union(c, d));
		
		System.out.println("Intersection A, B: " + intersection(a, b));
		System.out.println("Intersection C, D: " + intersection(c, d));
		
		System.out.println("Diff A, B: " + difference(a, b));
		System.out.println("Diff B, A: " + difference(b, a));
		System.out.println("Diff C, D: " + difference(c, d));
		
	}
	
}
