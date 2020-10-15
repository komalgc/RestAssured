package com.causeway.api.PlannedJobsDB;

import com.causeway.vixen.Plannedjobssql.Plannedjobssql;
import com.causway.files.Payload;
import com.causway.files.Resources;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class Test2 {


    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }

    //Get the No of planned Jobs
    @Test
    public void Test2() throws IOException {

        RestAssured.baseURI = prop.getProperty("HOST3");


        Plannedjobssql response =
                given()
                        .queryParam("count", Payload.Count())
                        .queryParam("fromDate", Payload.FmDate())
                        .queryParam("toDate", Payload.ToDate())
                        .queryParam("includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getplannedjobdb())
                        .as(Plannedjobssql.class);

        //Object Mapper Class - to serialize java objects into JSON and deserialize JSON string into JAVA objects

        ObjectMapper objectMapper = new ObjectMapper();
        String jsoninput = objectMapper.writeValueAsString(response);
        JsonNode node = objectMapper.readValue(jsoninput, JsonNode.class);

        JsonNode jobsPlanned = node.get("masterClients").findPath("jobsPlanned");

        System.out.println("The size of jobsPlanned is: " + jobsPlanned.size());
        System.out.println(jobsPlanned);


    }


}
