package com.alibaba.search.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaSearchRelationGroupInfo {

    private String description;

    /**
     * @return 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setDescription(String description) {
        this.description = description;
    }

    private String code;

    /**
     * @return 关系code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置关系code     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setCode(String code) {
        this.code = code;
    }

    private Boolean related;

    /**
     * @return 是否 在该关系下有关联
     */
    public Boolean getRelated() {
        return related;
    }

    /**
     * 设置是否 在该关系下有关联     *
     * 参数示例：<pre></pre>     
     * 此参数必填
     */
    public void setRelated(Boolean related) {
        this.related = related;
    }

}
