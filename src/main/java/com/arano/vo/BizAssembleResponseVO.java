package com.arano.vo;

import com.arano.domain.BizResponse;
import com.arano.entity.BizEntityC;
import com.arano.entity.BizEntityD;
import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.Optional;

/**
 * @author arano
 * @since 2021/7/18 13:10
 */
public class BizAssembleResponseVO extends BizResponse {
    @JsonGetter
    public String getC() {
        return Optional.ofNullable(getEntityC())
                .map(BizEntityC::getFieldC)
                .orElse(null);
    }

    @JsonGetter
    public String getD() {
        return Optional.ofNullable(getEntityD())
                .map(BizEntityD::getFieldD)
                .orElse(null);
    }
}
