#ifndef DATES_H
#define DATES_H


class dates
{
    public:
        dates();
        virtual ~dates();
        int month,day,year;
        void getdate();
        void showdate() const;
        void check();
    protected:

    private:
};

#endif // DATES_H
