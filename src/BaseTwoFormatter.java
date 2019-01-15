/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class BaseTwoFormatter implements NumberFormatter{
	public String toString(int num) {
		String str = "";
		int i = 0;
		while (num > Math.pow(2, i)) {
			str = str + Integer.toString(num % 2);
			num = num / 2;
			i++;
		}
		return str;
	}
}
