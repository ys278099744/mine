package cn.tongdun.kraken.web.reqParam;



/**
 * @Author Steven Tang
 * @Description
 * @Date create in 10:26 18/2/6
 **/


public class UserCustomPara {
    long modelId;
    String account;
    int state;
    int creater;
    int current;
    int pageSize;

    public long getModelId() {
        return modelId;
    }

    public void setModelId(long modelId) {
        this.modelId = modelId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCreater() {
        return creater;
    }

    public void setCreater(int creater) {
        this.creater = creater;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

    