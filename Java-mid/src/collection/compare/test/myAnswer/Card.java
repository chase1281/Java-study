package collection.compare.test.myAnswer;

public class Card implements Comparable<Card>{
    private int number;
    private String image;

    public Card(int number, String image) {
        this.number = number;
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return number + "(" + image + ")";
    }

    @Override
    public int compareTo(Card o) {
        if(this.number < o.number) return -1;
        else if(this.number == o.number){
            return this.image.compareTo(o.image);
        }
        return 1;
    }

}
