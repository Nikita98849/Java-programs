public class first_program {
    int c;
    public static void main(String arg[])
    {
         first_program f=new first_program();
        int a=90;
        int b;
        System.out.println(a);      //print-90
        //System.out.println(b);  //error :- The local variable b may not have been initialized
        System.out.println(f.c);  //default value of c is 0.

        

    }

    
}

/*    Output :-
              90
             0   */