package de.afrouper.server;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class EchoResourceTest {

    @Test
    void get() {
        Response response = given().when().get("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("GET", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }

    @Test
    void post() {
        Response response = given().when().post("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("POST", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }

    @Test
    void delete() {
        Response response = given().when().delete("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("DELETE", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }

    @Test
    void put() {
        Response response = given().when().put("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("PUT", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }

    @Test
    void options() {
        Response response = given().when().options("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("OPTIONS", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }

    @Test
    void patch() {
        Response response = given().when().patch("/echo/foo?k=v");

        Assertions.assertEquals(200, response.statusCode());

        JsonPath jsonPath = response.jsonPath();
        Assertions.assertEquals("/echo/foo", jsonPath.getString("path"));
        Assertions.assertEquals("PATCH", jsonPath.getString("method"));
        Assertions.assertEquals("v", jsonPath.getString("query.k[0]"));
    }
}