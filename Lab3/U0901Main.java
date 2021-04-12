package StockListProject;
public class U0901Main {

	public static void main(String[] args) {
		
		Integer[] intArr = { 10, 20, 15 };
		Float[] floatArr = new Float[10];
		for (int i = 0; i < 10; i++) {
			floatArr[i] = 0.5f+i;
		}
		String[] stringArr=new String[5];
		for (int i = 0; i < 5; i++) {
		stringArr[i]=new String("asd");
		}
		
		U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
		U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
		
		System.out.println(insWorkArrayFloat.sum());
		System.out.println(insWorkArrayInt.sum());
	}
	
}