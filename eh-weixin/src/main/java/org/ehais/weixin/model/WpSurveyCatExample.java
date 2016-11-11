package org.ehais.weixin.model;

import java.util.ArrayList;
import java.util.List;

public class WpSurveyCatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected Integer start;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected Integer len;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public WpSurveyCatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
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
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void setStart(Integer start) {
        this.start=start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public Integer getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public void setLen(Integer len) {
        this.len=len;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
     */
    public Integer getLen() {
        return len;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
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

        public Criteria andSurCatIdIsNull() {
            addCriterion("sur_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andSurCatIdIsNotNull() {
            addCriterion("sur_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurCatIdEqualTo(Integer value) {
            addCriterion("sur_cat_id =", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdNotEqualTo(Integer value) {
            addCriterion("sur_cat_id <>", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdGreaterThan(Integer value) {
            addCriterion("sur_cat_id >", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sur_cat_id >=", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdLessThan(Integer value) {
            addCriterion("sur_cat_id <", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdLessThanOrEqualTo(Integer value) {
            addCriterion("sur_cat_id <=", value, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdIn(List<Integer> values) {
            addCriterion("sur_cat_id in", values, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdNotIn(List<Integer> values) {
            addCriterion("sur_cat_id not in", values, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdBetween(Integer value1, Integer value2) {
            addCriterion("sur_cat_id between", value1, value2, "surCatId");
            return (Criteria) this;
        }

        public Criteria andSurCatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sur_cat_id not between", value1, value2, "surCatId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andWxidIsNull() {
            addCriterion("wxid is null");
            return (Criteria) this;
        }

        public Criteria andWxidIsNotNull() {
            addCriterion("wxid is not null");
            return (Criteria) this;
        }

        public Criteria andWxidEqualTo(Integer value) {
            addCriterion("wxid =", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotEqualTo(Integer value) {
            addCriterion("wxid <>", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThan(Integer value) {
            addCriterion("wxid >", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wxid >=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThan(Integer value) {
            addCriterion("wxid <", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidLessThanOrEqualTo(Integer value) {
            addCriterion("wxid <=", value, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidIn(List<Integer> values) {
            addCriterion("wxid in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotIn(List<Integer> values) {
            addCriterion("wxid not in", values, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidBetween(Integer value1, Integer value2) {
            addCriterion("wxid between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andWxidNotBetween(Integer value1, Integer value2) {
            addCriterion("wxid not between", value1, value2, "wxid");
            return (Criteria) this;
        }

        public Criteria andIsVoidIsNull() {
            addCriterion("is_void is null");
            return (Criteria) this;
        }

        public Criteria andIsVoidIsNotNull() {
            addCriterion("is_void is not null");
            return (Criteria) this;
        }

        public Criteria andIsVoidEqualTo(Short value) {
            addCriterion("is_void =", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidNotEqualTo(Short value) {
            addCriterion("is_void <>", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidGreaterThan(Short value) {
            addCriterion("is_void >", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidGreaterThanOrEqualTo(Short value) {
            addCriterion("is_void >=", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidLessThan(Short value) {
            addCriterion("is_void <", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidLessThanOrEqualTo(Short value) {
            addCriterion("is_void <=", value, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidIn(List<Short> values) {
            addCriterion("is_void in", values, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidNotIn(List<Short> values) {
            addCriterion("is_void not in", values, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidBetween(Short value1, Short value2) {
            addCriterion("is_void between", value1, value2, "isVoid");
            return (Criteria) this;
        }

        public Criteria andIsVoidNotBetween(Short value1, Short value2) {
            addCriterion("is_void not between", value1, value2, "isVoid");
            return (Criteria) this;
        }

        public Criteria andOrderSortIsNull() {
            addCriterion("order_sort is null");
            return (Criteria) this;
        }

        public Criteria andOrderSortIsNotNull() {
            addCriterion("order_sort is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSortEqualTo(Integer value) {
            addCriterion("order_sort =", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotEqualTo(Integer value) {
            addCriterion("order_sort <>", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortGreaterThan(Integer value) {
            addCriterion("order_sort >", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_sort >=", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortLessThan(Integer value) {
            addCriterion("order_sort <", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortLessThanOrEqualTo(Integer value) {
            addCriterion("order_sort <=", value, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortIn(List<Integer> values) {
            addCriterion("order_sort in", values, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotIn(List<Integer> values) {
            addCriterion("order_sort not in", values, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortBetween(Integer value1, Integer value2) {
            addCriterion("order_sort between", value1, value2, "orderSort");
            return (Criteria) this;
        }

        public Criteria andOrderSortNotBetween(Integer value1, Integer value2) {
            addCriterion("order_sort not between", value1, value2, "orderSort");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wp_survey_cat
     *
     * @mbggenerated do_not_delete_during_merge Wed Mar 09 23:01:10 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wp_survey_cat
     *
     * @mbggenerated Wed Mar 09 23:01:10 CST 2016
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