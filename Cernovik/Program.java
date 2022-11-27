package Cernovik;



public class Program {
    public static void main(String[] args) {
        ColourList<Integer> colourList = new ColourList<>();
        colourList.add(3);
        colourList.add(5);
        colourList.add(15);
        colourList.add(30);

        for (Integer item : colourList) {
            System.out.println(item);
        }

        ColourList<String> colourList2 = new ColourList<>();
        colourList2.add("black");
        colourList2.add("green");
        colourList2.add("blue");
        colourList2.add("grey");

        for (String item : colourList2) {
            System.out.println(item);
        }

    }
}
