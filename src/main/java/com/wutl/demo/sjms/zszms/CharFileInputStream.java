package com.wutl.demo.sjms.zszms;

import java.io.*;
import java.net.URL;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-1 16:38
 */
public class CharFileInputStream extends FilterInputStream {

    protected CharFileInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int c;
        Class<CharFileInputStream> charFileInputStreamClass = CharFileInputStream.class;
        URL resource = charFileInputStreamClass.getResource("");
        String path = resource.getPath()+File.separator+"text.txt";
        File file = new File(path);
        try {
            InputStream in =
                    new CharFileInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(file)));
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
