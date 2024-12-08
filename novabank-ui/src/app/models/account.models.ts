// account.models.ts
export interface AccountBalance {
    accountId: string;
    balance: number;
    currency: string;
}

export interface AccountStatement {
    transactionId: string;
    date: string;
    description: string;
    amount: number;
}

export interface ClosureReason {
    reason: string;
}