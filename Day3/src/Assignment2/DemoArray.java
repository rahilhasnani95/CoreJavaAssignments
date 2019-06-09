package Assignment2;

public class DemoArray {

	public static void main(String[] args) {

		int firstArrayMatrix[][] = {{1,1,1}, {1,1,1}};
		int secondArrayMatrix[][] = {{2,2,2}, {2,2,2}};
		
		System.out.println("Matrix1");
		
		for(int i = 0; i< firstArrayMatrix.length; i++)
		{
			for(int j = 0; j< firstArrayMatrix[i].length; j++)
			{
				System.out.print(firstArrayMatrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matrix2");	
		for(int i = 0; i< secondArrayMatrix.length; i++)
		{
			for(int j = 0; j< secondArrayMatrix[i].length; j++)
			{
				System.out.print(secondArrayMatrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Sum of matrices");
		for(int i = 0; i< firstArrayMatrix.length; i++)
		{
			for(int j = 0; j< firstArrayMatrix[i].length; j++)
			{
				System.out.print(firstArrayMatrix[i][j] + secondArrayMatrix[i][j]);
			}
			System.out.println();
		}
		// 00 01 02
		// 10 11 12		
		
	}

}
