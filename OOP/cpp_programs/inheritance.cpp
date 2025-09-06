#include <iostream>
using namespace std;
class Point
{
public:
    int x;
    int y;
    void print_point();
};
void Point::print_point()
{
    cout << "(" << x << ", " << y << ")" << endl;
}
class Shape
{
public:
    int num_points;
    Point *points;

    Shape();
    float get_area();
    void set_points(Point *p);

};
Shape::Shape()
{
    cout << "In Shape constructor ..." << endl;
    points = NULL;
    num_points = 0;
}
float Shape::get_area()
{
    return -1.0;
}
class Triangle : public Shape
{
public:
    Triangle();
    void set_points(Point *p);
    void show_shape();
    float get_area();
};
Triangle::Triangle()
{
cout << "In triangle constructor ..." << endl;
num_points = 3;
}
void Triangle::set_points(Point *p)
{
    points  = p;
}
void Triangle::show_shape()
{
    Point *temp = points;
    for (int i = 0 ; i < num_points ;i++ )
    {
        temp->print_point();
        temp++;
    }
}
float Triangle::get_area()
{
    int x0 , y0 , x1, y1 , x2 , y2;
    Point *t = points;

    x0 = t ->x; y0 = t->y; t++;
    x1 = t-> x; y1 = t ->y; t++;
    x2 = t -> x; y2 = t ->y ;t++;

    return abs(x0 * (y1-y2) + x1 * (y2 - y0) + x2 * (y0 - y1) / 2);
}
void create_shape()
{
    Triangle *t = new Triangle;

    Point p1, p2, p3;
    p1.x = p1.y = 0;
    p2.x = p2.y = 10;
    p3.x = p3.y = 25;

    Point *points_of_triangle = new Point[3];
    points_of_triangle[0] = p1;
    points_of_triangle[1] = p2;
    points_of_triangle[2] = p3;

    t->set_points(points_of_triangle);
    t->show_shape();

    cout << "Area of triangle t: " << t->get_area() << endl;
}
int main()
{
    create_shape();
    return 0;
}
