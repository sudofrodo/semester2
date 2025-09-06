#include <iostream>
using namespace std;
class angle
{
private:
    int degrees;
    float mins;
    char dir;
public:
    angle() : degrees(0) , mins(0) , dir(0){};
    angle(int deg , int m , char dn)
    {
        degrees = deg;
        mins = m;
        dir = dn;
    }
    void showlocation()
    {
        cout << degrees << " "<< mins << " " << dir << endl;
    }
};
int main()
{
    angle l1(179,43.5,'E');
    l1.showlocation();

}
