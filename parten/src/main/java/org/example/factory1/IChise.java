package org.example.factory1;

/**
 * @author wqm
 */
public interface IChise extends IFood {
    /**
     * 获取口味
     *
     * @return String
     */
    default String getFlavor() {
        return "芝士";
    }
}
