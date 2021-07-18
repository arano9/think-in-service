package com.arano.controller;

import com.arano.domain.BizResponse;
import com.arano.service.BizServiceA;
import com.arano.service.BizServiceB;
import com.arano.vo.BizAssembleRequestVO;
import com.arano.vo.BizNormalRequestVO;
import com.arano.vo.BizNormalResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arano
 * @since 2021/7/18 13:08
 */
@RestController
@RequestMapping("/biz")
public class BizController {
    BizServiceA bizServiceA;
    BizServiceB bizServiceB;

    @Autowired
    public void setBizService(BizServiceA bizServiceA) {
        this.bizServiceA = bizServiceA;
    }

    @Autowired
    @Qualifier("bizBImpl")
    public void setBizServiceB(BizServiceB bizServiceB) {
        this.bizServiceB = bizServiceB;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/normal")
    public BizNormalResponseVO doSomeThing(@RequestBody BizNormalRequestVO req) {
        return bizServiceA.doBiz(req);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/assemble")
    public BizResponse doThing(@RequestBody BizAssembleRequestVO req) {
        return bizServiceB.doBiz(req);
    }
}
