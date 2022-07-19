// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 

// P   A   H   N
// A P L S I I G
// Y   I   R

// And then read line by line: "PAHNAPLSIIGYIR"
// Write the code that will take a string and make this conversion given a number of rows:
// string convert(string s, int numRows);

class Solution {
    public String convert(String s, int numRows) {
        
        int[] index = new int[s.length()];
        int counter = 0;
        boolean change = true;
        String answer = "";
        
    //if it's only 1 row then return the string as is   
    if(numRows>1){
        //set where the characters belong in new string from Zero to s.length-1
        for(int i=0;i< s.length();i++){
            index[i] = counter;
             if(change == true){
                counter++;
                if(counter == numRows-1)
                    change = false;
             }
             else{
                counter--;
                if(counter == 0)
                    change = true;
             }
        }//end of for loop
        
        //put all the row 1 chars in the answer string, then all the row 2,... etc. 
         for(int i=0; i<numRows;i++){
             for(int j=0;j<s.length();j++){
                if(index[j] == i )
                answer+= s.charAt(j);
            }
        }//end of for outter loop
    }
    else
        return s;
        
    return answer;
    }//end of convert method
}
