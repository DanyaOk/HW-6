public class Main {
    public static void main(String[] args) {
        for ( int i=1; i<10; i++ ) {
            System.out.println(i);
        }
        for ( int i=10; i>0; i-- ) {
            System.out.println(i);
        }

        for ( int i=0; i<17; i= i+2 ) {
            System.out.println(i);
        }

        for ( int i=10; i>=-10; i-- ) {
            System.out.println(i);
        }

for (int i=1904; i<2096; i = i + 4 ) {
    System.out.println(i+ " год является високосным" );
}

        for ( int i=7; i<=98; i =i+7 ) {
            System.out.println(i);
        }

        for ( int i=1; i<=512; i=i*2 ) {
            System.out.println(i);
        }

        int cash=29000;
        int total=0;
        for ( int i=0; i<12; i++ ) {
            total=total+cash;
            System.out.println("Месяц "+i+ ", сумма накоплений равна "+ total+" рублей");}

int cash1=29000;
int total1=0;
for ( int i=0; i<12; i++ ) {
    total1=total1+total/100;
    total1=total1+cash1;
    {
        System.out.println( "Месяц "+i+ ", сумма накоплений равна "+ total1+" рублей");
    }


    }

  for ( int k=2; k<=20; k =k+2 ) {
        System.out.println(k);

  }

    }
}
