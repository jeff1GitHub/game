package com.sf.game.service;

import com.sf.game.enums.GameTypeEnum;

public interface IGameService {
    void createOrders();


    GameTypeEnum getGameType();
}
