/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class DecimalFormatter implements NumberFormatter{
	public String toString(int num) {
		String str = Integer.toString(num);
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if ((str.length() - i) % 3 == 0 && (str.length() - i) < str.length()) {
				temp += str.substring(i, i+1) + ".";
			} else {
				temp += str.substring(i, i+1);
			}
		}
		String finalStr = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			finalStr += temp.substring(i, i+1);
		}
		return finalStr;
	}
}
