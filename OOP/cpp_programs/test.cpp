#include <iostream>
using namespace std;
////////////////////////////////////////////////////////////////
class A
 //base class
{
private:
int privdataA;
 //(functions have the same access
protected:
 //rules as the data shown here)
int protdataA;
public:
int pubdataA;
};
////////////////////////////////////////////////////////////////
class B : public A
 //publicly-derived class
{
public:
void funct()
{
int a;
//a = privdataA; //error: not accessible
a = protdataA; //OK
a = pubdataA;
 //OK
}
};
////////////////////////////////////////////////////////////////
class C : private A
 //privately-derived class
{
public:
void funct()
{
int a;
//a = privdataA; //error: not accessible
a = protdataA; //OK
a = pubdataA;
 //OK
}
};
////////////////////////////////////////////////////////////////
int main()
{
int a;
B objB;
//a = objB.privdataA;
//a = objB.protdataA;
a = objB.pubdataA;
//error: not accessible
//error: not accessible
//OK (A public to B)
C objC;
//a = objC.privdataA;
//a = objC.protdataA;
//a = objC.pubdataA;
return 0;
}
