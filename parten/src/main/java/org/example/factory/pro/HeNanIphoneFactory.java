package org.example.factory.pro;

import org.example.factory.fac.IPhone;
import org.example.factory.fac.IProduct;

/**
 * 河南IPone手机
 * @author wangqingao
 */
public class HeNanIphoneFactory implements IPhoneFactory{
    @Override
    public IProduct product() {
        return new IPhone();
    }
}
