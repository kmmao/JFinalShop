package com.cms.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePayment<M extends BasePayment<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setCreateDate(java.util.Date createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.util.Date getCreateDate() {
		return get("createDate");
	}

	public M setModifyDate(java.util.Date modifyDate) {
		set("modifyDate", modifyDate);
		return (M)this;
	}
	
	public java.util.Date getModifyDate() {
		return get("modifyDate");
	}

	public M setMemberId(java.lang.Long memberId) {
		set("memberId", memberId);
		return (M)this;
	}
	
	public java.lang.Long getMemberId() {
		return getLong("memberId");
	}

	public M setMemo(java.lang.String memo) {
		set("memo", memo);
		return (M)this;
	}
	
	public java.lang.String getMemo() {
		return getStr("memo");
	}

	public M setSn(java.lang.String sn) {
		set("sn", sn);
		return (M)this;
	}
	
	public java.lang.String getSn() {
		return getStr("sn");
	}

	public M setMethod(java.lang.String method) {
		set("method", method);
		return (M)this;
	}
	
	public java.lang.String getMethod() {
		return getStr("method");
	}

	public M setOrderId(java.lang.Long orderId) {
		set("orderId", orderId);
		return (M)this;
	}
	
	public java.lang.Long getOrderId() {
		return getLong("orderId");
	}

	public M setAmount(java.math.BigDecimal amount) {
		set("amount", amount);
		return (M)this;
	}
	
	public java.math.BigDecimal getAmount() {
		return get("amount");
	}

}
