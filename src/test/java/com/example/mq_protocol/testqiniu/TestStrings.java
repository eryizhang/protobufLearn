package com.example.mq_protocol.testqiniu;

import com.qiniu.util.Auth;

public class TestStrings {
    public static void main(String[] args) {
        String accessKey = "access key";
        String secretKey = "secret key";
        String bucket = "bucket name";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);

    }
}
