public class EmailExampleTest {
    private static RegularExpression regularExpression;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] validEmail1 = new String[] {"@gmail.com", "ab@.com", "abc@hotmail.com"};

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        for (String email:
             validEmail) {
            boolean isvalid = regularExpression.validate(email);
            System.out.println("Email is " + email + "  is valid  " + isvalid);
        }
        for (String email:
             validEmail1) {
            boolean isvalid = regularExpression.validate(email);
            System.out.println("Email is " + email + " is valid  " + isvalid);
        }
    }

}
