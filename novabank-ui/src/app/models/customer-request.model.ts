/**
 * Enum for Identification Types
 * Represents various types of identification that can be associated with a customer.
 */
export enum IdentificationType {
    NATIONAL_ID = 'NATIONAL_ID', // National Identity Card
    PASSPORT = 'PASSPORT',       // Passport used for international travel
    DRIVER_LICENSE = 'DRIVER_LICENSE', // Government-issued license for driving
    BIRTH_CERTIFICATE = 'BIRTH_CERTIFICATE', // Official certificate of birth
    RESIDENCE_PERMIT = 'RESIDENCE_PERMIT'  // Permission to reside in a country
}

/**
 * CustomerRequest Model
 * Represents the structure of a customer request, which includes personal information and identification details.
 */
export interface CustomerRequest {
    id?: number;  // Optional: This may not be required when creating a new customer
    fullName: string;  // Full name of the customer
    email: string;     // Email address of the customer
    phone: string;     // Phone number of the customer
    identification: string;  // Identification number or code
    identificationType: IdentificationType;  // Type of the identification (National ID, Passport, etc.)
}