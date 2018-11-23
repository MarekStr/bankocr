class AccountNumber {

    //ilosc cyfr skladajacych sie na numer konta
    final static int NO_OF_ACC_DIGITS = 9;

    //oblicza sume kontrolna i zwraca wartosc true gdy jest poprawna lub false w przeciwnym przypadku
    //zawsze zwraca false jesli dlugosc przekazanego numeru konta jest różna od zadanej
    static boolean checkSum (String accountNumber) {

        //niepotrzebne
        //if (accountNumber.length() != NO_OF_ACC_DIGITS) throw new IllegalArgumentException("Nr konta musi miec 9 znakow : " + accountNumber);

        if (accountNumber.length() != NO_OF_ACC_DIGITS) return false;
        else {
            int digit;
            int chksum = 0;

            for (int i = 0; i < NO_OF_ACC_DIGITS; i++) {
                digit = Integer.parseInt(accountNumber.substring(NO_OF_ACC_DIGITS - 1 - i, NO_OF_ACC_DIGITS - i));
                chksum += (i + 1) * digit;
                //System.out.println(digit + " " + chksum); //tylko w celach testowych
            }

            return chksum % 11 == 0;
        }
    }

    public static int getNoOfAccDigits() {
        return NO_OF_ACC_DIGITS;
    }
}
