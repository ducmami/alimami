package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaOceanOpenplatformBizTradeParamTradeWithholdPreparePayParam {

    private String accountType;

    /**
     * @return 
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private Long buyerId;

    /**
     * @return 
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    private Long orderId;

    /**
     * @return 
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private AlibabaOceanOpenplatformCommonCallerInfo callerInfo;

    /**
     * @return 
     */
    public AlibabaOceanOpenplatformCommonCallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCallerInfo(AlibabaOceanOpenplatformCommonCallerInfo callerInfo) {
        this.callerInfo = callerInfo;
    }

    private String opRequestId;

    /**
     * @return 
     */
    public String getOpRequestId() {
        return opRequestId;
    }

    /**
     * 设置     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setOpRequestId(String opRequestId) {
        this.opRequestId = opRequestId;
    }

}
