package org.example.factory;

import org.example.factory.fac.IProduct;
import org.example.factory.pro.BeijingFactory;
import org.example.factory.pro.HeNanIphoneFactory;
import org.example.factory.pro.IFactory;
import org.example.factory.pro.NanjingComputerFactory;

/**
 * 工厂测试类
 *
 * @author wangqingao
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new NanjingComputerFactory();
        IProduct nj = factory.product();
        String productName = nj.getProductName();
        System.out.println("南京工厂=>" + productName);

        IFactory factory1 = new BeijingFactory();
        IProduct product = factory1.product();

        String productName1 = product.getProductName();
        System.out.println("北京工厂=>" + productName1);

        IFactory henanFactor = new HeNanIphoneFactory();
        IProduct iphone = henanFactor.product();
        System.out.println("河南工厂=>" + iphone.getProductName());
    }
}
