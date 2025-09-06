#include <iostream>
using namespace std;
class Base
{
public:
    virtual void show() = 0;
};
class Derv1 : public Base
{
public:
    void show()
    { cout << "derived 1" << endl;}
};
class Derv2 : public Base
{
public:
    void show()
    { cout << "derived 2 " << endl;}
};
int main()
{
    Derv1 dv1;
    Derv2 dv2;

//    Base* ptr;
//
//    ptr = &dv1;
//    ptr->show();
//
//    ptr = &dv2;
//    ptr ->show();

/// array of pointers
Base* arr[2];
arr[0] = &dv1;
arr[1] = &dv2;

arr[0]->show();
arr[1]->show();

    return 0;
}
