package com.gildedrose;

public class Normal  extends  BasicItem {
	public Normal(Long quality, Long daysRemaining) {
		super(quality, daysRemaining);
	}

	@Override
	public void tick() {
		setDaysRemaining(getDaysRemaining() - 1);
		if (getQuality() == 0) return;

		setQuality(getQuality() - 1);
		if (getDaysRemaining() <= 0) {
			setQuality(getQuality() - 1);
		}
	}
}