package org.example.factory.pro;

import org.example.factory.fac.IProduct;

/**
 * 工厂接口
 *
 * @author wangqingao
 */
public interface IFactory {
    /**
     * 生产
     *
     * @return
     */
    IProduct product();
}
