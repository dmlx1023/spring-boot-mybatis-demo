package com.zycat.springbootmybatisdemo.mapper;

import com.zycat.springbootmybatisdemo.domain.UsrMmenus;

public interface UsrMmenusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    int insert(UsrMmenus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    int insertSelective(UsrMmenus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    UsrMmenus selectByPrimaryKey(String menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UsrMmenus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr_mmenus
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UsrMmenus record);
}