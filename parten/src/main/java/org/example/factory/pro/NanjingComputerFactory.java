package org.example.factory.pro;

import org.example.factory.fac.AcerComputer;
import org.example.factory.fac.IProduct;

/**
 * 南京生产 宏碁电脑
 *
 * @author wangqingao
 */
public class NanjingComputerFactory implements IComputerFactory {
    @Override
    public IProduct product() {
        return new AcerComputer();
    }

}
