import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AccountBalance,AccountStatement,ClosureReason} from '../../models/account.models';
import {AccountRequest,AccountType}  from '../../models/account-request.model';

@Injectable({
  providedIn: 'root',
})
export class AccountService {
  private readonly API_BASE = 'http://localhost:8080/accounts'; // Adjust URL as needed

  constructor(private http: HttpClient) {}

  /**
   * Create a new account
   * @param accountRequest Details for the new account
   * @returns Observable of the created account response
   */
  createAccount(accountRequest: AccountRequest): Observable<any> {
    return this.http.post(`${this.API_BASE}`, accountRequest);
  }

  /**
   * Get account balance
   * @param accountId ID of the account
   * @returns Observable of the account balance
   */
  getAccountBalance(accountId: string): Observable<AccountBalance> {
    return this.http.get<AccountBalance>(`${this.API_BASE}/${accountId}/balance`);
  }

  /**
   * Get account statements
   * @param accountId ID of the account
   * @param startDate Start date for the statement
   * @param endDate End date for the statement
   * @returns Observable of the account statements
   */
  getAccountStatements(accountId: string, startDate: string, endDate: string): Observable<AccountStatement[]> {
    const params = new HttpParams()
      .set('startDate', startDate)
      .set('endDate', endDate);
    return this.http.get<AccountStatement[]>(`${this.API_BASE}/${accountId}/statements`, { params });
  }

  /**
   * Close an account
   * @param accountId ID of the account
   * @param reasonRequest Reason for closure
   * @returns Observable of the closure confirmation message
   */
  closeAccount(accountId: string, reasonRequest: ClosureReason): Observable<string> {
    return this.http.patch<string>(`${this.API_BASE}/${accountId}`, reasonRequest);
  }

  /**
   * Get available account types
   * @returns Observable of the list of account types
   */
  getAvailableAccountTypes(): Observable<AccountType[]> {
    return this.http.get<AccountType[]>(`${this.API_BASE}/types`);
  }
}