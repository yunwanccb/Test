/**
 * 
 */
package ccb.admaster;

/**
 * @author Cloud
 * 
 */
public class IpUtils {

	/**
	 * 将4点式的字符串ip转换为long型的ip。 原理：IP地址每段可以看成是8位无符号整数即0-255，把每段拆分成一个二进制形式组合起来，
	 * 然后把这个二进制数转变成一个无符号32为整数。
	 * 
	 * @param ip
	 *            4点式的字符串ip
	 * @return 返回long型的ip
	 */
	public static long ip2long(String ip) {
		String[] item = ip.split("\\.");
		// 位运算提高效率
		return Long.valueOf(item[0]) << 24 | Long.valueOf(item[1]) << 16
				| Long.valueOf(item[2]) << 8 | Long.valueOf(item[3]);
	}

	/**
	 * 将long型的ip转化为4点式的字符串ip
	 * 
	 * 原理：把这个整数转换成一个32位二进制数。从左到右，每8位进行一下分割，得到4段8位的二进制数，
	 * 把这些二进制数转换成整数然后加上”.”就是这个ip地址了
	 * 
	 * @param ipLong
	 *            long型的ip地址
	 * @return 
	 *            返回一个4点式的字符串ip
	 */
	public static String long2ip(long ipLong) {
		StringBuilder sb = new StringBuilder();
		sb.append((ipLong >> 24) & 0xFF).append(".");
		sb.append((ipLong >> 16) & 0xFF).append(".");
		sb.append((ipLong >> 8) & 0xFF).append(".");
		sb.append(ipLong & 0xFF);
		return sb.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long ip = ip2long("127.0.0.1");
		String ip_str = long2ip(ip);
		System.out.println(ip + "\n" + ip_str);
	}

}
