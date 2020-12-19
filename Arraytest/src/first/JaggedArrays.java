package first;

public class JaggedArrays {
	public static void main(String[] args) {
		int x[]= {2,3,4};
		int y[]= {4,9};
		int z[]= {1,0,3,5};
		int p[][]= {
				{2,3,4},
				{4,9},
				{1,0,3,5}
				
		};
		for(int i[] : p) {
			for(int j : i) {
				System.out.print(j +" ");
			}
				System.out.println(" ");
			
		}
	}
}
