package com.moviemarket.dao;

import com.moviemarket.model.Coupon;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Maxim on 14.7.17.
 */
public interface CouponMapper {

    public List<Coupon> getAllCoupons() throws DataAccessException;

    public Coupon getCouponById(Integer couponId) throws DataAccessException;

    public Coupon getCouponByCode(String code) throws DataAccessException;

    public Integer addCoupon(Coupon coupon) throws DataAccessException;

    public Integer updateCoupon(Coupon coupon) throws DataAccessException;

    public Integer deleteCoupon(Integer couponId) throws DataAccessException;
}