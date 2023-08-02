public class Count {
    public String nameCount;
    public int count;

    public Count(String nameCount, int count) {
        this.nameCount = nameCount;
        this.count = count;
    }

    public Count(String name) {
        this(name,0);
    }

    public int countMult() {
        return ++this.count;
    }

    public int countSub() {
        return --this.count;
    }

    public int countCust(int i) {
        return this.count += i;
    }

    public static void main(String[] args) {
        Count even = new Count("Четные числа", 0);
        Count odd = new Count("Не четные числа", 0);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                even.countMult();
            } else {
                odd.countMult();
            }

        }

        printCounter(even);
        printCounter(odd);

    }

    public static void printCounter(Count count) {
        System.out.printf("%s: %d \n", count.nameCount, count.count);
    }


}
