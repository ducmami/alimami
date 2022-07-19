package com.alibaba.search.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaSearchRelationAccountInfo {

    private Long userId;

    /**
     * @return 关联人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置关联人ID     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private String companyName;

    /**
     * @return 关联人所在公司名
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置关联人所在公司名     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private AlibabaSearchRelationGroupInfo[] relationDesc;

    /**
     * @return 关联的信息描述
     */
    public AlibabaSearchRelationGroupInfo[] getRelationDesc() {
        return relationDesc;
    }

    /**
     * 设置关联的信息描述     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRelationDesc(AlibabaSearchRelationGroupInfo[] relationDesc) {
        this.relationDesc = relationDesc;
    }

    private String[] domainInPlatforms;

    /**
     * @return 卖家在平台上的旺铺域名
     */
    public String[] getDomainInPlatforms() {
        return domainInPlatforms;
    }

    /**
     * 设置卖家在平台上的旺铺域名     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDomainInPlatforms(String[] domainInPlatforms) {
        this.domainInPlatforms = domainInPlatforms;
    }

    private String loginId;

    /**
     * @return 关联人昵称信息
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置关联人昵称信息     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

}
