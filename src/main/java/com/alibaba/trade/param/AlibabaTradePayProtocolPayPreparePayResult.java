package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradePayProtocolPayPreparePayResult {

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
     * @return 错误码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置错误码     *
          
     * 此参数必填
     */
    public void setCode(String code) {
        this.code = code;
    }

    private String message;

    /**
     * @return 错误消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置错误消息     *
          
     * 此参数必填
     */
    public void setMessage(String message) {
        this.message = message;
    }

    private ComAlibabaOceanOpenplatformBizTradeResultTradeWithholdPreparePayResultMresult result;

    /**
     * @return 扣款返回值
     */
    public ComAlibabaOceanOpenplatformBizTradeResultTradeWithholdPreparePayResultMresult getResult() {
        return result;
    }

    /**
     * 设置扣款返回值     *
          
     * 此参数必填
     */
    public void setResult(ComAlibabaOceanOpenplatformBizTradeResultTradeWithholdPreparePayResultMresult result) {
        this.result = result;
    }

}
