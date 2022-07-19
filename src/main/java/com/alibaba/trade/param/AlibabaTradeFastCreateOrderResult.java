package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeFastCreateOrderResult {

    private AlibabaTradeFastResult result;

    /**
     * @return 订单详细信息
     */
    public AlibabaTradeFastResult getResult() {
        return result;
    }

    /**
     * 设置订单详细信息     *
          
     * 此参数必填
     */
    public void setResult(AlibabaTradeFastResult result) {
        this.result = result;
    }

    private Boolean success;

    /**
     * @return 是否成功
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 设置是否成功     *
          
     * 此参数必填
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    private String code;

    /**
     * @return 错误编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置错误编码     *
          
     * 此参数必填
     */
    public void setCode(String code) {
        this.code = code;
    }

    private String message;

    /**
     * @return 错误描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置错误描述     *
          
     * 此参数必填
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
