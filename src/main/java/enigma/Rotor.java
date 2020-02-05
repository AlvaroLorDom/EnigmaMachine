package enigma;

public class Rotor {

    private String type;
    private String input;
    private String output;
    private int position = 0;

    public Rotor(){}

    public Rotor(String type) {
        this.type = type;
        Rotor.getRotor(type, this);
    }

    private void setInput(String input) {
        this.input = input;
    }

    private void setOutput(String output) {
        this.output = output;
    }

    public String translate(String letter) {
        int index = (input.indexOf(letter)+position)%25;
        String result = String.valueOf(output.charAt(index));
        System.out.println(index);
        this.rotate();
        return result;
    }

    protected static void getRotor(String type, Rotor rotor) {
        if (type.equals("0")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("BCDEFGHIJKLMNOPQRSTUVWXYZA");
        }
        if (type.equals("CDI")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("PEZUOHXSCVFMTBGLRINQJWAYDK");
        }
        if (type.equals("CDII")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("ZOUESYDKFWPCIQXHMVBLGNJRAT");
        }
        if (type.equals("CDIII")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("EHRVXGAOBQUSIMZFLYNWKTPDJC");
        }
        if (type.equals("CDIV")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("IMETCGFRAYSQBZXWLHKDVUPOJN");
        }
        if (type.equals("CDV")) {
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("QWERTZUIOASDFGHJKPYXCVBNML");
        }
        if (type.equals("REF")){
            rotor.setInput("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
            rotor.setOutput("VKWRGIETFZBUSPQNODMHLACYXJ");
        }
    }

    public void rotate() {
        position = (position++)%25;
    }

}
