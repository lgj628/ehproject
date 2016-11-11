package org.ehais.weixin.model;

import java.io.Serializable;

public class HaiCategoryWithBLOBs extends HaiCategory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hai_category.filter_attr
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    private String filterAttr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hai_category.sub_parent_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    private String subParentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hai_category.brand_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    private String brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_category
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_category.filter_attr
     *
     * @return the value of hai_category.filter_attr
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public String getFilterAttr() {
        return filterAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_category.filter_attr
     *
     * @param filterAttr the value for hai_category.filter_attr
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public void setFilterAttr(String filterAttr) {
        this.filterAttr = filterAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_category.sub_parent_id
     *
     * @return the value of hai_category.sub_parent_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public String getSubParentId() {
        return subParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_category.sub_parent_id
     *
     * @param subParentId the value for hai_category.sub_parent_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public void setSubParentId(String subParentId) {
        this.subParentId = subParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hai_category.brand_id
     *
     * @return the value of hai_category.brand_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hai_category.brand_id
     *
     * @param brandId the value for hai_category.brand_id
     *
     * @mbggenerated Mon Mar 28 15:40:34 CST 2016
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
}