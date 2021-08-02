package com.example.mq_protocol.testqiniu;

import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.util.Auth;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTest {
    //设置好账号的ACCESS_KEY和SECRET_KEY
    static String ACCESS_KEY = "EwP8G4T4Cjf2EYCM1XU4cLkMUgKNB2_N-4U9FDMX"; //这两个登录七牛 账号里面可以找到
    static String SECRET_KEY = "_go9og2l01Faxp47CSTdcR_qrPTuaonploJU-knP";
    // 上传空间
    static String bucketName = "zyhch";
    static String domain="qx1stfd67.hn-bkt.clouddn.com";
    static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    static Configuration cfg = new Configuration(Zone.autoZone());   //zong1() 代表华北地区

    public static void main(String[] args) throws Exception {
        // 上传文件的路径，因为在Mac下，所以路径和windows下不同
        String filePath = "D:\\dynamic.proto";
        // 上传到七牛后保存的文件名
        String key = "dynamic.proto";

        String token=auth.uploadToken(bucketName);
    }

    public static String uploadFile()
    {
        StringBuffer fileUrl=new StringBuffer(domain);
        //Configuration cfg
        return null;
    }

    /**
     * 模拟文件post上传
     * @param urlStr（接口地址）
     * @param formName（接口file接收名）
     * @param fileName（需要上传文件的本地路径）
     * @return文件上传到接口返回的结果
     */
    public static String uploadFile(String urlStr, String  formName, String fileName) {
        String baseResult = null;
        try {
            final String newLine = "\r\n";
            final String boundaryPrefix = "--";
            String BOUNDARY = "========7d4a6d158c9";// 模拟数据分隔线
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");// 设置为POST请求
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setRequestProperty("connection", "Keep-Alive");// 设置请求头参数
            conn.setRequestProperty("Charsert", "UTF-8");
            conn.setRequestProperty("Content-Type","multipart/form-data; boundary=" + BOUNDARY);
            OutputStream out = conn.getOutputStream();

            File file = new File(fileName);
            StringBuilder sb = new StringBuilder();
            sb.append(boundaryPrefix);
            sb.append(BOUNDARY);
            sb.append(newLine);
            sb.append("Content-Disposition: form-data;name=\""+formName+"\";filename=\""+ fileName + "\"" + newLine);
            sb.append("Content-Type:application/octet-stream");
            sb.append(newLine);
            sb.append(newLine);

            out.write(sb.toString().getBytes());// 将参数头的数据写入到输出流中

            DataInputStream in = new DataInputStream(new FileInputStream(file));// 数据输入流,用于读取文件数据
            byte[] bufferOut = new byte[1024];
            int bytes = 0;

            while ((bytes = in.read(bufferOut)) != -1) {// 每次读1KB数据,并且将文件数据写入到输出流中
                out.write(bufferOut, 0, bytes);
            }

            out.write(newLine.getBytes());
            in.close();

            byte[] end_data = (newLine + boundaryPrefix + BOUNDARY
                    + boundaryPrefix + newLine).getBytes();

            out.write(end_data);
            out.flush();
            out.close();


            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line = null;
            StringBuffer strs = new StringBuffer("");
            while ((line = reader.readLine()) != null) {
                strs.append(line);
            }
            baseResult = strs.toString();
        } catch (Exception e) {
            baseResult = e.getMessage();
        }
        return baseResult;
    }
}
