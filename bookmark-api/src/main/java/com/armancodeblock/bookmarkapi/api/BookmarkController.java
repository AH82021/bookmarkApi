package com.armancodeblock.bookmarkapi.api;

import com.armancodeblock.bookmarkapi.domain.Bookmark;
import com.armancodeblock.bookmarkapi.dto.BookmarkDTO;
import com.armancodeblock.bookmarkapi.service.BookmarkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bookmark")
public class BookmarkController {
    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }
@GetMapping
    public BookmarkDTO getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page) {
        return bookmarkService.getBookmarks(page);
    }
}
