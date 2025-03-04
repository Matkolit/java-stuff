

public class Args {

    public static void main(String args[]) {
        int argsSize = args.length;

        if (args.length == 0) {
            System.out.println("Hi user, no arguments provided");
            return;
        }

        if (args[0].equals("-m")) {
            for (int i = 1; i < argsSize; i++) {
                System.out.println("Żegnaj " + args[i]);
            }
        }else {
          for (int i = 0; i < argsSize; i++) {
            System.out.println("Witaj "  +  args[i] + '\u263A');
          }
        }

    }

}
