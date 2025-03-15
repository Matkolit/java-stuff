

public class Greeting {

    public static void main(String args[]) {
        int argsSize = args.length;
        
        if (argsSize == 0) {
            System.out.println("Żegnaj bezimienny");
            return;
        }
        boolean hasWArgs = args[0].equals("+w");
        int startIndex = hasWArgs ? 1 : 0;

        if (hasWArgs && argsSize == 1) {
            System.out.println("Cześć Bezimienny");
            return;
        }

        for (int i = startIndex; i < argsSize; i++) {
            System.out.println("Witaj " + args[i] + '\u263A');
        }  }

}
