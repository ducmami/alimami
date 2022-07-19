package com.alibaba.search.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaSearchRelationSupplyParam extends AbstractAPIRequest<AlibabaSearchRelationSupplyResult> {

    public AlibabaSearchRelationSupplyParam() {
        super();
        oceanApiId = new APIId("com.alibaba.search", "alibaba.search.relation.supply", 1);
    }

    private Date relationTime;

    /**
     * @return 建立关联的时间，如果不设置则查找所有
     */
    public Date getRelationTime() {
        return relationTime;
    }

    /**
     * 设置建立关联的时间，如果不设置则查找所有     *
     * 参数示例：<pre>20180809000000000+0800</pre>     
     * 此参数必填
     */
    public void setRelationTime(Date relationTime) {
        this.relationTime = relationTime;
    }

    private Integer pageNum;

    /**
     * @return 分页时的页数
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * 设置分页时的页数     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    private Integer pageSize;

    /**
     * @return 每一页的大小
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置每一页的大小     *
     * 参数示例：<pre>20</pre>     
     * 此参数必填
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
