package com.example.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.reader.entity.Book;

public interface BookService {
    /**
     *
     * @param page 页号
     * @param rows 每页数量
     * @return 分页对象
     */
    public IPage<Book> paging(Long categoryId, String order, Integer page, Integer rows);

    /**
     * 根据编号查询详情
     *
     * @param bookId
     * @return
     */
    public Book selectById(Long bookId);
}
