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
	 * ��4��ʽ���ַ���ipת��Ϊlong�͵�ip�� ԭ��IP��ַÿ�ο��Կ�����8λ�޷���������0-255����ÿ�β�ֳ�һ����������ʽ���������
	 * Ȼ��������������ת���һ���޷���32Ϊ������
	 * 
	 * @param ip
	 *            4��ʽ���ַ���ip
	 * @return ����long�͵�ip
	 */
	public static long ip2long(String ip) {
		String[] item = ip.split("\\.");
		// λ�������Ч��
		return Long.valueOf(item[0]) << 24 | Long.valueOf(item[1]) << 16
				| Long.valueOf(item[2]) << 8 | Long.valueOf(item[3]);
	}

	/**
	 * ��long�͵�ipת��Ϊ4��ʽ���ַ���ip
	 * 
	 * ԭ�����������ת����һ��32λ���������������ң�ÿ8λ����һ�·ָ�õ�4��8λ�Ķ���������
	 * ����Щ��������ת��������Ȼ����ϡ�.���������ip��ַ��
	 * 
	 * @param ipLong
	 *            long�͵�ip��ַ
	 * @return 
	 *            ����һ��4��ʽ���ַ���ip
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
