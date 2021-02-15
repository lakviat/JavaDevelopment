package apiutils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class apiUtil {
    public static void main(String[] args) {
        String bodyJson = "";

        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJson).when().get("https://www.moesif.com/solutions/track-api-program?utm_campaign=analytics&utm_term=%2Bapi%20%2Btesting&utm_medium=ppc&utm_source=adwords&utm_campaign=Moesif+Features&hsa_tgt=kwd-298720611504&hsa_ver=3&hsa_acc=1107942668&hsa_cam=716956025&hsa_grp=43007528852&hsa_mt=b&hsa_src=g&hsa_ad=343020815187&hsa_net=adwords&hsa_kw=%2Bapi%20%2Btesting&gclid=CjwKCAiAgc-ABhA7EiwAjev-j190LvHZ-dvOv1hZS3FmCmtltqzkho2-bvzDruIrh928hyfzMWjVRxoCS7QQAvD_BwE");
        System.out.println(response);

    }
}
