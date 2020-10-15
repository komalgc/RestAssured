package com.causeway.api.ReactiveJobsDB;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import java.io.*;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.causway.files.Payload;
import com.causway.files.Resources;

public class ReactiveJobsDB {
    Properties prop = new Properties();


    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }


    @Test(dataProvider="DateRange")

    public void Test1(String Fmdate, String Todate ) {

        RestAssured.baseURI = prop.getProperty("HOST2");


        Response resp =


                given().queryParam("Count", Payload.Count())
                        .queryParam("fromDate", Fmdate)
                        .queryParam("toDate", Todate)
                        .queryParam("Includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getreactivejobdb())

                        .then()
                        .assertThat()
                        .statusCode(200).
                        extract().response();

        long responseTime1 = resp.getTime();
        System.out.println("Response time in ms using getTime() for Planned Jobs:" + responseTime1);

    }



    @DataProvider(name="DateRange")

    public Object[][]  getDateRange()

    {

        return new Object[][] {{"2019-01-01","2019-01-02"},{"2019-01-01","2019-03-01"}, {"2019-01-01","2019-12-01"}};


    }





}


