public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10;
		int a=++value; // pre-increment 11=a --value =9=a
		int b=value; // b=11
		int c=value++; // post increment 11=c & value becomes 12
		System.out.println(a+ "b="+b + "c="+c+"value="+value); // 11 11 11 12
		if(a <=b && a<=c) {// true && true
			if(b<=c) // true 11==11
			{
				a=++b; //pre 12=a ++b b=b+1 => b=12
				
			}else // this will not be executed
			{
				a=++c;
			}
		}
		System.out.println(a+ "b="+b + "c="+c+"value="+value);//12 12 11 12

	}

}
