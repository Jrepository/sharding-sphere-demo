package com.indi.order.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author ph
 * @since 2022-05-18
 */
@Data
@Builder
@TableName("order")
@ApiModel(value = "OrderEntity对象", description = "")
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("user_id")
    private Long userId;

    @TableField("order_number")
    private Long orderNumber;

    @TableField("pay_amount")
    private BigDecimal payAmount;

//    @TableField(value = "create_time", fill = FieldFill.INSERT)
//    private LocalDateTime createTime;
//
//    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
//    private LocalDateTime updateTime;

}
