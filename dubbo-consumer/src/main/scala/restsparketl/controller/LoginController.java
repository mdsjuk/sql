package restsparketl.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import restsparketl.health.DynamicDataSource.DataBase;
import restsparketl.health.entity.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import restsparketl.health.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author:wxb
 * @description:
 * @date:16:502019/11/18
 */

@Controller
public class LoginController {
    @Resource
    public UserService userService;

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/toIndex", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    @DataBase("db2")
    public String toIndex(@RequestParam String username, @RequestParam String password, HttpSession session) {

        LoginUser user = this.userService.getUserByName(username);
        if (user == null) {
            return "register";
        } else {
            if (user.getPassword().equals(password)) {
                session.setAttribute("username",username);
                return "success_1";
            } else {
                return "error password";
            }

        }
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }



}
