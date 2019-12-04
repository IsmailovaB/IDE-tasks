package ReplIt;

public class project {
    public static void main(String[] args) {
        System.out.println(dateToWords(4,29,1919));
    }

    public static String dateToWords(int month222, int day222, int year222) {
        String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
        String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] yearWords = {"Hundred", "Thousand"};
        // TO DO
        String str = "";
        for(int i = 1; i <= monthWords.length; i++){
            if(month222 == i){
                str += monthWords[i-1] + " ";
            }
        }
        for(int j = 1; j <=31; j++){
            if(j <= 10){
                if(day222 == j){
                    str += numbersLessThanTen[j-1] + " ";
                    break;
                }
            }else if (j > 10 && j < 20){
                if(day222 == j){
                    str += numbersBetweenTenAndTwenty[j-1] + " ";
                    break;
                }
            }else if (j >20 && j < 30 && j > 30){
                if (day222 == j){
                    int lastnumber = j%10;
                    int firstnumber = j /10;
                    str += multiplesOfTen[firstnumber-1] + " " + multiplesOfTen[lastnumber-1] + " ";
                    break;
                }
            }else if (j  == 20){
                if(day222 == j){
                    str +=multiplesOfTen[1];
                }
            }else if(j == 30){
                if(day222 == j){
                    str +=multiplesOfTen[2];
                }
            }
        }
        int thousand = year222/1000;
        int hundred = year222%1000/100;
        int yearsTensAndSingles = year222 - thousand*1000 - hundred*100;
        int yearsTens=yearsTensAndSingles/10;
        int yearsSingles=yearsTensAndSingles%10;
        if (year222==2000) {
            str+=numbersLessThanTen[thousand-1]+" "+yearWords[1];
        }

        else if(year222<2000){
            str+=numbersLessThanTen[0]+" "+yearWords[1]+" "+numbersLessThanTen[8]+" "+yearWords[0]+" "+ multiplesOfTen[yearsTens-1]+" "+numbersLessThanTen[yearsSingles-1];
        }
        else if(year222>2000&&year222<2100){
            str+=numbersLessThanTen[1]+" "+yearWords[1]+" "+multiplesOfTen[yearsTens-1]+" "+numbersLessThanTen[yearsSingles-1];
        }

        return str;
    }

}
