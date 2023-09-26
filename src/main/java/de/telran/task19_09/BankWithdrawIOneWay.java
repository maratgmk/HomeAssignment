package de.telran.task19_09;

public class BankWithdrawIOneWay {
    public static void main(String[] args) {

        // первая итерация
        //   проверка на простоту числа 59

        int N = 59;
        int i;

        for (i = N; i > 1; i--) {
            if (N % i == 0) {
                System.out.println(i);
            }


            //  59   число простое

            int withdraw = 1; // можно снять только один доллар
            int newbalance = 58; // состояние баланса

            //  вторая итерация
            // проверка на простоту числа 58

            N = 58;


            for (i = N; i > 1; i--) {
                if (N % i == 0) {
                    System.out.println(i);
                }
            }
            // число 58 составное с макс делителем 29

            int withdraw2 = 29; // можно снять 29 долларов
            int newbalance2 = 29; // состояние баланса

            // третья итерация
            //  проверка на простоту числа 29

            N = 29;
            for (i = N; i > 1; i--) {
                if (N % i == 0) {
                    System.out.println(i);
                }
            }
            N = 29; // простое число
            int withdraw3 = 1; // можно снять только один доллар
            int newbalance3 = 28; // состояние баланса

            // четвертая итерация
            // проверка на простоту числа 28

            N = 28;  // число 28 составное с макс делителем 14

            int withdraw4 = 14; // можно снять 14 доллваров
            int newbalance4 = 14; // состояние баланса

            // пятая итерация
            // проверка на простоту числа 14

            N = 14;
            for (i = N; i > 1; i--) {
                if (N % i == 0) {
                    System.out.println(i);
                }

                N = 14;  // число 14 составное с макс делителем 7

                int withdraw5 = 7; // можно снять 7 доллваров
                int newbalance5 = 7; // состояние баланса

                // шестая итерация
                // проверка на простоту числа 7


                N = 7; // простое чмсло

                N = 7;
                for (i = N; i > 1; i--) {
                    if (N % i == 0) {
                        System.out.println(i);

                        N = 7; // простое чмсло

                        int withdraw6 = 1; // можно снять только один доллар
                        int newbalance6 = 6; // состояние баланса

                        // седьмая итерация
                        // проверка на простоту числа 6

                        N = 6;
                        for (i = N; i > 1; i--) {
                            if (N % i == 0) {
                                System.out.println(i);
                            }
                        }
                        N = 6; // число 6 составное с макс делителем 3

                        int withdraw7 = 3; // можно снять 3 доллара
                        int newbalance7 = 3; // состояние баланса


                        // восьмая итерация
                        // проверка на простоту числа 3

                        N = 3;
                        for (i = N; i > 1; i--) {
                            if (N % i == 0) {
                                System.out.println(i);
                            }
                        }

                        N = 3; // простое число

                        int withdraw8 = 1; // можно снять только один доллар
                        int newbalance8 = 2; // состояние баланса

                        // девятая итерация
                        // проверка на простоту числа 2


                        N = 2;
                        for (i = N; i > 1; i--) {
                            if (N % i == 0) {
                                System.out.println(i);

                            }
                        }


                        N = 2; // простое число

                        int withdraw9 = 1; // можно снять только один доллар
                        int newbalance9 = 1; // состояние баланса

                        // десятая итерация
                        // проверка на простоту числа 1

                        N = 1;
                        for (i = N; i > 1; i--) {
                            if (N % i == 0) {
                                System.out.println(i);
                            }
                        }
                        N = 1; // prime number
                        int withdraw10 = 1; // the tenth withdraw from account
                        int newbalance10 = 0;

                        // за десять шагов сняты все деньги


                    }
                }
            }
        }
    }
}
