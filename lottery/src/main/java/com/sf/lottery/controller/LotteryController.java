package com.sf.lottery.controller;

import com.sf.lottery.common.Context;
import com.sf.lottery.service.ILotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lottery")
public class LotteryController {
    @Autowired
    private Context context;

    @Autowired
    List<ILotteryService> lotterys;


}
