package com.lanou3g.code0427.Util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by dllo on 18/4/27.
 */
public class IOUtil {
    public static void CloseAll(AutoCloseable...closeables){
        if (closeables==null){
            return;
        }
        for (AutoCloseable closeable : closeables) {
             // 一定要是不等于null
            if (closeable!=null){
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
