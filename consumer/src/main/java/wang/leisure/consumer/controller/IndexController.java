package wang.leisure.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wang.leisure.api.ApiResult;
import wang.leisure.api.User;
import wang.leisure.api.UserService;
import wang.leisure.rpc.annotation.InjectService;

@RestController
@RequestMapping("/index/")
public class IndexController {

    @InjectService
    private UserService userService;

    /**
     * 获取用户信息
     * http://localhost:8080/index/getUser?id=1
     *
     * @param id 用户id
     * @return 用户信息
     */
    @GetMapping("getUser")
    public ApiResult<User> getUser(Long id) {
        return userService.getUser(id);
    }
}
