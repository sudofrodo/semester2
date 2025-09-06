#include <iostream>
using namespace std;
class Employee
{
//private:
protected:
    int pay_rate;
public:
    friend void access_pay_direct(Employee a);
    void set_pay_rate(int pay_rate)
    {
        if(pay_rate > 14)
        { this->pay_rate = pay_rate; }
        else
        { cout << "Pay rate " << pay_rate << " not acceptable\n"; }
    }

    inline int get_pay_rate()
    {   return pay_rate; }

};
class Faculty: public Employee
{
public:
      void set_pay_rate(int pay_rate)
    {
        if(pay_rate > 25)
        { this->pay_rate = pay_rate; }
        else
        { cout << "Pay rate " << pay_rate << " not acceptable\n"; }
    }


};
void access_pay_direct(Employee e)
{
    cout << "Pay rate: " << e.pay_rate << endl;
}
int main()
{
    Employee a;
    a.set_pay_rate(15);
//    cout << a.pay_rate; //error
   // cout << "Current Pay rate : " << a.get_pay_rate() << endl;
//    a.set_pay_rate(13);
//    cout << "Current Pay rate : " << a.get_pay_rate() << endl;
//    a.set_pay_rate(20);
//     cout << "Current Pay rate : " << a.get_pay_rate() << endl;
//    Faculty f;
//    f.set_pay_rate(26);
//    cout << "Current Pay rate : " << f.get_pay_rate() << endl;
//    f.set_pay_rate(23);
//     cout << "Current Pay rate : " << f.get_pay_rate() << endl;
    access_pay_direct(a);
}
