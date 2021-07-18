package com.arano.service.impl;

import com.arano.entity.BizEntityC;
import com.arano.entity.BizEntityD;
import com.arano.service.BizServiceA;
import com.arano.vo.BizNormalRequestVO;
import com.arano.vo.BizNormalResponseVO;
import org.springframework.stereotype.Service;

/**
 * @author arano
 * @since 2021/7/18 13:31
 */
@Service
public class BizAImpl implements BizServiceA {
    @Override
    public BizNormalResponseVO doBiz(BizNormalRequestVO req) {
        BizEntityC entityC = getCFromDBbyA(req.getFieldVoA());
        BizEntityD entityD = getCFromDBbyD(req.getFieldVoB());
        BizNormalResponseVO vo = new BizNormalResponseVO();
        vo.setFieldVoC(entityC.getFieldC());
        vo.setFieldVoD(entityD.getFieldD());
        return vo;
    }

    private BizEntityC getCFromDBbyA(String fieldVoA) {
        BizEntityC bizEntityC = new BizEntityC();
        bizEntityC.setFieldC(fieldVoA);
        return bizEntityC;
    }

    private BizEntityD getCFromDBbyD(String fieldVoB) {
        BizEntityD bizEntityD = new BizEntityD();
        bizEntityD.setFieldD(fieldVoB);
        return bizEntityD;
    }
}
