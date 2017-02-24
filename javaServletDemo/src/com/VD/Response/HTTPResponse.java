package com.VD.Response;

/**
 * Created by vd on 2017/2/24.
 */
public class HTTPResponse
{
    private HTTPResponseCode code = null;
    private String message = null;
    public HTTPResponseCode getCode() {
        return code;
    }

    public void setCode(HTTPResponseCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
