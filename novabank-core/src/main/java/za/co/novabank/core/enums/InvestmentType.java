package za.co.novabank.core.enums;

/**
 * Enum for investment types with descriptions.
 * @author Noxolo.Mkhungo
 */
public enum InvestmentType {
    STOCKS("Shares in a company, which represent partial ownership of the company."),
    BONDS("Debt securities issued by corporations or governments to raise capital, promising to pay back the principal along with interest."),
    MUTUAL_FUNDS("Investment funds that pool money from many investors to purchase securities, managed by professionals."),
    EXCHANGE_TRADED_FUNDS("Investment funds traded on stock exchanges, similar to mutual funds, but typically with lower fees."),
    REAL_ESTATE("Investments in physical properties such as residential, commercial, or industrial real estate."),
    COMMODITIES("Physical goods such as gold, silver, oil, and agricultural products that can be bought and sold."),
    CRYPTOCURRENCIES("Digital or virtual currencies that use cryptography for security and operate independently of a central bank."),
    PEER_TO_PEER_LENDING("Investing in loans issued to individuals or businesses through online platforms, bypassing traditional banks."),
    CERTIFICATES_OF_DEPOSIT("Savings certificates issued by banks with a fixed maturity date and specified interest rate."),
    RETIREMENT_PLANS("Tax-advantaged accounts, such as IRAs and 401(k)s, designed to help individuals save for retirement."),
    SAVINGS_ACCOUNTS("Bank accounts that earn interest on the deposited funds, providing a safe place to save money."),
    INDEX_FUNDS("Funds designed to track the performance of a specific index, such as the S&P 500."),
    HEDGE_FUNDS("Private investment funds that employ various strategies to generate high returns, often with higher risk."),
    PRIVATE_EQUITY("Investments in private companies or buyouts of public companies, typically requiring a longer-term commitment."),
    ANNUITIES("Insurance products that provide regular income payments in exchange for an initial lump sum payment."),
    OPTIONS("Contracts that give the investor the right, but not the obligation, to buy or sell a security at a predetermined price within a specific timeframe."),
    FUTURES("Contracts obligating the buyer to purchase, or the seller to sell, a specific asset at a predetermined future date and price."),
    MONEY_MARKET_FUNDS("Mutual funds that invest in short-term, low-risk securities such as treasury bills and commercial paper."),
    TREASURY_SECURITIES("Government debt instruments issued by the U.S. Department of the Treasury, including treasury bills, notes, and bonds."),
    COLLECTIBLES("Investments in items such as art, antiques, and rare coins that have the potential to appreciate in value."),
    FOREIGN_EXCHANGE("Trading of currencies in the foreign exchange (Forex) market to profit from changes in exchange rates.");

    private final String description;

    InvestmentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}