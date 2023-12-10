package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import com.kodilla.patterns.strategy.predictors.BalancedPredictor;
import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public  interface BuyPredictor

        {

    String predictWhatToBuy();
}
