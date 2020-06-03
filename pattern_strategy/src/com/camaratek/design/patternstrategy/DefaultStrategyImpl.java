package com.camaratek.design.patternstrategy;

public class DefaultStrategyImpl implements IStrategy {

		@Override
		public void applyStrategy() {
			System.out.println( "Etape intermédiaire d'algo avec la strategie par defaut" );
		}

	}
