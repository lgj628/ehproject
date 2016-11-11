package org.ehais.weixin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ehais.weixin.model.WpMember;
import org.ehais.weixin.model.WpMemberExample;

public interface WpMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int countByExample(WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int deleteByExample(WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int insert(WpMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int insertSelective(WpMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    List<WpMember> selectByExampleWithBLOBs(WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    List<WpMember> selectByExample(WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    WpMember selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExampleSelective(@Param("record") WpMember record, @Param("example") WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WpMember record, @Param("example") WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExample(@Param("record") WpMember record, @Param("example") WpMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKeySelective(WpMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(WpMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKey(WpMember record);
}