package com.lanou3g.hw0514.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * If there are no bugs, it was created by Chen FengYao on 2018/4/27;
 * Otherwise, I don't know who created it either
 */

public class IOUtil {
    public static void closeAll(AutoCloseable ... closeables){
        if (closeables == null){
            return;
        }
        for (AutoCloseable closeable : closeables) {
            // 一定要是 不为空
            if (closeable != null){
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
