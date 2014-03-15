package defaultPackage;

public class TryArrays {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		double[] squares = new double[5];
		int[] smallPrimes = {2, 3, 5, 7};
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
			squares[i] = Math.pow(i + 1, 2);
		}
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("number: " + numbers[i] + " square: " + squares[i]);
		}
		
		for (int number: numbers)
		{
			System.out.println("number using foreach: " + number);
		}
		
		for (int prime: smallPrimes)
		{
			System.out.println("small prime using foreach: " + prime);
		}
	}

}
