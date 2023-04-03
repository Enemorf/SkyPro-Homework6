public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    static void task1()
    {
        System.out.println("Задание 1");

        for(int i = 0; i <10; i++)
        {
            System.out.println(i+1);
        }
        System.out.println("----\n");
    }

    static void task2()
    {
        System.out.println("Задание 2");

        for(int i = 10; i > 0; i --)
        {
            System.out.println(i);
        }
        System.out.println("----\n");
    }

    static void task3()
    {
        System.out.println("Задание 3");

        for(int i = 0; i < 17; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println("----\n");
    }

    static void task4()
    {
        System.out.println("Задание 4");

        for(int i = 10; i >= -10;i--)
        {
            System.out.println(i);
        }
        System.out.println("----\n");
    }

    static void task5()
    {
        System.out.println("Задание 5");

        for(int i = 1904; i < 2096; i ++)
        {
            if(i%4==0)
            {
                System.out.println(i + " год является високосным.");
            }
        }
        System.out.println("----\n");
    }

    static void task6()
    {
        System.out.println("Задание 6");

        for(int i = 1; i <= 14;i++)
        {
            System.out.println(7 * i);
        }
        System.out.println("----\n");
    }

    static void task7()
    {
        System.out.println("Задание 7");

        for(int i = 1; i <=512; i=i+i)
        {
            System.out.println(i);
        }
        System.out.println("----\n");
    }

    static void task8()
    {
        System.out.println("Задание 8");
        int cash = 29_000;
        int summ = 0;

        for(int i = 1; i <= 12; i++)
        {
            summ = summ + cash;
            System.out.println("Месяц "+ i + ", сумма накоплений равна "+ summ);
        }
        System.out.println("----\n");
    }

    static void task9()
    {
        System.out.println("Задание 9");

        int cash = 29_000;
        int summ = 0;
        float percent = 0.01f;

        for(int i = 1; i <= 12; i++)
        {
            summ = (int) (cash + (summ*(percent+1)));
            System.out.println("Месяц "+ i + ", сумма накоплений равна "+ summ);
        }
        System.out.println("----\n");
    }
    static void task10()
    {
        System.out.println("Задание 10");

        for(int i = 1; i <=10;i++)
        {
            System.out.println("2*"+i+"="+(2*i));
        }
        System.out.println("----\n");
    }
}