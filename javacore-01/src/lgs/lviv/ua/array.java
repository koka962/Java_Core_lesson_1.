package lgs.lviv.ua;

//first commit to github

public class array {
	public static void main(String[] args) {
		int[] array = {5,125,4,6,87,63,12,68};
		int max = array[0];
		int min = array[0];
		
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max){
				System.out.println("maximum value is " +array[i]);
				max=array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]<min) {
				System.out.println("minimum value is " +array[i]);
				min=array[i];
		
	}

}
	}
}
