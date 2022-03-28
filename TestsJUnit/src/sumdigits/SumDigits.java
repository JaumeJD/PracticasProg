package sumdigits;

public class SumDigits {

	private int num;

	public SumDigits(int num) {
		super();
		this.num = num;
	}

	public int sum() {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}

}
