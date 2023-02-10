class HelloWorld {

    public void Mymethod(int i)
    {
        //code for my method
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        if(args.length>0)
        {
            System.out.println("Used command line argument list:");
            for(int i=0;i<args.length;i++)
            {
                System.out.println("Argument #"+i+": "+args[i]);
                if(i==args.length-1)System.out.println("End of command line arguments");
            }
            System.exit(0);//main() method termination,
            //program exits with code "0" - normal exit
            //Note no return value for main()
        }
        else
        {
            System.out.println("No cmd line arguments given!");
            System.exit(1);//No command line arguments were given,
            //exit with non-zero code.

        }
    }
}