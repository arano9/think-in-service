package com.arano.domain;

import com.arano.entity.BizEntityA;
import com.arano.entity.BizEntityB;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author arano
 * @since 2021/7/18 14:05
 */
public class BizRequest {
    private BizEntityA entityA = new BizEntityA();
    private BizEntityB entityB = new BizEntityB();

    public BizEntityA getEntityA() {
        return entityA;
    }

    @JsonIgnore
    public void setEntityA(BizEntityA entityA) {
        this.entityA = entityA;
    }

    public BizEntityB getEntityB() {
        return entityB;
    }

    @JsonIgnore
    public void setEntityB(BizEntityB entityB) {
        this.entityB = entityB;
    }
}
