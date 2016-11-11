package org.ehais.weixin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ehais.weixin.model.WpMemberPublic;
import org.ehais.weixin.model.WpMemberPublicExample;
import org.ehais.weixin.model.WpMemberPublicWithBLOBs;

public interface WpMemberPublicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int countByExample(WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int deleteByExample(WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int insert(WpMemberPublicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int insertSelective(WpMemberPublicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    List<WpMemberPublicWithBLOBs> selectByExampleWithBLOBs(WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    List<WpMemberPublic> selectByExample(WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    WpMemberPublicWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExampleSelective(@Param("record") WpMemberPublicWithBLOBs record, @Param("example") WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") WpMemberPublicWithBLOBs record, @Param("example") WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByExample(@Param("record") WpMemberPublic record, @Param("example") WpMemberPublicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKeySelective(WpMemberPublicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(WpMemberPublicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wp_member_public
     *
     * @mbggenerated Mon Feb 15 22:30:00 CST 2016
     */
    int updateByPrimaryKey(WpMemberPublic record);
}