package wang.leisure.provider.service;

import wang.leisure.api.ApiResult;
import wang.leisure.api.User;
import wang.leisure.api.UserService;
import wang.leisure.rpc.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ApiResult<User> getUser(Long id) {
        User user = getFromDbOrCache(id);
        return ApiResult.success(user);
    }

    private User getFromDbOrCache(Long id) {
        return new User(id, "东方雨倾", 1, "https://leisure.wang");
    }
}
