package pages;

import java.util.Random;

public class RandomPrograns {

        public static String generateRandomEmail() {
            String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            int length = 10;

            StringBuilder email = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(allowedChars.length());
                char randomChar = allowedChars.charAt(index);
                email.append(randomChar);
            }

            email.append("@testnewqa.com");
            return email.toString();
        }


    public String generateRandomPhoneNumber() {
        String phoneNumber = "";
        for (int i = 0; i < 9; i++) {
            phoneNumber += (int) (Math.random() * 10);
        }
        return phoneNumber;
    }

        public static String generateVatNumber() {
            String countryCode = "DE";
            int vatLength = 9;
            StringBuilder vatNumber = new StringBuilder(countryCode);

            Random random = new Random();
            for (int i = countryCode.length(); i < vatLength; i++) {
                int digit = random.nextInt(10);
                vatNumber.append(digit);
            }
            return vatNumber.toString();
        }
}
