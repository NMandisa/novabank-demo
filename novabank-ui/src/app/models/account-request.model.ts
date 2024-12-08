import { CustomerRequest } from "./customer-request.model";

/**
 * AccountCategory Enum
 * Defines various categories of accounts that a customer can have.
 */
export enum AccountCategory {
    PERSONAL = 'PERSONAL',  // Personal account for individuals
    BUSINESS = 'BUSINESS',  // Business account for companies
    INVESTMENT = 'INVESTMENT', // Account for investment purposes
    DIGITAL = 'DIGITAL',    // Digital account (e.g., for online services)
}

/**
 * AccountType Enum
 * Specifies the types of accounts available for a customer to choose from.
 */
export enum AccountType {
    SAVINGS = 'SAVINGS',       // Savings account
    CURRENT = 'CURRENT',       // Current account for daily transactions
    FIXED_DEPOSIT = 'FIXED_DEPOSIT', // Fixed deposit account with a locked-in term
    ING_DEPOSIT = 'ING_DEPOSIT', // ING Deposit account type
    CHECKING = 'CHECKING',     // Checking account for frequent transactions
    CORPORATE = 'CORPORATE',   // Corporate account for businesses
    MERCHANT = 'MERCHANT',     // Merchant account for business transactions
    DEMAT = 'DEMAT',           // Demat account for holding shares or securities
    TRADING = 'TRADING',       // Account for trading stocks or securities
    RETIREMENT = 'RETIREMENT', // Retirement saving account
    INSURANCE = 'INSURANCE',   // Account for insurance policies
    DIGITAL_SAVINGS = 'DIGITAL_SAVINGS', // Digital savings account
    MOBILE_WALLET = 'MOBILE_WALLET', // Mobile wallet for digital transactions
    ONLINE_TRADING = 'ONLINE_TRADING' // Online trading account
}

/**
 * AccountStatus Enum
 * Represents the current state of the account.
 */
export enum AccountStatus {
    ACTIVE = 'ACTIVE',          // The account is open and operational.
    INACTIVE = 'INACTIVE',      // The account hasn't been used for a certain period.
    FROZEN = 'FROZEN',          // The account is temporarily disabled, often due to suspicious activity.
    PENDING = 'PENDING',        // The account is in the process of being opened or closed.
    CLOSED = 'CLOSED',          // The account has been permanently closed.
    SUSPENDED = 'SUSPENDED',    // The account is temporarily suspended, often for regulatory reasons.
    DORMANT = 'DORMANT',        // The account has been inactive for a long time and may require reactivation.
    OVERDRAWN = 'OVERDRAWN',    // The account has a negative balance.
    RESTRICTED = 'RESTRICTED',  // The account has limitations on certain types of transactions.
    LOCKED = 'LOCKED'           // The account is locked, usually due to security concerns.
}

/**
 * AccountRequest Model
 * Represents the structure of an account creation request.
 */
export interface AccountRequest {
    id?: number;               // Optional: This may not be required when creating a new account. Typically generated by the backend for existing accounts.
    customer: CustomerRequest;  // The customer associated with the account.
    category: AccountCategory;  // The category of the account (e.g., personal, business).
    type: AccountType;          // The type of account (e.g., savings, current).
    balance: number;            // The initial balance for the account (ensure proper validation for money values).
    status: AccountStatus;      // The current status of the account (e.g., active, closed).
}