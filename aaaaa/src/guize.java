public class guize {
public static void main(String[] args) {
	String input="13111111111";
	String regex1="^1[3|4|5]\\d{9}$";
	boolean isNumber=input.matches(regex1);
	System.out.println(isNumber);
	
	

}

}