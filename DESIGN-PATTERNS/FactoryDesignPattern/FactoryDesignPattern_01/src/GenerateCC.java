public class GenerateCC {

    public static void main (String[] args){


        // CreditCard factory
        GetCCFactory ccFactory = new GetCCFactory();

        // a business cc
        CreditCard businessCC1 = ccFactory.getCC("BusinessCreditCard");

        // a children cc
        CreditCard childrenCC1 = ccFactory.getCC("CHILDRENCREDITCARD");

        // a standard cc
        CreditCard standardCC1 = ccFactory.getCC("staNdarDcredItCARD");

        //test
        System.out.println("Business limit: " + businessCC1.getLimit());
        System.out.println("Children limit: " + childrenCC1.getLimit());
        System.out.println("Standard limit: " + standardCC1.getLimit());
    }
}
