package com.sf.game.service.impl;

import com.sf.game.enums.GameTypeEnum;
import com.sf.game.service.IGameService;
import org.springframework.stereotype.Service;

@Service
public class SSCServiceImpl implements IGameService {
    public static GameTypeEnum GAME_TYPE = GameTypeEnum.SSC;

    @Override
    public void createOrders() {
        System.out.println("SSCServiceImpl");
    }

    @Override
    public GameTypeEnum getGameType() {
        return GAME_TYPE;
    }
}
