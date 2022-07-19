package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaOrderMemoAddParam extends AbstractAPIRequest<AlibabaOrderMemoAddResult> {

    public AlibabaOrderMemoAddParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.order.memoAdd", 1);
    }

    private Long orderId;

    /**
     * @return 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID     *
     * 参数示例：<pre>1234567</pre>     
     * 此参数必填
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private String memo;

    /**
     * @return 备忘信息
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备忘信息     *
     * 参数示例：<pre>订单备忘详情</pre>     
     * 此参数必填
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    private String remarkIcon;

    /**
     * @return 备忘图标，目前仅支持数字。1位红色图标，2为蓝色图标，3为绿色图标，4为黄色图标
     */
    public String getRemarkIcon() {
        return remarkIcon;
    }

    /**
     * 设置备忘图标，目前仅支持数字。1位红色图标，2为蓝色图标，3为绿色图标，4为黄色图标     *
     * 参数示例：<pre>2</pre>     
     * 此参数必填
     */
    public void setRemarkIcon(String remarkIcon) {
        this.remarkIcon = remarkIcon;
    }

}
