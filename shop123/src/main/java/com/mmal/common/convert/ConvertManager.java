package com.mmal.common.convert;

import java.util.List;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
public interface ConvertManager {

    public <T> T  tran(Object b, Class<T> c);

    public <T> List<T> convertList(List<?> oList, Class<T> c);

    void tranTo(Object src, Object dest);
}
