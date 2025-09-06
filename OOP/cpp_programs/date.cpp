#include <iostream>
using namespace std;
class date
{
    int month,day,year;
    public:
    void getdate()
    {
        cout << "Enter month :"; cin >> month;
        cout << "Enter day   :"; cin >> day;
        cout << "Enter year  :"; cin >> year;
    }
    void showdate() const
    {
        cout << month << "/" << day << "/" << year << endl;
    }
};
class Employee
{
private:
    int idnum;
    float compens;
    date doe;
    enum etype {laborer = 1, secretary , manager , peon , salesman};
    etype type;
public:
    void display ()
    {
        cout << "Employee number : " << idnum << endl;
        cout << "Compensation    : " << compens << endl;
    }
    void getdata()
    {
        int ch;
        cout << "Date of employment : ";
        doe.getdate();
        cout << "Compensation       : "; cin >> compens;
        cout << "Employee type (num 1 to 5)      : "; cin >> ch;
        type = etype(ch);
    }
    void showdata()
    {
        cout << "=====================================" << endl;
        cout << "Date of employment : " ; doe.showdate();
        cout << "Compensation       : " <<  compens << endl;
        cout << "Employee type      : ";
        switch (type) {
        case 1: cout << "Laborer"; break;
        case 2: cout << "Secretary"; break;
        case 3: cout << "Manager"; break;
        case 4: cout << "Peon"; break;
        case 5: cout << "Salesman";break;
        }
        cout << endl;
    }
};
int main()
{
Employee e1;
e1.getdata();
e1.showdata();
}
