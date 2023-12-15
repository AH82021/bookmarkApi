package com.armancodeblock.bookmarkapi.dto;

import com.armancodeblock.bookmarkapi.domain.Bookmark;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;


import java.util.List;


public class BookmarkDTO {
    private List<Bookmark>  bookmarkList;
    private long totalBookmarks;
    private int totalPages;
    private int currentPage;
    private boolean isFirst;
    private boolean isLast;
    private boolean hasNext;
    private boolean hasPrevious;

    public BookmarkDTO(Page<Bookmark> bookmarkPage) {
     this.setBookmarkList(bookmarkPage.getContent());
     this.setTotalBookmarks(bookmarkPage.getTotalElements());
     this.setTotalPages(bookmarkPage.getTotalPages());
     this.setCurrentPage(bookmarkPage.getNumber()+1);
     this.setFirst(bookmarkPage.isFirst());
     this.setLast(bookmarkPage.isLast());
     this.setHasNext(bookmarkPage.hasNext());
     this.setHasPrevious(bookmarkPage.hasPrevious());

    }

    public List<Bookmark> getBookmarkList() {
        return bookmarkList;
    }

    public void setBookmarkList(List<Bookmark> bookmarkList) {
        this.bookmarkList = bookmarkList;

    }

    public long getTotalBookmarks() {
        return totalBookmarks;
    }

    public void setTotalBookmarks(long totalBookmarks) {
        this.totalBookmarks = totalBookmarks;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean last) {
        isLast = last;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public boolean isHasPrevious() {
        return hasPrevious;
    }

    public void setHasPrevious(boolean hasPrevious) {
        this.hasPrevious = hasPrevious;
    }
}
