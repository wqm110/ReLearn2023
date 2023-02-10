package org.example.chain;

/**
 * 萝卜资源
 *
 * @author wangqingao
 */
public class Radish implements IResource {
    private String name;

    @Override
    public IResource setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IResource doChain() {
        this.name+="_A_";
        return this;
    }
}
