package com.arc.auth.controller.data;

//import com.arc.core.model.request.system.UserRequest;
//import com.arc.utils.Assert;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 用户相关的的接口by RESTful
 *
 * @author yehcao
 * @date 2018/12/25
 */
@Slf4j
@RestController
@RequestMapping("/v2")
public class UserController {

    @Data
    class User {
        private String username;
        private String password;
    }

    @PostMapping(value = "/login/form/process")
    public ResponseEntity loginV1(User user) {
        log.debug("LOGIN");
        log.info("LOGIN");
        log.warn("LOGIN");
        System.out.println(user);
        return ResponseEntity.ok(true);
    }


    @GetMapping(value = "/{id}")
    public Object get(@PathVariable Long id) {
        log.debug("获取单个用户,参数 id={}", id);
        return "id->" + id;
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    @PostMapping(value = "/list")
    public Object list() {
        log.debug("获取用户列表。");
        return "list 获取用户列表 [,,,,,,,,]";
    }


//    @Resource
//    private SysUserService userService;

    // 测试登陆1
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Map user) {
//        return ResponseEntity.ok(userService.login(user.getIdentifier(), user.getCredential()));
        return ResponseEntity.ok(true);
    }

    // 测试登陆2
    @GetMapping("/login/{u}/{p}/{identityType}")
    public ResponseEntity test1(@PathVariable String u, @PathVariable String p, @PathVariable Integer identityType) {
        Assert.notNull(u, "username 不能为空");
        Assert.notNull(p, "password 不能为空");
        Assert.notNull(identityType, "认证类型不能为空");
//        return ResponseEntity.ok(userService.login(u, p, identityType));
        return ResponseEntity.ok(true);
    }

    @GetMapping(value = "/info/{id}")
    @ResponseBody
    public Object user(@PathVariable Long id) {
        return id;
    }
}

