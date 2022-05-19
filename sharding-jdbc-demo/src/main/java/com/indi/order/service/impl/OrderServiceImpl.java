package com.indi.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.indi.order.entity.OrderEntity;
import com.indi.order.mapper.OrderMapper;
import com.indi.order.service.IOrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ph
 * @since 2022-05-18
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements IOrderService {

}
