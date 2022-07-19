package com.alibaba.search.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaSearchRelationSupplyResult {

    private AlibabaSearchRelationAccountInfo[] result;

    /**
     * @return 返回的卖家信息
     */
    public AlibabaSearchRelationAccountInfo[] getResult() {
        return result;
    }

    /**
     * 设置返回的卖家信息     *
          
     * 此参数必填
     */
    public void setResult(AlibabaSearchRelationAccountInfo[] result) {
        this.result = result;
    }

    private String errorCode;

    /**
     * @return 错误code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误code     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorMessage;

    /**
     * @return 错误描述
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 设置错误描述     *
          
     * 此参数必填
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private Integer pageNum;

    /**
     * @return 页数
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * 设置页数     *
          
     * 此参数必填
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    private Integer pageSize;

    /**
     * @return 每页返回数
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页返回数     *
          
     * 此参数必填
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    private Long totalRecords;

    /**
     * @return 总记录数
     */
    public Long getTotalRecords() {
        return totalRecords;
    }

    /**
     * 设置总记录数     *
          
     * 此参数必填
     */
    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

}
