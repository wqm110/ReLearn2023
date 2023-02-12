package org.example.factory1;

/**
 * 位置
 *
 * @author wqm
 */
public interface Landon extends ILocation {
    default String getLocation() {
        return "伦敦";
    }
}
