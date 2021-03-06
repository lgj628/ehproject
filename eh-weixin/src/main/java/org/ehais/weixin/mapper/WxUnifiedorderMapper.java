package org.ehais.weixin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.ehais.weixin.model.WxUnifiedorder;
import org.ehais.weixin.model.WxUnifiedorderExample;

public interface WxUnifiedorderMapper {
	
	@Update("update wx_unifiedorder set e_pay_status = #{e_pay_status} where out_trade_no = #{out_trade_no}")
	public void UpdatePayStatue(@Param("out_trade_no") String out_trade_no,@Param("e_pay_status") Integer e_pay_status);
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int countByExample(WxUnifiedorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int deleteByExample(WxUnifiedorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int deleteByPrimaryKey(Integer wxOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int insert(WxUnifiedorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int insertSelective(WxUnifiedorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    List<WxUnifiedorder> selectByExample(WxUnifiedorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    WxUnifiedorder selectByPrimaryKey(Integer wxOrderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int updateByExampleSelective(@Param("record") WxUnifiedorder record, @Param("example") WxUnifiedorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int updateByExample(@Param("record") WxUnifiedorder record, @Param("example") WxUnifiedorderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int updateByPrimaryKeySelective(WxUnifiedorder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_unifiedorder
     *
     * @mbggenerated Fri Feb 26 14:59:15 CST 2016
     */
    int updateByPrimaryKey(WxUnifiedorder record);
}