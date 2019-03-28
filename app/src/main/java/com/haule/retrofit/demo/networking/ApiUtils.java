package com.haule.retrofit.demo.networking;

public class ApiUtils {
    private static final String STAGING = "";
    private static final String DEV = "https://api.stackexchange.com/2.2/";
    private static final String PRODUCTION = "";

    public static ApiServices getApiService() {
        return RetrofitClient.getClient(DEV).create(ApiServices.class);
    }
}
