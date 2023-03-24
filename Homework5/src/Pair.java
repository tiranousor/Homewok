public class Pair<Key, Value> {

    private Key key1;
    private Value value1;


    public Pair(Key key1, Value value1) {
        this.key1 = key1;
        this.value1 = value1;
    }

    public Pair(){
        
    }

    public Key getKey() {
        return key1;
    }

    public void setKey(Key key1) {
        this.key1 = key1;
    }

    public Value getValue() {
        return value1;
    }

    public void setValue(Value value1) {
        this.value1 = value1;
    }
    public static void main(String[] args) {
        Pair<Integer, String> MyCat = new Pair<Integer, String>(5, "Пуша");
        int age = MyCat.getKey();
        String name = MyCat.getValue();

        System.out.println("Моя кошка " + name + " живет у нас дома уже " + age + " лет ");
    }

}