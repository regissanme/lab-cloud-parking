package com.rsanme.parking.controller;

import com.rsanme.parking.controller.dto.ParkingCreateDTO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

/**
 * Projeto: lab-cloud-parking
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 17/08/2022
 * Hora: 16:39
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ParkingControllerTest extends AbstractContainerBase {
class ParkingControllerTest {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest() {
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {
        RestAssured.given()
                .auth()
                .basic("user", "admin")
                .when()
                .get("/parking")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    void whenCreateThenCheckIsCreated() {
        var createDTO = new ParkingCreateDTO();
        createDTO.setColor("AZUL");
        createDTO.setLicence("DMZ-1597");
        createDTO.setModel("OPALA");
        createDTO.setState("SC");

        RestAssured.given()
                .when()
                .auth().basic("user", "admin")
                .contentType(ContentType.JSON)
                .body(createDTO)
                .post("/parking")
                .then()
                .statusCode(HttpStatus.CREATED.value());
    }
}