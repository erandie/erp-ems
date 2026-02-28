package org.example.erp_system.service.implementation;

import jakarta.transaction.Transactional;
import org.example.erp_system.dto.ChartOfAccountDTO;
import org.example.erp_system.entity.ChartOfAccount;
import org.example.erp_system.repository.ChartOfAccountRepository;
import org.example.erp_system.service.ChartOfAccountService;
import org.example.erp_system.util.VarList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ChartOfAccountServiceImpl implements ChartOfAccountService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ChartOfAccountRepository chartOfAccountRepository;

    @Override
    public List<ChartOfAccountDTO> getAllAccounts() {
        List<ChartOfAccount> accounts = chartOfAccountRepository.findAll();
        return modelMapper.map(accounts, new TypeToken<List<ChartOfAccountDTO>>(){}.getType());
    }

    @Override
    public int saveAccount(ChartOfAccountDTO account) {

        ChartOfAccount chartOfAccount = modelMapper.map(account, ChartOfAccount.class);

        // Force insert
        chartOfAccount.setAccountId(null);

        chartOfAccountRepository.save(chartOfAccount);

        return VarList.Created;
    }


}
