/**
 * �������
 * @author Administrator
 *
 */


public class ArrayDemo09 {
	
	//3:��ȡ���������СԪ��(getMax,getMin).
	
	//{30,50,20,40,10}
	static int getMax(int[] a){
		int max = a[0];
		for(int i = 1;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
//	4:��ӡ����Ԫ��//[A,B,C,D]   json xml
	static void printArr(String[] arr){
		if(arr==null){
			System.out.println("null");
			return;
		}
		String str="[";
		for(int index = 0;index<arr.length;index++){
			str = str+arr[index];
			if(index != arr.length-1){
				str = str+",";
			}
		}
		str = str+"]";
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		//--------1:�����������
		int[] nums = {2,4,6,8};
		//nums = {1,3,5,7,9};  �����
		nums = new int[]{1,3,5,7,9};
		
		//a.��ȡԪ�ص�ֵ
		int tempNum = nums[0];
		System.out.println(tempNum);
		
		//b.������Ԫ������ֵ
		nums[2] = 10;
		System.out.println(nums[2]);
		
		System.out.println("------------------------");
		//c.��������  ������Ԫ��,һ��һ��ȡ����
		//1.��ͨfor  �±�(����  0 ,1,2,3,4)  �� Ԫ��
		for(int i = 0;i<nums.length;i++){
			System.out.println(i+","+nums[i]);
			
//			if(i == 2){
//				break;
//			}
		}
		
		System.out.println("------------");
		//2.����foreach  java5  ֻ���ó�Ԫ��
		for (int val : nums) {
			System.out.println(val);
		}
		
		String[] names = {"rose","jack","tom"};
		for (String str : names) {
			System.out.println(str);
		}
		
		
		//--------2:�������鳣���쳣
//		a.����Խ��
		
		// java.lang.ArrayIndexOutOfBoundsException
		//����Խ��Ĵ�����ʾ
		//String tempName = names[5];
		//System.out.println(tempName);
		
//		b.������
		//java.lang.NullPointerException ������
		//names = null;
		//System.out.println(names.length);
		
		 //--------3:��ȡ���������СԪ��(getMax,getMin).
		int[] a = {30,50,200,40,10};
		int max = getMax(a);
		System.out.println(max);
		
		
		//-------- 4:��ӡ����Ԫ��
		String[] arr = {"A","B","C","D"};
		//System.out.println(arr);//[A,B,C,D]
		//arr=null;
		printArr(arr);
		
	}

}