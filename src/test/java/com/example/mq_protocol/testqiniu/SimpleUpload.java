package com.example.mq_protocol.testqiniu;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.Base64;
import com.qiniu.util.UrlSafeBase64;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import sun.net.www.http.HttpClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 七牛 java sdk 简单上传，覆盖上传，文件上传
 */
public class SimpleUpload {
    //设置好账号的ACCESS_KEY和SECRET_KEY
    static String ACCESS_KEY = "EwP8G4T4Cjf2EYCM1XU4cLkMUgKNB2_N-4U9FDMX"; //这两个登录七牛 账号里面可以找到
    static String SECRET_KEY = "_go9og2l01Faxp47CSTdcR_qrPTuaonploJU-knP";
    // 上传空间
    static String bucketName = "zyhch";
    static String domain="qx1stfd67.hn-bkt.clouddn.com";
    static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    static Configuration cfg = new Configuration(Zone.autoZone());   //zong1() 代表华北地区
    static UploadManager uploadManager = new UploadManager(cfg);

    /**
     * 主函数：程序入口，测试功能
     */
    public static void main(String[] args)  {
        // 上传文件的路径，因为在Mac下，所以路径和windows下不同house.proto
        String filePath = "D:\\dynamic.proto";
        // 上传到七牛后保存的文件名
        String key = "dynamic.proto";

        String token=auth.uploadToken(bucketName,key,43200,null);;
        //System.out.println(auth.uploadToken(bucketName,"house.proto",43200,null));
        try {
            //upload( filePath,  key,  token);
            //put64image( filePath,  key,  token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String urlStr="http://upload-z2.qiniu.com";
        String fromName=key;
        try {
            System.out.println(uploadFile(urlStr,fromName, filePath, token));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void uploadFilehttppost(String urlStr, String  key, String fileName,String token) throws Exception {

    }
    /**
     * 模拟文件post上传
     * @param urlStr（接口地址）
     * @param key（接口file接收名）
     * @param fileName（需要上传文件的本地路径）
     * @return文件上传到接口返回的结果
     */
    public static String uploadFile(String urlStr, String  key, String fileName,String token) throws Exception {
        String baseResult = null;
        try {
            final String newLine = "\r\n";
            final String boundaryPrefix = "--";
            String BOUNDARY = "----WebKitFormBoundaryxeWIVE1AsGkAN5Kz";// 模拟数据分隔线
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

            sb.append("Content-Disposition: form-data;name=\""+"token\"");
            sb.append(newLine);
            sb.append(newLine);
            sb.append(token);

            sb.append(newLine);
            sb.append(boundaryPrefix);
            sb.append(BOUNDARY);
            sb.append(newLine);
            sb.append("Content-Disposition: form-data;name=\""+"key\"");
            sb.append(newLine);
            sb.append(newLine);
            sb.append(key);

            sb.append(newLine);
            sb.append(boundaryPrefix);
            sb.append(BOUNDARY);
            sb.append(newLine);

            sb.append("Content-Disposition: form-data;name=\""+key+"\";filename=\""+ fileName + "\"" + newLine);
            sb.append("Content-Type:application/octet-stream");
            sb.append(newLine);
            sb.append(newLine);

            System.out.println(sb.toString());
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
            System.out.println(e);
        }
        return baseResult;
    }


    public  static void http(String filePath, String key, String token) throws Exception{

    }

    // base64方式上传
    public  static void put64imagewithplanhttp(String filePath, String key, String token) throws Exception{
        FileInputStream fis = null;
        int l = (int) (new File(filePath).length());
        byte[] src = new byte[l];
        fis = new FileInputStream(new File(filePath));
        fis.read(src);
        String file64 = Base64.encodeToString(src, 0);
        String url = "http://upload-z2.qiniup.com/putb64/" + l + "/key/" + UrlSafeBase64.encodeToString(key);
        URL url1=new URL(url);
        HttpClient client=HttpClient.New(url1);
    }

    // base64方式上传
    public  static void put64image(String filePath, String key, String token) throws Exception{
        FileInputStream fis = null;
        int l = (int) (new File(filePath).length());
        byte[] src = new byte[l];
        fis = new FileInputStream(new File(filePath));
        fis.read(src);
        String file64 = Base64.encodeToString(src, 0);
        String url = "http://upload-z2.qiniup.com/putb64/" + l + "/key/" + UrlSafeBase64.encodeToString(key);
        RequestBody rb = RequestBody.create(null, file64);
        Request request = new Request.Builder().url(url).addHeader("Content-Type", "application/octet-stream")
                .addHeader("Authorization", "UpToken " + token).post(rb).build();
        System.out.println(request.headers());
        OkHttpClient client = new OkHttpClient();
        okhttp3.Response response = client.newCall(request).execute();
        System.out.println(response);
    }

    /**
     * 上传方法1
     * @param filePath 文件路径  （也可以是字节数组、或者File对象）
     * @param key 上传到七牛上的文件的名称  （同一个空间下，名称【key】是唯一的）
     * @param token 空间名称  （这里是为了获取上传凭证）
     */
    public  static void upload(String filePath, String key, String token) {
        try {
            // 调用put方法上传
            Response res = uploadManager.put(filePath, key, token);
            // 打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException qe) {
                // ignore
            }
        }
    }

    /**
     * 上传方法2
     * @param file 文件
     * @param key 上传到七牛上的文件的名称  （同一个空间下，名称【key】是唯一的）
     */
    public void upload(File file, String key,String token) {
        try {
            // 调用put方法上传
            Response res = uploadManager.put(file, key, token);
            // 打印返回的信息
            System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException qe) {
                // ignore
            }
        }
    }
    /**
     * 上传方法3 覆盖上传
     * @param path 上传文件路径
     * @param key 文件名
     */
    public void overrideUpload(String path, String key,String token) {
        try {
            Response response = uploadManager.put(path, key, token);//执行上传，通过token来识别 该上传是“覆盖上传”
            System.out.println(response.toString());
        } catch (QiniuException e) {
            System.out.println(e.response.statusCode);
            e.printStackTrace();
        }
    }
    /**
     * 模拟文件post上传
     * @param urlStr（接口地址）
     * @param formName（接口file接收名）
     * @param fileName（需要上传文件的本地路径）
     * @return文件上传到接口返回的结果
     */
    public static String uploadFile64(String urlStr, String  formName, String fileName,String token) throws Exception {

        FileInputStream fis = null;
        int l = (int) (new File(fileName).length());
        byte[] src = new byte[l];
        fis = new FileInputStream(new File(fileName));
        fis.read(src);
        String file64 = Base64.encodeToString(src, 0);
        String url1 = "http://upload-z2.qiniup.com/putb64/" + l + "/key/" + UrlSafeBase64.encodeToString(formName);

        String baseResult = null;
        try {
            final String newLine = "\r\n";
            final String boundaryPrefix = "--";
            String BOUNDARY = "";// 模拟数据分隔线
            URL url = new URL(url1);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");// 设置为POST请求
            conn.setDoOutput(true);
            conn.setDoInput(true);

            conn.setRequestProperty("connection", "Keep-Alive");// 设置请求头参数
            conn.setRequestProperty("Charsert", "UTF-8");
            conn.setRequestProperty("Content-Type","multipart/form-data; boundary=" + BOUNDARY);
            conn.setRequestProperty("Authorization","UpToken "+token);
            OutputStream out = conn.getOutputStream();

            File file = new File(fileName);
            StringBuilder sb = new StringBuilder();
            sb.append(boundaryPrefix);
            sb.append(BOUNDARY);
            sb.append(newLine);
            sb.append("Content-Disposition: form-data;name=\""+formName+"\";filename=\""+ fileName + "\"" + newLine);
            sb.append("Content-Type:application/octet-stream");
            sb.append("Authorization:"+"UpToken "+token);
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
            System.out.println(e);
        }
        return baseResult;
    }



}

