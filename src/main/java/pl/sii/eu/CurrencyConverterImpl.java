package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

class CurrencyConverterImpl implements CurrencyConverter {

    @Override
    public Amount convertToPln(Amount euroAmount) {

        Double doubleEuroAmount = amountToDoubleValue(euroAmount, Amount.PRECISION);
        Double plnAmount = round(doubleEuroAmount * EURO_TO_PLN_RATIO, Amount.PRECISION);

        return doubleToAmount(plnAmount, Amount.PRECISION, Currency.PLN);
    }

    @Override
    public Amount convertToEur(Amount plnAmount) {

        Double doublePlnAmount = amountToDoubleValue(plnAmount, Amount.PRECISION);
        Double euroAmount = round(doublePlnAmount / EURO_TO_PLN_RATIO, Amount.PRECISION);

        return doubleToAmount(euroAmount, Amount.PRECISION, Currency.EUR);
    }

    private Double amountToDoubleValue(Amount amount, int precision) {

        return amount.getValue() / Math.pow(10, precision);
    }

    private Amount doubleToAmount(Double amount, int precision, Currency currency) {

        return new Amount(Double.valueOf(amount * Math.pow(10, precision)).longValue(), currency);
    }

    private static double round(double value, int precision) {
        if (precision < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, precision);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}