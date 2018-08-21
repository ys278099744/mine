package cn.farmerspace.biz;


import cn.farmerspace.core.result.EnumStatus;
import cn.farmerspace.core.result.StatusCode;

/**
 * @Description: 业务异常类
 * @author caimiao
 */
public class BusException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private EnumStatus status;
    private String msg;

    public BusException() {
        this(StatusCode.UNKNOW_ERROR);
    }


    public BusException(EnumStatus status,String msg) {
        super(msg);
        this.status = status;
    }

    public BusException(EnumStatus status) {
        this(status,status.getMsg());
    }

    public BusException(EnumStatus status,String msg,Throwable cause) {
        super(msg, cause);
        this.status = status;
    }
    public BusException(EnumStatus status, Throwable cause) {
        this(status,status.getMsg(),cause);
    }



    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
