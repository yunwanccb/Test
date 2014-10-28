/**
 * 
 */
package ccb.admaster;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Cloud
 *
 */
public class PrintDate {
	
	/**
	 * ���뿪ʼ���ںͽ������ڵ��ַ����������ʱ���ڵ���������ȫ��ӡ����
	 * ��ʽΪyyMMdd�����Զ��ŷָ����������һ�����ڲ��ö���
	 * @param begin ��ʼʱ�䣬��ʽΪyyMMdd
	 * @param end ����ʱ�䣬��ʽΪyyMMdd 
	 */
	public void printDate(String begin, String end) {
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
			Date _begin = sdf.parse(begin);
			Date _end = sdf.parse(end);
			Calendar cal = Calendar.getInstance();
			cal.setTime(_begin);		
			while(!cal.getTime().equals(_end)){
				System.out.print(sdf.format(cal.getTime())+",");
				cal.add(Calendar.DATE, 1);//���ڼ�1	
			}
			System.out.print(sdf.format(cal.getTime()));
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintDate test = new PrintDate();
		test.printDate("140903", "140930");
	}
}
