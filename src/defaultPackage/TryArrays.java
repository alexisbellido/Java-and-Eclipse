package defaultPackage;

public class TryArrays {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		double[] squares = new double[5];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
			squares[i] = Math.pow(i + 1, 2);
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.println("number: " + numbers[i] + " square: " + squares[i]);
		}
	}

}
