public class PracticeProblem {

	public static void main(String args[]) {
System.out.println(findSecond(new char[]  {'0', '2', '3', '2', '3' }, '2'));
	}

public static int find(int[] array, int number){
int index = -1;
for (int i =0; i<array.length; i++){
if (array[i] == number){
return i;
}
}
return index;	
}

public static int findLast(String[] array, String string){
	int index = -1;
	for (int i =array.length-1; i>-1; i--){
	if (array[i] == string){
	return i;
	}
	}
	return index;	
	}


public static int findSecond(char[] array, char character){
	int index = -1;
	int counter = 0;
	for (int i =0; i<array.length; i++){
	if (array[i] == character){
	counter++;
	index = i;
	}
	if (counter ==2){
		i = array.length;
		System.out.print(index);
	}
	}
	return index;
}	

}
