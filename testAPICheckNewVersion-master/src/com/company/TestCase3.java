package com.company;

import java.io.IOException;

public class TestCase3 {
    public static void Unittest3() throws IOException {
        String last_update ="9.0";
        String token = "ab5f6g";
        System.out.println("Unit test 3: The internet connected");
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update,token);
        if (!(res.code.equals("1001"))) throw new AssertionError();
        System.out.println("Can not connect to DB");
        System.out.println("Finished");
    }
}
