package com.company;



public class TestCase1 {
    public static void UnitTest1() throws Exception  {

        String last_update="9.0";
        String token = "ab5f6g";
        System.out.println("Unit test 1: Change Password Satisfied");
        ResponseCheckNewVersion res = TestCaseCheckNewVersion.callAPI(last_update,token);
        if(!("1000".equals(res.code)))throw new AssertionError();
        System.out.println("Finished!");
    }
}
