package za.co.novabank.core.enums;

/**
 * @author Noxolo.Mkhungo
 */
public enum TransactionType {
    DEPOSIT("Deposit of funds into an account"),
    WITHDRAWAL("Withdrawal of funds from an account"),
    TRANSFER("Transfer of funds between accounts"),
    PAYMENT("Payment to a third party"),
    LOAN_PAYMENT("Repayment of a loan"),
    DIRECT_DEPOSIT("Direct deposit of funds into an account"),
    DIRECT_CREDIT("Credit directly into an account"),
    DIRECT_DEBIT("Debit directly from an account"),
    CHEQUE_DEPOSIT("Deposit of a cheque"),
    CHEQUE_PAYMENT("Payment via cheque"),
    ATM_WITHDRAWAL("Cash withdrawal from an ATM"),
    ONLINE_TRANSFER("Transfer of funds through online banking"),
    MOBILE_TRANSFER("Transfer of funds through mobile banking"),
    FOREIGN_TRANSFER("Transfer of funds to a foreign account"),
    INVESTMENT("Investment in financial instruments"),
    DIVIDEND("Dividend payment from investments"),
    INTEREST_PAYMENT("Payment of interest"),
    FEE("Service fee charged by the bank"),
    CHARGE("Additional charge or fee"),
    REVERSAL("Reversal of a previous transaction"),
    ADJUSTMENT("Adjustment to the account balance"),
    REFUND("Refund of funds to the account"),
    ADVANCE("Advance of funds from a credit line"),
    LOAN_DISBURSEMENT("Disbursement of loan funds"),
    LOAN_COLLATERAL("Use of collateral for a loan"),
    LOAN_REPAYMENT("Repayment of loan principal"),
    LOAN_INTEREST("Payment of loan interest"),
    LOAN_FEES("Fees associated with a loan"),
    MORTGAGE_PAYMENT("Mortgage payment"),
    MORTGAGE_INTEREST("Payment of mortgage interest"),
    MORTGAGE_FEES("Fees associated with a mortgage"),
    MORTGAGE_REPAYMENT("Repayment of mortgage principal"),
    INSURANCE_PAYMENT("Payment for insurance premiums"),
    INSURANCE_PREMIUM("Insurance premium payment"),
    INSURANCE_CLAIM("Payout of an insurance claim"),
    INSURANCE_REFUND("Refund of an insurance premium"),
    BROKERAGE_FEE("Fee charged by a broker"),
    COMMISSION("Commission earned or paid"),
    FUND_TRANSFER("Transfer of funds between financial accounts"),
    STOCK_PURCHASE("Purchase of stocks"),
    STOCK_SALE("Sale of stocks"),
    STOCK_DIVIDEND("Dividend received from stocks"),
    STOCK_SPLIT("Split of stock shares"),
    STOCK_OPTION("Stock option transaction"),
    STOCK_GRANT("Grant of stock options"),
    STOCK_BONUS("Bonus shares received"),
    STOCK_REDEMPTION("Redemption of stock"),
    STOCK_WITHDRAWAL("Withdrawal of stock shares"),
    STOCK_DEPOSIT("Deposit of stock shares"),
    STOCK_ADJUSTMENT("Adjustment to stock holdings"),
    STOCK_REINVESTMENT("Reinvestment of stock dividends"),
    STOCK_DIVIDEND_REINVESTMENT("Reinvestment of stock dividends into new shares"),
    STOCK_OPTION_EXERCISE("Exercise of stock options"),
    STOCK_OPTION_EXPIRATION("Expiration of stock options"),
    STOCK_OPTION_GRANT("Grant of stock options"),
    STOCK_OPTION_REDEMPTION("Redemption of stock options"),
    STOCK_OPTION_TRANSFER("Transfer of stock options"),
    STOCK_OPTION_ADJUSTMENT("Adjustment to stock options"),
    STOCK_OPTION_REINVESTMENT("Reinvestment of stock options"),
    STOCK("General stock transaction");

    private final String description;
    TransactionType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}