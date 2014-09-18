/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pups.oil.util;

import com.pups.oil.dto.DealerCompanyDTO;
import com.pups.oil.dto.DealerCompanyStaffDTO;
import com.pups.oil.dto.transfer.ResponseDTO;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author aubreyM
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DataUtil {

    @PersistenceContext
    EntityManager em;
    
    public ResponseDTO registerDealerCompany(DealerCompanyDTO a, DealerCompanyStaffDTO s) {
        ResponseDTO r = new ResponseDTO();
        
        return r;
    }
}
