package cn.farmerspace.core.util;

import java.security.SecureRandom;
import java.util.UUID;

/**
 * @Description: 封装各种生成唯一性ID算法的工具类
 * @author caimiao
 */
public class UuidUtil {

	private static SecureRandom random = new SecureRandom();

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid2() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 使用SecureRandom随机生成Long.
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}
}
