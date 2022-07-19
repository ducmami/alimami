package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaTradeOpQueryMarketingMixConfigParam extends AbstractAPIRequest<AlibabaTradeOpQueryMarketingMixConfigResult> {

    public AlibabaTradeOpQueryMarketingMixConfigParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.trade.OpQueryMarketingMixConfig", 1);
    }

    private String sellerMemberId;

    /**
     * @return 卖家memberId
     */
    public String getSellerMemberId() {
        return sellerMemberId;
    }

    /**
     * 设置卖家memberId     *
     * 参数示例：<pre>b2b-1623492085</pre>     
     * 此参数必填
     */
    public void setSellerMemberId(String sellerMemberId) {
        this.sellerMemberId = sellerMemberId;
    }

    private String sellerLoginId;

    /**
     * @return 卖家LoginId，sellerMemberId为空时，以loginId为准
     */
    public String getSellerLoginId() {
        return sellerLoginId;
    }

    /**
     * 设置卖家LoginId，sellerMemberId为空时，以loginId为准     *
     * 参数示例：<pre>alitestforisv01</pre>     
     * 此参数必填
     */
    public void setSellerLoginId(String sellerLoginId) {
        this.sellerLoginId = sellerLoginId;
    }

}
