package com.shopping.mall.discountsapi.domain.usecase;

import java.util.List;

import com.shopping.mall.discountsapi.domain.model.Coupon;

public interface FindAllDeactivatedCoupon {
	
	List<Coupon> findAllDeactivated();

}
