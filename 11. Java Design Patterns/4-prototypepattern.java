class Prototype implements Cloneable {
    private String data;

    public Prototype(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        try {
            Prototype original = new Prototype("Original Data");
            Prototype clone = (Prototype) original.clone();

            System.out.println("Original: " + original.getData());
            System.out.println("Clone: " + clone.getData());

            clone.setData("Modified Clone Data");
            System.out.println("After modification:");
            System.out.println("Original: " + original.getData());
            System.out.println("Clone: " + clone.getData());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
