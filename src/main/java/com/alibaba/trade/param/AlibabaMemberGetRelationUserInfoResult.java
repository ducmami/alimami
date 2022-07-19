package com.alibaba.trade.param;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class AlibabaMemberGetRelationUserInfoResult {

    private String companyName;

    /**
     * @return 公司名称	
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称	     *
          
     * 此参数必填
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    private String memberId;

    /**
     * @return 会员ID	
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设置会员ID	     *
          
     * 此参数必填
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    private String loginId;

    /**
     * @return loginId
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置loginId     *
          
     * 此参数必填
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    private Boolean success;

    /**
     * @return 是否成功	
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * 设置是否成功	     *
          
     * 此参数必填
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    private String errorInfo;

    /**
     * @return 错误信息
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * 设置错误信息     *
          
     * 此参数必填
     */
    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    private String errorCode;

    /**
     * @return 错误编码
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误编码     *
          
     * 此参数必填
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
