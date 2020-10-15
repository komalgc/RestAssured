package com.causeway.api.PlannedJobsDB;

import com.causeway.Util.GetDate;
import com.causeway.vixen.Plannedjobssql.Plannedjobssql;
import com.causway.files.Payload;
import com.causway.files.Resources;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import static org.testng.Assert.assertEquals;

public class Test6 {

    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream(
                "C:\\RestAssured\\src\\test\\java\\com\\causway\\files\\env.properties");
        prop.load(fis);

    }

    //Validate  the Response time for 3mos of data
    @Test
    public void Test6() throws IOException {
        RestAssured.baseURI = prop.getProperty("HOST3");

        Plannedjobssql response =
                        given().
                        queryParam("count", 0)
                        .queryParam("fromDate", "2019-01-01")
                        .queryParam("toDate", "2019-12-01")
                        .queryParam("includefollowons", Payload.incfoll())
                        .log()
                        .all()

                        .when()
                        .get(Resources.getplannedjobdb())
                        .as(Plannedjobssql.class);


        ObjectMapper objectMapper = new ObjectMapper();
        String jsoninput = objectMapper.writeValueAsString(response);
        JsonNode node = objectMapper.readValue(jsoninput, JsonNode.class);

        //get the json node details
        JsonNode visitid = node.get("masterClients").findPath("visitId");
        JsonNode visitno = node.get("masterClients").findPath("visitNumber");
        JsonNode visitdate = node.get("masterClients").findPath("visitDate");
        JsonNode visitstatus = node.get("masterClients").findPath("status");
        JsonNode engg = node.get("masterClients").findPath("engineer");
        JsonNode completedstatus = node.get("masterClients").findPath("completed");


        //Validate the Visit details for Visit ID ZZZ999B90208

        assertEquals(visitid.textValue(), "01ZZZ999B90208");
        assertEquals(visitno.asInt(), 63);
        assertEquals(visitdate.textValue(), "2019-02-08");
        assertEquals(visitstatus.textValue(), "F");
        assertEquals(engg.textValue(), "MAB");
        assertEquals(completedstatus.asBoolean(), false);


    }
}