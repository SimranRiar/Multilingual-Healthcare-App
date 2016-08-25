import java.util.*;

public class spaPorts {

	public static void main (String[] args){
		System.out.println("Enter shit");
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();

		String[] array = a.split("");

		for (int i = 0; i < array.length; i++){
			System.out.println("spaPort[] = " + array[i]);
		}

	}
}
