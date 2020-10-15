package com.causeway.api.PlannedJobsDB;

import com.causeway.vixen.PlannedjobsISAM.PlannedJobsisam;
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
import static org.testng.Assert.assertEquals;

public class Test5 {


    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }


    //compare no of sites for plannedjobs from DB and ISAM request API
    @Test
    public void Test5() throws IOException {

        RestAssured.baseURI = prop.getProperty("HOST3");


        Plannedjobssql pj = given().queryParam("count", Payload.Count())
                .queryParam("fromDate", Payload.FmDate())
                .queryParam("toDate", Payload.ToDate())
                .queryParam("includefollowons", Payload.incfoll())
                .log()
                .all()

                .when()
                .get(Resources.getplannedjobdb())
                .as(Plannedjobssql.class);


        ObjectMapper objectMapper = new ObjectMapper();
        String jsoninput = objectMapper.writeValueAsString(pj);
        JsonNode node = objectMapper.readValue(jsoninput, JsonNode.class);
        JsonNode sitesplannedjobssql = node.get("masterClients").findPath("sites");


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


        ObjectMapper objectMapper1 = new ObjectMapper();
        String jsoninput1 = objectMapper.writeValueAsString(pjisam);
        JsonNode node1 = objectMapper.readValue(jsoninput, JsonNode.class);
        JsonNode sitesjobsPlannedisam = node.get("masterClients").findPath("sites");

        System.out.println("The size of jobsPlannedsql is: " + sitesplannedjobssql.size());
        int plannedjobssqlsites = sitesplannedjobssql.size();

        System.out.println("The size of jobsPlannedisam is: " + sitesjobsPlannedisam.size());
        int plannedjobsisamsites = sitesjobsPlannedisam.size();

        assertEquals(plannedjobssqlsites, plannedjobsisamsites);


    }
}
