#include <iostream>
using namespace std;
class Int
{
public:
    int variable;
    Int()
    {
        variable = 0;
    }
    Int(int value) {
    variable = value;
    }
    void showint()
    {
        cout << variable;
    }
    void add(Int var1, Int var2) {
        variable = var1.variable + var2.variable;
    }
//    void sum(int b)
//    {
//        return variable + b;
//    }

};
int main() {
Int num1;
//cout << num1.variable;
Int num2(4);
Int num3(6);
//cout << num2.variable;
//num1.showint();
num2.add(num3 , num1);
Int num4;
num4.add(num2, num3);
cout << endl;
cout << "num2 ";
num2.showint();
cout << endl << "num4 ";
num4.showint();
return 0;
}
