package com.ydm.api_autotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiAutotestApplicationTests {

    @Test
    public void contextLoads() {

    }


    public static void main(String[] args) throws InterruptedException {

        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add(".\\testng.xml");
        //suites.add(".\\test-output\\testng-failed.xml");
        testNG.setTestSuites(suites);
        testNG.run();
//        // 等待执行结束，然后去执行失败用例
//        TestNG testNG1 = new TestNG();
//        List<String> suites1 = new ArrayList<String>();
//        Thread.sleep(5000);
//        suites1.add(".\\test-output\\testng-failed.xml");
//        testNG1.setTestSuites(suites1);
//        testNG1.run();


    }

}
