package Assignment1.BMITest;

public class IsInteger implements IsIntegerIF{

	public boolean isInputInteger(String str) {
		if (str == null) {
			return false;
		}
		return true;
	}
}
