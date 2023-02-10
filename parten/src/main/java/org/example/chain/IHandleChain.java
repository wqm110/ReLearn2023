package org.example.chain;

/**
 * 处理接口
 *
 * @author wangqingao
 */
public interface IHandleChain {
    /**
     * 获取下一个处理
     *
     * @return IHandle 任务
     */
    IHandleChain getNext();

    /**
     * 设置下一处理步骤
     */
    void setNext(IHandleChain handler);

    /**
     * 具体处理过程
     */
    void handle();
}
