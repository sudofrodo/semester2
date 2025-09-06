#include <iostream>
using namespace std;
class A
{
protected:
    int temp;
public:
    void set_temp(int a)
    { temp = a; }
    void display()
    { cout << "\nNumber in me : " << temp << endl;  }
};
class B : public A
{
protected:
    int tempB;
public:
    void set_temp(int a)
    { tempB = a; }
    void display()
    { cout << "\nNumber in me : " << tempB << endl;  }
    int b_specific()
    {
        int factor = tempB * 2;
        return factor;
    }
};
class C : public B
{
protected:
    int tempC;
public:
    void set_temp(int a)
    { tempC = a; }
    void display()
    { cout << "\nNumber in me : " << tempC << endl;  }
};
int main()
{
    A objA;
    objA.set_temp(6);
    objA.display();

    B objB;
    objB.set_temp(7);
    objB.display();
    cout << objB.b_specific() << "  Special op" << endl;

    C objC;
    objC.set_temp(8);
    objC.display();
}
