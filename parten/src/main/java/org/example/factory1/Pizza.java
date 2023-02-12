package org.example.factory1;

import lombok.Data;

/**
 * 披萨
 *
 * @author wqm
 */
@Data
public abstract class Pizza implements IFood {
    abstract IFood getFood();

    /**
     * 预备
     */
    abstract void prepare();

    /**
     * 烹饪
     */
    abstract void cock();

    /**
     * 运送
     */
    abstract Pizza delive();

    @Override
    public String getType() {
        return "披萨";
    }
}
