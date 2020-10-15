package com.causeway.api.PlannedJobsISAM;

import com.causeway.vixen.PlannedjobsISAM.PlannedJobsisam;
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

public class Test3 {


    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }


    //compare no of PlannedJobs from DB adn ISAM request API
    @Test
    public void Test2() throws IOException {

        RestAssured.baseURI = prop.getProperty("HOST3");


        PlannedJobsisam pjisam =
                given().queryParam("Count", Payload.Count())
                        .queryParam("fromDate", Payload.FmDate())
                        .queryParam("toDate", Payload.ToDate())
                        .queryParam("Includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getplannedjobisam())
                        .as(PlannedJobsisam.class);



        ObjectMapper objectMapper = new ObjectMapper();
        String jsoninput = objectMapper.writeValueAsString(pjisam);
        JsonNode node = objectMapper.readValue(jsoninput,JsonNode.class);
        JsonNode jobsPlanned = node.get("masterClients").findPath("jobsPlanned");

        System.out.println("The size of jobsPlannedisam is: " + jobsPlanned.size());
        System.out.println(jobsPlanned);




    }
}