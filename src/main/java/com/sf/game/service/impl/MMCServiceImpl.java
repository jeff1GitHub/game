package com.sf.game.service.impl;

import com.sf.game.enums.GameTypeEnum;
import com.sf.game.service.IGameService;
import org.springframework.stereotype.Service;

@Service
public class MMCServiceImpl implements IGameService {
    public static GameTypeEnum GAME_TYPE = GameTypeEnum.MMC;

    @Override
    public void createOrders() {
        System.out.println("MMCServiceImpl");
    }

    @Override
    public GameTypeEnum getGameType() {
        return GAME_TYPE;
    }
}
