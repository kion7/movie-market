package com.moviemarket.dao;

import com.moviemarket.model.Order;
import com.moviemarket.model.OrderDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Maxim on 16.7.17.
 */
public interface OrderMapper {

    public List<OrderDTO> getAllOrdersByUsername(String username) throws DataAccessException;

    public Integer addOrder(@Param("order") Order order, @Param("username") String username)
            throws DataAccessException;

    public Integer deleteOrder(Integer orderId) throws DataAccessException;
}
