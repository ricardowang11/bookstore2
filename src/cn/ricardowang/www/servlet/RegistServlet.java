package cn.ricardowang.www.servlet;

import cn.ricardowang.www.javabean.User;
import cn.ricardowang.www.service.UserService;
import cn.ricardowang.www.utils.Result;
import com.google.gson.Gson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wangqin
 * @Date: 2020/12/19 0019 - 12 -19 -17:03
 * @Description: cn.ricardowang.www.servlet
 * @version: 1.0
 */
public class RegistServlet extends BaseServlet {
    // TODO: 2020/12/19 0019 未完成注册方法
    public void regist(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Result result = UserService.regist(username, password);

        Gson gson = new Gson();
        String json = gson.toJson(result);
        resp.getWriter().println(json);
    }
}
