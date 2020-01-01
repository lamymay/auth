package com.arc.auth.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 叶超
 * @since: 2019/13/31
 */
@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
//                .formLogin()
//                .loginPage("/test_login")
//                .loginProcessingUrl("/test_login")
//                .and()
                .authorizeRequests()
                .antMatchers(
                        "/favicon.ico",
                        "/verify/**",
                        "/test/**"
                        //登陆表单提交的地址
                        //"/v1/login/form/process"
                ).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable()
        ;

    }


    /**
     * 密码加密解密
     *
     * @return
     */
    @Bean(name = "passwordEncoder")
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean(name = "userDetailsService")
//    public UserDetailsService securitySysUserService() {
//        return new SecuritySysUserServiceImpl();
//    }
    // @Autowired  private MyAccessDeniedHandle exceptionHandler;


//    @Autowired
//    private ArcSecurityProperties arcSecurityProperties;

//        @Resource
//        private RedisTemplate<Object, Object> redisTemplate;
}
