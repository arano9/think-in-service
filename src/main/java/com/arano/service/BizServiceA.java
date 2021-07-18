package com.arano.service;

import com.arano.vo.BizNormalRequestVO;
import com.arano.vo.BizNormalResponseVO;

/**
 * @author arano
 * @since 2021/7/18 13:20
 */
public interface BizServiceA {
    BizNormalResponseVO doBiz(BizNormalRequestVO req);
}
