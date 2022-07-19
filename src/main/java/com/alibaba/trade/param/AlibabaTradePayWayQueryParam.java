package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradePayWayQueryParam extends AbstractAPIRequest<AlibabaTradePayWayQueryResult> {

    public AlibabaTradePayWayQueryParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.payWay.query", 1);
    }

    private String orderId;

    /**
     * @return 订单号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单号     *
     * 参数示例：<pre>123123</pre>     
     * 此参数必填
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

}
