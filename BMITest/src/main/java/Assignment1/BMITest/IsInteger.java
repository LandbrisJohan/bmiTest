package Assignment1.BMITest;

public class IsInteger implements IsIntegerIF{

	public boolean isInputInteger(String str) {
		if (str == null) {
			return false;
		}
		int length = str.length();
		if (length == 0) {
			return false;
		}
		if (str.charAt(0) == '-') {
			return false;
		}
		int i = 0;
		for (; i < length; i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		
		return true;
	}
}
