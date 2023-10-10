package company.trustingSocial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Bugs {
	public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            if(Integer.parseInt(input[0]) == 1){
                arrayList.add(Integer.parseInt(input[1]));
            }
            if(Integer.parseInt(input[0]) == 2){
                Collections.sort(arrayList, Collections.reverseOrder());
                if(arrayList.size() < 3){
                    System.out.println("Not enough enemies");
                }else{
                    System.out.println(arrayList.get((arrayList.size()/3)-1));
                }
            }
        }
    }
}
