#include <iostream>
#include <string>
using namespace std;
struct student {
string name;
int marks;
} s1;
int main() {
cout << "Hello" << endl;
s1.name = "Ali";
student *s;
s = new student;
s->name = "Akbar";
delete s;
cout << s1.name << endl;
return 0;
}
