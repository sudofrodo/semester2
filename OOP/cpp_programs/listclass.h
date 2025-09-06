#ifndef LISTCLASS_H
#define LISTCLASS_H

template <class T>
class listclass
{
    public:
        listclass(){
         last = head = NULL;
        };
        virtual ~listclass();
        void push(T val);
        T pop();
        void print_list();
        void delete_after_node(node *current)
    protected:

    private:
        struct node
    {
        T val;
        node *next;
    };

    node *head , *last;
};

#endif // LISTCLASS_H
