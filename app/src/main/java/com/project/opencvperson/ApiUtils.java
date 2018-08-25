package com.project.opencvperson;

/**
 * 서버 주소
 */

public class ApiUtils {
    public static final String BASE_URL = "http:ec2-13-209-88-47.ap-northeast-2.compute.amazonaws.com:3000/";
    /**
     * Gson
     */
    public static Service getSOService() {
        return RetrofitService.getClient(BASE_URL).create(Service.class);
    }
}
