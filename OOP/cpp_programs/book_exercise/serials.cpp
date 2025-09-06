#include <iostream>
using namespace std;
class serial
{
private:
    int ser;
public:
     static int count;
    serial():ser(count)
    {
        count++;
    };
    void respond()
    {
        cout << "I am object number " << ser;
    }
};
int serial::count = 1;
int main()
{
    serial s1 , s2, s3;
    s1.respond();
    cout << endl;
    s2.respond();
    cout << endl;
    s3.respond();
}
