package za.co.novabank.admin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/admin")
public class AdminController {

    //Managing customer accounts (e.g., activating/deactivating accounts).
    //Handling user roles and permissions.
    //Performing tasks like updating system configurations and ensuring compliance with internal policies.
    //Managing operational settings for the application (e.g., enabling/disabling features, setting limits).

    /* Workflow and Integration Between Controllers:
    AnalyticsController:
        The AnalyticsController is used to gather key data metrics across various aspects of the banking system.
        It might gather data about transactions, account activities, loans, and general bank performance.
        AdminController might interact with AnalyticsController to generate specific reports based on user activities or system performance for decision-making.
        DashboardController could present data gathered by the AnalyticsController in the form of visualizations, such as charts or graphs,
        to provide a comprehensive view of performance.

    AdminController:
        The AdminController manages the internal operations and administrative settings of the bank, such as user roles, account management, and system configuration.
        It could interact with AnalyticsController to generate specific reports that help administrators evaluate the performance of accounts, users, or specific banking services.
        DashboardController could present an administrative view of the dashboard with a focus on system health, user management, and any pending administrative tasks.

    DashboardController:
        The DashboardController aggregates data from both AnalyticsController (for metrics and insights) and AdminController (for operational tasks).
        It presents a high-level view of both customer-specific and bank-wide information. For example, customers can view their account balances, recent transactions, and alerts,
        while administrators can see bank-wide performance metrics, recent activities, and operational status.
        The DashboardController acts as the entry point for providing both customers and admins with a centralized overview of the system's health, performance, and activities.
     */

}
