import java.util.Random;

public class GetCCFactory {



    public CreditCard getCC(String creditCardType){
        if (creditCardType == null){
            return null;
        } else if (creditCardType.equalsIgnoreCase("StandardCreditCard")){
            return new StandardCreditCard(generateId(), 480000, true);
        } else if (creditCardType.equalsIgnoreCase("BusinessCreditCard")){
            return new BusinessCreditCard(generateId(), 2800000, true);
        } else if (creditCardType.equalsIgnoreCase("ChildrenCreditCard")){
            return new ChildrenCreditCard(generateId(), 85000, false);
        }

        return null;
    }

    private Integer generateId(){
        // fake/example method to generate id numbers
        Random x = new Random();
        Integer idNumber = Integer.valueOf((int) Math.floor(x.nextInt(999999)));
        return idNumber;
    }


}
