package com.camaratek.design.patternstrategy;

public class StrategyImpl2 implements IStrategy {

	@Override
	public void applyStrategy() {
		System.out.println( "Etape interm�diaire d'algo avec la strategie 2" );
	}

}