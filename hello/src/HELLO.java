
public class HELLO {

}
public static void main(String[] args) {
//	1��	String str = ��willabcde��  ����ĸ��д
	String str = "willabcde";//---->Willabcde
	
	//��ȡ
//    System.out.println(str.substring(2));//��ʼλ��    ��  ����
//    System.out.println(str.substring(2,5));��ʼλ��   ��  ����λ��
	String firstchar = str.substring(0, 1);
	System.out.println(firstchar);
	firstchar = firstchar.toUpperCase();
	System.out.println(firstchar);
	
	String newStr = firstchar+str.substring(1);
	System.out.println(newStr);
	
//    2��	��ȡ��hello��ͷ���ļ����ĺ�׺��
//	String filenames = ��abc.java;hello.will.txt;hello.java;hello.classs��;
	
	String filenames = "abc.java;hello.will.txt;hello.java;hello.classs";
	
	//�ַ���----->����
	String[] arr = filenames.split(";");
	System.out.println(arr.length);
	System.out.println(Arrays.toString(arr));
	System.out.println("---------------------");
	for (String string : arr) {
		//System.out.println(string);
		if(string.contains("hello")){ 
			//System.out.println(string);
			int index = string.lastIndexOf(".");
			//System.out.println(index);
			
			System.out.println(string.substring(index));
		}
	}

}