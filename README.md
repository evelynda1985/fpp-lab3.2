# fpp-lab3.2
For this exercise, we imagine that the bank (a "credit union") provides services to employees of our (imaginary) company for three kinds of accounts: savings, checking, and retirement.

Programming Assignment 3-2
In this exercise, you will extend the functionality of the Employee class that was mentioned in the book and lecture slides. For this exercise, we imagine that the bank (a "credit union") provides services to employees of our (imaginary) company for three kinds of accounts: savings, checking, and retirement. We will therefore equip our Employee class with one instance field for each type of account. (In a real application, we would implement multiple accounts by storing them in some kind of List container – more on this later.) You will use the Account class that you developed in Lab 3-1 in conjunction with this version of Employee. Also, for practice, replace all uses of Date and GregorianCalendar with the new Date and Time API class LocalDate.

The class file shows that employee now will provide new services. An Employee instance can be asked to create a new checking account, new savings account, or new retirement account. It can also be asked to make a deposit or make a withdrawal. In this exercise, you will implement these new methods.
The overall purpose of this new application is to make it possible for an authorized user to see a list of all employees along with each of their bank accounts. In the first phase of implementation, you will present output on the console. In the second phase (which will be the topic of a future lab), you will present it in a GUI.
To get the process started, a test class called Main (this is like the book’s test class EmployeeTest) will create a number of instances of Employee (using imaginary names and other data) and will also populate each Employee instance with several accounts (that is, Account instances). It will then ask the user if he wants to see a formatted report of all accounts; if the user answers yes, the Main object will call the getFormattedAcctInfo on each Employee object and prepare a String to display in the console.

What you need to do:
For Phase I, you will need to fill in code in the classes Main and Employee (plan on using the
Account class that you created in Lab 3-1). You will notice that Employee has been placed in
the employeeinfo package (place your Account class in this package too), but Main lies
outside of this package. Do not modify this structural arrangement.
Main
If the user answers 'yes', you need to call the getFormattedAccountInfo method in Main, and then display the return value to the console. You will also need to implement the method getFormattedAccountInfo. This method will call the getFormattedAcctInfo method of each of the Employee instances, and then put those Strings together into a good format. Employee
 implement each of the createNewXXX methods by creating a new instance of Account with the appropriate data, and storing the new instance in the appropriate instance variable in Employee
 implement the deposit() method by calling the makeDeposit() method on the appropriate Account instance.
 implement the withdraw() method as follows: Call the appropriate makeWithdrawal method on the appropriate Account instance and then use the return value as the new return value for withdraw().
 implement the getFormattedAccountInfo() by calling the toString() method on each Account instance to provide its own formatted representation of its own account type and balance. The getFormattedAccountInfo method should then piece these 3 Strings together, and return the result. Note: your Account class already has an implementation of toString(); you may need to modify the implementation of this method in order to obtain the desired output format.
 add “getter” methods for the name and hireDate fields.
Here is the expected output of your program, in the console application (for Phase I):
