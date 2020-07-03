package com.koreait.second;

public class Gugudan {

	public static void main(String[] args) {
		gugudan(2, 5);
		
		int sum = sum(1, 2); //3
		sum = sum(1, 2, 3); //6
		sum = sum(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12); //다 더한값 ㅋㅋ
		
		int result = Utils.parseStringToInt("10", 0); //10정수값 리턴
		System.out.println("result (1): " + result);
		result = Utils.parseStringToInt("aa10", 1);//파싱할 수 없을 때 두번째 인자값 리턴
		System.out.println("result (2): " + result);
		result = Utils.parseStringToInt("aa10"); //0리턴
		System.out.println("result (3): " + result);
		result = Utils.parseStringToInt("9"); //9리턴
		System.out.println("result (4): " + result);
		
		int[] arr = {4, 5, 11, 223, 3, 10};
		
		Utils.sortASC(arr); //오름차순 정렬
		Utils.printArr(arr); //[3, 4, 5, 10, 11, 223]
		Utils.sortDESC(arr); //내림차순 정렬
		Utils.printArr(arr); //[223, 11, 10, 5, 4, 3]
		
		int[] rArr = Utils.createRandomArr(1, 9, 5); 
		//1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오.		
		Utils.printArr(rArr);
		
		rArr = Utils.createRandomArr(5, 15, 10); 
		//5~15 랜덤한 값을 10칸 가지는 정수형 배열을 리턴하시오.
		Utils.printArr(rArr);
		
		//랜덤한 숫자가 나올 수 있는 범위보다 큰 칸을 요구하는 경우 null을 리턴
		rArr = Utils.createRandomArrNoDuplication(5, 15, 13);
		Utils.printArr(rArr); //null이 넘어오면 "arr is null"을 출력
		
		rArr = Utils.createRandomArrNoDuplication(5, 15, 11);
		Utils.printArr(rArr); 
		
		String star = makeStarTriangle(8); //결과값 문자열로 넘기기
		System.out.println(star);
		// "*\n**\n***\n****\n*****\n"
		
		//*
		//**
		//***
		//****
		//*****
	}
	
	public static String makeStarTriangle(int star) {
		String str = "";
		for(int i=0; i<star; i++) {
			for(int z=0; z<=i; z++) {
				str += "*";
			}
			str += "\n";
		}
		
		return str;
	}

	public static int sum(int...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void gugudan(int sIdx, int eIdx) {
		
	}
}




