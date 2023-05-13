package org.rpc.docker;

public interface BookService {

    Vo<Book> getBookById(Integer id);

}
