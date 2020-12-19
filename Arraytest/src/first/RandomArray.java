package first;

import java.util.Random;

public class RandomArray {
	public static void main(String[] args) {
		Random r=new Random();
		int a[]=new int[20];
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt(50);
		}
		try {
			System.out.println(a[21]);
		} catch (Exception e) {
			System.out.println("Max size crossed");
		}
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
	}
	}


