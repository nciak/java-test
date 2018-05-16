package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class CurrencyConverterRUN {

    public static void main(String[] args) {
         CurrencyConverterImpl cc = new CurrencyConverterImpl();

        Amount eurAmount = new Amount(100000, Currency.EUR);
        System.out.println(cc.convertToPln(eurAmount).getValue());

        Amount plnAmount = new Amount(10000, Currency.PLN);
        System.out.println(cc.convertToEur(plnAmount).getValue());


    }
}
