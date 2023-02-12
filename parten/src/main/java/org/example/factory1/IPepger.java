package org.example.factory1;

public interface IPepger extends IFood {
    String TYPE = "胡椒";

    @Override
    default String getFlavor() {
        return TYPE;
    }
}
