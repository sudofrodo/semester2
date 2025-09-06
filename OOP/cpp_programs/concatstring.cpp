#include <iostream>
#include <string.h>
#include <stdlib.h>
using namespace std;
class String
{
private:
    enum {SZ = 80};
    char str[SZ];
public:
    String()
    { strcpy(str, ""); }
    String (char s[])
    { strcpy(str,s); }
    void display() const
    { cout << str; }
    void getstr()
    {cin.get(str, SZ);}
    String operator + (String ss) const;
    bool operator == (String ss) const;

};
String String::operator+(String ss) const
{
    String temp;
    if (strlen(str) + strlen(ss.str) < SZ)
    {
        strcpy(temp.str, str);
        strcat(temp.str, ss.str);
    }
    else
    { cout << "\nString overflow"; exit(1);}
    return temp;
}
bool String::operator==(String ss) const
{
    return (strcmp(str,ss.str)==0) ? true:false;
}

int main()
{
//    String s1 = "\nMerry Christmas! ";
//    String s2 = "Happy new year!";
//    String s3;
//
//    s1.display();
//    s2.display();
//    s3.display();
//
//    s3 = s1 + s2;
//
//    s3.display();
String s1 = "yes";
String s2 = "no";
String s3;

cout << "\nEnter 'yes' or 'no':";
s3.getstr();
if (s3 == s1)
    cout << "You typed yes\n";
else if(s3 == s2)
    cout << "You typed no\n";
else
    cout << "You didn't follow the instructions\n";
return 0;
    cout << endl;
    return 0;
}
