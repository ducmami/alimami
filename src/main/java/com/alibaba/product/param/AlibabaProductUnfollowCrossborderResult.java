package com.alibaba.product.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaProductUnfollowCrossborderResult {

    private Integer code;

    /**
     * @return code,0表示成功
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置code,0表示成功     *
          
     * 此参数必填
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    private String message;

    /**
     * @return 结果的描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置结果的描述     *
          
     * 此参数必填
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
