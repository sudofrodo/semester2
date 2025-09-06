#include <iostream>
using namespace std;
class Distance
{
private:
    int feet;
    float inches;
public:
    Distance() : feet(0) , inches(0.0)
    {

    }
    Distance(int ft, float in) : feet(ft) , inches(in)
    {

    }
    void getdist()
    {
        cout << "\nEnter feet: "; cin >> feet;
        cout << "Enter inches: "; cin >> inches;
    }
    void showdist() const
    {
        cout << feet << "\'-" << inches << '\"';
    }
  //  void add_dist(Distance, Distance);
  Distance add_dist(const Distance&) const;
};

// simple function
//void Distance::add_dist(Distance d2, Distance d3)
//{
//    inches = d2.inches + d3.inches;
//    feet = 0;
//    if (inches >= 12.0)
//    {
//        inches -= 12.0;
//        feet++;
//    }
//    feet += d2.feet + d3.feet;
//}

// object returning function
Distance Distance::add_dist(const Distance& d2) const
{
    Distance temp;
    temp.inches = inches + d2.inches;
    if (temp.inches >= 12.0)
    {
        temp.inches -= 12.0;
        temp.feet = 1;
    }
    temp.feet += feet + d2.feet;
    return temp;
}
int main()
{
    //default copy constructors
//    Distance dist1(11, 6.25);
//    Distance dist2(dist1);
//    Distance dist3 = dist1;

//    Distance dist1 , dist3;
//    Distance dist2(11, 6.25);
//    dist1.getdist();
//    dist3 = dist1.add_dist(dist2);
    //dist3.add_dist(dist1 , dist2);

//    cout << "\ndist1 = "; dist1.showdist();
//    cout << "\ndist2 = "; dist2.showdist();
//    cout << "\ndist3 = "; dist3.showdist();

const Distance football(300,0);
//football.getdist(); //error
cout << "football field = ";
football.showdist();

    cout << endl;
    return 0;
}
