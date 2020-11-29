package core;

public class TDG_TestDateGeneration {

	int length = 0, result = 0;
	static int max = 102;
	
	
	static PrimeNumberChecker p = new PrimeNumberChecker();
	public static void main(String[] args) {
		for (int i = 2; i <= max; i++) {
			System.out.println("{" + i + ", " + p.validate(i) + "}" + (i < max ? "," : ""));
		}
	}
}

