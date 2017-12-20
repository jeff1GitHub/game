package com.sf.game.controller;

import com.sf.game.enums.GameTypeEnum;
import com.sf.game.enums.ResultCode;
import com.sf.game.exception.GameException;
import com.sf.game.service.IGameService;
import com.sf.game.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManageController {
    @Autowired
    private List<IGameService> fda;

    @RequestMapping(value = "321", method = RequestMethod.GET)
    public JsonResult createOrders(GameTypeEnum enums) {
        IGameService gameService = null;
        for(IGameService tmpService : fda) {
            if(tmpService.getGameType() == enums) {
                gameService = tmpService;
                break;
            }
        }

        if(gameService == null) {
            throw new GameException("游戏类型不存在");
        }

        gameService.createOrders();

        return new JsonResult(ResultCode.SUCCESS);
    }
}
