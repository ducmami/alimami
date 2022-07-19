package com.alibaba.product.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductFollowCrossborderParam extends AbstractAPIRequest<AlibabaProductFollowCrossborderResult> {

    public AlibabaProductFollowCrossborderParam() {
        super();
        oceanApiId = new APIId("com.alibaba.product", "alibaba.product.follow.crossborder", 1);
    }

    private Long productId;

    /**
     * @return 商品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品id     *
     * 参数示例：<pre>52312121144</pre>     
     * 此参数必填
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
