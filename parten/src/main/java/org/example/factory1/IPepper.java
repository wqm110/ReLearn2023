package org.example.factory1;

/**
 * @author wqm
 */
public interface IPepper extends IFood {
    String TYPE = "胡椒";

    @Override
    default String getFlavor() {
        return TYPE;
    }
}
