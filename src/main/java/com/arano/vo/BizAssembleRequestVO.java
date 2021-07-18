package com.arano.vo;

import com.arano.domain.BizRequest;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author arano
 * @since 2021/7/18 13:10
 */
public class BizAssembleRequestVO extends BizRequest {

    @JsonSetter
    public void a(String a) {
        getEntityA().setFieldA(a);
    }

    @JsonSetter
    public void b(String b) {
        getEntityB().setFieldB(b);
    }
}
