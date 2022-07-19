package com.alibaba.p4p.param;

import com.alibaba.ocean.rawsdk.client.APIId;
import com.alibaba.ocean.rawsdk.common.AbstractAPIRequest;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaCpsGenClickUrlParam extends AbstractAPIRequest<AlibabaCpsGenClickUrlResult> {

    public AlibabaCpsGenClickUrlParam() {
        super();
        oceanApiId = new APIId("com.alibaba.p4p", "alibaba.cps.genClickUrl", 1);
    }

    private Integer type;

    /**
     * @return 转链接类型(店铺、商品、活动)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置转链接类型(店铺、商品、活动)     *
     * 参数示例：<pre>0商品;1店铺;2活动;7优惠券</pre>     
     * 此参数必填
     */
    public void setType(Integer type) {
        this.type = type;
    }

    private Long mediaId;

    /**
     * @return 媒体id
     */
    public Long getMediaId() {
        return mediaId;
    }

    /**
     * 设置媒体id     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

    private Long mediaZoneId;

    /**
     * @return 媒体推广位id
     */
    public Long getMediaZoneId() {
        return mediaZoneId;
    }

    /**
     * 设置媒体推广位id     *
     * 参数示例：<pre>1</pre>     
     * 此参数必填
     */
    public void setMediaZoneId(Long mediaZoneId) {
        this.mediaZoneId = mediaZoneId;
    }

    private List objectValueList;

    /**
     * @return 推广实体
     */
    public List getObjectValueList() {
        return objectValueList;
    }

    /**
     * 设置推广实体     *
     * 参数示例：<pre>商品：传offerId；
    活动：传活动id；
    商铺：卖家sellerId；优惠券：offerId</pre>     
     * 此参数必填
     */
    public void setObjectValueList(List objectValueList) {
        this.objectValueList = objectValueList;
    }

    private String ext;

    /**
     * @return 其他自定义参数，查询订单会返回该参数
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置其他自定义参数，查询订单会返回该参数     *
     * 参数示例：<pre>{"p1":"123","p2":"456","p3":"789"}</pre>     
     * 此参数必填
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

}
