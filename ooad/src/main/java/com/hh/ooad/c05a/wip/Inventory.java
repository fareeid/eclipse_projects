package com.hh.ooad.c05a.wip;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> inventory;

	public Inventory() {
		inventory = new LinkedList<Instrument>();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = null;
		if (spec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);

		} else if (spec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
		}
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchSpec) {
		List<Instrument> matchingInstruments = new LinkedList<Instrument>();
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSpec().matches(searchSpec))
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
	}

	public List<Instrument> search(MandolinSpec searchSpec) {
		List<Instrument> matchingMandolins = new LinkedList<Instrument>();
		for (Iterator<Instrument> i = inventory.iterator(); i.hasNext();) {
			Mandolin mandolin = (Mandolin) i.next();
			if (mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
		}
		return matchingMandolins;
	}

}
