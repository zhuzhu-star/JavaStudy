

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class commonUtils {
    private static final String name = "zhubin";
    private static final String age = "22";

    /**
     * 打印我的名字+年龄
     * @return
     */
    @PostMapping("/echo")
    public String echo(){
        String x = name + "是一个" + age + "岁的少年";
        return x;
    }

}
