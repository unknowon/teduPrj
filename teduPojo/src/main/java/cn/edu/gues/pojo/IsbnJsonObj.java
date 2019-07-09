package cn.edu.gues.pojo;

/**
 * IsbnJsonObj
 *
 * @author lulu
 * @date 2019-07-04
 **/
public class IsbnJsonObj {

    private String reason;
    private IsbnResult result;
    private int error_code;
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getReason() {
        return reason;
    }

    public void setResult(IsbnResult result) {
        this.result = result;
    }
    public IsbnResult getResult() {
        return result;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }
    public int getError_code() {
        return error_code;
    }

}
