#include <iostream>
using namespace std;
template <class T>
T find_max(T a , T b)
{
    T result;
    result = a > b ? a : b;
    return result;
}
int main()
{
    int p,q,r;
    q = 10 ;r = 11;
    p = find_max<int>(q,r);
    cout << "Max Number : " << p << endl;

    string j,k,l;
    j = "Ali" ; k = "Usman";
    l = find_max<string>(j,k);
    cout << "Max string : " << l << endl;
}
