package com.arc.auth.config.properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 自动读取配置文件中配置
 * 浏览器相关属性
 *
 * @author 叶超
 * @since: 2019/5/8 22:24
 */
@Setter
@Getter
@ToString
//@ConfigurationProperties(prefix = "arc.security.browser")
public class BrowserProperties {

    public String loginUrl = "/test_login";

    public String loginProcessingUrl = "/v1/login/form/process";

    public String cookieKey = "COOKIE_KEY_";

    //    private int rememberMeSeconds=600;
    //    private String signUpUrl;
    //    private LoginType loginType;

}
