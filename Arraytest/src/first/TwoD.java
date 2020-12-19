package first;

public class TwoD {

	public static void main(String[] args) {
		int x[]= {2,3,4,5};
		int y[]= {4,3,8,9};
		int z[]= {1,0,3,5};
		int p[][]= {
				{2,3,4,5},
				{4,3,8,9},
				{1,0,3,5}
				
		};
//		for(int i[] : p) {
//			for(int j : i) {
//				System.out.print(j +" ");
//			}
//				System.out.println(" ");
//			
//		}
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(p[i][j] + " ");
		}
             System.out.println("");
	}

	}
}
