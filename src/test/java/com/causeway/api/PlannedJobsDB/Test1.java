package com.causeway.api.PlannedJobsDB;

import com.causeway.Util.GetDate;
import com.causway.files.Payload;
import com.causway.files.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class Test1 {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }

    //Validate  the Response time for 3mos of data
    @Test
    public void Test1() throws IOException {
        RestAssured.baseURI = prop.getProperty("HOST3");

             // given

                 given()
                .queryParam("count", Payload.Count())
                .queryParam("fromDate", "2019-01-01")
                .queryParam("toDate", "2019-03-01")
                .queryParam("includefollowons", Payload.incfoll())
                .log()
                .all()

               //when

                .when()
                .get(Resources.getplannedjobdb())

                // Asserting response time is less than 2000 milliseconds
                // L just represent long. It is in millisecond by default.

                 //then

                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .then()
                .time(Matchers.lessThan(30000L));

    }


}




