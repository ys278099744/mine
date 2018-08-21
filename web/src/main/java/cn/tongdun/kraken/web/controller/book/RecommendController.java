package cn.tongdun.kraken.web.controller.book;

import cn.farmerspace.dal.dao.entity.book.BookGoodEntity;
import cn.farmerspace.biz.service.book.BookGoodEntityService;
import cn.farmerspace.biz.service.user.UserEntityService;
import cn.farmerspace.core.result.Response;
import cn.tongdun.kraken.web.controller.commom.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/****************************************
 * @@CREATE : 2018-02-02 下午4:59
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 最短路径查询
 * @@VERSION :
 *
 *****************************************/
@Controller
@RequestMapping("book/")
public class RecommendController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(RecommendController.class);
    @Autowired
    private BookGoodEntityService bookGoodEntityService;
    @Autowired
    private UserEntityService userEntityService;

    @RequestMapping("getRecBooks")
    @ResponseBody
    public Response<List<BookGoodEntity>> getRecBooks() throws ParseException {

        System.out.println("进入/getRecBooks");
        List<BookGoodEntity> stocks=bookGoodEntityService.selectAll();
        return Response.success(stocks);
    }

    @RequestMapping("searchBooks")
    @ResponseBody
    public Response<List<BookGoodEntity>> searchBooks(String name) throws ParseException {
        BookGoodEntity book=new BookGoodEntity();
        book.setName(name);
        List<BookGoodEntity> stocks=bookGoodEntityService.selectEntity(book);
        return Response.success(stocks);
    }
    @RequestMapping("getSellBooksByUser")
    @ResponseBody
    public Response<List<BookGoodEntity>> getSellBooksByUser(Long userId) throws ParseException {
        BookGoodEntity book=new BookGoodEntity();
        book.setOwnerId(userId);
        List<BookGoodEntity> stocks=bookGoodEntityService.selectEntity(book);
        return Response.success(stocks);
    }
    @RequestMapping("getBookById")
    @ResponseBody
    public Response<BookGoodEntity> getBookById(Long bookId) throws ParseException {
        BookGoodEntity book=new BookGoodEntity();
        book.setId(bookId);
        List<BookGoodEntity> stocks=bookGoodEntityService.selectEntity(book);
        return Response.success(stocks.get(0));
    }

}
