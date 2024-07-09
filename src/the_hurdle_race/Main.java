package the_hurdle_race;

import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		String input = scan.nextLine();
		String string = "";
		do { string = scan.nextLine(); } while(Integer.parseInt(input.split(" ")[0]) != string.split(" ").length);
		
		String[] array_string = string.split(" ");
		int temp = 0;
		for (int i = 0; i < array_string.length; i++) {
			if (Integer.parseInt(array_string[i]) > temp) {
				temp = Integer.parseInt(array_string[i]);
			}
		}
		int result = (temp - Integer.parseInt(input.split(" ")[1]) > 0) ? temp - Integer.parseInt(input.split(" ")[1]) : 0;
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
