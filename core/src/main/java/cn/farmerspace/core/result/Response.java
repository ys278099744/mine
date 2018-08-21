package cn.farmerspace.core.result;

import java.io.Serializable;

public class Response <T> implements Serializable{
	private static final long serialVersionUID = 1L;
	private int status;
	private String msg;
	private T data;
	
	
	public Response(){

	}

	/**通用成功
	 * @param data
	 * @return
	 */
	public static <T> Response<T> success(T data){
		Response<T> response = new Response<T>();
		response.data = data;
		response.status = StatusCode.SUCCESS.getStatus();
		response.msg = StatusCode.SUCCESS.getMsg();
		return response;
	}

	/**通用重定向
	 * @param data
	 * @return
	 */
	public static <T> Response<T> redirect(T data){
		Response<T> response = new Response<T>();
		response.data = data;
		response.status = StatusCode.REDIRECT.getStatus();
		response.msg = StatusCode.REDIRECT.getMsg();
		return response;
	}

	/**
	 * 通用未知异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> unKnowError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.UNKNOW_ERROR.getStatus();
		response.msg = message == null?StatusCode.UNKNOW_ERROR.getMsg():message;
		return response;
	}

	/**
	 * 通用业务异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> bussinessError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.BUSSINESS_ERROR.getStatus();
		response.msg = message == null?StatusCode.BUSSINESS_ERROR.getMsg():message;
		return response;
	}

	/**
	 * 通用系统异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> systemError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.SYSTEM_ERROR.getStatus();
		response.msg = message == null?StatusCode.SYSTEM_ERROR.getMsg():message;
		return response;
	}

	/**
	 * 通用数据库异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> databaseError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.DATABASE_ERROR.getStatus();
		response.msg = message == null?StatusCode.DATABASE_ERROR.getMsg():message;
		return response;
	}

	/**
	 * 通用参数不正确异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> paramError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.PARAM_ERROR.getStatus();
		response.msg = message == null?StatusCode.PARAM_ERROR.getMsg():message;
		return response;
	}


	/**
	 * 通用解密异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> encryptError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.ENCRYPT_ERROR.getStatus();
		response.msg = message == null?StatusCode.ENCRYPT_ERROR.getMsg():message;
		return response;
	}

	/**
	 * 通用缓存异常
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> cacheError(String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = StatusCode.CACHE_ERROR.getStatus();
		response.msg = message == null?StatusCode.CACHE_ERROR.getMsg():message;
		return response;
	}


	/**
	 * 通用失败异常
	 * @param status
	 * @param message
	 * @param <T>
	 * @return
	 */
	public static <T> Response<T> error(EnumStatus status,String message){
		Response<T> response = new Response<T>();
		response.data = null;
		response.status = status.getStatus();
		response.msg = message == null?status.getMsg():message;
		return response;
	}


	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
