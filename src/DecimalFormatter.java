/**
 * 
 * @author Kevin Guo Period 6
 *
 */
public class DecimalFormatter implements NumberFormatter{
	public String toString(int num) {
		public String toString(int num) {
			String str = Integer.toString(num);
			String temp = "";
			for (int i = 0; i < str.length(); i++) {
				if (i % 3 == 0  && i > 0) {
					temp += str.substring(i, i+1) + ".";
				} else {
					temp += str.substring(i, i+1);
				}
			}
			String finalStr = "";
			for (int i = temp.length(); i > 0; i++) {
				finalStr += temp.substring(i, i+1);
			}
			return finalStr;
		}
	}
}
