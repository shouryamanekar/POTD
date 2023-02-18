//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int left = 0, right = 0;
        int oranges = 0, maxApples = 0;

        while (right < n) {
            if (arr.charAt(right) == 'O') {
                oranges++;
            }
            while (oranges > m) {
                if (arr.charAt(left) == 'O') {
                    oranges--;
                }
                left++;
            }
            if (right - left + 1 > maxApples) {
                maxApples = right - left + 1;
            }
            if (oranges <= m && right + 1 < n && arr.charAt(right + 1) == 'A') {
                maxApples = Math.max(maxApples, right - left + 2);
            }
            right++;
        }

        return maxApples;
    }
    }


//{ Driver Code Starts.

// } Driver Code Ends