package BankyApplication.BankyApplication.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import BankyApplication.BankyApplication.entity.BankAccount;
import BankyApplication.BankyApplication.service.BankAccountService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/accounts")
@Tag(name = "Bank Account", description = "Bank account management APIs")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/create")
    @Operation(summary = "Create a new bank account")
    public ResponseEntity<BankAccount> createAccount(@RequestParam String accountHolderName,
                                                     @RequestParam BigDecimal initialDeposit) {
        BankAccount account = bankAccountService.createAccount(accountHolderName, initialDeposit);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    @Operation(summary = "Get all bank accounts")
    public ResponseEntity<List<BankAccount>> getAllAccounts() {
        return ResponseEntity.ok(bankAccountService.getAllAccounts());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a bank account by ID")
    public ResponseEntity<BankAccount> getAccountById(@PathVariable Long id) {
        return bankAccountService.getAccountById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/deposit")
    @Operation(summary = "Deposit funds into an account")
    public ResponseEntity<Void> deposit(@PathVariable Long id, @RequestParam BigDecimal amount) {
        bankAccountService.deposit(id, amount);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/withdraw")
    @Operation(summary = "Withdraw funds from an account")
    public ResponseEntity<Void> withdraw(@PathVariable Long id, @RequestParam BigDecimal amount) {
        bankAccountService.withdraw(id, amount);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/transfer")
    @Operation(summary = "Transfer funds between accounts")
    public ResponseEntity<Void> transfer(@RequestParam Long fromAccountId,
                                         @RequestParam Long toAccountId,
                                         @RequestParam BigDecimal amount) {
        bankAccountService.transfer(fromAccountId, toAccountId, amount);
        return ResponseEntity.ok().build();
    }
}
