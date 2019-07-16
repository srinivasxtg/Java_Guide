package etcc.automation.riteAnalysis;

import java.util.Arrays;

public class PrintMatrixFormat {


	int a[][] = {{1,2,3},{3,4,5},{6,7,8}};

	void m1(){
		for(int i=0; i<a.length;i++){

			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+"\t");

			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		 new PrintMatrixFormat().m1();
	}
}


