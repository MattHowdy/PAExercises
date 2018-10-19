package com.gardener;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Office {
    ArrayList<String> allLines = new ArrayList<>();
    List<Integer> nutritientType = new ArrayList<>();
    int numOfDays;
    List<List<String>> detailedPlanList = new ArrayList<>();



    public void handleInput() {
        readFile();
        readHeader();
        readPlantDetails();
    }


    void readFile(){
        try {
            File filePath = new File("/Users/matehodi/Documents/Codecool/OOP/PAExercises/src/main/java/com/gardener/input.txt");
            FileReader fr = new FileReader(filePath);
            BufferedReader readFile = new BufferedReader(fr);
            String line;
            while((line = readFile.readLine()) != null){
                setAllLines(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void setAllLines(String line){
        allLines.add(line);
    }


    private void readPlantDetails() {
        List<String> plantDetails = allLines.subList(1,allLines.size()-1);
        int len = plantDetails.size();

        for (int i = 0; i < len ; i++) {
            List<String> tempList = new ArrayList<>();

            String[] tempInnerList = plantDetails.get(i).split(" ");
            int innerListLen = tempInnerList.length;
            for (int j = 0; j < innerListLen; j++) {
                tempList.add(tempInnerList[j]);
            }
            detailedPlanList.add(tempList);
        }
    }


    void readHeader(){
        List<String> firstLine = Arrays.asList(allLines.get(0).split(" "));
        List<Integer> tempIntList = new ArrayList<>();
        firstLine.forEach(c -> tempIntList.add(Integer.parseInt(c)));
        numOfDays = tempIntList.get(0);
        nutritientType = tempIntList.subList(1, tempIntList.size());
    }



    public int getNumOfDays() {
        return numOfDays;
    }

    public List<Integer> getNutritientType() {
        return nutritientType;
    }

    public List getDetailedPlanList() {
        return detailedPlanList;
    }
}
