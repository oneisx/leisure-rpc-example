package wang.leisure.consumer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import wang.leisure.api.ApiResult;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndexControllerTest {

    @Resource
    private RestTemplate restTemplate;

    @Test
    public void testGetUser() {
        String url = "http://localhost:8080/index/getUser?id=1";
        ResponseEntity<ApiResult> response = restTemplate.getForEntity(url, ApiResult.class, "");
        ApiResult apiResult = response.getBody();
        System.out.println(apiResult);
    }

}
