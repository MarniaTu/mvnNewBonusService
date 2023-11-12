public class Main {
    public static void main(String[] args) {
        BonusService serviceForRegisteredAndUnderLimit = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = serviceForRegisteredAndUnderLimit.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForRegisteredAndUnderLimit " + passed);

        BonusService serviceForRegisteredAndOverLimit = new BonusService();

        amount = 1_000_000;
        registered = true;
        expected = 500;
        actual = serviceForRegisteredAndOverLimit.calculate(amount, registered);
        passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForRegisteredAndOverLimit " + passed);

        BonusService serviceForUnRegisteredAndOverLimit = new BonusService();

        amount = 90_000;
        registered = false;
        expected = 500;
        actual = serviceForUnRegisteredAndOverLimit.calculate(amount, registered);
        passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForUnRegisteredAndOverLimit " + passed);

        BonusService serviceForUnRegisteredAndUnderLimit = new BonusService();

        amount = 2_800;
        registered = false;
        expected = 28;
        actual = serviceForUnRegisteredAndUnderLimit.calculate(amount, registered);
        passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForUnRegisteredAndUnderLimit " + passed);

        BonusService serviceForUnRegisteredAndExactLimit = new BonusService();

        amount = 50_000;
        registered = false;
        expected = 500;
        actual = serviceForUnRegisteredAndExactLimit.calculate(amount, registered);
        passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForUnRegisteredAndExactLimit " + passed);

        BonusService serviceForRegisteredAndJustOverLimit = new BonusService();

        amount = 16_700;
        registered = true;
        expected = 500;
        actual = serviceForRegisteredAndJustOverLimit.calculate(amount, registered);
        passed = expected == actual;
        System.out.println();
        System.out.println("shouldCalculateForRegisteredAndJustOverLimit " + passed);
    }
}
