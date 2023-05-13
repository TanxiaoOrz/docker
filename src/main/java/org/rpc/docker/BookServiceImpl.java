package org.rpc.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    CacheUtils cacheUtils;
    @Autowired
    BookMapper bookMapper;

    @Override
    public Vo<Book> getBookById(Integer id) {
        Book cache = cacheUtils.getCache("book", id.toString(), Book.class);
        if (cache == null) {
            Book sql = bookMapper.getBookById(id);
            if (sql != null) {
                cacheUtils.setCache("book",id.toString(),sql);
            }
            return new Vo<>(0,sql,"没命中缓存");
        }
        return new Vo<>(0,cache,"命中缓存");
    }


}
