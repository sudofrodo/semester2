#include<iostream>
#include<vector>
using namespace std;
void output_vector(vector <int> lst);
void reverse_output_vector(vector <int> lst);
int main()
{
    vector <int> marks{10,20,30,40,50};
    cout << "Printing vector : " << endl;
    output_vector(marks);
    cout << "\nPrinting vectors in reverse : " << endl;
    reverse_output_vector(marks);
    auto it = marks.begin();
    marks.erase(it + 2);
    cout << "\nmodified vector" << endl;
    output_vector(marks);
    marks.push_back(60);
    cout << "\nPushed back vector " << endl;
    output_vector(marks);
}
void output_vector(vector <int> lst)
{
    cout << "[ ";
    for (auto i = lst.begin() ; i != lst.end() ; i++) //v.begin essentially a pointer to starting element of vector
    {
        cout << *i << "   ";
    }
    cout << " ]";
}
void reverse_output_vector(vector <int> lst)
{
     cout << "[ ";
    for (auto i = lst.rbegin() ; i != lst.rend() ; i++)
    {
        cout << *i << "   ";
    }
    cout << " ]";
}
