package edu.bionic.project551;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@ManagedBean(name = "merchantListBean")
@SessionScoped
public class MerchantListBean {
	private List<Merchant> merchants = null;
	@Autowired
	private MerchantService merchantService;
	
	public MerchantListBean(){   }

	public List<Merchant> getMerchants() {
		return merchants;
	}

	public void setMerchants(List<Merchant> merchants) {
		this.merchants = merchants;
	}

	public void refreshList(){
		merchants = merchantService.getAllMerchantList();
	}
}
