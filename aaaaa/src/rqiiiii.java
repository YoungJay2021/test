import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class rqiiiii {
public static void main(String[] args) throws Exception {
	Date date=new Date();
	System.out.println(date);
	System.out.println(date.toLocaleString());
SimpleDateFormat format1=new SimpleDateFormat("yyyy年MM月dd日");
String string =format1.format(date);
System.out.println(string);

SimpleDateFormat format2=new SimpleDateFormat("yyyy/MM/dd");
System.out.println("请输入yyyy/MM/dd");
Scanner sc =new Scanner(System.in);
String str=sc.next();
Date parse=format2.parse(str);
System.out.println(parse.toLocaleString());


}
}
