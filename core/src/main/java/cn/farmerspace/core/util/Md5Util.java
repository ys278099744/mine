package cn.farmerspace.core.util;

import java.security.MessageDigest;
/**
 * @Description: md5 
 * @author caimiao
 */
public class Md5Util {
	public static  String MD5(String s,String charset) {
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       

        try {
            byte[] btInput = s.getBytes(charset);
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String uuid = "1";
        String appId = "1.0.1";
        String ditchNo = "develop";
        String productNo = "001";
        String appVersion = "10001";
        String md5key = "!@video#2016";
        String sign = Md5Util.MD5(uuid+appId+ditchNo+productNo+appVersion+md5key,"UTF-8");
        System.out.println(sign);

    }
}
