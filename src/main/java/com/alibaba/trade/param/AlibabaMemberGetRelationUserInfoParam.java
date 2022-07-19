package com.alibaba.trade.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaMemberGetRelationUserInfoParam extends AbstractAPIRequest<AlibabaMemberGetRelationUserInfoResult> {

    public AlibabaMemberGetRelationUserInfoParam() {
        super();
        oceanApiId = new APIId("com.alibaba.trade", "alibaba.member.getRelationUserInfo", 1);
    }

    private String domain;

    /**
     * @return 店铺域名
     */
    public String getDomain() {
        return domain;
    }

    /**
     * 设置店铺域名     *
     * 参数示例：<pre>xx.1688.com</pre>     
     * 此参数必填
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

}
