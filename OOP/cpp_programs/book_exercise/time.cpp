#include <iostream>
using namespace std;
class Time
{
private:
  int hours , mins, secs;
public:
Time():hours(0),mins(0),secs(0) {};
Time(int hr , int m , int s): hours(hr) , mins(m) , secs(s) {};

void display() const
{
    cout << hours << ":" << mins << ":" << secs << endl;

}
void add(Time const t1, Time const t2)
{
    hours = t1.hours + t2.hours;
    mins = t1.mins + t2.mins;
    secs = t1.secs + t2.secs;
    if (mins >= 60)
    {
        mins -= 60;
        hours++;
    }
    if (secs >= 60)
    {
        secs -= 60;
        mins++;
    }

}
};
int main()
{
    const Time t(10,11,13);
    const Time _t(9,55,34);
    Time sum;
    sum.add(t,_t);
    sum.display();

}
