package com.company;

import java.io.IOException;

public class TestCase4 {
    public static void Unittest4( ) throws IOException {
        String last_update ="9.0";
        String token = "ab5f6g";
        System.out.println("Unit test 4: The account is blocked");
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI( last_update,token);
        if (((!res.code.equals("9995")))) throw new AssertionError();
        ResponseLogin resp = TestCaseLoginAPI.callAPI();
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        System.out.println("Finished");

    }
}
