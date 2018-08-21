package cn.farmerspace.core.convert;

import java.util.List;

/**
 * Created by Think on 2016/12/3.
 */
public interface Convert<POJO, VO>{

    public abstract VO convert(POJO pojo);

    public abstract List<VO> convert(List<POJO> pojoList);
}
