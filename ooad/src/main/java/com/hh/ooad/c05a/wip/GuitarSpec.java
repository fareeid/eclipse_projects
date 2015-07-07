package com.hh.ooad.c05a.wip;

public class GuitarSpec extends InstrumentSpec {
	protected int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		super(builder, model, type, topWood, topWood);
	}

	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (!super.matches(otherSpec))
			return false;
		if (!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec)otherSpec;
		if (numStrings!=spec.numStrings)
			return false;
		return true;
	}
	
}
