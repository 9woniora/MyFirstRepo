package ForDemo;

/*
 * 
 * 
 * 
 */
public class ForDemo1 {
	public static void main(String[] args) {

		int sum = 0;

		for (int a = 1; a <= 10; a++) {
			sum += a;

		}
		System.out.println(sum);

		int sum1 = 0;
		for (int b = 0; b <= 100; b++) {
			if (b % 2 == 0) {
				sum1 += b;
			}

		}
		System.out.println(sum1);

		int sum2 = 0;
		for (int c = 0; c <= 100; c += 2) { // 这个地方 c = c+2；
			sum2 += c;
		}

		System.out.println(sum2);

		int sum3 = 1;
		for (int a = 1; a <= 5; a++) {
			sum3 *= a;
		}
		System.out.println(sum3);

		// 水仙花

		int x = 0;
		for (int number = 100; number < 1000; number++) {
			// 怎么取各位数。
			/*
			 * 153 %10 =3； 153/10%10 =5； 153/10/10%10 =1； x/10/10/10%10= 千位
			 * 
			 * 
			 */

			int a = number % 10;
			int b = number / 10 % 10;
			int c = number / 10 / 10 % 10;

			if (number == (a * a * a + b * b * b + c * c * c)) {
				x++;
				System.out.println(number);
			}

		}
		System.out.println(x);

	}
}
