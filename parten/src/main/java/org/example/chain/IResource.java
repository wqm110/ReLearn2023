package org.example.chain;

/**
 * 处理资源类
 *
 * @author wangqingao
 */
public interface IResource {
    /**
     * 设置名称
     *
     * @param name 名
     * @return IResource
     */
    IResource setName(String name);

    /**
     *  获取名字
     *
     * @return String
     */
    String getName();

    IResource doChain();
}
