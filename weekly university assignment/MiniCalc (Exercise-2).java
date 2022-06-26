/*
 * A mini calculator demo
 */
public class MiniCalc {
    /*
     * Constructor
     */
	public MiniCalc(){
		int int3 = add(8,2);
		int int5 = sub(100,200);
		int int4 = multiply(34,40);
		int int6 = divide(100,25);
		System.out.println(int3+" "+int4+" "+int5+" "+int6);
	}
	//Subtraction the two number

	public int sub(int int1, int int2){
		return int1-int2;
	}
	//dividing two number
	public int divide(int int1, int int2){
		return int1/int2;
	}
	/*
	 * Add two values
	 */
	public int add(int int1, int int2){
		return int1 + int2;
	}
	/*
	 * Multiply two values
	 */
	public int multiply(int int1, int int2){
		return int1 * int2;
	}
	/*
	 * The main method
	 */
	public static final void main(String[] str) {
		System.out.println("MiniCalc");
		MiniCalc mc = new MiniCalc();
	}
}