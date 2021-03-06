package com.eveningbread.demo.common.paging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginationInfo {
	private String url;
	private int currentPageNo;
	private int recordCountPerPage;
	private int pageSize;
	private int totalRecordCount;
	private int totalPageCount;
	private int firstPageNoOnPageList;
	private int lastPageNoOnPageList;
	private int firstRecordIndex;
	private int lastRecordIndex;




	public int getTotalPageCount() {
		this.totalPageCount = (this.getTotalRecordCount() - 1) / this.getRecordCountPerPage() + 1;
		return this.totalPageCount;
	}

	public int getFirstPageNo() {
		return 1;
	}

	public int getLastPageNo() {
		return this.getTotalPageCount();
	}

	public int getFirstPageNoOnPageList() {
		this.firstPageNoOnPageList = (this.getCurrentPageNo() - 1) / this.getPageSize() * this.getPageSize() + 1;
		return this.firstPageNoOnPageList;
	}

	public int getLastPageNoOnPageList() {
		this.lastPageNoOnPageList = this.getFirstPageNoOnPageList() + this.getPageSize() - 1;
		if (this.lastPageNoOnPageList > this.getTotalPageCount()) {
			this.lastPageNoOnPageList = this.getTotalPageCount();
		}

		return this.lastPageNoOnPageList;
	}

	public int getFirstRecordIndex() {
		this.firstRecordIndex = (this.getCurrentPageNo() - 1) * this.getRecordCountPerPage();
		return this.firstRecordIndex;
	}

	public int getLastRecordIndex() {
		this.lastRecordIndex = this.getCurrentPageNo() * this.getRecordCountPerPage();
		return this.lastRecordIndex;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
