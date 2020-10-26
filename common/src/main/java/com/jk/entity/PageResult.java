package com.jk.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3141335290631498224L;
	//总条数
	private Long total;
	//每页展示数据
	private List rows;
	//当前页
	private Integer currPage;
	//每页展示个数
	private Integer pageSize;
	//总页数
	private Long totalPage;

	public PageResult(Long total, List rows, Integer currPage, Integer pageSize, Long totalPage) {
		this.total = total;
		this.rows = rows;
		this.currPage = currPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
	}

}
