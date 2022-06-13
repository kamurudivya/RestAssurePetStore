package com.Bridelabz.RestAssurePetStore;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.given;

/*
* Rest Assure PetStore Application
 */

public class PetStoreUploadImage {

    @Test
    public void uploadFileInPetStore(){
        File file = new File("C:\\Users\\Me\\Downloads\\puupy.jpg");
        Response response = given()
                .accept("application/json")
                .contentType("multipart/form-data")
                .multiPart(file)
                .when()
                .post("https://petstore.swagger.io/v2/pet/1/uploadImage");
        response.prettyPrint();
        response.then().assertThat().statusCode(200);

    }

}

