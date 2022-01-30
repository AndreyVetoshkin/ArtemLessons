public class Types {
    public static void main(String[] args) {
        // Логические
        boolean isFact = true; // Принимает значения true или false

        // Целочисленные
        byte a = 3;     // Занимает 1 байт (8 бит), принимает значия -128 .. 127
        short b = 12;   // Занимает 2 байта (16 бит), принимает значия -32 768 .. 32 767
        int i = 23;     // Занимает 4 байта (32 бита), принимает значия -2 147 483 648 .. 2 147 483 647
        long l = 2;     // Занимает 8 байт (64 бита), принимает значия –9 223 372 036 854 775 808 .. 9 223 372 036 854 775 807

        // Числа с плавающей точкой (они же дробные)
        float f = 3.5f; // Занимает 4 байта (32 бита), принимает значия ±1.40129846432481707e-45 .. ±3.40282346638528860e+38
        double d = 4.2; // Занимает 8 байт (64 бита), принимает значия ±4.94065645841246544e-324 .. ±1.79769313486231570e+308

        // Особые случаи применения
        long tooLargeForInt = 2_147_483_648L; // Допускаются разделители '_' и необходимо указать литерал L(l) для long
        // Представление в иных системах счисления
        int num122 = 0x7A; // 16-ричная система, число 122
        int num92 = 0134; // 8-ричная система, число 92
        int num13 = 0b1101; //2-ичная система, число 13

        // Символы и строки
        char ch = 'f'; // Принимает 1 символ или код символа из таблицы Unicode(UTF-16) - целое число из диапазона 0 .. 65535
        char ch102 = 102;
        char chHex = '\u0066';

        String s = "f"; // Не путать с 'f'; строка не является примитивным типом и "f" != 'f'!

//        {
//            String hello = "Hello world";
//            System.out.println(hello);
//        }

//        {
//            String text = "Hello \nworld";
//            System.out.println(text);
//        }
//
        {
            String moroz = "Мороз и солнце; день чудесный!\n" +
                    "Еще ты дремлешь, друг прелестный —\n" +
                    "Пора, красавица, проснись:\n" +
                    "Открой сомкнуты негой взоры\n" +
                    "Навстречу северной Авроры,\n" +
                    "Звездою севера явись!";
            System.out.println(moroz);
        }

    }
}