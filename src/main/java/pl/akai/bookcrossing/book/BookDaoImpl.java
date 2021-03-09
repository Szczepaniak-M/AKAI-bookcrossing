package pl.akai.bookcrossing.book;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.akai.bookcrossing.model.Book;
import pl.akai.bookcrossing.model.BookRentRequest;
import pl.akai.bookcrossing.model.Tag;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

    private final BookDaoMapper bookMapper;

    @Override
    public Book getBookById(int bookId) {
        return bookMapper.getBookById(bookId);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insertBook(book);
    }

    @Override
    public List<Book> getBooksByOwnerId(int id) {
        return bookMapper.getBooksByOwnerId(id);
    }

    @Override
    public List<Book> getBooksByReaderId(int id) {
        return bookMapper.getBooksByReaderId(id);
    }

    @Override
    public List<Tag> getTagsByBookId(int id) {
        return bookMapper.getTagsByBookId(id);
    }

    @Override
    public List<Book> getBooksByTagId(int id) {
        return bookMapper.getBooksByTagId(id);
    }

    @Override
    public void updateReader(int bookId, int readerId) {
        bookMapper.updateReader(bookId, readerId);
    }

    @Override
    public void insertBookUserRequest(BookRentRequest bookRentRequest) {
        bookMapper.insertBookUserRequest(bookRentRequest);
    }

    @Override
    public List<BookRentRequest> getBookRentRequestsByReaderId(int readerId) {
        return bookMapper.getBookRentRequestsByReaderId(readerId);
    }

    @Override
    public BookRentRequest getBookRentRequestsById(int id) {
        return bookMapper.getBookRentRequestsById(id);
    }

    @Override
    public void deleteBookRentRequestsById(int id) {
        bookMapper.deleteBookRentRequestsById(id);
    }

    @Override
    public Integer getBookRentRequestByRequesterAndBookIds(int requesterId, int bookId) {
        return bookMapper.getBookRentRequestByRequesterAndBookIds(requesterId, bookId);
    }

    @Override
    public void updateAvailable(int bookId, boolean available) {
        bookMapper.updateAvailable(bookId, available);
    }
}
