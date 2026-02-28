package org.example.erp_system.service;

import org.example.erp_system.dto.ChartOfAccountDTO;
import org.example.erp_system.entity.ChartOfAccount;

import java.util.List;

public interface ChartOfAccountService {
    int saveAccount(ChartOfAccountDTO account);

    List<ChartOfAccountDTO> getAllAccounts();

}
