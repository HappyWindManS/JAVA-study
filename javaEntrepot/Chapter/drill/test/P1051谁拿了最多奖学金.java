package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class P1051谁拿了最多奖学金 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer input =new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		input.nextToken();
		double time = input.nval;
		
		int sumOfAll = 0;
		
		int lalal = 0;
		String tempName = null;
		for(int i=0;i<time;i++)
		{
			int max = 0;
			student tempSt = new student();
			input.nextToken();
			tempSt.name = input.sval;
			input.nextToken();
			tempSt.stGrade = input.nval;
			input.nextToken();
			tempSt.zGrade = input.nval;
			input.nextToken();
			tempSt.id = input.sval;
			input.nextToken();
			tempSt.state = input.sval;
			input.nextToken();
			tempSt.numberOfPaper = input.nval;
			
			if(tempSt.stGrade>80&&tempSt.numberOfPaper>=1)
			{
				max += 8000;
				sumOfAll += 8000;
			}
			if(tempSt.stGrade>85&&tempSt.zGrade>80)
			{
				max += 4000;
				sumOfAll += 4000;
			}
			if(tempSt.stGrade>90)
			{
				max += 2000;
				sumOfAll += 2000;
			}
			if(tempSt.stGrade>85&&tempSt.state.equals("Y"))
			{
				max += 1000;
				sumOfAll += 1000;
			}
			if(tempSt.zGrade>80&&tempSt.id.equals("Y"))
			{
				max += 850;
				sumOfAll += 850;
			}
			
			if(max>lalal)
			{
				lalal = max;
				tempName = tempSt.name;
			}		
		}
		System.out.println(tempName);
		System.out.println(lalal);
		System.out.println(sumOfAll);
	}

}

class student
{
	String name;
	
	double stGrade;
	
	double zGrade;
	
	String id;
	
	String state;
	
	double numberOfPaper;
}
