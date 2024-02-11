public class Type_Promotion {
    public static void main(String[] Args){
        /*Type promotion means that the "short", "byte" and "char" data types are promoted to the "int"
          data type when the variables of these data types are used in an expression.For example -
          if there is a var "a" of short data type, a var "b" of byte data type and a var "c" of char data
           type and an expression " a + b + c" is formed using them, then the result of this expression will
           be a var of "int" data type as all these variables a,b and c are individually converted to "int"
            data type as they are being used in an expression.SAMPLE CODE IS AS FOLLOWS: */
        short a = 2;
        byte  b = 4;
        char c = 'h';
        int i = a + b + c;
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)c);
        System.out.println(i);
    }
}
