package cn.farmerspace.biz.service.book;

import cn.farmerspace.dal.dao.entity.book.BookGoodEntity;
import cn.farmerspace.dal.dao.mapper.book.BookGoodEntityMapper;
import cn.farmerspace.core.tkmybatis.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/****************************************
 * @@CREATE : 2018-02-02 下午12:56
 * @@AUTH : NOT A CAT【NOTACAT@CAT.ORZ】
 * @@DESCRIPTION :
 * @@VERSION :
 *
 *****************************************/
@Service
public class BookGoodEntityService extends BaseServiceImpl<BookGoodEntity> {
    private final static Logger logger = LoggerFactory.getLogger(BookGoodEntityService.class);
    @Autowired
    private BookGoodEntityMapper bookGoodEntityMapper;

}
