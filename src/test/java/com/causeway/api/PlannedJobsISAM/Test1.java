package com.causeway.api.PlannedJobsISAM;

import com.causeway.Util.GetDate;
import com.causway.files.Payload;
import com.causway.files.Resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
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

    //Compare  the Response time for 3mos of data
    @Test
    public void Test1() throws IOException {
        RestAssured.baseURI = prop.getProperty("HOST3");

        Response response1 =
                given().queryParam("Count", Payload.Count())
                        .queryParam("fromDate", Payload.FmDate())
                        .queryParam("toDate", Payload.ToDate())
                        .queryParam("Includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getplannedjobisam())

                        .then()
                        .assertThat()
                        .statusCode(200).
                        extract().response();

        long responseTime1 = response1.getTime();


        System.out.println("Response time in ms using getTime() for Planned Jobs ISAM: on Date " + GetDate.getDate() + " is " + responseTime1 + " milliseconds ");

        PrintStream o = new PrintStream(new File("C:\\Users\\Komal.Chowdhary\\Desktop\\A.txt"));

        // Store current System.out before assigning a new value
        PrintStream console = System.out;

        // Assign o to output stream
        System.setOut(o);
        System.out.println("Response time in ms using getTime() for Planned Jobs ISAM: on Date " + GetDate.getDate() + " is " + responseTime1 + " milliseconds ");


    }
}
