package vfh.httpInterface.dao.buildings;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vfh.httpInterface.model.BuildingsDetail;
import vfh.httpInterface.model.BuildingsDetailExample;
import vfh.httpInterface.model.BuildingsDetailWithBLOBs;

public interface BuildingsDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int countByExample(BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int deleteByExample(BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int insert(BuildingsDetailWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int insertSelective(BuildingsDetailWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    List<BuildingsDetailWithBLOBs> selectByExampleWithBLOBs(BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    List<BuildingsDetail> selectByExample(BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    BuildingsDetailWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByExampleSelective(@Param("record") BuildingsDetailWithBLOBs record, @Param("example") BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") BuildingsDetailWithBLOBs record, @Param("example") BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByExample(@Param("record") BuildingsDetail record, @Param("example") BuildingsDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByPrimaryKeySelective(BuildingsDetailWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(BuildingsDetailWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_buildings_detail
     *
     * @mbggenerated Wed Jan 06 17:08:26 CST 2016
     */
    int updateByPrimaryKey(BuildingsDetail record);
}