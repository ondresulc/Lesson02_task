package Maturita;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student01 = new Student("John",
                                        "May",
                                        LocalDate.of(1990, 4, 5),
                                        "4.A",
                                        new double[]{1, 2, 2, 1});


        Student student02 = new Student("Betty",
                                        "Glamour",
                                        LocalDate.of(1991, 8, 22),
                                        "4.B",
                                        new double[]{3, 3, 3, 1});

        Student student03 = new Student("Victor",
                                        "Moore",
                                        LocalDate.of(1992, 12, 31),
                                        "4.A",
                                        new double[]{5, 3, 5, 5});

        student01.studentResultsPrint();
        student01.passedExams();

        student02.studentResultsPrint();
        student02.passedExams();

        student03.studentResultsPrint();
        student03.passedExams();

    }


}


/**Naposledy jsme měli spoustu teorie a se znalostmi z první hodiny to ani nešlo jinak - teď už byste ale měli být schopni vytvořit něco, co by se dalo použít i v praxi.

 Potřebujeme nějak evidovat maturitní výsledky studentů - každý student má jméno, příjmení, datum narození, patří do nějaké třídy a maturuje ze čtyř předmětů
 - z každého dostane jednu známku a nakonec buď prospěje z vyznamenáním, prospěje, a nebo neprospěje - všechny tyhle údaje potřebujeme nějak evidovat
 a na vás je vymyslet a naprogramovat to jak.

 A protože jsou naši programátoři poněkud líní, tak je velmi potěší, když jestě vytvoříte i metodu,
 pomocí které půjde jednoduše vypsat, jak ten daný student dopadl a druhou metodu, která zjistí, jestli už má maturitu za sebou.*/