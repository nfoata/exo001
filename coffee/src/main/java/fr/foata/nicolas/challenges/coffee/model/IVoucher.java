package fr.foata.nicolas.challenges.coffee.model;

public interface IVoucher {

	public abstract String getDescription();
	public abstract double calculateTotal();
	public abstract double calculateGst();
	
}
