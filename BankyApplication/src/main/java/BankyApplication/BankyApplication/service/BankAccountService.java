package BankyApplication.BankyApplication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BankyApplication.BankyApplication.entity.BankAccount;
import BankyApplication.BankyApplication.repository.BankAccountRepository;
import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public BankAccount createAccount(String accountHolderName, BigDecimal initialDeposit) {
        if (initialDeposit.compareTo(new BigDecimal(500)) < 0) {
            throw new IllegalArgumentException("Initial deposit must be at least 500");
        }
        BankAccount account = new BankAccount(accountHolderName, initialDeposit);
        return bankAccountRepository.save(account);
    }

    public List<BankAccount> getAllAccounts() {
        return bankAccountRepository.findAll();
    }

    public Optional<BankAccount> getAccountById(Long id) {
        return bankAccountRepository.findById(id);
    }

    @Transactional
    public void deposit(Long accountId, BigDecimal amount) {
        BankAccount account = bankAccountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
        account.setBalance(account.getBalance().add(amount));
    }

    @Transactional
    public void withdraw(Long accountId, BigDecimal amount) {
        BankAccount account = bankAccountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
        if (account.getBalance().subtract(amount).compareTo(new BigDecimal(500)) < 0) {
            throw new IllegalArgumentException("Insufficient funds to maintain minimum balance of 500");
        }
        account.setBalance(account.getBalance().subtract(amount));
    }

    @Transactional
    public void transfer(Long fromAccountId, Long toAccountId, BigDecimal amount) {
        withdraw(fromAccountId, amount);
        deposit(toAccountId, amount);
    }
}
