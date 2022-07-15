public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int dog = 3;
        byte cat =4;
        short bear =4;
        long elefant =111L;
        double saltWeight = 4.4;
        float sugarWeight = 2.2F;
        boolean catIsAdult =cat > 9;
        char bar = 43;
System.out.println(bar);

//задача2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weihgtOfAllBoxers = boxer1 + boxer2;
        double weihgtDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weihgtOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weihgtDifference);

        //задание3
        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int egg = 4;
        int MassGramm = (bananas*80)+(milk*105)+(iceCream*100)+(egg*70);
        float MassGr =MassGramm/1000f;
                System.out.println("Вес завтрака "+MassGr + "кг");


                        //задание4
        int x =250;
                int y=500;
                int Z = 7*1000;
                int xday = Z/x;
                int yday = Z/y;
                System.out.println("за " +xday + "дней спортсмен похудеет, если будет сбрасывать 250 гр сутки");
        System.out.println("за " +yday + "дней спортсмен похудеет, если будет сбрасывать 500 гр сутки");


        //задание 5
        int M = 67760;
                int MY = M*12;
                int Mplus = (M*10)/100;
                int MAFplus = Mplus*12;
                int MDifference = MAFplus - MY;
                System.out.println(MY + " рублей годовой доход Марии");
        System.out.println(Mplus + "рублей после прибавки к зарплате");
        System.out.println(MAFplus + "рублей годовой доход Марии после прибавки");
        System.out.println(MDifference + "разница в зарплате Марии после прибавки к зарплате");

        int D = 83690;
        int DY = D*12;
        int Dplus = (D*10)/100;
        int DAFplus = Dplus*12;
        int DDifference = DAFplus - DY;
        System.out.println(DY + " рублей годовой доход Дениса");
        System.out.println(Dplus + "рублей после прибавки к зарплате");
        System.out.println(DAFplus + "рублей годовой доход Дениса после прибавки");
        System.out.println(DDifference + "разница в зарплате Дениса после прибавки к зарплате");

        int K = 83690;
        int KY = K*12;
        int Kplus = (K*10)/100;
        int KAFplus = Kplus*12;
        int KDifference = KAFplus - KY;
        System.out.println(KY + " рублей годовой доход Кристины");
        System.out.println(Kplus + "рублей после прибавки к зарплате");
        System.out.println(KAFplus + "рублей годовой доход Кристины после прибавки");
        System.out.println(KDifference + "разница в зарплате Кристины после прибавки к зарплате");

    }
}