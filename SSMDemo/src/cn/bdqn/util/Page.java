package cn.bdqn.util;

import java.util.List;

import cn.bdqn.pojo.User;

public class Page {
	//总页数
	private int pageCount;
	//页大小
	private int pageSize=6;
	//总记录数
	private int dataCount;
	//当前页码
	private int thisPageNumber;
	//页数据
	private List<User> pageDataList;
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		if(dataCount==0) {
		this.dataCount = dataCount;
		}else {
			setPageCount(dataCount%this.getPageSize()==0?dataCount/this.getPageSize():dataCount/this.getPageSize()+1);
		}
	}
	public int getThisPageNumber() {
		return thisPageNumber;
	}
	public void setThisPageNumber(int thisPageNumber) {
		this.thisPageNumber = thisPageNumber;
	}
	public List<User> getPageDataList() {
		return pageDataList;
	}
	public void setPageDataList(List<User> pageDataList) {
		this.pageDataList = pageDataList;
	}
	@Override
	public String toString() {
		return "Page [pageCount=" + pageCount + ", pageSize=" + pageSize + ", dataCount=" + dataCount
				+ ", thisPageNumber=" + thisPageNumber + ", pageDataList=" + pageDataList + "]";
	}
	public Page(int pageCount, int pageSize, int dataCount, int thisPageNumber, List<User> pageDataList) {
		super();
		this.pageCount = pageCount;
		this.pageSize = pageSize;
		this.dataCount = dataCount;
		this.thisPageNumber = thisPageNumber;
		this.pageDataList = pageDataList;
	}
	public Page() {
		super();
	}
	
}
