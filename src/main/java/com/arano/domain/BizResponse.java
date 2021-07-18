package com.arano.domain;

import com.arano.entity.BizEntityC;
import com.arano.entity.BizEntityD;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author arano
 * @since 2021/7/18 14:06
 */
public class BizResponse {
    private BizEntityC entityC;
    private BizEntityD entityD;

    @JsonIgnore
    public BizEntityC getEntityC() {
        return entityC;
    }

    public void setEntityC(BizEntityC entityC) {
        this.entityC = entityC;
    }

    @JsonIgnore
    public BizEntityD getEntityD() {
        return entityD;
    }

    public void setEntityD(BizEntityD entityD) {
        this.entityD = entityD;
    }
}
