package com.arc.auth.config.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 叶超
 * @since 2019/5/22 21:47
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
//@Component
//@ConfigurationProperties(prefix = "arc.security.code.image")
public class ImageCodeProperties  implements Serializable    {

    private int width = 60;

    private int height = 40;

    private int expiredSecond = 60;

    private String url = "/";


}
