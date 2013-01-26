package test;
/**
 *@author hwy1782@gmail.com
 *@date 2013-1-18ÏÂÎç3:42:56
 **/
public class TestUtil {
	
	private static String TABLE_NAME = "article";
	private static String A_ID = "id";
	private static String A_TITLE = "title";
	private static String A_PUB_TIME = "publist_time";
	private static String COMMONT_NUM = "commont_num";
	private static String READ_NUM = "read_num";
	private static String SUMMARY = "summary";
	private static String DETAIL_RUL = "detail_rul";
	private static String A_GMT_CREATE = "gmt_create";

	public static void main(String[] args) {
		String sql = "create table "+TABLE_NAME+" ( "+ A_ID +" int primary key, "
				+A_TITLE+" text,"+A_PUB_TIME+" text,"
				+COMMONT_NUM+" text,"+READ_NUM+" text,"
				+SUMMARY+" text,"+DETAIL_RUL+" text,"
				+A_GMT_CREATE+" text";

		System.out.println(sql);
	}
	
}
