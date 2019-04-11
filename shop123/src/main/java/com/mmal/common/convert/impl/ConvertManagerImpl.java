package com.mmal.common.convert.impl;

import com.mmal.common.convert.ConvertManager;
import org.dozer.DozerBeanMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 对象转换实现类
 *
 * @author wangyf
 * @date 2019/4/2
 */
public class ConvertManagerImpl implements ConvertManager {

    @Resource
    private DozerBeanMapper mapper;
    @Override
    public <T> T tran(Object b, Class<T> c) {
        return mapper.map(b,c);
    }

    @Override
    public <T> List<T> convertList(List<?> oList, Class<T> c) {
        if (oList == null) {
            return null;
        }
        List<T> returnList = new ArrayList<>();
        for (Object o : oList) {
            if (o != null) {
                T f = mapper.map(o, c);
                returnList.add(f);
            }
        }
        return returnList;
    }

    @Override
    public void tranTo(Object src, Object dest) {
        this.mapper.map(src, dest);
    }
}
