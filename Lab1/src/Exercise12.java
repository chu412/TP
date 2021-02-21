
public class Exercise12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting project");
        byte vByte = 16;
		short vShort = 32000;
		int vInt = 9999999;
		long vLong = -111111;
		float vFloat = (float) 0.3;
		double vDouble = -2222222.9999;
		char vChar = 'c';
		boolean vBoolean = false;
        System.out.println("This is a byte: " + vByte);
		System.out.println("This is a int: " + vInt);
		System.out.println("This is a long: " + vLong);
		System.out.println("This is a float: " + vFloat);
		System.out.println("This is a double: " + vDouble);
		System.out.println("This is a short: " +vShort);
		System.out.println("This is a char: " + vChar);
		System.out.println("This is a boolean: " + vBoolean);
        vByte = 120;
		vShort = 129;
		vChar = 'a'; // error: cannot find symbol correct sytax 'a' if don't have ''
		vInt = 65999;
		vLong = 4294967296l; // error: integer number too large vLong=4294967296; note the "l" at the end
		vFloat = (float) 0.33333334;
		vDouble = 0.3333333333333333;
		// vDouble=true ; //vDouble is not boolean
		vBoolean = true;
        System.out.println("This is a byte: " + vByte);
		System.out.println("This is a int: " + vInt);
		System.out.println("This is a long: " + vLong);
		System.out.println("This is a float: " + vFloat);
		System.out.println("This is a double: " + vDouble);
		System.out.println("This is a short: " +vShort);
		System.out.println("This is a char: " + vChar);
		System.out.println("This is a boolean: " + vBoolean);
    }
}
