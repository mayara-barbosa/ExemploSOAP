using HW_SOAP_DotNet.ServiceReference1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HW_SOAP_DotNet
{
    class Program
    {
        static void Main(string[] args)
        {

            OlaServiceClient hello = new OlaServiceClient();
            string msg;
            msg = hello.cumprimentar("Teste");
            Console.WriteLine(msg);
            Console.Read();

        }
    }
}
