package com.causeway.api.PlannedJobsDB;

import com.causway.files.Payload;
import com.causway.files.Resources;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PlannedJobsDB {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }

    @Test

    public void Test2() {

        RestAssured.baseURI = prop.getProperty("HOST3");

        Response response =
                given().queryParam("Count", "0")
                        .queryParam("fromDate", "2019-01-01")
                        .queryParam("toDate", "2019-12-01")
                        .queryParam("Includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getplannedjobdb())

                        .then()
                        .assertThat()
                        .statusCode(200).
                        extract().response();

        //   long responseTime1 = resp.getTime();
        //  System.out.println("Response time in ms using getTime() for Planned Jobs:" + responseTime1);

        System.out.println(response);

        String responsestring = response.asString();

        JsonPath js = new JsonPath(responsestring);


                int plannedJobs = js.get("masterClients[0].clients[0].sites[0].jobsPlanned.size()");

                System.out.println("No of jobsplanned " + plannedJobs);
            }


        }


