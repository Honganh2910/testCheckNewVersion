package com.company;

import java.io.IOException;

public class TestCase6 {
    public static void Unittest6() throws IOException {
        String last_update ="9.0";
        String token = "ab5f6g";
        System.out.println("Unit test 6:New version is not exist");
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update,token);
        if (((!res.code.equals("9994")))) throw new AssertionError("Last_update: "+last_update);
        System.out.println("Finished");


    }
}
