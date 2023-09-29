class operators
{
    int a=10;
    int b=20;
    operators()
    {
        System.out.println("operator values");
        this.getresult();
    }
    void getresult()
    {
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

    }
    class lessthen
    {
        public static void main (String ah[])
        {
            operators obj = new operators();
;        }
    }

}