package org.example.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @Controller 의미
// 개발자가 스프링부트에게 말한다.
// 아래 있는 HomeController가 컨트롤러이다.
@Controller
public class HomeController {

    // 전역변수로 빼왔기 때문에 새로고침할 때마다 숫자 카운트 됨
    private int count;

    public HomeController() {
        count = -1;
    }

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

    @GetMapping("/home/increase")
    @ResponseBody
    public int showIncrease() {
        count++;
        return count;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    // @RequestParam의 의미
    // 개발자가 스프링부트에게 말한다.
    // int a는 쿼리스트링에서 a 파라미터의 값을 얻은 후 정수화 한 값이어야 한다.
    // @RequestParam은 생략 가능
    public int showPlus(@RequestParam(defaultValue = "0")int a, @RequestParam(defaultValue = "0")int b) {
        return a + b;
    }
}
