package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaOpenplatformTradeResultOpMarketingMixConfigModel {

    private Boolean generalHunpi;

    /**
     * @return 是否普通混批
     */
    public Boolean getGeneralHunpi() {
        return generalHunpi;
    }

    /**
     * 设置是否普通混批     *
     * 参数示例：<pre>true</pre>     
     * 此参数必填
     */
    public void setGeneralHunpi(Boolean generalHunpi) {
        this.generalHunpi = generalHunpi;
    }

    private Date gmtCreate;

    /**
     * @return 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    private Date gmtModified;

    /**
     * @return 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    private String memberId;

    /**
     * @return 卖家memberID
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置卖家memberID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private Integer mixAmount;

    /**
     * @return 混批金额
     */
    public Integer getMixAmount() {
        return mixAmount;
    }

    /**
     * 设置混批金额     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMixAmount(Integer mixAmount) {
        this.mixAmount = mixAmount;
    }

    private Integer mixNumber;

    /**
     * @return 混批数量
     */
    public Integer getMixNumber() {
        return mixNumber;
    }

    /**
     * 设置混批数量     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setMixNumber(Integer mixNumber) {
        this.mixNumber = mixNumber;
    }

}
