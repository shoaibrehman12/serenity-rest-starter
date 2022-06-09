package starter.postcodes;


import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Assert;


import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostCodeAPI {


     private static String LOCATION_BY_POST_CODE_AND_COUNTRY = "https://android.app%40leyjao.pk:5fF9mu5s052F729JD9RBbwZ28371g95a@stage.leyjao.pk/api/User/{process}/";
     private static String get_user_api_link = "https://android.app%40leyjao.pk:5fF9mu5s052F729JD9RBbwZ28371g95a@stage.leyjao.pk/api/User/{id}/";

/*
 this is Put API
    leyjao.pk*/
      public void fetchLocationByPostCodeAndCountry(String process) {
        Map<String , Object>reg =new HashMap<>();
        reg.put("password", "1234567");
        reg.put("lastname", "update");
        reg.put("phone", "000000000000");

          SerenityRest.given()
                .header("Content-Type","application/json")
                .pathParam("process", process)
                 .body(reg)
                .put(LOCATION_BY_POST_CODE_AND_COUNTRY);



/*

String url ="https://android.app%40leyjao.pk:5fF9mu5s052F729JD9RBbwZ28371g95a@stage.leyjao.pk/api/User/";

                RestAssured.given().header("Content-Type","application/json");
                RestAssured.given().header("Connection","keep-alive");

        ResponseBody statusCode= (ResponseBody) RestAssured
                .given()
                //for social_login =login_by_email     social_
                        .queryParam("process","login_by_email")
                        .queryParam("email","shoa@leyjao.com")
                        .queryParam("password","123456")
                .when()
                        .get(url)
                .then().log().body();*/
//                        .getBody()
//         JsonPath status=statusCode.jsonPath();
//
//         JsonPath json=statusCode.jsonPath();
//         String  l = json.get("status_code");
//        System.out.println(l);
//        System.out.println("The response status is "+statusCode.asPrettyString());
//     .then().log().all().assertThat().body(Matchers.equalTo("{\"status\":{\"status\":true,\"status_code\":200,\"status_message\":\"You have been successfully logged in.\"},\"data\":{\"user_id\":\"9243\",\"status\":\"A\",\"user_type\":\"C\",\"user_login\":\"user_9243\",\"referer\":\"\",\"is_root\":\"N\",\"company_id\":\"0\",\"last_login\":\"1654592613\",\"timestamp\":\"1654260135\",\"password\":\"9b51d2926e2cbb61c531cc7f6540a219\",\"salt\":\"bkv!_raLJS\",\"firstname\":\"sho\",\"lastname\":\"Qa\",\"company\":\"\",\"email\":\"shoa@leyjao.com\",\"phone\":\"\",\"fax\":\"\",\"url\":\"\",\"tax_exempt\":\"N\",\"lang_code\":\"en\",\"birthday\":\"\",\"purchase_timestamp_from\":\"\",\"purchase_timestamp_to\":\"\",\"responsible_email\":\"\",\"last_passwords\":\"\",\"password_change_timestamp\":\"1\",\"api_key\":\"\",\"janrain_identifier\":\"\",\"partner_id\":\"\",\"usergroups\":[],\"profile_id\":\"9235\",\"profile_type\":\"P\",\"b_firstname\":\"\",\"b_lastname\":\"\",\"b_address\":\"\",\"b_address_2\":\"\",\"b_city\":\"\",\"b_county\":\"\",\"b_state\":\"\",\"b_country\":\"PK\",\"b_zipcode\":\"\",\"b_phone\":\"\",\"s_firstname\":\"\",\"s_lastname\":\"\",\"s_address\":\"\",\"s_address_2\":\"\",\"s_city\":\"\",\"s_county\":\"\",\"s_state\":\"\",\"s_country\":\"PK\",\"s_zipcode\":\"\",\"s_phone\":\"\",\"s_address_type\":\"\",\"profile_name\":\"Main\",\"profile_update_timestamp\":\"1654260135\",\"fields\":[],\"b_country_descr\":\"Pakistan\",\"s_country_descr\":\"Pakistan\",\"points\":0}}"));




 /*      // String url ="https://android.app%40leyjao.pk:5fF9mu5s052F729JD9RBbwZ28371g95a@stage.leyjao.pk/api/User/";
        String url ="https://android.app%40leyjao.pk:5fF9mu5s052F729JD9RBbwZ28371g95a@stage.leyjao.pk/api/User/{id}/";

        Map<String , Object>reg =new HashMap<>();
//        reg.put("email", "shoaib_khan@leyjao.com");
//        reg.put("company_id", "0");
//        reg.put("user_type", "A");
        reg.put("password", "1234567");
        reg.put("lastname", "update");
        reg.put("phone", "000000000000");

      ResponseBody res= RestAssured.given()
              .header("Content-Type","application/json")
                .pathParam("id","9243")
                      .body(reg)
                .when()
                    //  .post(url)
                      .put(url)
                .then()
            //    .log().all().assertThat().statusCode(200);
                .log().all().assertThat().extract().response();
        String s= res.asString();
        System.out.println(s);
*/
    }
    /*
     this is get API
        leyjao.pk*/
    public void fetchuserinfo(Integer id) {
         SerenityRest.given()
        .pathParam("id",id)
        .get(get_user_api_link);

    }
}
