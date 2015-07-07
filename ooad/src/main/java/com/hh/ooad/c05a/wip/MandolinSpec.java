package com.hh.ooad.c05a.wip;

public class MandolinSpec extends InstrumentSpec {
	protected Style style;

	public MandolinSpec(Builder builder, String model, Type type, Style style, int numStrings, Wood backWood, Wood topWood) {
		super(builder, model, type, topWood, topWood);
		this.style=style;
	}

	public Style getStyle() {
		return style;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof MandolinSpec))
			return false;
		MandolinSpec spec = (MandolinSpec)otherSpec;
		if (!style.equals(spec.style))
			return false;
		return true;
	}
	
}
