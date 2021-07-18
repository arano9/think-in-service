package com.arano.service;

import com.arano.domain.BizRequest;
import com.arano.domain.BizResponse;

/**
 * @author arano
 * @since 2021/7/18 13:20
 */
public interface BizServiceB<Req extends BizRequest, Resp extends BizResponse> {
    Resp doBiz(Req req);
}
