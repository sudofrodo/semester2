#include <iostream>
#include <string>
using namespace std;
class Employee{

public:

string name;
int age;
int salary;
Employee();
Employee(int salary);
~Employee();
void sign_in(string name);
void sign_out();
void pay_check() {
//cout << "What is your paygrade : ";
//cin >> this -> pay.paygrade;
//cout << "Your salary is : " << this -> pay -> salary << endl;
}

};
Employee::~Employee() {
cout << endl << "Destroyed the instance of employee ." << endl;
}
Employee::Employee() {
salary = 10000;
cout << "--Constructed an employee instance with default salary.";
}
Employee::Employee(int salary) {
this -> salary = salary;
cout << "--Constructed an employee instance with given salary." << endl;
}
void Employee::sign_in(string name) {
cout << "Signing in : " + name << endl;
}
void Employee::sign_out() {
cout << "Signing out : " << endl;
}
int main() {
//cout << "Working" << endl;
//Employee e1; //if instance is defined this way , at the end of program , it will distruct itself automatically;
//e1.name = "Athar";
//cout << endl <<"Salary : " << e1.salary << endl;

//cout << e1.name << endl;
//e1.pay.salary = 10000;
//e1.pay_check();
//cout << endl;
Employee *e2 = new Employee(35000);
e2 -> name = "Ali";
cout << "Salary 2nd : " << e2 -> salary << endl;
delete e2;
e2 = new Employee(12000);
cout << "Third Salary : " << e2 -> salary << endl;
delete e2;
e2 = NULL;
//cout << e2 -> name << endl;
//e1.sign_in(e1.name);
//e2->sign_out();

return 0;
}
