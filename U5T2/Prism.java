public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int num) {
        length = num;
        width = num;
        height = num;
    }

    public Prism() {
        length = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public void setLength(int num) {
        length = num;
    }

    public void setWidth(int num) {
        width = num;
    }

    public void setHeight(int num) {
        height = num;
    }

    public String dimensions() {
        String str = "";
        str += "Length = " + length;
        str += "\nWidth = " + width;
        str += "\nHeight = " + height;
        return str;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }
}