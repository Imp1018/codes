package com.lanou3g.code0523.dynamic;

import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;

public class MyResponse extends HttpServletResponseWrapper {

    private String filePath;
    // 输出流 但是不会输出到硬盘上
    // 而是把内容都写到一个char类型的数组中
    private CharArrayWriter out;

    public MyResponse(HttpServletResponse response, ServletContext app) {
        super(response);
        String path = app.getRealPath("");
        filePath = path + File.separator + "random.html";
        out = new CharArrayWriter();

    }

    @Override
    public PrintWriter getWriter() throws IOException {
        // 替换getWriter方法,让它向一个静态页面进行输出
        return new PrintWriter(out);
    }

    public void writeFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf8");
        // 把页面写入到文件中
        osw.write(out.toCharArray());
        osw.close();

    }
}
