package com.paintee.common.repository.entity.vo;

import com.paintee.common.repository.entity.PromotionCode;

public class PromotionCodeVO extends PromotionCode {

	private int addCount;
	
	public int getAddCount(){
		return addCount;
	}
	public void setAddCount(int addCount){
		this.addCount = addCount;
	}
	
}
