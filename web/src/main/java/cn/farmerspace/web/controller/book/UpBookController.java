package cn.farmerspace.web.controller.book;

import cn.farmerspace.dal.dao.entity.book.BookGoodEntity;
import cn.farmerspace.biz.service.book.BookGoodEntityService;
import cn.farmerspace.core.result.Response;
import cn.farmerspace.web.controller.commom.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;

/****************************************
 * @@CREATE : 2018-02-02 下午4:59
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION : 最短路径查询
 * @@VERSION :
 *
 *****************************************/
@Controller
@RequestMapping("book/")
public class UpBookController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(UpBookController.class);
    @Autowired
    private BookGoodEntityService bookGoodEntityService;


    @RequestMapping("upBooks")
    @ResponseBody
    public Response<String> computeStock(@RequestParam("file") MultipartFile file,Long userId,String bookName,String price,
                                                       HttpServletRequest request) throws ParseException {

        BookGoodEntity book=new BookGoodEntity();
        book.setName(bookName);
        book.setOwnerId(userId);
        book.setPrice(price);


        String fn=file.getOriginalFilename();
        int piontIndex=fn.lastIndexOf(".");

        String fileName =String.valueOf(userId)+"_"+String.valueOf(System.currentTimeMillis())+fn.substring(piontIndex,fn.length());
        String filePath = request.getSession().getServletContext().getRealPath("/WEB-INF/classes/static/imgs/");
        book.setImgId(fileName);
        try {
            uploadFile(file.getBytes(), filePath, fileName);
            bookGoodEntityService.save(book);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return Response.success("上传成功");
    }

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        File stf = new File("/home/admin/bookimgs/");
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        FileOutputStream st = new FileOutputStream(stf+"/"+fileName);

        out.write(file);
        out.flush();
        out.close();

        st.write(file);
        st.flush();
        st.close();
    }

    @RequestMapping("updateBook")
    @ResponseBody
    public String updateBook(BookGoodEntity book) throws ParseException {
        BookGoodEntity op=new BookGoodEntity();
        op.setId(book.getId());
        BookGoodEntity good=bookGoodEntityService.selectEntity(op).get(0);
        good.setName(book.getName());
        good.setPrice(book.getPrice());
        bookGoodEntityService.updateByPrimaryKey(good);
        return "success";
    }
    @RequestMapping("deleteGood")
    @ResponseBody
    public String updateBook(Long id) throws ParseException {
        BookGoodEntity op=new BookGoodEntity();
        op.setId(id);
        bookGoodEntityService.delete(op);
        return "success";
    }
}
