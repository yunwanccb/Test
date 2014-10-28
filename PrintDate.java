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
	 * 输入开始日期和结束日期的字符串，将这段时间内的所有日期全打印出来
	 * 格式为yyMMdd，并以逗号分隔开来，最后一个日期不用逗号
	 * @param begin 开始时间，格式为yyMMdd
	 * @param end 结束时间，格式为yyMMdd 
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
				cal.add(Calendar.DATE, 1);//日期加1	
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
