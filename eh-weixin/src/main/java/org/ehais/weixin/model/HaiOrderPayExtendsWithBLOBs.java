package org.ehais.weixin.model;

import java.io.Serializable;

public class HaiOrderPayExtendsWithBLOBs extends HaiOrderPayExtends implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hai_order_pay_extends.order_body
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    private String orderBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hai_order_pay_extends.remark
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_order_pay_extends
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_order_pay_extends.order_body
     *
     * @return the value of hai_order_pay_extends.order_body
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    public String getOrderBody() {
        return orderBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_order_pay_extends.order_body
     *
     * @param orderBody the value for hai_order_pay_extends.order_body
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    public void setOrderBody(String orderBody) {
        this.orderBody = orderBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_order_pay_extends.remark
     *
     * @return the value of hai_order_pay_extends.remark
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_order_pay_extends.remark
     *
     * @param remark the value for hai_order_pay_extends.remark
     *
     * @mbggenerated Thu Oct 27 23:40:36 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}