#include <iostream>
using namespace std;
class Distance
{
private:
    int feet;
    float inches;
public:
    Distance() : feet(0), inches(0.0)
{ }
 //constructor (two args)
Distance(int ft, float in) : feet(ft), inches(in)
{ }
void getdist()
 //get length from user
{
cout << "\nEnter feet: "; cin >> feet;
cout << "Enter inches: "; cin >> inches;
}
void showdist() const
 //display distance
{ cout << feet << "\’-" << inches << '\"'; }
void operator += (Distance);
Distance operator + (Distance ) const;
bool operator < (Distance) const;
};

#if 0
void Distance::operator+=(Distance d2)
{
    feet += d2.feet;
    inches += d2.inches;
    if (inches >= 12.0)
    {
        inches -= 12.0;
        feet++;
    }
}
Distance Distance::operator + (Distance d2) const
{
    int f = feet + d2.feet;
    float i = inches + d2.inches;
    if (i >= 12.0 )
    {
        f++; i -= 12;
    }
    return Distance (f, i);
}
bool Distance::operator<(Distance d2) const
{
    float bf1 = feet + inches/12;
    float bf2 = d2.feet + d2.inches;
    return (bf1 < bf2) ? true : false;
}
int main()
{
    Distance dist1, dist3, dist4;
    dist1.getdist();

    Distance dist2(11,6.25);
   // dist3 = dist1 + dist2;
  //  dist4 = dist1 + dist2 + dist3;

    cout << "dist1 = ";
 dist1.showdist(); cout << endl;
cout << "dist2 = ";
 dist2.showdist(); cout << endl;
//cout << "dist3 = ";
// dist3.showdist(); cout << endl;
//cout << "dist4 = ";
// dist4.showdist(); cout << endl;

////if (dist1 < dist2)
////    cout << "\ndist1 is less than dist2";
////else
////    cout << "\ndist 1 is greater than (or equal to) dist2";

dist1 += dist2;
cout << "\nAfter addition,";
cout << "\ndist1 = ";
 dist1.showdist(); cout << endl;
return 0;

}
#endif // 0
