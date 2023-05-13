package org.rpc.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Autowired BookService bookService;

    @GetMapping("/{id}")
    public Vo<Book> getBook(@PathVariable Integer id) {
        Vo<Book> bookById = bookService.getBookById(id);
        if (bookById == null) {
            return new Vo<>(1,null,"找不到该书");
        }
        return bookById;
    }

}
