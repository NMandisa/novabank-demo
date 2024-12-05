package za.co.novabank.core.enums;

/**
 *  Enum for insurance policy types with descriptions.
 * @author Noxolo.Mkhungo
 */
public enum PolicyType {
    LIFE_INSURANCE("Insurance that pays out a sum of money either on the death of the insured person or after a set period."),
    HEALTH_INSURANCE("Insurance covering the whole or part of the risk of a person incurring medical expenses."),
    HOME_INSURANCE("Insurance covering the home against damages such as fire, theft, and certain natural disasters."),
    AUTO_INSURANCE("Insurance for cars, trucks, motorcycles, and other road vehicles."),
    TRAVEL_INSURANCE("Insurance that covers the risks associated with traveling, such as medical expenses, trip cancellations, and lost luggage."),
    DISABILITY_INSURANCE("Insurance that provides income in the event a policyholder is prevented from working due to disability."),
    LIABILITY_INSURANCE("Insurance that provides protection against claims resulting from injuries and damage to people and/or property."),
    BUSINESS_INSURANCE("Insurance that protects businesses against risks such as property damage, legal liability, and employee-related risks."),
    PET_INSURANCE("Insurance that helps cover the veterinary treatment costs for an insured person's pet."),
    CRITICAL_ILLNESS_INSURANCE("Insurance that provides a lump-sum cash payment if the policyholder is diagnosed with a critical illness."),
    RENTERS_INSURANCE("Insurance that provides coverage for a renter's personal property and liability."),
    LONG_TERM_CARE_INSURANCE("Insurance that covers the cost of long-term care services, such as in-home care, assisted living, and nursing home care."),
    MARINE_INSURANCE("Insurance that covers the loss or damage of ships, cargo, terminals, and any transport by which goods are transferred, acquired, or held between points of origin and final destination."),
    CREDIT_INSURANCE("Insurance that pays off outstanding debts if the policyholder dies or becomes disabled."),
    BURGLARY_INSURANCE("Insurance that covers losses or damages resulting from a burglary."),
    FIDELITY_INSURANCE("Insurance that protects a business against losses caused by fraudulent acts of employees."),
    MORTGAGE_INSURANCE("Insurance that compensates lenders or investors for losses due to the default of a mortgage loan.");

    private final String description;

    PolicyType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
