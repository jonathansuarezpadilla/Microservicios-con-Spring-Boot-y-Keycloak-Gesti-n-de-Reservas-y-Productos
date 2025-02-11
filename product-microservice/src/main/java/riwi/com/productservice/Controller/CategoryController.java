package riwi.com.productservice.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@RefreshScope
public class CategoryController {

    @Value("${app.testProp}")
    private String testProp;


    @GetMapping("test-prop")
    public String getTestProp(){
        return this.testProp;
    }

    public void setTestProp(String testProp) {
        this.testProp = testProp;
    }
}
