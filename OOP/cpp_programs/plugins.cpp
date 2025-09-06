#include <iostream>
#include <string>
using namespace std;

class Plugin
{
public:
    void apply_filter(int img[5][5])
    { cout << "Inside abstract class : Doing nothing\n";}

};

class Makeitblack : public Plugin
{
public:
    void apply_filter(int img[5][5])
    {
        for (int i = 0 ; i < 5; i++) {
             for (int j = 0 ; j < 5 ; j++)
                { img[i][j] = 0; }
        }
    }
};
class MakeitWhite : public Plugin
{
public:
     void apply_filter(int img[5][5])
    {
        for (int i = 0 ; i < 5; i++) {
             for (int j = 0 ; j < 5 ; j++)
                { img[i][j] = 255; }
        }
    }
};
void init_matrix(int img[5][5])
{
 for (int i = 0 ; i < 5;i ++) {
             for (int j = 0 ; j < 5 ; j++)
                { img[i][j] = i * j; }
}
}
void output_matrix(int img[5][5])
{
     for (int i = 0 ; i < 5; i++) {
             for (int j = 0 ; j < 5 ; j++)
                { cout << img[i][j] << "   "; }
        cout << endl;
}
}
Plugin * select_plugin();
int main()
{
    cout << "Hello\n";
    int pic[5][5];

    init_matrix(pic);

    cout << "Before: " << endl;
    output_matrix(pic);

    Plugin P;
    P.apply_filter(pic);

    Makeitblack mib;
    mib.apply_filter(pic);

    cout << "After MakeitBlack" << endl;
    output_matrix(pic);

    MakeitWhite miw;
    miw.apply_filter(pic);

    cout << "\nAfter MakeitWhite" << endl;
    output_matrix(pic);

    init_matrix(pic); //restore to original
}
