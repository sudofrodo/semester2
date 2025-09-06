#include <iostream>
#include "dates.h"
using namespace std;
dates::dates()
{
    //ctor
}

dates::~dates()
{
    //dtor
}
void dates::getdate()
    {
        cout << "Enter month :"; cin >> month;
        cout << "Enter day   :"; cin >> day;
        cout << "Enter year  :"; cin >> year;
    }
void dates::showdate() const
    {
        cout << month << "/" << day << "/" << year << endl;
}
void dates::check()
{
    cout << "\nWorking\n";
}


int main()
{
return 0;
}

