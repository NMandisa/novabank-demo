package za.co.novabank.core.enums;

/**
 * Enum for loan types with descriptions.
 * @author Noxolo.Mkhungo
 */
public enum LoanType {
    PERSONAL_LOAN("A loan taken for personal use, such as home renovation or medical expenses."),
    HOME_LOAN("A loan used to purchase a residential property or refinance an existing mortgage."),
    AUTO_LOAN("A loan to purchase a new or used vehicle."),
    STUDENT_LOAN("A loan to cover educational expenses, such as tuition, books, and living expenses."),
    BUSINESS_LOAN("A loan to support business activities, including startup costs, expansion, or operational expenses."),
    PAYDAY_LOAN("A short-term loan with a high interest rate, typically repaid on the borrower's next payday."),
    CREDIT_CARD_LOAN("A revolving credit line that can be used for a variety of purchases."),
    MORTGAGE("A loan used to purchase or refinance a property, with the property serving as collateral."),
    BRIDGE_LOAN("A short-term loan used to bridge the gap between the purchase of a new property and the sale of an existing one."),
    EQUIPMENT_FINANCING("A loan specifically for the purchase of business equipment."),
    CONSTRUCTION_LOAN("A short-term loan used to finance the construction of a new building or property."),
    DEBT_CONSOLIDATION_LOAN("A loan used to consolidate multiple debts into a single payment."),
    LINE_OF_CREDIT("A flexible loan that allows the borrower to draw funds as needed up to a predetermined limit.");

    private final String description;

    LoanType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
