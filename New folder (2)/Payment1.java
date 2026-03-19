class Payment {
    void processPayment() {
        System.out.println("Payment Processing!");
    }
}

class Creditcardpayment extends Payment {
    void processPayment() {
        System.out.println("Payment done using Credit Card!");
    }
}

class Debitcardpayment extends Payment {
    void processPayment() {
        System.out.println("Payment done using Debit Card!");
    }
}

class Upipayment extends Payment {
    void processPayment() {
        System.out.println("Payment done using UPI!");
    }
}

class Payment1 {
    public static void main(String[] args) {

        Payment p=new Payment();

        p = new Creditcardpayment();
        p.processPayment();

        p = new Debitcardpayment();
        p.processPayment();

        p = new Upipayment();
        p.processPayment();
    }
}