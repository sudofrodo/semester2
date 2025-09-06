#include <iostream>
using namespace std;
class tollBooth
{
private:
    unsigned int tcars , ncars , pcars;
    double money;
public:
    tollBooth() : tcars(0),money(0.0),ncars(0),pcars(0) {
    /*empty*/ };
    void payingCar()
    {
        tcars++; pcars++;
        money += 0.50;
    }
    void nopayCar()
    {
        tcars++; ncars++;
        money += 0;
    }
    void display() const
    {
        cout << "\nPark Road Tollbooth : ";
        cout << "\n========================================" << endl;
        cout << "Summary : " << endl;
        cout << "Total number of cars : " << tcars << endl;
        cout << "Total non - paying cars : " << ncars << endl;
        cout << "Total paying cars : " << pcars << endl;
        cout << "Total money collected : " << money << "$" << endl;
    }


};
int main() {
tollBooth tb1;
char status;
do {
cout << "Input status (p for paying , n for non paying , x to exit)\n";
cin >> status;
if (status  == 'p') {
tb1.payingCar();
} else if (status == 'n') {
    tb1.nopayCar();
}
} while (status != 'x');
tb1.display();
}
