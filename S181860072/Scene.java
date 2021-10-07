package S181860072;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;

import S181860072.classloader.SteganographyClassLoader;

public class Scene {

    public static void main(String[] args) throws Exception {

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        //SteganographyClassLoader loader = new SteganographyClassLoader(
        //        new URL("https://cdn.njuics.cn/example.BubbleSorter.png"));
        //SteganographyClassLoader loader = new SteganographyClassLoader(
        //        new URL("file:S181860072.BubbleSorter.png"));
        //SteganographyClassLoader loader = new SteganographyClassLoader(
        //        new URL("file:S181860072.QuickSorter.png"));
        SteganographyClassLoader loader = new SteganographyClassLoader(
              new URL("file:S181860072.SelectSorter.png"));
        Class<?> c = loader.loadClass("S181860072.SelectSorter");

        Sorter sorter = (Sorter) c.getDeclaredConstructor().newInstance();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line);


        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
