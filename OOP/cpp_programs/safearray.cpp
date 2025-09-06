#include <iostream>
#include <stdlib.h>
using namespace std;
const int LIMIT = 100;
class safearray
{
private:
    int arr[LIMIT];
public:
    void putel(int n , int elvalue)
    {
        if (n < 0 || n>= LIMIT)
        { cout << "\nIndex out of bounds"; exit(1);}
        arr[n] = elvalue;
    }
   // int getel(int n) const
   /// int& access(int n)
   int& operator [](int n)
    {
        if (n < 0 || n>=LIMIT)
        { cout << "\nIndex out of bounds"; exit(1); }
        return arr[n];
    }
};
int main()
{
    safearray sa1;
   for (int j=0 ; j < LIMIT;j++)
    sa1[j] = j * 10;
    ///sa1.access(j) = j*10;
//        sa1.putel(j, j*10);

    for (int j = 0 ; j < LIMIT; j++)
    {
        //int temp = sa1.getel(j);
        ///int temp = sa1.access(j);
        int temp = sa1[j];
        cout << "Element " << j << " is " << temp << endl;
    }
    return 0;
}
