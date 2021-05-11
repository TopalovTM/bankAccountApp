# bankAccountApp
Application for handling new customer bank account requests.

Application remarks:
* two types of accounts: savings and checking
* both accounts will have an 11-digit account number (generated: 1 or 2, depending on account type, last two digits of SSN, unique 5-digit number and a random 3-digit number)
* read a .csv file of names, social security numbers, account type and initial deposit
* both the savings and checking accounts share the following properties: deposit(), withdraw(), transfer(), showInfo()
* both accounts use an interface to implement the base rate

* Checking accounts have a debit card with 12-digit number and 4-digit PIN
* Savings accounts have a safety deposit box, which is identified by a 3-digit number and 4-digit code
