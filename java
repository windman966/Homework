package myjava;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		 
		
		//1번 함수생성
		 int[] list = makeList();
		 //2번 인덱스가 홀수인 수들을 출력하는 함수 정의
		 evennumber(list);
		 
		 //3번 배열의 수들의 합을 반환하는 함수 정의
		 int sum = makesum(list);
		 
		 //4번 가장 작은 수의 위치를 반환하는 함수
		 int minimumnumber = minimumindex(list);
		 System.out.println(minimumnumber);
		 
		 //5번 3의 배수만을 새로운 배열에 복사하여 리턴하는 함수
		 ArrayList<Integer> triple = triple(list);
		 
		 //추가 문제 배열의 수들을 한줄에 10개씩 출력하는 함수. 이때 각 수들은 줄이 맞춰져야함.
		 printten(list);
		
	}	
	
	 public static int[] makeList() {
		 int[] result = new int[100];
		 for(int i=0; i<result.length; i++) {
			 int temp = (int)(Math.random()*999);
			 result[i] = temp;
		 }
		 return result;
	 }

	 public static int makesum(int[] list) {
		 int sum = 0;
		 
		 for(int i=0; i < list.length; i++) {
			 sum += list[i];
		 }
		return sum;
	 }
	 
	 public static void evennumber(int[] list) {
		for(int i = 0; i<=list.length-1; i++) {
			if(list[i]%2==0) {
				System.out.println(list[i]);
			}
		}	 
	 }
	 
	 
	 public static int minimumindex(int[] list) {
		
		int minimum=1000;
		 
		for(int i = 0; i<=list.length-1; i++) {
			int min = list[0];
			if (min > list[i]) {
				minimum = i;
			}
			}
	
		return minimum; 
	 } 
	 
	 public static ArrayList triple(int[] list) {
		 ArrayList<Integer> triple = new ArrayList<Integer>();
		 for(int i = 0; i<=list.length-1; i++) {
			if(list[i]%3==0) {
				triple.add(list[i]);
			} 
		 }
		 return triple;
		 
	 }
	 
	 public static void printten(int[] list) {
		 for(int i = 0; i<=list.length-1; i++) {
			 
			 if(i%10 == 0) {
				 System.out.println(' ');
			 } else {
				 System.out.print(list[i] + " ");
				 
			 }
		 }
	 }
}
