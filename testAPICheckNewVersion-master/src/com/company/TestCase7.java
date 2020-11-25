package com.company;

import java.io.IOException;

public class TestCase7 {
    public static void Unittest7() throws IOException {
        String last_update ="9.0";
        String token = "ab5f6g";
        Integer active= 0;
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update,token);
        if(active==0){
            System.out.println("Unit test 7:Your account has been blocked ");
            if (((!res.code.equals("9995")))) throw new AssertionError();
            ResponseLogin resp = TestCaseLoginAPI.callAPI();
            if (((!resp.code.equals("1000")))) throw new AssertionError();
            System.out.println("Finished");
        }





    }
}
