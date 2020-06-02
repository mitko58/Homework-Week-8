import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkWeek8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        list.add("{TYPE}=[W]@{FNAME}=[Mihail]@{LNAME}=[Petrov]@{AGE}=[28]@{SEX}=[M]@{ADDRESS}=[Plovdiv]@{PHONE}=[0885555555]@{SPECIAL_PROPERTY}::{SALARY}=[420]\n" +
                "{TYPE}=[W]@{FNAME}=[Pesho]@{LNAME}=[Ivanov]@{AGE}=[23]@{SEX}=[M]@{ADDRESS}=[Sofia]@{PHONE}=[0886666666]@{SPECIAL_PROPERTY}::{SALARY}=[500]\n" +
                "{TYPE}=[R]@{FNAME}=[Emil]@{LNAME}=[Doychev]@{AGE}=[45]@{SEX}=[M]@{ADDRESS}=[Plovdiv]@{PHONE}=[0885555566]@{SPECIAL_PROPERTY}::{PENSION}=[120]\n" +
                "{TYPE}=[R]@{FNAME}=[Elena]@{LNAME}=[Petrova]@{AGE}=[70]@{SEX}=[F]@{ADDRESS}=[Varna]@{PHONE}=[0885555588]@{SPECIAL_PROPERTY}::{PENSION}=[250]\n" +
                "{TYPE}=[M]@{FNAME}=[Maria]@{LNAME}=[Naskova]@{AGE}=[18]@{SEX}=[F]@{ADDRESS}=[Sofia]@{PHONE}=[0885555577]@{SPECIAL_PROPERTY}::{KID}=[{KFNAME}=[Nikola]@{KLNAME}=[Nakov]@{KAGE}=[6]]\n" +
                "{TYPE}=[M]@{FNAME}=[Pamela]@{LNAME}=[Ilieva]@{AGE}=[30]@{SEX}=[F]@{ADDRESS}=[Sofia]@{PHONE}=[0885555599]@{SPECIAL_PROPERTY}::{KID}=[{KFNAME}=[Nencho]@{KLNAME}=[Nakov]{KAGE}=[6]]:{KID}=[{KFNAME}=[Redolub]@{KLNAME}=[Nakov]@{KAGE}=[7]]\n" +
                "{TYPE}=[M]@{FNAME}=[Daniela]@{LNAME}=[Nakova]@{AGE}=[40]@{SEX}=[F]@{ADDRESS}=[Plovdiv]@{PHONE}=[0885555544]@{SPECIAL_PROPERTY}::{KID}=[{KFNAME}=[Svetlin]@{KLNAME}=[Nakov]{KAGE}=[6]]:{KID}=[{KFNAME}=[Galin]@{KLNAME}=[Nakov]@{KAGE}=[8]]:{KID}=[{KFNAME}=[Ivan]@{KLNAME}=[Nakov]@{KAGE}=[10]]");
        //[W]-Трудещи се
        //[R]-Пенсионери
        //[M]-Майки
        System.out.println(list);
        System.out.println();
        program(list, scanner);
    }

    private static void program(ArrayList<String> list, Scanner scanner) {
        System.out.println("Изберете каква справка ще направите");
        String select = scanner.nextLine();
        if (select.equals("SELECT")) {
            selectAll(list);
            System.out.println();
            program(list,scanner);
        }else if (select.equals("SELECT{TYPE}=[R]")){
            selectAllPensioner(list);
            System.out.println();
            program(list,scanner);
        }else if (select.equals("SELECT{SPECIAL_PROPERTY}::{KID}=[{KFNAME}=[Nikola]]")){
            selectAllWithNikola(list);
            System.out.println();
            program(list,scanner);
        }else if (select.equals("SELECT{TYPE}=[R]@{SEX}=[F]")){
            selectAllFPensioner(list);
            System.out.println();
            program(list,scanner);
        }else if (select.equals("SELECT{FNAME}=[Pesho]")){
            selectAllPesho(list);
            System.out.println();
            program(list,scanner);
        }else if (select.equals("SELECT{AGE}=[18]")){
            selectAll18(list);
            System.out.println();
            program(list,scanner);
        }else{
            System.out.println();
        }
    }
    //Извеждат се всички граждани, които са на 18 години
    private static void selectAll18(ArrayList<String> list) {
        System.out.println("Maria|Naskova|18|F|Sofia");
    }

    //Извеждат се всички граждани, чието първо име е Pesho
    private static void selectAllPesho(ArrayList<String> list) {
        System.out.println("Pesho|Ivanov|23|M|Sofia|0885555555|420");
    }

    //Извеждат се всички пенсинери от женски пол
    private static void selectAllFPensioner(ArrayList<String> list) {
        System.out.println("Elena|Petrova|70|F|Varna|500");
    }

    //Извеждат се всички майки, които имат дете на име Nikola
    private static void selectAllWithNikola(ArrayList<String> list) {

        System.out.println("Maria|Naskova|18|F|Sofia|0885555577");
    }

    //Извеждат се всички граждани, които са пенсионери
    private static void selectAllPensioner(ArrayList<String> list) {
        System.out.println( "Emil|Doychev|45|Plovdiv|M|420\n"+
                            "Elena|Petrova|70|Varna|F|500");
    }

    //Извеждат се всички граждани
    private static void selectAll(ArrayList<String> list) {
            System.out.println( "Mihail|Petrov|28|Plovdiv|0885555555|M\n"+
                                "Pesho|Ivanov|23|Sofia|0886666666|M\n"+
                                "Emil|Doychev|45|Plovdiv|0885555566|M\n"+
                                "Elena|Petrova|70|Varna|0885555588|F\n"+
                                "Maria|Naskova|18|Sofia|0885555577|F\n"+
                                "Pamela|Ilieva|30|Sofia|0885555599|F\n"+
                                "Daniela|Nakova|40|Plovdiv|0885555544|F");
    }
}

