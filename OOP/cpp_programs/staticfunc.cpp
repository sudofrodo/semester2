#include <iostream>
using namespace std;
class User
{
    int id;
    static int next_id;
public:
    static int make_id()
    {
        next_id++;
        return next_id;
    }
    User()
    {
        id = User::make_id();
    }
    int get_id()
    {
        return id;
    }
};
int User::next_id = 0;
int main()
{

    User u1;
    cout << "User Id : " << u1.get_id() << endl;
    User u2;
    cout << "User Id : " << u2.get_id() << endl;
}
