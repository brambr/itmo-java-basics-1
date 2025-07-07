
import java.util.Arrays;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args){
                System.out.println("4.1.1 Вывести все нечетные числа в диапазоне от 1 до 99");
                case411(1,100);

                System.out.println("4.1.2 Найти число делящеяся на 3 и на 5 в диапазоне 1-100");
                case412(0,100);

                System.out.println("4.1.3 Вычисление суммы двух целых чисел и проверка их равенства третьему");
                case413();

                System.out.println("4.1.4  Проверка на то что второе число больше превого и меньше третьего");
                case414();

                System.out.println("4.1.5 Проверка содержит ли  3 первый и последний  элемент массива");
                int[] array15=new int[]{3,-3,7,4,5,4,3};
                case415(array15);

                System.out.println("4.1.6 Проверка наличия в массиве значений 1 или 3");
                int[] array16=new int[]{3,-3,7,4,5,4,3};
                case416(array16);

                System.out.println("4.2.1 Проверка масива на возрастание");
                int[] array21=new int[]{-1,10,4,5,8,23};
                case421(array21);

                System.out.println("4.2.2 Ввод массива через консоль");
                case422();

                System.out.println("4.2.3 Перестановка первого и последнего элемента массива");
                int[] array23 = new int[]{12, 4, 3, 1, 2, 4};
                case423(array23);

                System.out.println("4.2.4 Найти первое уникальное число в массиве");
                int[] array24 = new int[]{1, 2, 3, 1, 2, 4};
                case424(array24);
                case425();
            }

            private static void case425() {
                System.out.println("4.2.5 Сортировка массива методом слияния ");
                int[] array=new int[]{2,5,1,3,6,4,2,7,8,2};
                System.out.println("Basic array:"+Arrays.toString(array));
                System.out.println("Sorted array:"+Arrays.toString(sortArray(array)));

            }



            private static int [] sortArray(int[] array){
                if (array==null) return null;
                if (array.length<2) return array;
                int []  arrayA;
                int []  arrayB;


                if (array.length%2==0) {
                    arrayA= new int[array.length/2];
                    arrayB= new int[array.length/2];
                }
                else {
                    arrayA= new int[(array.length+1)/2];
                    arrayB= new int[array.length-arrayA.length];
                }

                for (int i = 0; i < arrayA.length; i++) arrayA[i]=array[i];
                for (int i = 0; i < arrayB.length; i++) arrayB[i]=array[i+arrayA.length];

                arrayA = sortArray(arrayA);
                arrayB = sortArray(arrayB);
                return mergeArrays(arrayA, arrayB);

            }
            private static int[] mergeArrays(int[] arrayA, int[] arrayB) {
                int[] newArray = new int[arrayA.length + arrayB.length];
                int i = 0, i1 = 0, i2 = 0;

                while (i1 < arrayA.length && i2 < arrayB.length) newArray[i++] = arrayA[i1] < arrayB[i2] ? arrayA[i1++] : arrayB[i2++];
                while (i1 < arrayA.length) newArray[i++] = arrayA[i1++];
                while (i2 < arrayB.length) newArray[i++] = arrayB[i2++];
                return newArray;
            }

            private static void case424(int [] array) {
                int count;
                for (int i : array) {
                    count = 0;
                    for (int j : array)
                        if (i == j) count++;
                    if (count== 1){
                        System.out.println(i+" является первым  уникальным числом  для массива");
                        System.out.println("array:"+ Arrays.toString(array));
                        break;
                    }
                }
            }


            private static void case423(int[] array) {
                System.out.println("   Basic array:"+Arrays.toString(array));
                int temp = array[array.length-1];
                array[array.length-1]=array[0];
                array[0]=temp;
                System.out.println("Modified array:"+Arrays.toString(array));
            }

            private static void case422() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("Array Length:");
                int[] array= new int[scanner.nextInt()];
                System.out.println("Numbers of array:");
                for (int i = 0; i < array.length; i++) array[i]=scanner.nextInt();
                System.out.println("Result:"+ Arrays.toString(array));



            }

            private static void case421(int[] array) {

                boolean result= true;

                for (int i = 1; i < array.length; i++) {
                    if (array[i-1]> array[i]) {
                        result = false;
                        break;
                    }
                }
                if (result) System.out.println("Ok");
                else System.out.println("Please try again");
                System.out.println("array:"+Arrays.toString(array));
            }

            private static void case416(int[] array) {
                boolean result=false;
                for(int i:array){
                    if(i==1||i==3){
                        result =true;
                         break;
                    }
                }
                if (result) System.out.println("Массив содержит значения  1 или 3");
                else System.out.println("Массив не содержит значения  1 или 3");
                System.out.println("array"+Arrays.toString(array));
            }

            private static void case415(int[] array) {

                System.out.println("array="+Arrays.toString(array));
                if (array[0]==3 && array[array.length-1]==3) System.out.println("true");
                else System.out.println("false");

            }

            private static void case414() {
                int firstNumber;
                int secondNumber;
                int thirdNumber;
                boolean result;

                Scanner reader=new Scanner(System.in);
                System.out.print("Введите первое число:");
                firstNumber = reader.nextInt();
                System.out.print("Введите второе число:");
                secondNumber = reader.nextInt();
                System.out.print("Введите третье число:");
                thirdNumber = reader.nextInt();

                if(firstNumber<secondNumber&&secondNumber<thirdNumber) result= true;
                else result = false;
                System.out.println("Результат:" + result);

            }

            private static void case413() {
                int firstNumber;
                int secondNumber;
                int thirdNumber;
                boolean result;

                Scanner reader=new Scanner(System.in);
                System.out.print("Введите первое число:");
                firstNumber = reader.nextInt();
                System.out.print("Введите второе число:");
                secondNumber = reader.nextInt();
                System.out.print("Введите третье число:");
                thirdNumber = reader.nextInt();

                if((firstNumber+secondNumber)==thirdNumber) result= true;
                else result = false;
                System.out.println("Результат:" + result);

            }


            public static void case412(int start, int end) {
                StringBuilder result = new StringBuilder();
                int[] array = new int[100];
                for (int i = start; i < end; i++) {
                    array[i] = i+1;
                }
                for (int i : array) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        result.append("Число ").append(i).append(" делится на 3 и на 5.").append("\n");
                    } else {

                        if (i % 3 == 0) {
                            result.append("Число ").append(i).append(" делится на 3 ").append("\n");
                        } else {
                            if (i % 5 == 0) {
                                result.append("Число ").append(i).append(" делится на 5 ").append("\n");
                            }
                        }
                    }
                }
                System.out.println(result);
            }

            public static void case411(int start, int end){

                for (int i = start; i < end; i++) {
                    if (i%2!= 0) System.out.println(i);
                }

            }
        }


