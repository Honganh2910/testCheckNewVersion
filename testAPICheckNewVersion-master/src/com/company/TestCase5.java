package com.company;

import java.io.IOException;

public class TestCase5 {
    public static void Unittest5() throws IOException {

        String last_update ="9.0";
        String token = "ab5f6g";
        String your_version="8.9";
        System.out.println("Unit test 5: Your version is not newest version");
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update,token);
        if(!last_update.equals(your_version)){
            System.out.println("Please update the newest version availabe");
            if (((!res.code.equals("9994")))) throw new AssertionError();
        }


    }
}
