#include<iostream>
#include<string.h>
//#include <cstlib>
using namespace std;
class String
{
private:
    enum { SZ = 80};
    char str[SZ];
public:
    String()
    { str[0] = '\0';}
    String( char s[])
    { strcpy(str,s);}
    void display() const
    { cout << str; }
    operator char*()
    { return str;}
};
class Pstring: private String
{
private:
    enum { SZ = 80};
    char str[SZ];
public:
    Pstring() : String() {};
    Pstring(char s[])
    {
        if (strlen(s) > SZ)
        { cout << "String overflow" ; exit(1); }
        else
        { strcpy(str,s);}
    }
};
int main()
{
    String s1;
    char xstr[] = "King of North";
    s1 = xstr;
    s1.display();

    String s2 = "\nCrown Jewel";

    cout << static_cast<char*>(s2);
    cout << endl;
    Pstring p1;
    char arr[] =  "This string will surely exceed the width of the screen";
    Pstring p2(arr);
    return 0;


}


