package com.lanou3g.code0416;

import java.io.Closeable;

/**
 * Created by dllo on 18/4/16.
 */
public class IOUtils {
    public static void closeAll(Closeable... closeables) {
        if (closeables == null) {
            return;
        }
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}