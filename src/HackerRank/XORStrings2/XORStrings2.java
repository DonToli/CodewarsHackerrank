package HackerRank.XORStrings2;

/*Даны две строки, состоящие только из цифр 0 и 1, найти XOR двух строк.
Отладьте данную функцию strings_xor, чтобы найти XOR двух заданных строк соответствующим образом.
Примечание. Вы можете изменить не более трех строк в данном коде, и вы не можете добавлять или
удалять строки в коде.
Чтобы восстановить исходный код, нажмите на значок справа от селектора языка.
Формат ввода
Вход состоит из двух строк. Первая строка ввода содержит первую строку,
а вторая строка содержит вторую строку,.*/
public class XORStrings2 {
    public static void main(String[] args) {
        System.out.println(XORStrings2("10000","00101"));
    }
    public static String XORStrings2(String s,String t){
        String res = "";
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==t.charAt(i))
                res = res + "0";
            else
                res = res + "1";

        }
        return res;
    }

}
