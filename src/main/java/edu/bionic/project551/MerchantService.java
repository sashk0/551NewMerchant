package edu.bionic.project551;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
public class MerchantService {
    @Autowired
    private MerchantDao merchantDao;

    //@Transactional
    public Merchant findById(int id) {
      return merchantDao.findById(id);
    }
    
    public List<Merchant> getAllMerchantList(){
    	return merchantDao.getAllMerchantList();
    }
    
    @Transactional
    public void save(Merchant m){
    	merchantDao.save(m);
    }
}
