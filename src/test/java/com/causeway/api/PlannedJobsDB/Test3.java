package com.causeway.api.PlannedJobsDB;

import com.causway.files.Payload;
import com.causway.files.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class Test3 {


    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }

    //Validate  the Status Code
    @Test
    public void Test3() throws IOException {
        RestAssured.baseURI = prop.getProperty("HOST3");


        given().queryParam("count", Payload.Count())
                .queryParam("fromDate", "2019-01-01")
                .queryParam("toDate", "2019-03-01")
                .queryParam("includefollowons", Payload.incfoll())
                .log()
                .all()

                .when()
                .get(Resources.getplannedjobdb())

                .then()
                .assertThat()
                .statusCode(200);


    }
}