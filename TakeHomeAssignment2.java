import java.io.*;
import java.util.*;

public class TakeHomeAssignment2 {

  public static void main(String[] args) {
    List<List<String>> products = readCSV("testCase1.csv");
    sortByRatingDescending(products);
    assignRank(products);
    toCSV("rankedProducts.csv", products);
  }

  public static void sortByRatingDescending(List<List<String>> data) {
    data.sort((a, b) -> b.get(1).compareTo(a.get(1)));
  }

  public static void assignRank(List<List<String>> data) {
    int maxRating = Integer.parseInt(data.get(0).get(1));
    int rank = 1;

    for (int i = 0; i < data.size(); i++) {
      int currentRating = Integer.parseInt(data.get(i).get(1));
      if (currentRating != maxRating) {
        maxRating = currentRating;
        rank = i + 1;
      }
      List<String> updatedList = new ArrayList<>(data.get(i)); // Create a new list
      updatedList.add(0, String.valueOf(rank)); // Add the rank at index 0
      updatedList.remove(2); // Remove the third element (index 2)
      data.set(i, updatedList);
    }
  }

  public static void toCSV(String filename, List<List<String>> data) {
    BufferedWriter bw = null;
    try {
      bw = new BufferedWriter(new FileWriter(filename));
      for (List<String> row : data) {
        bw.write(String.join(",", row));
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static List<List<String>> readCSV(String filename) {
    BufferedReader br = null;
    List<List<String>> data = new ArrayList<List<String>>();
    try {
      br = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = br.readLine()) != null) {
        String[] values = line.split(",");
        data.add(Arrays.asList(values));
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return data;
  }
}
