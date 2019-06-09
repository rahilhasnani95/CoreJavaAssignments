package Assignment3;

public class JaggedArray {

	public static void main(String[] args) {
	
		String [][] array = new String [4][];
		
		array[0] = new String[] {"Tony", "Java", "C", "C++"};
		array[1] = new String[] {"Thomas", "JAVA", "UNIX", ""};
		array[2] = new String[] {"Dinil", "Linux", "Oracle", ""};
		array[3] = new String[] {"Delvin", "RDBMS", "C#", "ORACLE"};
		
		for(int i = 0; i < array[3].length; i++)
		{
			System.out.println(array[3][i]);
		}
	
	}

}
