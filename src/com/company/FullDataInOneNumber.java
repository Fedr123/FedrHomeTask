package com.company;

/**
 * Created by vakula on 11.6.2016.
 */
public class FullDataInOneNumber {
    private long fullData;


    public FullDataInOneNumber(long fullData) {
        this.fullData = fullData;
    }

    public long getFullData() {
        return fullData;
    }


    // full format is 19 digits. 0011112222333344444

    public void setOld (long old){
        char[] inputOld = Long.toString(old).toCharArray();
        if (inputOld.length > 4 || 4 > inputOld.length){
            System.out.println("OLD must consists of 4 digits: " + old);
            return;
        }

        char[] fullCharArr = Long.toString(this.fullData).toCharArray();
        for (int c = 2; c <= 5; c++){
            fullCharArr[c] = inputOld[c-2];
        }
        this.fullData = Long.parseLong(fullCharArr.toString());
    }

    public void setWeight (long weight){
        char[] inputWeight = Long.toString(weight).toCharArray();
        if (inputWeight.length > 4 || 4 > inputWeight.length){
            System.out.println("OLD must consists of 4 digits: " + weight);
            return;
        }
        char[] fullCharArr = Long.toString(this.fullData).toCharArray();
        for (int c = 6; c <= 9; c++){
            fullCharArr[c] = inputWeight[c-6];
        }
        this.fullData = Long.parseLong(fullCharArr.toString());
    }

    public void setHeight (long height){
        char[] inputHeight = Long.toString(height).toCharArray();
        if (inputHeight.length > 4 || 4 > inputHeight.length){
            System.out.println("OLD must consists of 4 digits: " + height);
            return;
        }
        char[] fullCharArr = Long.toString(this.fullData).toCharArray();
        for (int c = 10; c <= 13; c++){
            fullCharArr[c] = inputHeight[c-10];
        }
        this.fullData = Long.parseLong(fullCharArr.toString());
    }

    public void setYear (long year){
        char[] inputYear = Long.toString(year).toCharArray();
        if (inputYear.length > 5 || 5 > inputYear.length){
            System.out.println("OLD must consists of 5 digits: " + year);
            return;
        }
        char[] fullCharArr = Long.toString(this.fullData).toCharArray();
        for (int c = 14; c <= 18; c++){
            fullCharArr[c] = inputYear[c-14];
        }
        this.fullData = Long.parseLong(fullCharArr.toString());
    }


    private char[] longToFullCharArr (long inLong){
        char[] fullCharArr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char[] inCharArr = Long.toString(this.fullData).toCharArray();
        int diff = 19 - Long.toString(this.fullData).length();
        diff = diff--;
        for (int i = diff; i <= 18; i++){
            fullCharArr[i] = inCharArr[i-diff];
        }
        return fullCharArr;
    }

    public String getOld (){
        char[] fullCharArr = longToFullCharArr(this.fullData);
        char[] old = new char[4];

        for (int c = 2; c <= 5; c++){
            old[c-2] = fullCharArr[c];
        }
        return String.copyValueOf(old);
    }

    public String getWeight (){
        char[] fullCharArr = longToFullCharArr(this.fullData);
        char[] weight = new char[4];

        for (int c = 6; c <= 9; c++){
            weight[c-6] = fullCharArr[c];
        }
        return String.copyValueOf(weight);
    }

    public String getHeight (){
        char[] fullCharArr = longToFullCharArr(this.fullData);
        char[] height = new char[4];

        for (int c = 10; c <= 13; c++){
            height[c-10] = fullCharArr[c];
        }
        return String.copyValueOf(height);
    }

    public String getYear (){
        char[] fullCharArr = longToFullCharArr(this.fullData);
        char[] year = new char[5];

        for (int c = 14; c <= 18; c++){
            year[c-14] = fullCharArr[c];
        }
        return String.copyValueOf(year);
    }

    @Override
    public String toString() {
        return "FullDataInOneNumber{"
                + "\nFullData:" + fullData
                + "\nOld: " + this.getOld()
                + "\nWeight: " + this.getWeight()
                + "\nHeight: " + this.getHeight()
                + "\nYear: " + this.getYear();
    }
}
