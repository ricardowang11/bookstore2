package cn.ricardowang.www.service;

import cn.ricardowang.www.utils.Result;

/**
 * @Author: wangqin
 * @Date: 2020/12/19 0019 - 12 -19 -20:50
 * @Description: cn.ricardowang.www.service
 * @version: 1.0
 */
public class UserService {
    public static Result regist(String username, String password) {
        //todo:检测username是否已经存在
        String name = "admin";
        if (username.equals(name)) {
            return new Result(false, "The username is  possessed");
        } else {
            return new Result(true, "success,congratulations");
        }
    }
}
