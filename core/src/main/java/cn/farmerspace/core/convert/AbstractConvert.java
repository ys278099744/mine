package cn.farmerspace.core.convert;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Think on 2016/12/3.
 */
public abstract class AbstractConvert<POJO, VO> implements Convert<POJO, VO> {

    public abstract VO convert(POJO pojo);

    public List<VO> convert(List<POJO> pojoList){
        if(CollectionUtils.isNotEmpty(pojoList)){
            List<VO> VOList = new ArrayList<VO>();
            for(Iterator<POJO> it = pojoList.iterator();it.hasNext();){
                POJO pojo = it.next();
                VOList.add(convert(pojo));
            }
            return VOList;
        }
        return Collections.EMPTY_LIST;
    }
}
