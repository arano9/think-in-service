package com.arano.service.impl;

import com.arano.domain.BizRequest;
import com.arano.domain.BizResponse;
import com.arano.entity.BizEntityC;
import com.arano.entity.BizEntityD;
import com.arano.service.BizServiceB;
import com.arano.vo.BizAssembleRequestVO;
import com.arano.vo.BizAssembleResponseVO;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author arano
 * @since 2021/7/18 14:23
 */
@Service("bizBImpl")
public class BizBImpl implements BizServiceB<BizAssembleRequestVO, BizAssembleResponseVO> {
    @Override
    public BizAssembleResponseVO doBiz(BizAssembleRequestVO bizAssembleRequestVO) {
        BizAssembleResponseVO responseVO = new BizAssembleResponseVO();
        fillResponse(responseVO, bizAssembleRequestVO);
        return responseVO;
    }

    /**
     * 可复用
     *
     * @param bizResponse
     * @param bizRequest
     */
    protected void fillResponse(BizResponse bizResponse, BizRequest bizRequest) {
        Objects.requireNonNull(bizResponse);
        bizResponse.setEntityC(getCByReq(bizRequest));
        bizResponse.setEntityD(getDByReq(bizRequest));
    }

    private BizEntityD getDByReq(BizRequest bizRequest) {
        return new BizEntityD(bizRequest.getEntityB().getFieldB());
    }

    private BizEntityC getCByReq(BizRequest bizRequest) {
        return new BizEntityC(bizRequest.getEntityA().getFieldA());
    }

}
