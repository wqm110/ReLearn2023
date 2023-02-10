package org.example.factory.pro;

import org.example.factory.fac.IProduct;
import org.example.factory.fac.LenoveComputer;

/**
 * 北京生产联想电脑
 *
 * @author wangqingao
 */
public class BeijingFactory implements IComputerFactory{
    @Override
    public IProduct product() {
        return new LenoveComputer();
    }

}
