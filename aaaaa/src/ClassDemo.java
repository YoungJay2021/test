import java.lang.reflect.Field;

public class ClassDemo {
	
	public static void main(String[] args) throws Exception {
//		����Class���͵Ķ���  ����
//		����1:
	  Class c =	String.class;
	  
//	  ����2:
	  Class a = Class.forName("com.etc_05ClassDemo.Apple");
	  //��ȡ���������
	  Field[] fields = a.getDeclaredFields();
	  for (Field field : fields) {
		System.out.println(field.getName());
	  }
	  
	  //��ȡClass����ʵ����
	  Object object = a.newInstance();
	  if(object instanceof Apple){
		  //System.out.println("Yes, Apple");
		  Apple a1 = (Apple)object;
		  System.out.println(a1);
		 
		  
		  
		  /*
		  //int ---double 
		  int i = 10;
		  double j = i;
		  //double ---->int
		  double k = 10.34;
		  int h =(int) k;
		  */
	  }
		
	}

}
