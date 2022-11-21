import java.util.ArrayList;

class LessonMain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("太陽");
        names.add("水星");
        names.add("木星");
        System.out.println("要素の数");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        int index = 4;
        try {
            if (index < 0 || 3 < index) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(names.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
            System.out.println();   //改行
            System.out.println("気になる惑星の名前:" + names);

            for (int i = 0; i < names.size(); i++) {
                System.out.println("お気に入り順、" + i + "：" + names.get(i));
            }
        }
    }
}

