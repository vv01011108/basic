package org.example.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 의미
// 개발자가 스프링부트에게 말한다.
// 아래 있는 HomeController가 컨트롤러이다.
@Controller
public class HomeController {
    // @GetMapping("/home/main")의 의미
    // 개발자가 스프링부트에게 말한다.
    // 만약에 /home/main 이런 요청이 들어오면 아래 메서드를 실행해줘
    @GetMapping("/home/main")
    @ResponseBody
    // @ResponseBody의 의미
    // 아래 메서드를 실행한 후 그 리턴값을 응답으로 삼아줘
    public String showHome() {
        return "안녕하세요1";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showHome2() {
        return "안녕하세요2";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String showHome3() {
        return "안녕하세요3";
    }
}
