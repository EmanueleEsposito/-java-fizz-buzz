package jana60;

public class FizzBuzz {

	public static void main(String[] args) {

	int numero=100;
		for (int i = 1; i <= numero; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);

			}

		}

	}

}
