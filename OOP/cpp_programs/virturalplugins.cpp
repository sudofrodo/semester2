#include <iostream>
#include <string>
using namespace std;

class Plugin
{
public:
    virtual void apply_filter(int img[5][5]) = 0; // makes it pure virtual function
    // { cout << "Inside abstract class : Doing nothing\n";}

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
Plugin * select_plugin()
{
    string plugin_name = "MIB";

    Plugin *p;
    if (plugin_name == "MIW")
        p = new MakeitWhite;
    else
        p = new Makeitblack;

    return p;
}
int main()
{
    cout << "Hello\n";
    int pic[5][5];

    init_matrix(pic);

    cout << "Before: " << endl;
    output_matrix(pic);

// Plugin P;  //will return an error , cause abstract class can not be instantiated
// P.apply_filter(pic);
    Plugin *p;

    p = select_plugin();
    p->apply_filter(pic);
    cout << "After plugin Application : " << endl;
    output_matrix(pic);

    init_matrix(pic); //restore to original
}
