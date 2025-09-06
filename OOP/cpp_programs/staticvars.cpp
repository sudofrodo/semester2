#include <iostream>
using namespace std;
class game
{
private:
    static int count;
public:
    game()
    {
        count++;
    }
    int getcount()
    {
        return count;
    }
};
int game::count = 0;
int main()
{
    game g1, g2, g3;

    cout << "count is " << g1.getcount() << endl;
 //each object
    cout << "count is " << g2.getcount() << endl;
 //sees the
    cout << "count is " << g3.getcount() << endl;
 //same value
}
