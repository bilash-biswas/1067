using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            int a,i;
            a = Convert.ToInt32(Console.ReadLine());
            for(i = 1;i <= a;i += 2)
            {
                Console.WriteLine(i);
            }
            Console.ReadLine();
        }
    }
}
