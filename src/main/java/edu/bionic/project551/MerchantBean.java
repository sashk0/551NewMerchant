package edu.bionic.project551;

import javax.faces.bean.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@ManagedBean(name = "merchantBean")
@SessionScoped
public class MerchantBean {
	private String name;
	private String bankName;
	private String swift;
	private String account;
	private double charge;
	private String period;
	private double minSum;

	private Merchant merchant;
	
	@Autowired
	private MerchantService merchantService;
	
	public MerchantBean(){   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public double getMinSum() {
		return minSum;
	}

	public void setMinSum(double minSum) {
		this.minSum = minSum;
	}

	public Merchant getMerchant(){
		Merchant m = new Merchant();
		m.setName(name);
		m.setBankName(bankName);
		m.setSwift(swift);
		m.setAccount(account);
		m.setCharge(charge);
		m.setPeriod(Short.valueOf(period));
		m.setMinSum(minSum);
		return m;
	}
	
	public String saveMerchant(){
		merchant = getMerchant();
		merchantService.save(merchant);
		return "save";
	}
}
