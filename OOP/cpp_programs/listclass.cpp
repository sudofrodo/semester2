#include <iostream>
using namespace std;
int main()
{

return 0;
}//#include "listclass.h"


template <class T>
void listclass<T>::push(T val)
{
    node *temp = new node;
    temp->val = val;
    temp->next = NULL;

    if (last == NULL) // if list is empty
    {
        head = temp;
        last = temp;
    } else {
    last -> next = temp;
    last = last -> next;
    }
}
template <class T>
void listclass<T>::delete_after_node(node *current) {
    node* temp = current -> next;
    current->next = current -> next -> next;
    delete temp;
}
