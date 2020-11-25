package com.company;

public class TestCase2 {
    public static void UnitTest2() throws Exception{

        String last_update ="9.0";
        String token = "ab5f6g";
        System.out.println("Unit test 2: Token is incorrect");
        ResponseCheckNewVersion ress = TestCaseCheckNewVersion.callAPI(last_update,token);
        if (!(ress.code.equals("9998"))) throw new AssertionError();
        ResponseLogin res = TestCaseLoginAPI.callAPI();
        if (((!res.code.equals("1000")))) throw new AssertionError();
        System.out.println("Finished");

    }
}