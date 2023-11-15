
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}	

	public static int reverse(int x) {
		if (x == 0)
			return 0;
		else if (x > 0) {
			return getReverse(x);
		} else {
			return getReverse(x * (-1))*(-1);
		}
	}

	public static int getReverse(int x) {
		long n = 0;
		while (x > 0) {
			n = (n == 0) ? n + (x % 10) : (n * 10) + (x % 10);
			x = x / 10;
		}
		if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            return 0;
        }
		return (int)n;
	}
}
