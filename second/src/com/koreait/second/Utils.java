package com.koreait.second;

public class Utils {
	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);
	}
	
	public static int parseStringToInt(String str, int def) {
		int result = def;
		try {
			result = Integer.parseInt(str);
		}catch(Exception e) {}
		return result;
	}
	
	public static void printArr(int[] arr) {
		if(arr == null) {
			System.out.println("arr is null");
			return;
		}
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.printf(i < arr.length - 1 ? "%d, " : "%d]", arr[i]);
		}
		System.out.println();
	}
	
	public static void sortASC(int[] arr) {
		sort(arr, true);
	}
	
	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}
	
	private static void sort(int[] arr, boolean asc) {
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(asc == (arr[i] > arr[z])) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
				
			}
		}
	}
	
	public static int getRandom(int sVal, int eVal) {
		return (int)(Math.random() * (eVal - sVal + 1) + sVal);
	}
	
	public static int[] createRandomArr(int sVal, int eVal, int len) {
		int[] arr = new int[len];
		for(int i=0; i<arr.length; i++) {
			arr[i] = getRandom(sVal, eVal);
		}
		return arr;
	}
	
	public static int[] createRandomArrNoDuplication(int sVal, int eVal, int len) {
		if((eVal - sVal + 1) < len) {
			return null;
		}
		
		int[] arr = new int[len];
		for(int i=0; i<arr.length; i++) {
			arr[i] = getRandom(sVal, eVal);
			
			for(int z=0; z<i; z++) {
				if(arr[i] == arr[z]) {
					i--;
					break;
				}
			}
		}
		return arr;
	}
}









