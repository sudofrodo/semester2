#include <iostream>
using namespace std;
#define ABS(a) ((a) < 0 ? (-a) : (a))
#define INVENTORY_INC_MOD //its acts like a switch

#ifdef INVENTORY_INC_MOD /*if the macro is defined (switch is on , do nothing
                        else , if switch is not defined i.e commented out, (switch is off) , then
                         it will return false , and code will not be included                                , */
void show_inventory() {
    cout << "Showing inventory ...." << endl;
}
#endif // INVENTORY_INC_MOD
int main() {
//cout << "ehllo" << endl;
//cout << ABS(10) << endl;
//cout << ABS(-5) << endl;
//cout << -5 << endl;
#ifdef INVENTORY_INC_MOD
show_inventory();
#endif // INVENTORY_INC_MOD
cout << "working" << endl;
return 0;
}
