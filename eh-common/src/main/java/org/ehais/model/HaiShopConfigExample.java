package org.ehais.model;

import java.util.ArrayList;
import java.util.List;
import org.ehais.tools.CriteriaObject;

public class HaiShopConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected Integer len;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected Integer start;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public HaiShopConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void setLen(Integer len) {
        this.len=len;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public Integer getLen() {
        return len;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void setStart(Integer start) {
        this.start=start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public Integer getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public void CriteriaStoreId(Criteria c, CriteriaObject co) {
        if(co == null || co.getOperator() == null)return ;
        if(co.getOperator().equals("eq")){
            c.andStoreIdEqualTo(co.getStoreId());
        }else if(co.getOperator().equals("in")){
            c.andStoreIdIn(co.getStoreList());
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeTextIsNull() {
            addCriterion("code_text is null");
            return (Criteria) this;
        }

        public Criteria andCodeTextIsNotNull() {
            addCriterion("code_text is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTextEqualTo(String value) {
            addCriterion("code_text =", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextNotEqualTo(String value) {
            addCriterion("code_text <>", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextGreaterThan(String value) {
            addCriterion("code_text >", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextGreaterThanOrEqualTo(String value) {
            addCriterion("code_text >=", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextLessThan(String value) {
            addCriterion("code_text <", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextLessThanOrEqualTo(String value) {
            addCriterion("code_text <=", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextLike(String value) {
            addCriterion("code_text like", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextNotLike(String value) {
            addCriterion("code_text not like", value, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextIn(List<String> values) {
            addCriterion("code_text in", values, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextNotIn(List<String> values) {
            addCriterion("code_text not in", values, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextBetween(String value1, String value2) {
            addCriterion("code_text between", value1, value2, "codeText");
            return (Criteria) this;
        }

        public Criteria andCodeTextNotBetween(String value1, String value2) {
            addCriterion("code_text not between", value1, value2, "codeText");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStoreRangeIsNull() {
            addCriterion("store_range is null");
            return (Criteria) this;
        }

        public Criteria andStoreRangeIsNotNull() {
            addCriterion("store_range is not null");
            return (Criteria) this;
        }

        public Criteria andStoreRangeEqualTo(String value) {
            addCriterion("store_range =", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeNotEqualTo(String value) {
            addCriterion("store_range <>", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeGreaterThan(String value) {
            addCriterion("store_range >", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeGreaterThanOrEqualTo(String value) {
            addCriterion("store_range >=", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeLessThan(String value) {
            addCriterion("store_range <", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeLessThanOrEqualTo(String value) {
            addCriterion("store_range <=", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeLike(String value) {
            addCriterion("store_range like", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeNotLike(String value) {
            addCriterion("store_range not like", value, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeIn(List<String> values) {
            addCriterion("store_range in", values, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeNotIn(List<String> values) {
            addCriterion("store_range not in", values, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeBetween(String value1, String value2) {
            addCriterion("store_range between", value1, value2, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreRangeNotBetween(String value1, String value2) {
            addCriterion("store_range not between", value1, value2, "storeRange");
            return (Criteria) this;
        }

        public Criteria andStoreDirIsNull() {
            addCriterion("store_dir is null");
            return (Criteria) this;
        }

        public Criteria andStoreDirIsNotNull() {
            addCriterion("store_dir is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDirEqualTo(String value) {
            addCriterion("store_dir =", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirNotEqualTo(String value) {
            addCriterion("store_dir <>", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirGreaterThan(String value) {
            addCriterion("store_dir >", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirGreaterThanOrEqualTo(String value) {
            addCriterion("store_dir >=", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirLessThan(String value) {
            addCriterion("store_dir <", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirLessThanOrEqualTo(String value) {
            addCriterion("store_dir <=", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirLike(String value) {
            addCriterion("store_dir like", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirNotLike(String value) {
            addCriterion("store_dir not like", value, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirIn(List<String> values) {
            addCriterion("store_dir in", values, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirNotIn(List<String> values) {
            addCriterion("store_dir not in", values, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirBetween(String value1, String value2) {
            addCriterion("store_dir between", value1, value2, "storeDir");
            return (Criteria) this;
        }

        public Criteria andStoreDirNotBetween(String value1, String value2) {
            addCriterion("store_dir not between", value1, value2, "storeDir");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andIsvoidIsNull() {
            addCriterion("isvoid is null");
            return (Criteria) this;
        }

        public Criteria andIsvoidIsNotNull() {
            addCriterion("isvoid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvoidEqualTo(String value) {
            addCriterion("isvoid =", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidNotEqualTo(String value) {
            addCriterion("isvoid <>", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidGreaterThan(String value) {
            addCriterion("isvoid >", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidGreaterThanOrEqualTo(String value) {
            addCriterion("isvoid >=", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidLessThan(String value) {
            addCriterion("isvoid <", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidLessThanOrEqualTo(String value) {
            addCriterion("isvoid <=", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidLike(String value) {
            addCriterion("isvoid like", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidNotLike(String value) {
            addCriterion("isvoid not like", value, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidIn(List<String> values) {
            addCriterion("isvoid in", values, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidNotIn(List<String> values) {
            addCriterion("isvoid not in", values, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidBetween(String value1, String value2) {
            addCriterion("isvoid between", value1, value2, "isvoid");
            return (Criteria) this;
        }

        public Criteria andIsvoidNotBetween(String value1, String value2) {
            addCriterion("isvoid not between", value1, value2, "isvoid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hai_shop_config
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 13 10:37:53 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return this;
        }

        public Criteria andCodeTextLikeInsensitive(String value) {
            addCriterion("upper(code_text) like", value.toUpperCase(), "codeText");
            return this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return this;
        }

        public Criteria andStoreRangeLikeInsensitive(String value) {
            addCriterion("upper(store_range) like", value.toUpperCase(), "storeRange");
            return this;
        }

        public Criteria andStoreDirLikeInsensitive(String value) {
            addCriterion("upper(store_dir) like", value.toUpperCase(), "storeDir");
            return this;
        }

        public Criteria andIsvoidLikeInsensitive(String value) {
            addCriterion("upper(isvoid) like", value.toUpperCase(), "isvoid");
            return this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hai_shop_config
     *
     * @mbggenerated Wed Apr 13 10:37:53 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}