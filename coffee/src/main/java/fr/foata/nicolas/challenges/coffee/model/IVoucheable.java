package fr.foata.nicolas.challenges.coffee.model;

public interface IVoucheable {

	public abstract boolean  hasVoucher();
	public abstract void     setVoucher( IVoucher voucher );
	public abstract IVoucher getVoucher();
	
}
