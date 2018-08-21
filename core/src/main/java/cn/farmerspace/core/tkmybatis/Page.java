package cn.farmerspace.core.tkmybatis;

import java.util.List;

/****************************************
 * @@CREATE : 2018-02-02 下午9:48
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 分页相关
 * @@VERSION :
 *
 *****************************************/
public class Page<T> {
    private long total;//总记录数
    private int curPage;//当前页
    private int pageSize;//每页的数量
    private int pages;//总页数
    private int size;//当前页的数量
    private List<T> contents;//内容列表

    public Page(){

    }

    public Page(long total, int curPage, int pageSize, int pages, int size, List<T> contents) {
        this.total = total;
        this.curPage = curPage;
        this.pageSize = pageSize;
        this.pages = pages;
        this.size = size;
        this.contents = contents;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<T> getContents() {
        return contents;
    }

    public void setContents(List<T> contents) {
        this.contents = contents;
    }
}
