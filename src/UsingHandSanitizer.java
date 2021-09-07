public class UsingHandSanitizer {
    public static void main(String[] args) {
        HandSanitizerBottle bottle1 = new HandSanitizerBottle("Jdub","Fun Sanitizer",true,500,20,
                                    true,true);
        HandSanitizerBottle bottle2 = new HandSanitizerBottle("Jdub","Industrial",false,10000,20,
                            false,true);

        System.out.println(bottle1);
        System.out.println(bottle2);

    }
}
