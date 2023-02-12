package org.example.factory1;

/**
 * 位置
 *
 * @author wqm
 */
public interface Beijing extends ILocation {
    default String getLocation() {
        return "北京";
    }
}
