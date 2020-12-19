package cn.ricardowang.www.utils;

/**
 * @Author: wangqin
 * @Date: 2020/12/19 0019 - 12 -19 -20:48
 * @Description: cn.ricardowang.www.utils
 * @version: 1.0
 */
public class Result {
    private boolean isSuccess;
    private String details;

    public Result(boolean isSuccess, String details) {
        this.isSuccess = isSuccess;
        this.details = details;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
