package com.arc.auth.config.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 叶超
 * @since 2019/5/22 22:17
 */
@Setter
@Getter
@NoArgsConstructor
public class ValidateCodeProperties {


    private int length = 4;

    private ImageCodeProperties image = new ImageCodeProperties();

}
