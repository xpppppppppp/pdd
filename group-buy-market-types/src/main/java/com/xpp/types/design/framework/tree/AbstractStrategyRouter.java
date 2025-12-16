package com.xpp.types.design.framework.tree;

public abstract class AbstractStrategyRouter<T, D, R> implements StrategyHandler<T, D, R>, StrategyMapper<T, D, R> {

    protected StrategyHandler<T, D, R> defaultStrategyHandler = StrategyHandler.DEFAULT;


    public R Router(T requestParameter, D dynamicContext) throws Exception{
        StrategyHandler<T, D, R> strategyHandler = get(requestParameter, dynamicContext);
        if (strategyHandler != null) {
            return strategyHandler.apply(requestParameter, dynamicContext);
        }
        else {
            return defaultStrategyHandler.apply(requestParameter, dynamicContext);
        }
    }
}
