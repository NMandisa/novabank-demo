package za.co.novabank.core.enums.aml;

/**
 * @author Noxolo.Mkhungo
 */
public enum AMLTransactionType {
    DEPOSIT("Deposit"),
    WITHDRAWAL("Withdrawal"),
    TRANSFER("Transfer"),
    PAYMENT("Payment"),
    RECEIPT("Receipt"),
    CASH_ADVANCE("Cash Advance"),
    ATM_WITHDRAWAL("ATM Withdrawal"),
    ONLINE_PAYMENT("Online Payment"),
    MOBILE_PAYMENT("Mobile Payment"),
    INTERNATIONAL_TRANSFER("International Transfer"),
    DOMESTIC_TRANSFER("Domestic Transfer"),
    CARD_TRANSACTION("Card Transaction"),
    CHEQUE_DEPOSIT("Cheque Deposit"),
    CHEQUE_WITHDRAWAL("Cheque Withdrawal"),
    STANDING_ORDER("Standing Order"),
    DIRECT_DEBIT("Direct Debit"),
    BANK_DRAFT("Bank Draft"),
    CERTIFIED_CHECK("Certified Check"),
    MONEY_ORDER("Money Order"),
    BUY_STOCKS("Buy Stocks"),
    SELL_STOCKS("Sell Stocks"),
    BUY_BONDS("Buy Bonds"),
    SELL_BONDS("Sell Bonds"),
    DIVIDEND_PAYMENT("Dividend Payment"),
    INTEREST_PAYMENT("Interest Payment"),
    ACCOUNTS_PAYABLE("Accounts Payable"),
    ACCOUNTS_RECEIVABLE("Accounts Receivable"),
    INVOICE_PAYMENT("Invoice Payment"),
    PURCHASE_ORDER("Purchase Order"),
    SALES_RECEIPT("Sales Receipt"),
    VENDOR_PAYMENT("Vendor Payment"),
    LARGE_CASH_TRANSACTION("Large Cash Transaction"),
    HIGH_RISK_INDUSTRY_TRANSACTION("High Risk Industry Transaction"),
    SUSPICIOUS_PATTERN_TRANSACTION("Suspicious Pattern Transaction"),
    PEP_INVOLVED_TRANSACTION("PEP Involved Transaction"),
    SANCTIONS_LIST_MATCH_TRANSACTION("Sanctions List Match Transaction");

    private final String description;

    AMLTransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
