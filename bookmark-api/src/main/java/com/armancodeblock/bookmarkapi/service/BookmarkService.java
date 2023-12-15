package com.armancodeblock.bookmarkapi.service;

import com.armancodeblock.bookmarkapi.domain.Bookmark;
import com.armancodeblock.bookmarkapi.dto.BookmarkDTO;
import com.armancodeblock.bookmarkapi.repository.BookmarkRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;;

    public BookmarkService(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }
@Transactional(readOnly = true)
    public BookmarkDTO getBookmarks(Integer page) {
      int pNum =  page < 0 ? 1 : page -1;
    Pageable pageable = PageRequest.of(pNum,10, Sort.Direction.DESC,"createdAt");

        return new BookmarkDTO(bookmarkRepository.findAll(pageable));
    }

    public Bookmark getBookmarkById(Long id) {
        return bookmarkRepository.getReferenceById(id);
    }

    public Bookmark addBookmark(Bookmark bookmark){
        return bookmarkRepository.save(bookmark);
    }




}
