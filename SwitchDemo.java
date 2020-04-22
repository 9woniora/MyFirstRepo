package SwitchDemo;

/*
 * 可以用case穿透来做
 * case 3：
 * case 4：
 * case 5：
 * 		System.out.println("spring");
		break;

 * case 6:
 * case 7:
 * case 8:
 * 		System.out.println("summer");
		break;
	...
 * 
 * 
 */



import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("type in");
		int number = sc.nextInt();

		if (number < 13 && number > 0) {
			switch (number) {
			case 3:
				System.out.println("spring");
				break;

			case 6:
				System.out.println("summer");
				break;
			case 9:
				System.out.println("fall");
				break;
			
			default:
				System.out.println("winter");
			
			}
		}else {
			System.out.println("type error");
		}

	}

}
