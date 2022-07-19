package com.alibaba.p4p.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaCpsOpenClickUrlDTO {

    private String objectId;

    /**
     * @return 推广实体id
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * 设置推广实体id     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    private String longClickUrl;

    /**
     * @return 长链接
     */
    public String getLongClickUrl() {
        return longClickUrl;
    }

    /**
     * 设置长链接     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLongClickUrl(String longClickUrl) {
        this.longClickUrl = longClickUrl;
    }

    private String shortClickUrl;

    /**
     * @return 短链接
     */
    public String getShortClickUrl() {
        return shortClickUrl;
    }

    /**
     * 设置短链接     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setShortClickUrl(String shortClickUrl) {
        this.shortClickUrl = shortClickUrl;
    }

    private String alipayUrl;

    /**
     * @return 支口令
     */
    public String getAlipayUrl() {
        return alipayUrl;
    }

    /**
     * 设置支口令     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setAlipayUrl(String alipayUrl) {
        this.alipayUrl = alipayUrl;
    }

}
