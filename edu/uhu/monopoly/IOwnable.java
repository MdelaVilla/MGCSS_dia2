package edu.uhu.monopoly;

public interface IOwnable {

	Player getProprietary();

	boolean isAvailable();

	void setProprietary(Player owner);

	void setAvailable(boolean available);

}