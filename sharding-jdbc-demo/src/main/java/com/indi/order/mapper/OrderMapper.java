package com.indi.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.indi.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ph
 * @since 2022-05-18
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

}
